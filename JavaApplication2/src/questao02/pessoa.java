/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao02;

/**
 *
 * @author gusta
 */
import java.util.Calendar;
public class pessoa {
    private String nome; 
    private String sobrenome;
    private int idade;
    private double altura;
    private double peso;
    private double imc;
    private Data dataNascimento;
    private String nomefull;
    public double calcImc(){
        imc = peso/(altura*altura);
        return imc;
    }
    public String informaObesidade(){
        if(imc<18.5){
            return "Abaixo do peso";
        }
        if(imc>=18.5 && imc<=24.9){
            return "Peso normal";
        }
        if(imc>=25.0 && imc<=29.9){
            return "Sobrepeso";
        }
        if(imc>=30.0 &&  imc<=34.9){
            return "Obesidade Grau 1";
        }
       if(imc>=35.0 &&  imc<=39.9){
            return "Obesidade Grau 2";
        }
       if(imc>=40){
            return "Obesidade Grau 3";
        }
       else{
           return "Classificação não encontrada";
       }
    }
   
    public void setDataNascimento(Data dataNascimento) {
    this.dataNascimento = dataNascimento;
    }

    public Data getDataNascimento() {
    return dataNascimento;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public double getImc() {
        return imc;
    }
    //funcao
    public int calculaIdade(){
        Calendar hoje = Calendar.getInstance();
        int anoAtual = hoje.get(Calendar.YEAR);
        int diaAtual = hoje.get(Calendar.DAY_OF_MONTH) ;
        int mesAtual = hoje.get(Calendar.MONTH)+1;
        
        int idade = anoAtual - dataNascimento.getAno();
        
        if(mesAtual < dataNascimento.getMes() ||
       (mesAtual == dataNascimento.getMes() && diaAtual < dataNascimento.getDia())){
        idade--;
    }
        return idade;
    }

    /**
     * @return the nomefull
     */
    public String getNomefull() {
        return nomefull;
    }

    
    public void setNomefull(String nomefull) {
        this.nomefull = nomefull;
    }
}

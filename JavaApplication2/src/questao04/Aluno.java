/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao04;

/**
 *
 * @author gusta
 */
public class Aluno {
    private String aluno;
    private double nota1;
    private double nota2;
    
    public void setAluno(String aluno){
        this.aluno= aluno;
        
    }
    public void setNota1(double nota1){
        this.nota1=nota1;
    }
    public void setNota2(double nota2){
        this.nota2=nota2;
    }
    public String getAluno(){
        return aluno;
    }
    public double getNota1(){
        return nota1;
    }
    public double getNota2(){
        return nota2;
    }
    
    //metodo
    
    public void calcularMedia(){
        double media;
        media = (nota1+nota2)/2;
        System.out.println("A media e: " + media);
    }
}

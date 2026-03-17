/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao02;

/**
 *
 * @author gusta
 */
import java.util.Scanner;
import questao02.pessoa;
public class questao02 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        pessoa[] p = new pessoa[10];
        
        int a,d,m;
        String nome,sobrenome;
        double peso,imc,altura;
        int idade;
       String nomeAnterior="";
       int cont=0;
       int ifalso=1;
       for(int i=0;i<10;i++){
         Data data = new Data();
         p[i] =  new pessoa();
         
        System.out.println("Digite o nome da pessoa " + ifalso);
        nome = sc.nextLine();
        p[i].setNome(nome);
   
        System.out.println("Digite o sobrenome");
        sobrenome = sc.nextLine();
        p[i].setSobrenome(sobrenome);
        String nomecompleto;
        nomecompleto = nome + " " + sobrenome;
        p[i].setNomefull(nomecompleto);
        
        if(i>0 && p[i].getNomefull().equals(p[i-1].getNomefull())){
            break;
        }
         System.out.println("Digite a de data de nascimento:");
         
         System.out.println("Dia:");
         d = sc.nextInt();
         data.setDia(d);
         System.out.println("Mes:");
         m = sc.nextInt();
         data.setMes(m);
         System.out.println("Ano:");
         a = sc.nextInt();
         data.setAno(a);
         p[i].setDataNascimento(data);
         //está dando um erro ao digitar nos Doubles, daí ao invez de digitar (.), Digite (,)-- ex: 1,74
         System.out.println("Digite a altura");
         altura = sc.nextDouble();
         p[i].setAltura(altura);
         
          System.out.println("Digite o peso");
          peso = sc.nextDouble();
          p[i].setPeso(peso);
          sc.nextLine();
          ifalso++;
          cont++;
          
          
       }
       int ifake=1;
       for(int i=0;i<cont;i++){
           
           System.out.println("-----------------");
           System.out.println("Cadastro " + ifake +":");
           System.out.println("Nome completo: " + p[i].getNomefull());
           System.out.println("Nome de referencia: " + p[i].getSobrenome() + ", " + p[i].getNome().toUpperCase());
           System.out.println("Idade: " + p[i].calculaIdade());
           System.out.println("Altura: " + p[i].getAltura());
           System.out.println("IMC: " + p[i].calcImc());
           System.out.println("Classificacao: " + p[i].informaObesidade());
           System.out.println("-----------------");
           ifake++;
       }
       
       
    }
     
}

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
        pessoa p = new pessoa();
        String nome,sobrenome;
        double peso,imc,altura;
        int idade;
       
        System.out.println("Digite o nome");
        nome = sc.nextLine();
        p.setNome(nome);
   
        System.out.println("Digite o sobrenome");
        sobrenome = sc.nextLine();
        p.setSobrenome(sobrenome);
        
         System.out.println("Digite idade");
         idade = sc.nextInt();
         p.setIdade(idade);
         
         //está dando um erro ao digitar nos Doubles, daí ao invez de digitar (.), Digite (,)-- ex: 1,74
         System.out.println("Digite a altura");
         altura = sc.nextDouble();
         p.setAltura(altura);
         
          System.out.println("Digite o peso");
          peso = sc.nextDouble();
          p.setPeso(peso);
          
          System.out.println("Pessoa: " + p.getNome() + "--- Imc: " + p.calcImc());
          System.out.println("Classificação: " + p.informaObesidade());
    }
}

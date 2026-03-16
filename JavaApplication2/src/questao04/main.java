/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao04;

/**
 *
 * @author gusta
 */
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aluno a = new Aluno();
        String nome;
        double n1,n2;
        System.out.println("Digite o nome do aluno");
         nome = sc.nextLine();
        a.setAluno(nome);
        
        System.out.println("Digite a nota 1 do aluno");
        n1 = sc.nextDouble();
        a.setNota1(n1);
        
        System.out.println("Digite a nota 2 do aluno");
        n2 = sc.nextDouble();
        a.setNota2(n2);
        
        a.calcularMedia();
        
    }
}

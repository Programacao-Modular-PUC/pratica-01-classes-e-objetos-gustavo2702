/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao03;

/**
 *
 * @author gusta
 */
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Livro livro1 = new Livro();
 
        System.out.println("Digite o nome do livro:");
        livro1.titulo =  sc.nextLine();
        System.out.println("Digite o do autor do livro:");
        livro1.autor = sc.nextLine();
        System.out.println("Digite o ano do livro:");
        livro1.ano = sc.nextInt();
        
        livro1.mostrarInfo();
        
    }
}

package questao01;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 751513
 */
import questao01.pitagoras;
import java.util.Scanner;
public class questao1 {
    public static void main(String[] args){
        double c1,c2;
        Scanner sc = new Scanner(System.in);
        pitagoras t = new pitagoras();
        System.out.println("Digite o cateto 1 e o cateto 2");
        t.c1 = sc.nextDouble();
        t.c2 = sc.nextDouble();
        double hipot,area;
        hipot = t.calcHipotenusa();
        area = t.calcArea();
        
        System.out.println("A hipotenusa é: " + hipot);
        System.out.println("A area é: " + area);
    }

   
}

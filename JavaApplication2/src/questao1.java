/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 751513
 */
import java.util.Scanner;
public class questao1 {
    public static void main(String[] args){
        int c1,c2;
        Scanner sc = new Scanner(System.in);
        trianguloret t = new trianguloret();
        System.out.println("Digite o cateto 1 e o cateto 2");
        t.c1 = sc.nextInt();
        t.c2 = sc.nextInt();
    }

    private static class trianguloret {

        public trianguloret() {
        }
    }
}

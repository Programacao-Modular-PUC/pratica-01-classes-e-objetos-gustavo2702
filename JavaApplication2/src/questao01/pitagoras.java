package questao01;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 751513
 */
public class pitagoras {
    double c1;
    double c2;
    double h;
    
    double calcHipotenusa(){
        h = Math.sqrt((c1*c1)+(c2*c2));
        return h;
    }
    double a;
    double calcArea(){
        a = (c1*c2)/2;
        return a;
    }
}

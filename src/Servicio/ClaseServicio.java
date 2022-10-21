/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import java.util.Scanner;

/**
 *
 * @author hdsot
 */
public class ClaseServicio {

    Scanner leer = new Scanner(System.in);
    
    public int crearCircunsferencia(){
        int radio;
        
        
        System.out.println("Ingrese el RADIO ");
        radio=leer.nextInt();
        
        return radio;
    }
    public double area(int radio){
        double area;
        double pi=3.1415;
        area=pi*radio*radio;
        return area;
    }
    public double perimetro(int radio){
        double perimetro;
        perimetro=2*3.1415*radio;
        return perimetro;
    }
    
}

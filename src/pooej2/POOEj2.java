/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej2;

import Servicio.ClaseServicio;

/**
 *
 * @author hdsot
 */
public class POOEj2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ClaseServicio rad = new ClaseServicio();
       int radio = rad.crearCircunsferencia();
        System.out.println("El perimetro es: "+ rad.perimetro(radio));
        System.out.println("El area es:" + rad.area(radio));
    }
    
}

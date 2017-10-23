/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mfrancomartinez
 */
public class Circulo {
    private double radio;
    private final double pi = 3.1416;

    public Circulo() {
    }
    
    public Circulo (double r){
        radio = r;
    }
    
   public void setradio (double r){
       radio = r;
   }
   
   public double getradio (){
       return radio;
   }
   
   public double calcularArea (double area){
       area = pi*Math.pow(radio, 2);
       return area;
   }
   
   public double calcularPerimetro (double perimetro){
       perimetro = 2*pi*radio;
       return perimetro;
   }   
}


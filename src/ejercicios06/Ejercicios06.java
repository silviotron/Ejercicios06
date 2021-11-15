/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios06;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicios06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ejercicio01();
    }
    public static void ejercicio01(){
        Scanner sc = new Scanner(System.in);
        double[] notas = new double[10];
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Introduce la nota: ");
            notas[i] = sc.nextInt();
            
        }
        double media = calcMedia(notas);
        double mayor = cacMayor(notas);
        double menor = calcMenor(notas);
                
    }
    public static double calcMedia(double[] notas){
        double media = 0;
        for (int i = 0; i < notas.length; i++) {
            media = media + notas[i];
            
        }
        return media / notas.length;
        
    }
    public static double calcMayor(double[] notas){
        double mayor = 0;
        for (int i = 0; i < notas.length; i++) {
            if(mayor < notas[i]){
                mayor = notas[i];
            }
            
        }        
        return mayor;
    }
    public static double calcmenor(double[] notas){
        double menor = 10;
        for (int i = 0; i < notas.length; i++) {
            if(menor > notas[i]){
                menor = notas[i];
            }
            
        }        
        return menor;        
    }
    
}

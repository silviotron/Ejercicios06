/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios06;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author alumno
 */
public class Ejercicios06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ejercicio04();
    }

    public static void ejercicio01() {
        Scanner sc = new Scanner(System.in);
        double[] notas = new double[10];
        for (int i = 0; i < notas.length; i++) {
            notas[i] = -1;
        }
        for (int i = 0; i < notas.length;) {
            System.out.printf("Por favor, inserte la %sª nota: ", i + 1);
            if (sc.hasNextInt()) {
                notas[i] = sc.nextInt();
            }
            if (notas[i] < 0 || notas[i] > 10) {
                System.out.println("ERROR: Debe insertar una nota del 0 al 10");
            } else {
                i++;
            }
            sc.nextLine();
        }

        System.out.println("media: " + calcMedia(notas));
        System.out.println("la nota más alta es: " + calcMayor(notas));
        System.out.println("la nota más baja es: " + calcMenor(notas));

    }

    public static double calcMedia(double[] notas) {
        double media = 0;
        for (int i = 0; i < notas.length; i++) {
            media = media + notas[i];

        }
        return media / notas.length;

    }

    public static double calcMayor(double[] notas) {
        double mayor = 0;
        for (int i = 0; i < notas.length; i++) {
            if (mayor < notas[i]) {
                mayor = notas[i];
            }

        }
        return mayor;
    }

    public static double calcMenor(double[] notas) {
        double menor = 10;
        for (int i = 0; i < notas.length; i++) {
            if (menor > notas[i]) {
                menor = notas[i];
            }

        }
        return menor;
    }

    public static void ejercicio02() {
        int[] numeros = {2001, 2002, 2003, 2004, 2005, 2006, 2007, 2008, 2009, 2010};
        printIntArray(numeros);
        int[] invertidos = new int[numeros.length];
        int j = numeros.length - 1;
        for (int i = 0; i < invertidos.length; i++) {
            invertidos[i] = numeros[j];
            j--;

        }
        printIntArray(invertidos);

    }

    public static void printIntArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("[" + array[i] + "]");

        }

    }
    
    public static void ejercicio03(){
        int swap;
        int[] numeros = { 16, 3, 2, 13, 5, 10, 11, 8, 9, 6, 7, 12, 4, 15, 14, 1};
        for (int i = 0; i < numeros.length - 1; i++) {
            if(numeros[i] > numeros[i + 1]){
                swap = numeros[i];
                numeros[i] = numeros[i +1];
                numeros[i + 1] = swap;
                i=-1;
            }
            
        }
        printIntArray(numeros);
        
        
    }
    
    public static void ejercicio03v2(){
        int swap;
        int[] numeros = { 16, 3, 2, 13, 5, 10, 11, 8, 9, 6, 7, 12, 4, 15, 14, 1};
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = i + 1; j < numeros.length; j++) {
                if(numeros[i] > numeros[j]){
                swap = numeros[i];
                numeros[i] = numeros[j];
                numeros[j] = swap;
                }
                
            }

            
        }
        printIntArray(numeros);
        
        
    }
    
    public static void ejercicio04(){
        String[][] nombreCompleto = new String[13][3]; 
        String[] nombre = {"Carlos", "Miguel", "Iván", "Benjamín", "Francisco", "Erik", "Alexis Jose", "Marcos", "Cristopher", "Mauricio", "Jose Simon", "Nuria Maria", "Silvio", "Gonçalo Rafael"};
        String[] apellido1 = {"Alvarez", "Candeira", "Casas", "Dominguez", "Fernandez", "Ferreira", "Giraldez", "Gonzalez", "Juncal", "Montes", "Sanchez", "da Silva", "Suarez", "Novas", "rodrigues"};
        String[] apellido2 = {"Sanchez", "Carrera", "Cerqueira", "Fernandez", "Araujo", "Oset", "Groba", "Pereira", "Abeledo", "Iglesias", "Gonzalez", "Vilas", "martínez", "bento"};    
        for(int i = 0; i < nombreCompleto.length; i++){ 
            nombreCompleto[i][0] = nombre[random(nombre.length)];
            nombreCompleto[i][1] = apellido1[random(apellido1.length)];
            nombreCompleto[i][2] = apellido2[random(apellido2.length)];
        }
        printNombres(nombreCompleto);
    }
    
    public static void printNombres(String[][] nombres){
        for(int i = 0; i < nombres.length; i++){
            System.out.printf("%s %s, %s\n", nombres[i][1], nombres[i][2], nombres[i][0]);
            
        }
    }
    
    public static int random(int max){
        Random generador = new Random();
        return generador.nextInt(max);
    }

}

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
        String entradaUsuario;
        java.util.Scanner teclado = new java.util.Scanner(System.in);
        do{
            System.out.println("**************************************************");
            System.out.println("*  1. Notas: media, mayor, menor                 *");
            System.out.println("*  2. Print array derecho y reves                *");
            System.out.println("*  3. Ordenar array                              *");
            System.out.println("*  4. Nombres random y apellidos repetidos       *");
            System.out.println("*  5. Euromillones                               *");
            System.out.println("*  6. Print y ordenar array bidimensional        *");
            System.out.println("*  7. Anagrama bien                              *");
            System.out.println("*  0. Salir                                      *");
            System.out.println("**************************************************");
            entradaUsuario = teclado.nextLine();
            switch(entradaUsuario){
                case "1":
                    ejercicio01();
                    break;
                case "2":
                    ejercicio02();
                    break;
                case "3":
                    ejercicio03v2();
                    break;
                case "4":
                    ejercicio04();
                    break;
                case "5":
                    ejercicio05();
                    break;
                case "6":
                    ejercicio06();
                    break;
                case "7":
                    ejercicio07();
                    break;                    
                case "0":
                    break;
                default:
                    System.out.println("Opción incorrecta");
                    break;
            }
        }while(!entradaUsuario.equals("0"));  
    }
    
    public static int random(int max,int minimo) {        
        Random generador = new Random();
        return generador.nextInt(max + minimo) + minimo;
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
        System.out.println("");

    }

    
    public static void ejercicio03() {
        int swap;
        int[] numeros = {16, 3, 2, 13, 5, 10, 11, 8, 9, 6, 7, 12, 4, 15, 14, 1};
        for (int i = 0; i < numeros.length - 1; i++) {
            if (numeros[i] > numeros[i + 1]) {
                swap = numeros[i];
                numeros[i] = numeros[i + 1];
                numeros[i + 1] = swap;
                i = -1;
            }

        }
        printIntArray(numeros);

    }

    public static void ejercicio03v2() {
        int swap;
        int[] numeros = {16, 3, 2, 13, 5, 10, 11, 8, 9, 6, 7, 12, 4, 15, 14, 1};
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[i] > numeros[j]) {
                    swap = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = swap;
                }

            }

        }
        printIntArray(numeros);

    }

    
    public static void ejercicio04() {
        String[][] nombreCompleto = new String[13][3];
        String[] nombre = {"Carlos", "Miguel", "Iván", "Benjamín", "Francisco", "Erik", "Alexis Jose", "Marcos", "Cristopher", "Mauricio", "Jose Simon", "Nuria Maria", "Silvio", "Gonçalo Rafael"};
        String[] apellido1 = {"Alvarez", "Candeira", "Casas", "Dominguez", "Fernandez", "Ferreira", "Giraldez", "Gonzalez", "Juncal", "Montes", "Sanchez", "da Silva", "Suarez", "Novas", "rodrigues"};
        String[] apellido2 = {"Sanchez", "Carrera", "Cerqueira", "Fernandez", "Araujo", "Oset", "Groba", "Pereira", "Abeledo", "Iglesias", "Gonzalez", "Vilas", "martínez", "bento"};
        for (String[] nombreCompleto1 : nombreCompleto) {
            nombreCompleto1[0] = nombre[random(nombre.length, 0)];
            nombreCompleto1[1] = apellido1[random(apellido1.length, 0)];
            nombreCompleto1[2] = apellido2[random(apellido2.length, 0)];
        }
        printNombres(nombreCompleto);
        System.out.println("");
        printRepetidos2(apellido1, apellido2);
    }

    public static void printNombres(String[][] nombres) {
        for (String[] nombre : nombres) {
            System.out.printf("%s %s, %s\n", nombre[1], nombre[2], nombre[0]);
        }
    }

    public static void printRepetidos(String[][] array) {
        boolean noSeRepite = true;
        for (String[] array1 : array) {
            if (array1[1].equals(array1[2])) {
                System.out.printf("%s %s, %s tiene el apellido repetido\n", array1[1], array1[2], array1[0]);
                noSeRepite = false;
            }
        }
        if (noSeRepite) {
            System.out.println("no se repite ningun apellido");
        }

    }
    
    public static void printRepetidos2(String[] array1, String[] array2){
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if(array1[i].equals(array2[j])){
                    System.out.println(array1[i] + " esta repetido");
                }
                
            }
            
        }
        
    }

    
    public static void ejercicio05() {
        int[] numeros = new int[5];
        int[] estrellas = new int[2];
        numeros = llenarEuromillones(numeros, 50);
        estrellas = llenarEuromillones(estrellas, 10);
        System.out.print("números:");
        printIntArray(numeros);
        System.out.print("\nEstrellas:");
        printIntArray(estrellas);
        System.out.println("");

    }

    public static int[] llenarEuromillones(int[] array, int max) {
        int random;
        boolean existe;
        for (int i = 0; i < array.length; i++) {
            do {
                random = random(max, 1);
                existe = existeEnArray(random, array);
            } while (existe);
            array[i] = random;
        }
        int swap;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    swap = array[i];
                    array[i] = array[j];
                    array[j] = swap;
                }

            }

        }

        return array;
    }

    public static boolean existeEnArray(int n, int[] array) {
        for (int f = 0; f < array.length; f++) {
            if (array[f] == n) {
                return true;
            }
        }
        return false;
    }
    
    
    public static void ejercicio06(){
    int[][] matriz =
    
    {

        {16, 3, 2, 13},

        {5, 10, 11, 8},

        {9, 6, 7, 12},

        {4, 15, 14, 1}

    };
    System.out.println("PARTE 1:\n");
    printIntArray2v4(matriz);
    System.out.println("PARTE 2:\n");
    printIntArray2v4(ordenarIntArray2(matriz));    
        
    }
    
    public static void printIntArray2(int[][] array){
        String print;
        for (int i = 0; i < array.length; i++) {
            System.out.print("|");
            for (int j = 0; j < array[i].length; j++){
                switch(array[i][j]){
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        print = " " + array[i][j];
                        break;
                    default:
                        print = "" + array[i][j];
                        break;

                }     
                System.out.print("  " + print);
            }
            System.out.print("  |\n");
        }
        System.out.println("");
        
    } 
    public static void printIntArray2v2(int[][] array){
        String print;
        for (int[] subarray : array) {
            System.out.print("|");
            for (int valor : subarray) {
                switch (valor) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        print = " " + valor;
                        break;
                    default:
                        print = "" + valor;
                        break;
                }     
                System.out.print("  " + print);
            }
            System.out.print("  |\n");
        }
        System.out.println("");
        
    }    
    public static void printIntArray2v3(int[][] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print("|");
            for (int j = 0; j < array[i].length; j++) {     
                System.out.printf("%3s", array[i][j]);
            }
            System.out.print(" |\n");
        }
        System.out.println("");
        
    } 
    public static void printIntArray2v4(int[][] array){
        for (int[] subarray : array) {
            System.out.print("|");
            for (int valor : subarray) {     
                System.out.printf("%3s", valor);
            }
            System.out.print(" |\n");
        }
        System.out.println("");
        
    }     
    
    public static int[][] ordenarIntArray2(int[][] array){
        int swap;
        for(int i = 0; i < array.length; i++) {            
            for(int j = 0; j < array[i].length; j++) {
                for(int k = 0; k < array.length; k++) {
                    for(int l = 0; l < array[k].length; l++) {                        
                        if(array[i][j] < array[k][l]){
                            swap = array[i][j];
                            array[i][j] = array[k][l];
                            array[k][l]= swap;
                        }    
                        
                    }
                    
                }
    
                
            }
            
        }
        
        return array;
    }
    public static int[][] ordenarIntArray2v2(int[][] array){
        boolean done = false;
        boolean done1 = false;
        boolean done2 = false;
        int swap;
        for (int i = 0; i < array.length; i++) {            
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array.length; k++) {
                    for (int l = 0; l < array[k].length; l++) {                                               

                        if(array[i][j] < array[k][l]){
                            swap = array[i][j];
                            array[i][j] = array[k][l];
                            array[k][l]= swap;
                        } 
                        if(j == 3 && !done1){
                            k = i+1;    
                            l = 0;
                            done1 = true;
                        }else if(!done2){
                            l = j + 1;
                            done2 = true;
                            
                        }
                        
                    }
                    done1 = false;
                    done2 = false;
                    
                }
    
                
            }
            
        }
        
        return array;
    }   
    
    public static void ejercicio07(){
        Scanner sc = new Scanner(System.in);
        System.out.print("introduce un texto: ");
        String string1 = sc.nextLine();
        System.out.print("introduce otro texto: ");
        String string2 = sc.nextLine(); 
        if(esAnagrama(string1, string2)){
            System.out.printf("%s es un anagrama de %s\n", string1, string2);
        }else{
            System.out.printf("%s no es un anagrama de %s\n", string1, string2);
        }        
        
        
    }
    public static boolean esAnagrama(String s1, String s2){
        s1 = soloLetras(s1);
        s2 = soloLetras(s2);
        if(s1.length() != s2.length()){
            return false;
        }
        s1 = s1.toLowerCase();
        s1 = s2.toLowerCase();
        StringBuilder sb = new StringBuilder(s1);
        StringBuilder sb2 = new StringBuilder(s2);
        for(int f = 0; f < s1.length(); f++){
            if(s2.contains(Character.toString(s1.charAt(f)))){
                sb.deleteCharAt(0);
                sb2.deleteCharAt(sb2.indexOf(Character.toString(s1.charAt(f))));
                s2 = sb2.toString();
            }else{
                return false;
            }
        }
        String resultado = sb.toString();
        return resultado.equals("");        
        
        
    }
    public static String soloLetras(String s){
        StringBuilder sb = new StringBuilder(s);
        int caracter;
        for (int i = s.length()-1; i >= 0; i--) {
            if(!Character.isLetter(s.charAt(i))){
                sb.deleteCharAt(i);
            }
            
        }        
        s = sb.toString();
        return s;
    }
 
    
}

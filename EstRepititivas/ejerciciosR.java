package EstRepititivas;

import java.util.Scanner;

public class ejerciciosR {

    public static void imprimirN1_10While() {
        int numInt=1;
        while (numInt<=10) {
            System.out.println(numInt);
            numInt=numInt+1;
        }
    }
    public static void imprimirN1_10dowhile() {
        int numInit=1;
        do {
            System.out.println(numInit);
            numInit=numInit+1;
        } while (numInit<=10);
            
    }
    public static void imprimirN1_10forWhile() {
        for (int numInit = 1; numInit <=10; numInit++) {
            System.out.println(numInit);
        }
        
    }

    public static void inprimirNombreVertical() {
        //declarar varibles
        String nombre;
        //datos de entrada
        System.out.println("ingrese el nombre: ");
        Scanner lt=new Scanner(System.in);
        nombre=lt.next();
        //proceso y salida
        for (int i = 0; nombre.length() > i; i++) {
            System.out.println(nombre.charAt(i));
        }

    }
    public static void inprimirNombreRevesVertical() {
        //declarar varibles
        String nombre;
        //datos de entrada
        System.out.println("ingrese el nombre: ");
        Scanner lt=new Scanner(System.in);
        nombre=lt.next();
        //proceso y salida
        for (int i = nombre.length()-1; i >=0 ; i--) {
            System.out.println(nombre.charAt(i));
        }

    }
    public static void main(String[] args) {
        System.out.println("while");
        imprimirN1_10While();
        /*System.out.println("do while");
        imprimirN1_10dowhile();
        System.out.println("for");
        imprimirN1_10forWhile();*/
        // inprimirNombreVertical();
        // inprimirNombreRevesVertical();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
//Usaremos la clase scanner para leer numeros por pantalla
/**
 *
 * @author jose
 */
public class Comparar {
    public static void main(String[] args){
        Scanner introducir = new Scanner(System.in); //Declaramos un scanner para usar
        int num1=0, num2=0;
        
        System.out.println("Introduce el primer número");
        num1 = introducir.nextInt();
        System.out.println("Introduce el segundo número");
        num2 = introducir.nextInt();
        
        //Hacemos las comparaciones entre ambos numeros
        if(num1>num2){
            System.out.println(num1 + " es el mayor");
        }else if(num2>num1){
            System.out.println(num2 + " es el mayor");
        }else{
            System.out.println("Ambos numeros son iguales");
        }
        
        introducir.close(); //Cerramos el scanner al finalizar el programa
    }
}

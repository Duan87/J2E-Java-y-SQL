/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.je2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Duan
 */
public class JE2main {

    public static void main(String[] args) {
        final int SOBREPESO = 1;
        final int INFRAPESO = -1;
        final int PESOIDEAL = 0;

        Scanner sc = new Scanner(System.in);
        

        String nombre;
        int edad;
        char sexo;
        float peso;
        float altura;

        // Obtenemos datos de usuario
        System.out.println("Obtencion de datos");
        System.out.println("------------------");
        System.out.println("Dame el nombre de la persona:");
        nombre = sc.nextLine();
        System.out.println("Dame la edad de " + nombre);
        edad = sc.nextInt();
        System.out.println("Dime el sexo de " + nombre);
        sexo = sc.next().charAt(0);
        System.out.println("Dime el peso de " + nombre);
        peso = sc.nextFloat();
        System.out.println("Dame la altura para " + nombre);
        altura = sc.nextFloat();

        // Creamos las personas con los distintos constructores
        System.out.println("\nCreando persona");
        Persona p3 = new Persona(nombre, edad, sexo, peso, altura);
        System.out.println("Persona creada!");
        //Mostramos la relacion de peso
        System.out.println("\nMostrando relacion de pesos");
        System.out.print("El peso de la persona es: ");

        switch (p3.calcularIMC()) {

            case 1:
                System.out.println("Sobrepeso");
                break;
            case -1:
                System.out.println("Falta peso");
                break;
            case 0:
                System.out.println("Peso normal");
                break;

        }

        // Mostramos la mayoria de edad
        System.out.println("\nMostrando mayorias de edad");
        System.out.println("La persona 3 es: " + (p3.esMayorDeEdad() ? "Mayor de edad" : "Menor de edad"));

        // Mostramos todos los datos con el metodo toString() que ha sido Override
        System.out.println("\nMostrando todos los datos");
        System.out.println(p3.toString());
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadora;

/**
 *
 * @author 
 */
public class Calculadora {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        String operacion = args[2];

        int resultado = 0;

        if (operacion.equals("+")) {
            resultado = sumar(num1, num2);
        } else if (operacion.equals("-")) {
            resultado = restar(num1, num2);
        } else if (operacion.equals("*")) {
            resultado = multiplicar(num1, num2);
        } else if (operacion.equals("/")) {
            resultado = dividir(num1, num2);
        }

        System.out.println("El resultado de la operación es: " + resultado);
    }

    public static int sumar(int num1, int num2) {
        return num1 + num2;
    }

    public static int restar(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiplicar(int num1, int num2) {
        return num1 * num2;
    }

    public static int dividir(int num1, int num2) {
        return num1 / num2;
    }
}


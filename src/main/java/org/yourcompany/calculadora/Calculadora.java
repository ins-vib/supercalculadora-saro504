package org.yourcompany.calculadora;

import java.util.Scanner;

/**
 * 
 * @author Sam Roca Sanchez
 */

public class Calculadora {

    public static void main(String[] args) {

        int seleccio=0,numero,base,exponent;
        Scanner teclat = new Scanner(System.in);

        while (seleccio != 6) {
            System.out.println(mostrarMenuConsola());

            System.out.println("Escolleix una opció: ");
            seleccio = teclat.nextInt();

            switch (seleccio) {
                case 1 -> {
                    System.out.print("Introdueix fins a quin número vols sumar: ");
                    numero = teclat.nextInt();
                    System.out.println(sumaPrimersNumeros(numero));
                }
                case 2 -> {
                    System.out.print("Introdueix el número que factoritzar: ");
                    numero = teclat.nextInt();
                    System.out.println(calcularFactorial(numero));
                }
                case 3 -> {
                    System.out.print("Introdueix fins a quin número vols sumar els quadrats: ");
                    numero = teclat.nextInt();
                    System.out.println(sumaQuadrats(numero));
                }
                case 4 -> {
                    System.out.print("Introdueix la base: ");
                    base = teclat.nextInt();
                    System.out.print("Introdueix el exponent: ");
                    exponent = teclat.nextInt();
                    System.out.println(calcularPotencia(base, exponent));
                }
                case 5 -> {
                    System.out.print("Introdueix el nombre per a contar els digits: ");
                    numero = teclat.nextInt();
                    System.out.println(nombreDigits(numero));
                }
                default -> System.out.println("Opció no vàlida");
            }
        }
        
    }

    /**
     * Llista les opcions de les funcions disponibles
     */
    public static int mostrarMenuConsola() {
        System.out.println("1. Suma dels primers n números");
        System.out.println("2. Factorial d'un nombre");
        System.out.println("3. Suma dels quadrats dels primers n números");
        System.out.println("4. Porència d'un nombre");
        System.out.println("5. Nombre de dígits d'un nombre");
        System.out.println("6. Sortir");
        return 0;
    }

    /**
     * Retorna la suma dels primers n números.
     * 
     * @param n Últim número inclós a la suma
     * @return El resultat de l'operació
     */
    public static int sumaPrimersNumeros(int n) {
        int resultat=0;
        for (int i = 0; i <= n; i++) {
            resultat += i;
        }
        return resultat;
    }

    /**
     * Retorna el factorial de n.
     * 
     * @param n Número del qual farem el factorial
     * @return Resultat de l'operació
     */
    public static int calcularFactorial(int n) {
        int resultat = 1;
        while (n > 0) {
            resultat *= n;
            n -= 1;
        }
        return resultat;
    }

    /**
     * Retorna la suma dels quadrats dels primers n números.
     * 
     * @param n Últim número inclós a l'operació
     * @return Resultat de l'operació
     */
    public static int sumaQuadrats(int n) {
        int resultat=0;
        for (int i = 0; i <= n; i++) {
            resultat += i*i;
        }
        return resultat;
    }

    /**
     * Retorna la potència de n.
     * 
     * @param base Número base de la potència
     * @param exponent Número exponent de la potència
     * @return Resultat de l'operació
     */
    public static int calcularPotencia(int base, int exponent) {
        for (int i = 2; i < exponent; i++) {
            base *= base;
        }
        return base;
    }

    /**
     * Calcula el nombre de dígits d'un número enter.
     * Funciona tant per a nombres positius com negatius.
     * Si el nombre és 0, retorna 1.
     * 
     * @param n Número del qual es vol saber el nombre de dígits
     * @return Quantitat de dígits que té {@code n}
     */
    public static int nombreDigits(int n) {
        if (n == 0) {
            return 1; // el 0 té un dígit
        }        
        int comptador = 0;
        while (n != 0) {
            n /= 10;
            comptador++;
        }
        return comptador;
    }

}

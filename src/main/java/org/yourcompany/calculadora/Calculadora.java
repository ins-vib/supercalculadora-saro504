

package org.yourcompany.calculadora;

/**
 *
 * @author Posa el teu nom
 */

import java.util.Random;

public class Calculadora {

    public static void main(String[] args) {

        // Exemples de crida per al mètode nombreDigits
        System.out.println("Nombre de dígits de 1234: " + nombreDigits(1234));
        System.out.println("Nombre de dígits de 56789: " + nombreDigits(56789));
        System.out.println("Nombre de dígits de -101010: " + nombreDigits(-101010));
        System.out.println("Nombre de dígits de 0: " + nombreDigits(0));

        int resultat1 = numeroCares(50);
        System.out.println("Nombre de cares en 50 tirades: "+resultat1);
        
        int resultat2 = numeroCares(100);
        System.out.println("Nombre de cares en 100 tirades: "+resultat2);

        int resultat3 = numeroCares(1000);
        System.out.println("Nombre de cares en 1.000 tirades: "+resultat3);

        double resultat4 = preuCinema(5, true, true);
        System.out.println("Preu final: "+resultat4+"€.");

        double resultat5 = preuCinema(10, false, true);
        System.out.println("Preu final: "+resultat5+"€.");

        // Exemples de crida per al mètode sumaPrimersNumeros
        // System.out.println("Suma dels primers 5 números: " + sumaPrimersNumeros(5));
        // System.out.println("Suma dels primers 10 números: " + sumaPrimersNumeros(10));
        // System.out.println("Suma dels primers 15 números: " + sumaPrimersNumeros(15));
        // Exemples de crida per al mètode calcularFactorial
        // System.out.println("Factorial de 5: " + calcularFactorial(5));
        // System.out.println("Factorial de 7: " + calcularFactorial(7));
        // System.out.println("Factorial de 10: " + calcularFactorial(10));
        // Exemples de crida per al mètode sumaQuadrats
        // System.out.println("Suma dels quadrats dels primers 3 números: " + sumaQuadrats(3));
        // System.out.println("Suma dels quadrats dels primers 5 números: " + sumaQuadrats(5));
        // System.out.println("Suma dels quadrats dels primers 7 números: " + sumaQuadrats(7));
        // Exemples de crida per al mètode calcularPotencia
        // System.out.println("2 elevat a la potència 3: " + calcularPotencia(2, 3));
        // System.out.println("5 elevat a la potència 4: " + calcularPotencia(5, 4));
        // System.out.println("3 elevat a la potència 5: " + calcularPotencia(3, 5));
        
        
    }

    /**
     * Calcula el nombre de dígits d’un número enter.
     * Funciona tant per a nombres positius com negatius.
     * Si el nombre és 0, retorna 1.
     *
     * @param nombre Número del qual es vol saber el nombre de dígits
     * @return Quantitat de dígits que té {@code nombre}
     */
    public static int nombreDigits(int nombre) {
        if (nombre == 0) {
            return 1; // el 0 té un dígit
        }        
        int comptador = 0;
        while (nombre != 0) {
            nombre /= 10;
            comptador++;
        }
        return comptador;
    }

    public static int numeroCares(int repeticions) {

        // Variables
        int cara=0,creu=0,num;
        
        // Bucle for
        for (int i=1;i<=repeticions;i++) {
            Random generator = new Random();
            num = generator.nextInt(0,2);
            // System.out.println(num);
            if (num == 0) {
                cara++;
            } else if (num == 1) {
                creu++;
            }
        }
        
        return cara;

    }

    public static double preuCinema(double preuBase, boolean esCapDeSetmana, boolean teCarnetJove) {
        
        // Variables
        double extra;
        double descompte;
        double preuFinal;

        // Condicionals
        if (esCapDeSetmana == true) {
            extra = preuBase * 10 / 100;
            preuFinal = preuBase + extra;
        } else {
            preuFinal = preuBase;
        }
        if (teCarnetJove == true) {
            descompte = preuBase * 15 / 100;
            preuFinal -= descompte;
        }
        
        return preuFinal;

    }


}

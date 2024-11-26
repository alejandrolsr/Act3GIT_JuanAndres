package NumeroAleatorios;

import java.util.Random;

public class NumeroAleatorios {

    public static void main(String[] args) {
        mostrarNumerosAleatorios();
    }

    /**
     * Método que genera y muestra 30 números aleatorios entre 1 y 10.
     */
    public static void mostrarNumerosAleatorios() {
        Random random = new Random(); // Instancia para generar números aleatorios

        System.out.println("50 números aleatorios entre 1 y 10:"); //Modifico el método de mi compañero Juan Andrés.
        for (int i = 0; i < 50; i++) {
            int numero = random.nextInt(10) + 1; // Genera un número entre 1 y 10
            System.out.print(numero + " "); // Muestra el número en la misma línea
        }
        System.out.println(); // Salto de línea al final
    }
}

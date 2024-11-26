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

        System.out.println("30 números aleatorios entre 1 y 10:");
        for (int i = 0; i < 30; i++) {
            int numero = random.nextInt(10) + 1; // Genera un número entre 1 y 10
            System.out.print(numero + " "); // Muestra el número en la misma línea
        }
        System.out.println(); // Salto de línea al final
    }
}

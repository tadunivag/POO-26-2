package br.edu.univag.contas.main;

public class Cap3Exf4 {
    public static void main(String args[]) {
        int fatorial = 1; // Fatorial de zero
        System.out.println("O fatorial de 0 é 1");

        for (int n = 1; n <= 10; n++) {
            fatorial *= n;
            System.out.printf("O fatorial de %d é (%d!) * %d = %d%n",
                n, (n - 1), n, fatorial);
        }
    }
}

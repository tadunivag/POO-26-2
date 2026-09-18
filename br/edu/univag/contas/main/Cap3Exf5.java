package br.edu.univag.contas.main;

public class Cap3Exf5 {
    /*
    No código do exercício anterior, aumente a quantidade de números
    que terão os fatoriais impressos até 20, 30 e 40. Em um determinado
    momento, além de esse cálculo demorar, começará a mostrar respostas
    completamente erradas. Por quê?

    Mude de int para long a fim de ver alguma mudança.
    */
    public static void main(String args[]) {
        java.math.BigInteger fatorial = java.math.BigInteger.ONE; // Fatorial de zero
        System.out.println("O fatorial de 0 é 1");

        for (int n = 1; n <= 40; n++) {
            fatorial = fatorial.multiply(java.math.BigInteger.valueOf(n));
            System.out.printf("O fatorial de %d é (%d!) * %d = %d%n",
                n, (n - 1), n, fatorial);
        }
    }
}

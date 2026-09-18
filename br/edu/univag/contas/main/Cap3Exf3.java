package br.edu.univag.contas.main;

public class Cap3Exf3 {
    public static void main(String args[]) {
        //Imprima todos os múltiplos de 3, entre 1 e 100.

        // Versão 1 - for e if
        /*
        for (int contador = 1; contador <= 100; contador++) {
            if (contador % 3 == 0) {
                System.out.println(contador);
            }
        }
        */
        
        // Versão 2 - for e continue
        /*
        for (int contador = 1; contador <= 100; contador++) {
            if (contador % 3 != 0) {
                continue;
            }
            System.out.println(contador);
        }
        */
        
        // Versão 3 - for
        for (int contador = 3; contador <= 100; contador += 3) {
            System.out.println(contador);
        }
        
    }
}

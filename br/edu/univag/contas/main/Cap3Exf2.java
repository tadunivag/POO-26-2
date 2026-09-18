package br.edu.univag.contas.main;

public class Cap3Exf2 {
    public static void main(String args[]) {
        //Imprima a soma de 1 até 1000.

        int soma = 0;
        
        
        // Versão 1 - while
        /*
        int contador = 1;
        while(contador <= 1000) {
            soma = soma + contador;
            contador++;
        }
        */

        // Versão 2 - for
        
        for(int contador = 1; contador <= 1000; contador++) {
            soma = soma + contador;
        }

        System.out.println("Soma de 1 até 1000 = " + soma);
    }
}

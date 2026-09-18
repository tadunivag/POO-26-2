package br.edu.univag.contas.main;

import br.edu.univag.contas.ManipuladorDeContas;
import  br.edu.univag.contas.modelo.Conta;

/**
 * Classe de teste.
 */
public class TestaConta {
    public static void main(String args[]) {
        // Exercícios do cap 4 e 5
        Conta conta = new Conta("Duke");
        conta.setNumero(4567);
        conta.setAgencia("7892-X");
        conta.setSaldo(1500.52);
        conta.setDataAbertura("28/08/2026");
        
        conta.depositar(50);
        conta.sacar(12.58);

        System.out.println(conta.recuperarDadosParaImpressao());

        // sacando um valor negativo
        conta.sacar(-19);
        System.out.println(conta.recuperarDadosParaImpressao());
        
        Conta c1 = new Conta();     
        c1.setTitular("Danilo");
        c1.setSaldo(100);
    
        Conta c2 = new Conta();     
        c2.setTitular("Danilo");
        c2.setSaldo(100);
    
        System.out.println(c1 + " " + c1.getIdentificador());
        System.out.println(c2 + " " + c2.getIdentificador());
    
        if (c1 == c2) {
            System.out.println("iguais");
        } else {
            System.out.println("diferentes");       
        }

        c2 = c1;

        System.out.println(c1 + " " + c1.getIdentificador());
        System.out.println(c2 + " " + c2.getIdentificador());
    
        if (c1 == c2) {
            System.out.println("iguais");
        } else {
            System.out.println("diferentes");       
        }
        
        //Conta.saldo = 1234;
        //Conta.calculaRendimento();
        
        // Capítulo 8 - Exercício 5
        ManipuladorDeContas mdc = new ManipuladorDeContas();
        mdc.criaConta();

        mdc.deposita(1000);
        Conta contaMdc = mdc.getConta();
        System.out.println(contaMdc.recuperarDadosParaImpressao());

        mdc.saca(100);
        System.out.println(contaMdc.recuperarDadosParaImpressao());
    }
}
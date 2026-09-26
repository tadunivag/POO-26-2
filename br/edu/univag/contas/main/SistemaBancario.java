package br.edu.univag.contas.main;

import java.util.ArrayList;
import java.util.List;

import br.edu.univag.contas.ManipuladorDeContas;
import br.edu.univag.contas.ManipuladorDeSeguroDeVida;
import  br.edu.univag.contas.modelo.Conta;
import br.edu.univag.contas.modelo.SeguroDeVida;
import br.edu.univag.contas.modelo.Tributavel;

public class SistemaBancario {
    private static ManipuladorDeContas mdc = new ManipuladorDeContas();
    private static ManipuladorDeSeguroDeVida msv = new ManipuladorDeSeguroDeVida();
    
    public static void mostraTela() {
        testaContas();
        testaSegurosDeVida();
        listaTributaveis();
    }

    public static void testaContas() {
        // Inicializa as contas
        mdc.criaConta("Conta Corrente", "Duke", 5467, "4567-3");
        mdc.deposita(1000.15);

        //Teste do exercício 6 - Cap 9
        mdc.saca(100);
        Conta cc = mdc.getConta();
        cc.sacar(100);

        mdc.criaConta("Conta Poupança", "Patolino", 8514, "5498-X");
        mdc.deposita(2000);
        mdc.saca(500.26);

        // Exercício 8, cap 9
        Conta cp = mdc.getConta();
        mdc.setConta(cc);
        mdc.transfere(cp, 799.95);

        // Listar contas cadastradas
        System.out.println("\nListagem de Contas");
        System.out.println("==================");
        System.out.printf("%-20s %6s %7s %10s %s%n", "Titular", "Número",
            "Agência", "Saldo", "Tipo");
        if (mdc.getContas().isEmpty()) {
            System.out.println("Nenhuma conta cadastrada.");
        } else {
            for (Conta conta : mdc.getContas()) {
                System.out.printf("%-20S %6d %7s %10.2f %s%n", conta.getTitular(),
                    conta.getNumero(), conta.getAgencia(), conta.getSaldo(), conta.getTipo());
            }
        }
    }

    private static void testaSegurosDeVida() {
        msv.criaSeguro(1234, "Pato Donald", 15000);
        msv.criaSeguro(5468, "Bob Esponja", 1200);
        msv.criaSeguro(5668, "Sandy Bochechas", 16001);

        System.out.println("\nListagem de Seguros de Vida");
        System.out.println("===========================");
        System.out.println("Número Titular                   Valor Tipo");
        for (SeguroDeVida seguro : msv.getSeguros()) {
            System.out.printf("%6d %-20S %10.2f %s%n", seguro.getNumeroApolice(),
                seguro.getTitular(), seguro.getValor(), seguro.getTipo());
        }
    }

    private static void listaTributaveis() {
        //Inicialização das variáveis
        List<Tributavel> tributaveis = new ArrayList<>();
        for (Conta conta : mdc.getContas()) {
            if (conta instanceof Tributavel) {
                tributaveis.add((Tributavel) conta);
            }
        }
        tributaveis.addAll(msv.getSeguros());

        System.out.println("\nListagem de Tributáveis");
        System.out.println("=======================");
        System.out.println("Titular                 Imposto Tipo");
        for (Tributavel tributavel : tributaveis) {
            System.out.printf("%-20S %10.2f %s%n", tributavel.getTitular(),
                tributavel.getValorImposto(), tributavel.getTipo());
        }
    }
}
package br.edu.univag.contas.main;

import br.edu.univag.contas.ManipuladorDeContas;
import  br.edu.univag.contas.modelo.Conta;

public class SistemaBancario {
    private static ManipuladorDeContas mdc = new ManipuladorDeContas();
    
    static {
        mdc.criaConta("Conta Corrente", "Duke", 5467, "4567-3");
        mdc.deposita(1000.15);

        mdc.criaConta("Conta Poupança", "Patolino", 8514, "5498-X");
        mdc.deposita(2000);
        mdc.saca(500.26);
    };
    
    public static void mostraTela(boolean b) {
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
}
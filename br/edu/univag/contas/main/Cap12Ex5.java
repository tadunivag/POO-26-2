package br.edu.univag.contas.main;

import br.edu.univag.contas.modelo.Conta;
import br.edu.univag.contas.modelo.ContaCorrente;
import br.edu.univag.contas.modelo.SaldoInsuficienteException;

public class Cap12Ex5 {
    public static void main(String[] args) {
        try {
            Conta conta = new ContaCorrente();
            conta.sacar(1);
        }
        catch (SaldoInsuficienteException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}

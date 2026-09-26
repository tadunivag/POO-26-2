package br.edu.univag.contas.main;

import br.edu.univag.contas.modelo.Conta;
import br.edu.univag.contas.modelo.ContaCorrente;

public class Cap12Ex2 {
    public static void main(String[] args) {
        Conta conta = new ContaCorrente();
        conta.depositar(-100);
    }
}

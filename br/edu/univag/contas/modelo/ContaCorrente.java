package br.edu.univag.contas.modelo;

public class ContaCorrente extends Conta {
    @Override
    public String getTipo() {
        return "Conta Corrente";
    }

    /**
     * Saca o valor informado de uma Conta Corrente. Será descontado
     * mais 0.10 a cada operação.
     * @see br.edu.univag.contas.modelo.Conta#sacar(double)
     */
    @Override
    public boolean sacar(double valor) {
        return super.sacar(valor + 0.10);
    }
}
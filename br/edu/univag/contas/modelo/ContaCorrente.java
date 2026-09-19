package br.edu.univag.contas.modelo;

public class ContaCorrente extends Conta implements Tributavel {
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

    @Override
    public double getValorImposto() {
        return getSaldo() * 0.01; // 1% de imposto
    }
}
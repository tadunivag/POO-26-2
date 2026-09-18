package br.edu.univag.contas.modelo;

public class ContaCorrente extends Conta {
    @Override
    public String getTipo() {
        return "Conta Corrente";
    }
}
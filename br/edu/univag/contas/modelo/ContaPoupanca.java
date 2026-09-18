package br.edu.univag.contas.modelo;

public class ContaPoupanca extends Conta {
    @Override
    public String getTipo() {
        return "Conta Poupança";
    }
}
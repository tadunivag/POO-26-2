package br.edu.univag.contas;

import java.util.List;
import java.util.ArrayList;
import br.edu.univag.contas.modelo.Conta;
import br.edu.univag.contas.modelo.ContaCorrente;
import br.edu.univag.contas.modelo.ContaPoupanca;

public class ManipuladorDeContas {

    private List<Conta> contas = new ArrayList<>();

    private Conta conta;

    public void criaConta() {
        this.criaConta("Conta Corrente", "Batman", 56789, "1234");
    }

    public void criaConta(String tipo, String titular, int numero, String agencia) {
        if (tipo.equals("Conta Corrente")) {
            this.conta = new ContaCorrente();
        } else {
            this.conta = new ContaPoupanca();
        }
        this.conta.setAgencia(agencia);
        this.conta.setNumero(numero);
        this.conta.setTitular(titular);
        
        contas.add(conta);
    }

    public List<Conta> getContas() {
        return contas;
    }
    
    public void deposita(double valor){
        this.conta.depositar(valor);
    }

    public void saca(double valor){
        this.conta.sacar(valor);
    }
    
    public Conta getConta() {
        return conta;
    }
}
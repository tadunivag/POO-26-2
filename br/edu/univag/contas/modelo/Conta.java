package br.edu.univag.contas.modelo;

/**
 * Classe que representa uma conta bancária.
 * 
 * @author Shimo
 */
public class Conta {
    private static int contador;
    
    private int identificador;
    private String titular;
    private int numero;
    private String agencia;
    private double saldo;
    private String dataAbertura;
    
    /**
     * Construtor padrão.
     */
    public Conta() {
        contador++;
        identificador = contador;
    }
    
    /**
     * Construtor com titular obrigatório.
     * @param titular Nome do titular
     */
    public Conta(String titular) {
        this();
        setTitular(titular);
    }
    
    public String getTipo() {
        return "Conta";
    }
    
    public int getIdentificador() {
        return identificador;
    }
    
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setDataAbertura(String dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    /**
     * Saca o valor informado de uma conta.
     * @param valor O valor a ser sacado.
     */
    public void sacar(double valor) {
        saldo = saldo - valor;
    }
    
    public void depositar(double valor) {
        saldo += valor;
    }

    public double getRendimento( ) {
        return saldo * 0.1;
    }
    
    public String recuperarDadosParaImpressao() {
        return "Identificador: " + identificador +
            "\nTitular: " + titular +
            "\nNúmero: " + numero +
            "\nAgência: " + agencia +
            "\nSaldo: " + saldo +
            "\nData de abertura: " + dataAbertura;
    }
}
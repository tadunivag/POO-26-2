package br.edu.univag.contas.main;

/*
Na empresa em que trabalhamos, há tabelas com o gasto de cada mês.
Para fechar o balanço do primeiro trimestre, precisamos somar o
gasto total. Sabendo que, em janeiro, foram gastos 15 mil reais,
em fevereiro, 23 mil reais e, em março, 17 mil reais, faça um
programa que calcule e imprima a despesa total no trimestre e a
média mensal de gastos.
*/
public class Cap3Ex1 {
    public static void main(String args[]) {
        java.util.Locale.setDefault(java.util.Locale.of("pt", "BR"));

        // Inicialização
        int gastoTotalTrimestre;
        double mediaMensal;
        int janeiro = 15_000;
        int fevereiro = 23_000;
        int marco = 17_000;
        
        // Processamento
        gastoTotalTrimestre = janeiro + fevereiro + marco;
        mediaMensal = gastoTotalTrimestre / 3.0;

        // Saída
        System.out.println("Total do Trimestre: " + gastoTotalTrimestre);
        System.out.printf("Média Mensal: %.2f%n", mediaMensal);
        
        byte b = 127;
        System.out.println("Byte: " + b);
        b += 128;
        System.out.println("Byte: " + b);
    }
}

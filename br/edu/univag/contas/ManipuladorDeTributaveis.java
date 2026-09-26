package br.edu.univag.contas;

import java.util.List;

import br.edu.univag.contas.modelo.SeguroDeVida;

public class ManipuladorDeTributaveis {
    private double total;

    public double getTotal() {
        return total;
    }

    public void calculaImpostos(List<SeguroDeVida> seguros) {
        this.total = 0.0;
        for (SeguroDeVida seguro : seguros) {
            this.total += seguro.getValorImposto();
        }
    }
}

package br.edu.univag.contas;

import java.util.List;

import br.edu.univag.contas.modelo.Tributavel;

public class ManipuladorDeTributaveis {
    private double total;

    public double getTotal() {
        return total;
    }

    public void calculaImpostos(List<Tributavel> tributaveis) {
        this.total = 0.0;
        for (Tributavel tributavel : tributaveis) {
            this.total += tributavel.getValorImposto();
        }
    }
}

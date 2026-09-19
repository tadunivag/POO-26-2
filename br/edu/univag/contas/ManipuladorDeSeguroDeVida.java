package br.edu.univag.contas;

import java.util.ArrayList;
import java.util.List;

import br.edu.univag.contas.modelo.SeguroDeVida;

public class ManipuladorDeSeguroDeVida {
    private SeguroDeVida seguroDeVida;

    private List<SeguroDeVida> seguros = new ArrayList<>();

    public void criaSeguro(int numeroApolice, String titular, double valor) {
        seguroDeVida = new SeguroDeVida();
        seguroDeVida.setNumeroApolice(numeroApolice);
        seguroDeVida.setTitular(titular);
        seguroDeVida.setValor(valor);

        seguros.add(seguroDeVida);
    }

    public List<SeguroDeVida> getSeguros() {
        return seguros;
    }
}


package br.edu.univag.contas.main;

import br.edu.univag.contas.ManipuladorDeSeguroDeVida;
import br.edu.univag.contas.modelo.SeguroDeVida;

public class Cap11Ex3 {
    public static void main(String[] args) {
        ManipuladorDeSeguroDeVida msv = new ManipuladorDeSeguroDeVida();
        msv.criaSeguro(1234, "Pato Donald", 15000);
        msv.criaSeguro(5468, "Bob Esponja", 1200);
        msv.criaSeguro(5668, "Sandy", 16001);

        for (SeguroDeVida seguro : msv.getSeguros()) {
            System.out.println(seguro.recuperaDadosParaImpressao());
        }
    }
}
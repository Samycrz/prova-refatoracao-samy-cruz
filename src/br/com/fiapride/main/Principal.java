package br.com.fiapride.main;

import br.com.fiapride.model.Veiculo;

public class Principal {

    public static void main(String[] args) {

        Veiculo veiculo1 = new Veiculo("Samy", "SAM-6789", 10.0);

        veiculo1.adiciona(50.0);

        veiculo1.gasta(100.0);

        System.out.println("Dono: " + veiculo1.getDono() + " | Placa: " + veiculo1.getPlaca() + " | Gasolina: " + veiculo1.getGasolina());
    }
}
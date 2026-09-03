package br.com.fiapride.model;

public class Veiculo {

    private String dono;
    private String placa;
    private double gasolina;

    public Veiculo() {
    }

    public Veiculo(String dono, String placa, double gasolina) {
        this.dono = dono;
        this.placa = placa;
        this.gasolina = gasolina;
    }

    public void adiciona(double valor) {
        this.gasolina += valor;
    }

    public void gasta(double valor) {
        if (this.gasolina >= valor) {
            this.gasolina -= valor;
        } else {
            System.out.println("Atenção: Combustível insuficiente para o trajeto todo. O veículo andou até o tanque esvaziar!");
            this.gasolina = 0.0;
        }
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getGasolina() {
        return gasolina;
    }

    public void setGasolina(double gasolina) {
        this.gasolina = gasolina;
    }
}
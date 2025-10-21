package br.com.newlimp.gestaoproducao.model;

public class Tinta extends ItemEstoque {
    private String cor;
    private double volumeTotal;
    private double volumeRestante;

    public double getVolumeRestante() {
        return this.volumeRestante;
    }

    public void setVolumeRestante(double volumeRestante) {
        this.volumeRestante -= volumeRestante;
    }

    public String getCor() {
        return this.cor;
    }
}

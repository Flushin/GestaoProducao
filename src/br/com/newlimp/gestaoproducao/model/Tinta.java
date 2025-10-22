package br.com.newlimp.gestaoproducao.model;

import br.com.newlimp.gestaoproducao.model.enums.Cores;

public class Tinta extends ItemEstoque {
    private Cores cor;
    private double volumeTotal;
    private double volumeRestante;

    public double getVolumeRestante() {
        return this.volumeRestante;
    }

    public void setVolumeRestante(double volumeRestante) {
        this.volumeRestante = this.volumeTotal - this.volumeRestante;
    }

    public Cores getCor() {
        return this.cor;
    }

    public void setCor(Cores cor) {
        this.cor = cor;
    }

    public double getVolumeTotal() {
        return this.volumeTotal;
    }

    public void setVolumeTotal(double volumeTotal) {
        this.volumeTotal = volumeTotal;
    }
}

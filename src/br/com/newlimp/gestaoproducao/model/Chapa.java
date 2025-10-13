package br.com.newlimp.gestaoproducao.model;

public class Chapa extends ItemEstoque{
    private String cor;
    private String dimensoes;

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public String getDimensoes() {
        return this.dimensoes;
    }

    public void setDimensoes(String dimensoes) {
        this.dimensoes = dimensoes;
    }
}

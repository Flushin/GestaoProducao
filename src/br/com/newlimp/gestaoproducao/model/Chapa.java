package br.com.newlimp.gestaoproducao.model;

import br.com.newlimp.gestaoproducao.model.enums.Cores;
import br.com.newlimp.gestaoproducao.model.enums.UnidadeMedida;

public class Chapa extends ItemEstoque{
    private Cores cor;
    private UnidadeMedida dimensoes;

    public Cores getCor() {
        return this.cor;
    }

    public void setCor(Cores cor){
        this.cor = cor;
    }

    public UnidadeMedida getDimensoes() {
        return this.dimensoes;
    }

    public void setDimensoes(UnidadeMedida dimensoes) {
        this.dimensoes = dimensoes;
    }
}

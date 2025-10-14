package br.com.newlimp.gestaoproducao.model;

import br.com.newlimp.gestaoproducao.model.enums.Cores;

import java.util.List;
import java.util.Map;

public class PinturaVirgem extends Processo{
    private Cores cor;
    private int chapasPlanejadas;
    private int chapasPintadas;
    private Tinta tintaUtilizada;
    private List<Chapa> chapasUsadas;
    private Map<String, Integer> insumosUsados;

    @Override
    public void executar() {
        //irá iniciar o processo com uma quantidade padrão de todos os insumos
        //no final do processo a pessoa diz o que usou
    }

    public void registrarProducao(int quantidade) {
    }

    public boolean verificarEstoque() {
       return true;
    }

    public void consumirRecursos() {

    }
}

package br.com.newlimp.gestaoproducao.model;

import br.com.newlimp.gestaoproducao.model.enums.Cores;
import br.com.newlimp.gestaoproducao.model.enums.StatusProcesso;

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
        if (!verificarEstoque()) { //aqui é sempre testando se é false. Se for, entra no if.
            System.out.println("Estoque insuficiente para iniciar o processo de pintura virgem.");
            return;
        }

        this.setStatus(StatusProcesso.EM_EXECUCAO);
        System.out.println("Processo de pintura virgem iniciado com cor: " + cor);
        consumirRecursos();
    }

    public void registrarProducao(int quantidade) {
        this.chapasPintadas += quantidade;

        if (chapasPintadas >= chapasPlanejadas) {
            this.setStatus(StatusProcesso.CONCLUIDO);
            System.out.println("Processo de pintura concluído com sucesso!");
        } else {
            System.out.println("Produção parcial registrada: " + chapasPintadas + " chapas pintadas.");
        }
    }

    public boolean verificarEstoque() {
       if (tintaUtilizada.getVolumeRestante() <= 0) {
           System.out.println("Sem tinta suficiente para pintura");
           return false;
       }

       if (chapasUsadas == null || chapasUsadas.isEmpty()) {
           System.out.println("Nenhuma chapa disponível para pintura.");
           return false;
       }

       return true; //Entao tem estoque, retorna true que significa que tem estoque.
    }

    public void consumirRecursos() {
        double consumoPorChapa = 0.5; //exemplo: 0.5 litros por chapa
        double consumoTotal = chapasPlanejadas * consumoPorChapa; //2.5

        tintaUtilizada.setVolumeRestante(
                tintaUtilizada.getVolumeRestante() - consumoTotal
        );

        System.out.println(consumoTotal + "L de tinta " + tintaUtilizada.getCor() + " consumidos.");
    }
}

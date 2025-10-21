package br.com.newlimp.gestaoproducao.model;

import br.com.newlimp.gestaoproducao.model.enums.StatusProcesso;

import java.time.LocalDate;

public class Processo {
    private Long id;
    private String nome;
    private String responsavel;
    private LocalDate dataProgramacao;
    private StatusProcesso status;
    private double quantidadeProduzida;

    public void iniciarProcesso() {
        this.status = StatusProcesso.EM_EXECUCAO;
    }

    public void registrarProducao(double quantidadeProduzida) {
        this.quantidadeProduzida += quantidadeProduzida;
    }

    public void finalizarProcesso() {
        this.status = StatusProcesso.CONCLUIDO;
    }

    public void executar() {
    }

    public void setStatus(StatusProcesso status) {
        this.status = status;
    }
}

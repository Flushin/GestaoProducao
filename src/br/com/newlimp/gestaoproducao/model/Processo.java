package br.com.newlimp.gestaoproducao.model;

import br.com.newlimp.gestaoproducao.model.enums.StatusProcesso;

import java.time.LocalDate;

public class Processo {
    private int id;
    private String nome;
    private String responsavel;
    private LocalDate dataProgramacao;
    private StatusProcesso status;
    private double quantidadeProduzida;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public LocalDate getDataProgramacao() {
        return dataProgramacao;
    }

    public void setDataProgramacao(LocalDate dataProgramacao) {
        this.dataProgramacao = dataProgramacao;
    }

    public StatusProcesso getStatus() {
        return this.status;
    }

    public double getQuantidadeProduzida() {
        return quantidadeProduzida;
    }

    public void setQuantidadeProduzida(double quantidadeProduzida) {
        this.quantidadeProduzida = quantidadeProduzida;
    }

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

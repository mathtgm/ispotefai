package br.com.ispotefai.model;

public class Audio {

    private String titulo;
    private double duracao;
    private int totalReproducao;
    private int classificacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public int getTotalReproducao() {
        return totalReproducao;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void curte() {
        classificacao++;
    }

    public void reproduz() {
        totalReproducao++;
    }
}

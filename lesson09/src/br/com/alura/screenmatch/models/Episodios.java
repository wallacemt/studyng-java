package br.com.alura.screenmatch.models;

import br.com.alura.screenmatch.calculo.Classificavel;

public class Episodios implements Classificavel {
    private int number;
    private String name;
    private Serie serie;
    private int totalVisualizações;

    public int getNumber() {
        return number;
    }

    public int getTotalVisualizações() {
        return totalVisualizações;
    }

    public void setTotalVisualizações(int totalVisualizações) {
        this.totalVisualizações = totalVisualizações;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    @Override
    public int getClassificacao() {
        if(this.totalVisualizações > 100) {
            return 4;
        }else {
            return  2;
        }
    }
}

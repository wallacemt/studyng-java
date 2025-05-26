package br.com.alura.screenmatch;

import br.com.alura.screenmatch.calculo.CalculateTime;
import br.com.alura.screenmatch.calculo.FilterRecomentations;
import br.com.alura.screenmatch.models.Episodios;
import br.com.alura.screenmatch.models.Movie;
import br.com.alura.screenmatch.models.Serie;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Movie meuFilme = new Movie("O poderoso chefão", 1970);
        meuFilme.setDuracaoEmMinutos(180);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());
        //meuFilme.somaDasAvaliacoes = 10;
        //meuFilme.totalDeAvaliacoes = 1;
        //System.out.println(meuFilme.pegaMedia());

        Serie lost = new Serie("Lost", 2000);
        lost.setAnoDeLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMinutos());

        Movie outroFilme = new Movie("Avatar", 2023);
        outroFilme.setDuracaoEmMinutos(200);

        CalculateTime calculadora = new CalculateTime();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        FilterRecomentations myFilter = new FilterRecomentations();
        myFilter.filter(meuFilme);

        Episodios episodios = new Episodios();
        episodios.setNumber(1);
        episodios.setSerie(lost);
        episodios.setTotalVisualizações(300);
        myFilter.filter(episodios);

        var newMovie = new Movie("Whiplash", 2014);

        newMovie.setDuracaoEmMinutos(109);
        newMovie.avalia(10);

        ArrayList<Movie> movies = new ArrayList<>();

        movies.add(newMovie);
        movies.add(meuFilme);
        movies.add(outroFilme);

        System.out.println("Tamanho da lista: " + movies.size());
        System.out.println("Primeiro Filme: " + movies.get(0).getNome());
        System.out.println(movies);
    }
}
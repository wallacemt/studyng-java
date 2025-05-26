package br.com.alura.screenmatch;

import br.com.alura.screenmatch.models.Movie;
import br.com.alura.screenmatch.models.Serie;
import br.com.alura.screenmatch.models.Title;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class MainUsingLists {
    public static void main(String[] args) {
        Movie meuFilme = new Movie("O poderoso chefão", 1970);
        Movie meuSegundoFilme = new Movie("Whiplash", 2014);
        meuSegundoFilme.avalia(10);
        Movie meuTerceiroFilme = new Movie("Matrix", 1999);
        meuTerceiroFilme.avalia(9);
        Serie lost = new Serie("Lost", 2000);

        ArrayList<Title> lista = new ArrayList<>();
        lista.add(meuFilme);
        lista.add(meuSegundoFilme);
        lista.add(meuTerceiroFilme);
        lista.add(lost);

        for (Title item : lista) {
            System.out.println(item.getNome());
            if (item instanceof Movie filme) {
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }

        ArrayList<String> buscarPorArtista = new ArrayList<>();
        buscarPorArtista.add("Adam Sandler");
        buscarPorArtista.add("Will Smith");
        buscarPorArtista.add("Dwayne Johnson");

        Collections.sort(buscarPorArtista);
        System.out.println(buscarPorArtista);

        Collections.sort(lista);
        System.out.println(lista);

        lista.sort(Comparator.comparing(Title::getAnoDeLancamento));
        System.out.println(lista);
    }
}

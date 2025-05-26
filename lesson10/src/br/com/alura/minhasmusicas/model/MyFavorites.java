package br.com.alura.minhasmusicas.model;


public class MyFavorites {
    public void include(Audio audio) {
        if (audio.getRating() >= 8) {
            System.out.println("(" + audio.getTitle() + ") é considerado sucesso absoluto é preferido por todos!");
        } else {
            System.out.println("(" + audio.getTitle() + ") também é um dos que todos estao curtindo!");
        }
    }

}

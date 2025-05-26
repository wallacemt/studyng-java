import br.com.alura.minhasmusicas.model.Music;
import br.com.alura.minhasmusicas.model.MyFavorites;
import br.com.alura.minhasmusicas.model.Podcast;

public class Main {
    public static void main(String[] args) {
        Music myMusic = new Music();
        myMusic.setTitle("Um dia");
        myMusic.setArtist("Seu Pereira e Coletivo 401");
        for (int i = 0; i < 1000; i++) {
            myMusic.like();
        }
        for (int i = 0; i < 50; i++) {
            myMusic.play();
        }

        Podcast myPodcast = new Podcast();
        myPodcast.setTitle("Compilado Codigo Fonte");
        myPodcast.setHostPerson("Gabriel Fróes e Vanessa.");

        for (int i = 0; i < 2500; i++) {
            myPodcast.play();
        }

        for (int i = 0; i < 100; i++) {
            myPodcast.like();
        }

        MyFavorites myFavorites = new MyFavorites();
        myFavorites.include(myMusic);
        myFavorites.include(myPodcast);


    }
}
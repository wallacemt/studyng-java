package br.com.alura.minhasmusicas.model;

public class Music extends Audio {
    private String album;
    private String artist;
    private String genre;
    private String title;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public int getRating() {
        if (this.getTotalTimeReproducing() > 2000) {
            return 10;
        } else {
            return 7;
        }
    }
}

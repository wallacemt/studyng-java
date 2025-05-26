package br.com.alura.minhasmusicas.model;

public class Podcast extends  Audio{
    private String hostPerson;
    private String description;

    public String getHostPerson() {
        return hostPerson;
    }

    public void setHostPerson(String hostPerson) {
        this.hostPerson = hostPerson;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int getRating() {
        if(this.getTotalLikes() > 500) {
            return 10;
        }else{
            return 8;
        }
    }
}

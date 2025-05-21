package br.com.mysound.templates;

public class Audio {
    private String titulo;
    private int totalPlays;
    private int totalLikes;
    private double rating;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalPlays() {
        return totalPlays;
    }

    public int getTotalLikes() {
        return totalLikes;
    }

    public double getRating() {
        return rating;
    }

    public void like() {
        totalLikes++;
    }

    public void play() {
        totalPlays++;
    }
}
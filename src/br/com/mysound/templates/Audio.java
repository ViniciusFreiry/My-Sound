package br.com.mysound.templates;

public class Audio {
    private String title;
    private int totalPlays;
    private int totalLikes;
    private int rating;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getTotalPlays() {
        return totalPlays;
    }

    public int getTotalLikes() {
        return totalLikes;
    }

    public int getRating() {
        return rating;
    }

    public void like() {
        totalLikes++;
    }

    public void play() {
        totalPlays++;
    }
}
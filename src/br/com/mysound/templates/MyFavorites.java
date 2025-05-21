package br.com.mysound.templates;

public class MyFavorites {
    public void add(Audio audio) {
        if (audio.getRating() >= 8) {
            System.out.println(audio.getTitle() + " it's a huge hit!");
        } else {
            System.out.println(audio.getTitle() + " is one that everyone is enjoying!");
        }
    }
}
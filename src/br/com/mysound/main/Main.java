package br.com.mysound.main;

import br.com.mysound.templates.Music;
import br.com.mysound.templates.MyFavorites;
import br.com.mysound.templates.Podcast;

public class Main {
    public static void main(String[] args) {
        Music myMusic = new Music();
        myMusic.setTitle("Luna Bala");
        myMusic.setArtist("Ariis");

        for (int i = 0; i < 1000; i++) {
            myMusic.like();
        }

        for (int i = 0; i < 50; i++) {
            myMusic.play();
        }

        Podcast myPodcast = new Podcast();
        myPodcast.setTitle("BolhaDev");
        myPodcast.setHost("Marcus Mendes");

        for (int i = 0; i < 5000; i++) {
            myPodcast.play();
        }

        for (int i = 0; i < 1000; i++) {
            myPodcast.like();
        }

        MyFavorites myFavorites = new MyFavorites();
        myFavorites.add(myMusic);
        myFavorites.add(myPodcast);
    }
}
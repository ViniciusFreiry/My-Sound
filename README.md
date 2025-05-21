# 🎵 My Sound - Audio Management System in Java

This Java project models an audio management system that handles **Music** and **Podcast** objects, tracks their plays and likes, calculates ratings dynamically, and manages favorites based on those ratings.

## 📂 Project Structure

- **Main class** (`br.com.mysound.main.Main`): Demonstrates the creation and interaction of audio objects.
- **Templates package** (`br.com.mysound.templates`): Contains base and derived classes representing different audio types:
  - `Audio` (base class)
  - `Music` (extends `Audio`)
  - `Podcast` (extends `Audio`)
  - `MyFavorites` (manages favorite audios based on ratings)

## 📖 Classes Description

### Audio (Base Class)

- Fields: `title`, `totalPlays`, `totalLikes`, `rating`.
- Methods:
  - Getters and setters for `title`.
  - Getters for `totalPlays`, `totalLikes`, and `rating`.
  - `play()`: Increments play count.
  - `like()`: Increments like count.
- Represents general audio properties shared by all audio types.

### Music (Extends Audio)

- Additional Fields: `album`, `artist`, `genre`.
- Overrides `getRating()` method:
  - Returns `10` if `totalPlays >= 2000`.
  - Otherwise, returns `7`.
- Models a music track with artist and genre information.

### Podcast (Extends Audio)

- Additional Fields: `host`, `description`.
- Overrides `getRating()` method:
  - Returns `10` if `totalLikes >= 500`.
  - Otherwise, returns `8`.
- Models a podcast episode with host and description.

### MyFavorites

- Method `add(Audio audio)`: Evaluates the rating of an audio object.
  - Prints `"it's a huge hit!"` if rating ≥ 8.
  - Prints `"is one that everyone is enjoying!"` otherwise.
- Manages and highlights favorite audio content.

## 🚀 How the Main Class Works

```java
public class Main {
    public static void main(String[] args) {
        Music myMusic = new Music();
        myMusic.setTitle("Luna Bala");
        myMusic.setArtist("Ariis");
        
        // Simulate likes and plays
        for (int i = 0; i < 1000; i++) myMusic.like();
        for (int i = 0; i < 50; i++) myMusic.play();

        Podcast myPodcast = new Podcast();
        myPodcast.setTitle("BolhaDev");
        myPodcast.setHost("Marcus Mendes");

        // Simulate plays and likes
        for (int i = 0; i < 5000; i++) myPodcast.play();
        for (int i = 0; i < 1000; i++) myPodcast.like();

        MyFavorites myFavorites = new MyFavorites();
        myFavorites.add(myMusic);
        myFavorites.add(myPodcast);
    }
}

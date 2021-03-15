/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

/**
 *
 * @author 40757
 */
public class Song extends Item implements hasRank {

    //private String name;
    private String artist;
    private int rank;

    public Song(String artist, int rank, String name) {
        super(name);
        this.artist = artist;
        this.rank = rank;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        if (artist == null || artist.trim().equals("")) {
            throw new IllegalArgumentException(
                    "The name of the artist should not be empty.");
        }
        if (!artist.matches("[a-zA-Z]+")) {
            throw new IllegalArgumentException(
                    "The name of the artist should only contain characters: " + artist);
        }
        this.artist = artist;
    }

    public void setRank(int rank) {
        if (rank < 0) {
            throw new IllegalArgumentException(
                    "Rank should be a positive number: " + rank);
        }
        this.rank = rank;
    }

    @Override
    public int getRank() {
        return rank;
    }

}

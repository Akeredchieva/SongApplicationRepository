/**
 * Basic class for the properties and functionality of a song.
 * @author Ana Keredchieva
 * @since 14.06.2018
 */
public class Song {
    private String title;
    private String genre;
    private int timing;
    private String lyrics;

    /**
     * Basic constructor for filling all properties of the class.
     * @param title the name of the song. Type String.
     * @param genre the genre of the song. Type String.
     * @param timing the timming of the song. Integer value.
     * @param lyrics the lyrics of the song. Type String.
     */
    public Song(String title, String genre, int timing, String lyrics) {
        this.setTitle(title);
        this.setGenre(genre);
        this.setTiming(timing);
        this.setLyrics(lyrics);
    }

    /**
     * Override method toString to represent all of the properties of the song with some description.
     * @return String with all values of the parameters and some basic description.
     */
    @Override
    public String toString() {
        return "Song : \n" +
                "title: " + this.getTitle() + '\n' +
                "genre:" + this.getGenre() + '\n' +
                "timing: " + this.getTiming() + '\n' +
                "lyrics: " + this.getLyrics() + '\n' ;
    }

    /**
     * Methos which compare if the input genre is equal to the genre of the song.
     * @param genre input parameter.Type String.
     * @return True is they are equal and false if they are not.
     */
    public boolean isEqualGenre(String genre){
        return genre.equalsIgnoreCase(this.getGenre());
    }

    /**
     * Method for the timing which convert seconds into minutes.
     * @return String with converted timing and basic information.
     */
    public String getTimingSong(){
        int  minutes =  this.getTiming() / 60;
        int seconds = this.getTiming() % 60;
        return "The timing of the song is : " + minutes + ":" + seconds + " minutes\n";
    }

    /**
     * Setter for the title of the song.
     * @param title input parameter. Type String.
     */
    private void setTitle(String title) {
        if (title != null) {
            this.title = title;
        } else {
            throw new IllegalArgumentException("No value is given");
        }
    }

    /**
     * Setter for the genre of the song.
     * @param genre Input parameter. Type String.
     */
    private void setGenre(String genre) {
        if (genre != null) {
            this.genre = genre;
        } else {
            throw new IllegalArgumentException("No value is given");
        }
    }

    /**
     * Setter for the timing of the song.
     * @param timing Input parameter. Type int.
     */
    private void setTiming(int timing) {
        if (timing != 0) {
            this.timing = timing;
        } else {
            throw new IllegalArgumentException("There is no song with timing 0");
        }
    }

    /**
     * Setter for the lyrics of the song.
     * @param lyrics Input parameter. Type String.
     */
    private void setLyrics(String lyrics) {
        if (lyrics != null) {
            this.lyrics = lyrics;
        } else {
            throw new IllegalArgumentException("No value is given");
        }

    }

    /**
     * Getter for the title of the song
     * @return String type. The name of the song.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Getter for the genre of the song
     * @return String type. The genre of the song.
     */
    public String getGenre() {
        return genre;
    }

    /**
     * Getter for the timing of the song
     * @return int type. The timing of the song.
     */
    public int getTiming() {
        return timing;
    }

    /**
     * Getter for the lyrics of the song
     * @return String type. The lyrics of the song.
     */
    public String getLyrics() {
        return lyrics;
    }
}

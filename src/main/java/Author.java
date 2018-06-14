/**
 * This class represent basic properties and functionality of an author.
 * @author Ana Keredchieva
 * @since 14.06.2018
 */
public class Author {

    private String name;
    private int age;
    private Song song;

    /**
     * Basic constructor to fill all parameters os the class Author.
     * @param name the name of the Author. String parameter.
     * @param age the age of the Author. Int parameter.
     * @param song the song of the Author. It's from type class Song.
     */
    public Author(String name, int age, Song song) {

        this.setName(name);
        this.setAge(age);
        this.setSong(song);
    }

    /**
     * Method which return concatenated name and age of the Author
     * @return String with the name and age and some description
     */

    public String getAuthorNameAndAge(){
        return "Author name: " + this.getName() + '\n' +
                "Author age: " + this.getAge() + '\n';
    }

    /**
     * Method which return the name of the author and the name of the exact song.
     * @return String with the name of the author and song with some description.
     */
    public String getAuthorNameAndSongName(){
        return "Author name: " + this.getName() + '\n' +
                "Song name: " + this.getSong().getTitle() + '\n';
    }

    /**
     * Getter for the name of the author.
     * @return String with the name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for the name of the author
     * @param name String from the input
     */
    private void setName(String name) {
        if (name != null) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("No value is given");
        }
    }

    /**
     * Getter for the age of the author.
     * @return Integer with the age
     */
    public int getAge() {
        return age;
    }

    /**
     * Setter for the age of the author
     * @param age Int from the input
     */
    private void setAge(int age) {
        if (age > 0 ) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Invalid age.");
        }
    }

    /**
     * Getter for the song of the author.
     * @return Parameter from type class Song
     */
    public Song getSong() {
        return song;
    }

    /**
     * Setter for the song of the author
     * @param song parameter with type class Song from the input
     */
    private void setSong(Song song) {
        if (song != null) {
            this.song = song;
        } else {
            throw new IllegalArgumentException("No valid data");
        }
    }


}

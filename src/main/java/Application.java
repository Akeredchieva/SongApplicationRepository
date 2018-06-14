public class Application {
    public static void main(String[] args) {

        Song song = new Song("Highway to hell","Rock",260,"I'm on a highway toooo heeelll");
        Author author = new Author("AC/DC",40,song);

        System.out.println(song.toString());
        System.out.println(song.isEqualGenre("Metal"));
        System.out.println(song.getTimingSong());
        System.out.println(song.getLyrics());

        System.out.println(author.getAuthorNameAndAge());
        System.out.println(author.getAuthorNameAndSongName());
    }
}

public class SongFunction {

    String artist;
    String title;

    void play() {
        System.out.println(artist + " is singing " + title);
    }

    public static void main(String[] args){

        SongFunction Track1=new SongFunction();
        Track1.artist="Lata";
        Track1.title="Wande Matram.";
        Track1.play();
        Track1=null;

        SongFunction Track2=new SongFunction();
        Track2.artist="Sukhwindar";
        Track2.title="Jai Ho.";
        Track2.play();
        Track2=null;
    }
}

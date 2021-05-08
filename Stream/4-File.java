import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

class Four {
    
    static void workWithFiles(){
        Stream<String> songs;
        try {
            songs = Files.lines(Paths.get("Stream").resolve("songs.txt"));
            songs
            .map(String::toLowerCase)
            .filter(x -> x.contains("mar"))
            .filter(x -> x.length() > 3)
            .forEach(System.out::println);
        songs.close();

        System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void getCount(){
        Stream<String> songs;
        try {
            songs = Files.lines(Paths.get("Stream").resolve("songs.txt"));
            int count = (int)songs
            .map(String::toLowerCase)
            .filter(x -> x.contains("m"))
            .filter(x -> x.length() > 3)
            .count();
        songs.close();

        System.out.println(count);
        System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void main(String args[]){
        Four.workWithFiles();
        Four.getCount();
    }
}

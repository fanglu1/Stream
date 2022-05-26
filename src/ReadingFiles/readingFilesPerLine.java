package ReadingFiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import static java.nio.file.Path.of;
import static java.nio.file.Paths.*;

public class readingFilesPerLine {
    public static void main(String[] args) throws IOException {
        read("src/ReadingFiles/file.txt");
    }
    public static List<String> read(String file) throws IOException {
        List<String> read = new ArrayList<>();
        try{
            Files.lines(Paths.get(file)).forEach(read::add);
            read.forEach(System.out::println);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return read;
    }

}

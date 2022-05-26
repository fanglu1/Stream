package BooksFromFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class booksFromFile {
    public static void main(String[] args) throws IOException {
        readBooks("src/BooksFromFile/books.txt");
    }

    public static List<Book> readBooks(String file) throws IOException {
        List<Book> books = new ArrayList<>();
        try {
            Files.lines(Paths.get(file))
                    .map(row -> row.split(", "))
                    .filter(parts -> parts.length >= 4)
                    .map(parts -> new Book(parts[0], Integer.parseInt(parts[1]), Integer.parseInt(parts[2]), parts[3]))
                    .forEach(books::add);
            books.forEach(System.out::println);
        }
        catch(IOException e) {
            System.out.println(e.getMessage());
        }
//        System.out.println(books.toString());
        return books;
    }
}

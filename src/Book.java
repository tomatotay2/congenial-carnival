import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;

public class Book {
    private String text;

    // No-argument constructor (for cases where no URL is provided)
    public Book() {
        this.text = "";
    }

    // Constructor that takes URL and loads the book
    public Book(String urlString) throws IOException {
        this.text = loadBookFromUrl(urlString);
    }

    // Method to load the book content from a URL
    private String loadBookFromUrl(String urlString) throws IOException {
        URL url = new URL(urlString);
        BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
        StringBuilder content = new StringBuilder();
        String line;

        while ((line = reader.readLine()) != null) {
            content.append(line).append("\n");
        }

        reader.close();
        return content.toString();
    }

    // Method to get the book content as a string
    public String getText() {
        return text;
    }

    // Method to save the translated content to a file
    public void saveToFile(String content, String outputFileName) throws IOException {
        FileWriter writer = new FileWriter(outputFileName);
        writer.write(content);
        writer.close();
    }
}

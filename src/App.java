public class App {
    public static void main(String[] args) {
        String url = "https://www.gutenberg.org/cache/epub/1513/pg1513.txt";
        String outputFileName = "RomeoAndJuliet_PigLatin.txt";

        try {
            // Load the book
            Book book = new Book(url); // Correct constructor usage
            String bookContent = book.getText();

            // Translate the book to Pig Latin
            String[] lines = bookContent.split("\n");
            StringBuilder translatedContent = new StringBuilder();

            for (String line : lines) {
                translatedContent.append(PigLatinTranslator.translateLine(line)).append("\n");
            }

            // Save the translated text to the output file
            book.saveToFile(translatedContent.toString(), outputFileName);
            System.out.println("Translation complete! Saved to: " + outputFileName);
        } catch (java.io.IOException e) {
            System.err.println("An error occurred during file operations: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}

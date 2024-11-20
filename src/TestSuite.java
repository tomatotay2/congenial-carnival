public class TestSuite {
    public static void main(String[] args) {
        // Test word translation
        System.out.println("Test word translation:");
        System.out.println(PigLatinTranslator.translateWord("hello")); // Expected: ellohay
        System.out.println(PigLatinTranslator.translateWord("apple")); // Expected: appleay
        System.out.println(PigLatinTranslator.translateWord("school")); // Expected: oolschay

        // Test line translation
        System.out.println("\nTest line translation:");
        System.out.println(PigLatinTranslator.translateLine("hello world"));
        System.out.println(PigLatinTranslator.translateLine("this is a test"));

        // Test edge cases
        System.out.println("\nTest edge cases:");
        System.out.println(PigLatinTranslator.translateWord("")); // Expected: ""
        System.out.println(PigLatinTranslator.translateWord("hmm")); // Expected: hmmay
    }
}

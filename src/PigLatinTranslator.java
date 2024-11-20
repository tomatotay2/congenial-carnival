public class PigLatinTranslator {
  // Method to translate a single word into Pig Latin
  public static String translateWord(String word) {
      if (word.length() == 0) return word;

      // Find the first vowel in the word
      int firstVowelIndex = -1;
      for (int i = 0; i < word.length(); i++) {
          char c = word.charAt(i);
          if (isVowel(c)) {
              firstVowelIndex = i;
              break;
          }
      }

      if (firstVowelIndex == -1) return word + "ay"; // No vowel, just append "ay"
      String prefix = word.substring(0, firstVowelIndex);
      String suffix = word.substring(firstVowelIndex);
      return suffix + prefix + "ay";
  }

  // Method to check if a character is a vowel
  private static boolean isVowel(char c) {
      char lowerC = Character.toLowerCase(c);
      return lowerC == 'a' || lowerC == 'e' || lowerC == 'i' || lowerC == 'o' || lowerC == 'u';
  }

  // Method to translate an entire line into Pig Latin
  public static String translateLine(String line) {
      String[] words = line.split("\\s+");
      StringBuilder translatedLine = new StringBuilder();

      for (String word : words) {
          translatedLine.append(translateWord(word)).append(" ");
      }

      return translatedLine.toString().trim();
  }
}

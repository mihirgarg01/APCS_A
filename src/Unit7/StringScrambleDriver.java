package Unit7;

import java.util.ArrayList;

public class StringScrambleDriver {
   public static void main(String[] args) {
      System.out.println("\nTesting Part (b):\n");
      String[] words2 = { "TAN", "ABRACADABRA", "WHOA", "APPLE", "EGGS" };
      ArrayList<String> wordList = new ArrayList<String>();
      for (String word : words2)
         wordList.add(word);
      System.out.print(wordList);
      StringScramble ss = new StringScramble();
      ss.scrambleOrRemove(wordList);
      System.out.println(" ==> " + wordList);
   }
}
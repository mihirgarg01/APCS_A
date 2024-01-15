package Unit7;


import java.util.*;
public class StringFormatterDriver {
   public static void main(String[] args) {
      StringFormatter formatter = new StringFormatter();
        List<String> wordList = new ArrayList<String>();
        wordList.add("AP");
        wordList.add("COMP");
        wordList.add("SCI");
        wordList.add("ROCKS");
        
        System.out.println("" + wordList + "\n\tTotal number of letters: " +  formatter.totalLetters(wordList));
        System.out.println("\tNumber of gaps between words: " + formatter.gaps(wordList));
        System.out.println("\tBasic gap width: " + formatter.basicGapWidth(wordList,20) );
        System.out.println("\tLeft over spaces: " +  formatter.leftOverSpaces(wordList,20) );
        List<String>words2 = new ArrayList<String>();
        words2.add("GREEN");
        words2.add("EGGS");
        words2.add("AND");
        words2.add("HAM");
        System.out.println("" + words2 + "\n\tTotal number of letters: " +  formatter.totalLetters(words2));
        System.out.println("\tNumber of gaps between words: " + formatter.gaps(words2));
        System.out.println("\tBasic gap width: " + formatter.basicGapWidth(words2,20) );
        System.out.println("\tLeft over spaces: " +  formatter.leftOverSpaces(words2,20) );
        List<String>words3 = new ArrayList<String>();
        words3.add("BEACH");
        words3.add("BALL");
        System.out.println("" + words3 + "\n\tTotal number of letters: " +  formatter.totalLetters(words3));
        System.out.println("\tNumber of gaps between words: " + formatter.gaps(words3));
        System.out.println("\tBasic gap width: " + formatter.basicGapWidth(words3,20) );
        System.out.println("\tLeft over spaces: " +  formatter.leftOverSpaces(words3,20) );
 
   }
}
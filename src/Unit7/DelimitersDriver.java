package Unit7;


import java.util.ArrayList;
public class DelimitersDriver {
   public static String arrayToString(String[] arr) {
      String res = "[";
      for (String s: arr) {
         res += s + ", ";
      }
      res = res.substring(0,res.length()-2) + "]";
      return res;
   }
   public static void main(String[] args)
    {
        Delimiters d1 = new Delimiters("(", ")");
        String[] tokens = {"(", "x + y", ")", " * 5" };
        ArrayList<String> res1 = d1.getDelimitersList(tokens);
        System.out.println("Tokens in " + arrayToString(tokens) + ": " + res1);
        Delimiters d2 = new Delimiters("<q>", "</q>");
        String[] tokens2 = {"<q>", "yy", "</q>", "zz", "</q>"};
        ArrayList<String> res2 = d2.getDelimitersList(tokens2);
        System.out.println("Tokens in " + arrayToString(tokens2) + ": " + res2);
        
        d1 = new Delimiters("<sup>", "</sup>");
        String[] tokens3 = {"<sup>", "<sup>", "</sup>", "<sup>", "</sup>", "</sup>"};
        ArrayList<String> delList1 = d1.getDelimitersList(tokens3);
        boolean res3 = d1.isBalanced(delList1);
        System.out.println(arrayToString(tokens3) + " is balanced: " + res3);
        String[] tokens4 = {"<sup>", "</sup>", "</sup>", "<sup>"};
        ArrayList<String> delList2 = d1.getDelimitersList(tokens4);
        boolean res4 = d1.isBalanced(delList2);
        System.out.println(arrayToString(tokens4) + " is balanced: " + res4);
        String[] tokens5 = {"</sup>"};
        ArrayList<String> delList3 = d1.getDelimitersList(tokens5);
        boolean res5 = d1.isBalanced(delList3);
        System.out.println(arrayToString(tokens5) + " is balanced: " + res5);
        String[] tokens6 = {"<sup>", "</sup>", "</sup>"};
        ArrayList<String> delList4 = d1.getDelimitersList(tokens6);
        boolean res6 = d1.isBalanced(delList4);
        System.out.println(arrayToString(tokens6) + " is balanced: " + res6);
    }
}
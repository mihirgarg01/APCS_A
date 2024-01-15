public class Words {
    private ArrayList<String> myWords = new ArrayList<String>();

    public Words(Scanner scan) {
        while (scan.hasNext()) {
            myWords.add(scan.next());
        }
    }

    public ArrayList<String> wordsOfLength(int len) {
        ArrayList<String> res = new ArrayList<String>();

        for (String s : myWords) {
            if (s.length() == len) {
                res.add(s);
            }
        }

        return res;
    }

    public ArrayList<String> removeWordsOfLength(int len) {
        ArrayList<String> res = new ArrayList<String>();

        for (int i = 0; i < myWords.size(); i++) {
            if (myWords.get(i).length() == len) {
                res.add(myWords.remove(i));
            }
        }

        return res
    }

    public String toString() {
        return myWords.toString();
    }
}
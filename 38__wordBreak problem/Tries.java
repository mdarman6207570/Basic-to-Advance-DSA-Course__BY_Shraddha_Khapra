public class Tries {
    static class Node {
        Node[] children = new Node[26];
        boolean eow;

        public Node() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }
    }

    public static Node root = new Node();

    public static void insert(String word) {
        int level = 0;
        int len = word.length();
        int idx = 0;

        Node curr = root;
        for (level = 0; level < len; level++) {
            idx = word.charAt(level) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }

    public static boolean Search(String key) {
        int level = 0;
        int len = key.length();
        int idx = 0;

        Node curr = root;
        for (level = 0; level < len; level++) {
            idx = key.charAt(level) - 'a';
            if (curr.children[idx] == null) {
                return false;
            }
            curr = curr.children[idx];
        }
        return curr.eow == true;
    }

    public static boolean wordBreak(String key) {
        int len = key.length();

        if (len == 0) {
            return true;
        }
        for (int i =1; i<=len; i++) {
            if (Search(key.substring(0, i) && wordBreak(key.substring(i)))) {
                return true;
            }
        }
        return false;
    }


    public static void main(String args[]) {
        String words[] = {"the", "a", "there", "their", "any"};
        for (String word : words) {
            insert(word);
            System.out.println(word);
        }

        //System.out.println(Search("there"));
        //System.out.println(Search("thh"));
        System.out.println(wordBreak("anyatheir"));
    }
}


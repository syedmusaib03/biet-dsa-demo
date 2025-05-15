package Tries;

import java.util.Arrays;
import java.util.List;

class TrieNode {
    TrieNode[] children;
    boolean wordend;

    public TrieNode() {
        wordend = false;
        children = new TrieNode[26]; // Alphabet a to  z or  A TO Z
    }
}


public class Trie {
    //insert and search functions are important
    public static void insertWord(TrieNode root, String word) {
        TrieNode curr = root;
        for (char c : word.toCharArray()) {
            //arya = {'a','r','y','a'};
            //null means node is not present
            //so , we create a note of that character
            if (curr.children[c - 'a'] == null) {
                curr.children[c - 'a'] = new TrieNode();
            }
            curr = curr.children[c - 'a'];

        }
        curr.wordend = true;  //we have stored the word
    }

    public static boolean searchWords(TrieNode root, String word) {
        TrieNode curr = root;
        for (char c : word.toCharArray()) {
            if (curr.children[c-'a'] == null) {
                //Node is not present in the trie,return false
                return false;
            }

            curr = curr.children[c - 'a'];
        }
        return curr.wordend;
    }

    public static void main(String[] args) {
        TrieNode root = new TrieNode();
        List<String> inputWords = Arrays.asList("pooja", "jeevika", "nitish", "rama");
        for (String word : inputWords) {
            insertWord(root, word);

        }
        List<String> searchWords = Arrays.asList("pooja", "nirmal", "jeevika", "arun", "nitish", "rama", "anup");
        for(String word : searchWords){
            if(searchWords(root,word)) {
                System.out.println(word + " is present in trie");
            }else {
                System.out.println(word + "is not present in trie");
            }
        }
    }
}

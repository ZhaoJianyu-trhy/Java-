import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class _208前缀树 {
    Set<String> prefix;
    Set<String> set;
    /** Initialize your data structure here. */
    public _208前缀树() {
        prefix = new HashSet<>();
        set = new HashSet<>();
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        if (set.contains(word)) return;
        set.add(word);
        for (int i = 1; i <= word.length(); i++) {
            String pre = word.substring(0, i);
            if (prefix.contains(pre)) continue;
            prefix.add(pre);
        }
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        return set.contains(word);
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        return this.prefix.contains(prefix);
    }

    @Test
    public void test() {
        _208前缀树 tree = new _208前缀树();
        System.out.println(tree.startsWith("a"));
    }

    @Test
    public void test1() {
        Set<String> t = new HashSet<>();
        System.out.println(t.contains("a"));
    }
}

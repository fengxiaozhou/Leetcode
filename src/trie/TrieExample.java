package trie;

import java.util.Objects;

/**
 * 字典前缀树
 *
 * @author fengzhou <fengzhou@kuaishou.com>
 * Created on 2021-04-15
 */
public class TrieExample {

    DictionaryNode root;

    public TrieExample() {
        root = new DictionaryNode();
        root.setTree(new DictionaryNode[26]);
    }

    /**
     * Inserts a word into the trie.
     */
    public void insert(String word) {
        char[] chars = word.toCharArray();
        DictionaryNode index = root;
        for (char c : chars) {
            if(Objects.isNull(index)){
                index = new DictionaryNode();
                index.setTree(new DictionaryNode[26]);
            }
            index.getTree()[c-'a'] = new DictionaryNode();
            index = index.getTree()[c - 'a'];
        }
        index.setEndFlag(true);
    }

    /**
     * Returns if the word is in the trie.
     */
    public boolean search(String word) {
        char[] chars = word.toCharArray();
        DictionaryNode index = root;
        for (char c : chars) {
            if (null == index.getTree()[c - 'a']){
                return false;
            }
            index = index.getTree()[c - 'a'];
        }
        return index.isEndFlag();
    }


    /**
     * Returns if there is any word in the trie that starts with the given prefix.
     */
    public boolean startsWith(String prefix) {
        char[] chars = prefix.toCharArray();
        DictionaryNode index = root;
        for (char c : chars) {
            if (null == index.getTree()[c - 'a']){
                return false;
            }
            index = index.getTree()[c - 'a'];
        }
        return true;
    }

    public static void main(String[] args) {

        TrieExample trieExample = new TrieExample();
        trieExample.insert("app");
        trieExample.insert("apple");
        trieExample.search("apps");
        trieExample.search("app");

        System.out.println(trieExample.search("app"));


    }
}

class DictionaryNode {
    private boolean endFlag;
    private DictionaryNode[] tree;

    public DictionaryNode() {
        endFlag = false;
        tree = new DictionaryNode[26];
    }

    public boolean isEndFlag() {
        return endFlag;
    }

    public void setEndFlag(boolean endFlag) {
        this.endFlag = endFlag;
    }

    public DictionaryNode[] getTree() {
        return tree;
    }

    public void setTree(DictionaryNode[] tree) {
        this.tree = tree;
    }
}
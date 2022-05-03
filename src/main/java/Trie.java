import java.nio.charset.StandardCharsets;

public class Trie {
    private Node root;
    public Trie(){
     root=new  Node('\0');
    }

    public void insert(String word){
        Node curr=root;
       for(int i=0;i<word.length();i++){
           char c=word.charAt(i);
           if(curr.children[c-'a']==null){
               curr.children[c-'a']=new Node(c);
           }
           curr=curr.children[c-'a'];
       }
       curr.isWord=true;
    }

    public boolean search(String word){
       Node node=getNode(word);
       if (node!=null &&node.isWord==true){
           return true;
       }
       return false;
    }

    public boolean startsWith(String prefix){
        Node node=getNode(prefix);
        return node!=null;

    }

    private Node getNode(String word){
        Node curr=root;
        for(int i=0;i<word.length();i++){
            char c=word.charAt(i);
            if(curr.children[c-'a']==null){
               return null;
            }
            curr=curr.children[c-'a'];
        }
        return curr;
    }
}

class Node{
    public char c;
    public boolean isWord;
    public Node[] children;

    public Node(char c){
        this.c=c;
        isWord=false;
        children=new Node[256];
    }
}

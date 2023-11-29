import java.util.LinkedList;

public class WordFreq {
   public static int getHash(String word){
     int hash=word.hashCode();
     return hash;
   }

   public static Node count(LinkedList<Node> list, String key){
    for(Node node:list){
        if(node.key.equals(key)){
            return node;
        }
    }
    return null;
   }

}
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to hashTable program to calculate word frequency");
        String data = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidabl situations";
        String words[] = StringSplit.splitText(data);

        Map<Integer, LinkedList<Node>> hashTable = new HashMap<>();
        for (String word : words) {
            int currentHash = WordFreq.getHash(word);
            if (hashTable.containsKey(currentHash)) {
                LinkedList<Node> currList = hashTable.get(currentHash);

                Node existingNode = WordFreq.count(currList, word);
                if (existingNode == null) {
                    currList.add(new Node(word, 1));
                } else {
                    existingNode.val++;
                }
            } else {
                LinkedList<Node> newList = new LinkedList<>();
                newList.add(new Node(word, 1));
                hashTable.put(currentHash, newList);
            }
        }

        for (Map.Entry<Integer, LinkedList<Node>> entry : hashTable.entrySet()) {
            LinkedList<Node> list = entry.getValue();
            Integer hash = entry.getKey();
            System.out.println("-----------------------hash : " + hash + " -------------------------");
            for (Node node : list) {
                System.out.println("Frequency of " + node.key + ": " + node.val);
            }
        }
    }
}

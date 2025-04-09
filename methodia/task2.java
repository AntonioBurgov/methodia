package methodia;

import java.util.*;

public class task2 {
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a sentece: ");
        String text = sc.nextLine().toLowerCase();
        
        text = text.replaceAll("[^a-zA-Z ]", "").toLowerCase();

        String[] words = text.split(" ");
        
        HashMap<String, Integer> broi = new HashMap<>();
        
        for (String word : words) {
            if (!word.isEmpty()) {
                if (broi.containsKey(word)) {
                    broi.put(word, broi.get(word) + 1);
                } else {
                    broi.put(word, 1);
                }
            }
        }
        
        List<String> sorted = new ArrayList<>(broi.keySet());
        Collections.sort(sorted);
        
        System.out.println("Word:");
        for (String word : sorted) {
            System.out.println(word + " - " + broi.get(word));
        }
    }
}
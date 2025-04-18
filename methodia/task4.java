package methodia;

import java.util.HashMap;
import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
   	
        Scanner sc = new Scanner(System.in);
        System.out.print("enter to words with space: ");
        String text = sc.nextLine().toLowerCase();
        
        HashMap<Character, Integer> charCount = new HashMap<>();
        
        for (char c : text.toCharArray()) {
            if (charCount.containsKey(c)) {
                charCount.put(c, charCount.get(c) + 1);
            } else {
                charCount.put(c, 1);
            }
        }
        
        for (char c : charCount.keySet()) {
            if (charCount.get(c) > 1) {
                System.out.println(c + ": " + charCount.get(c));
            }
        }
    }
}
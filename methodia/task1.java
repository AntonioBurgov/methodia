package methodia;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {	
   
        Scanner sc = new Scanner(System.in);
        System.out.print("enter something: ");
        String text = sc.nextLine();

        char[] letters = text.toCharArray();
        int start = 0;
        int end = letters.length - 1;
        
        while (start < end) {
            char temp = letters[start];
            letters[start] = letters[end];
            letters[end] = temp;
            start++;
            end--;
        }
        
        String reversed = new String(letters);
        System.out.println(reversed);
    }
}
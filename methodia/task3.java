package methodia;

import java.util.*;

public class task3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("BMW");
        list.add("Mercedes");
        list.add("Audi");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        int j = 0;
        while (j < list.size()) {
            System.out.println(list.get(j));
            j++;
        }

        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
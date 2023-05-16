package java230516;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class JavaName {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            System.out.print("\nYour name? >> ");
            String s = scan.next();
            a.add(s);
        }

        for (int i = 0; i < a.size(); i++) {
            String name = a.get(i);
            System.out.print(name + " ");
        }

        v.add(-1);
        v.add(2, 100);
        Iterator<Integer> it = v.iterator();
        while (it.hasNext()) {
            int n = it.next();
            System.out.println(n);
        }
    }
}

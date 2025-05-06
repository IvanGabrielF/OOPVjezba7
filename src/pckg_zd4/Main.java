package pckg_zd4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main implements Comparator<String> {
    public static void main(String[] args) {

        File txt = new File("src/pckg_zd4/ribe.txt");
        LinkedList<String> list = new LinkedList<>();

        try {
            Scanner scanner = new Scanner(txt);
            while (scanner.hasNextLine()) {
                list.add(scanner.nextLine());
            }
            System.out.println("String lista: ");
            System.out.println(list);
            Collections.sort(list, new Main());
            Collections.reverse(list);
            System.out.println("Lista sortirana po dužini riječi:");
            System.out.println(list);

        } catch (FileNotFoundException e) {
            System.out.println("Inavlid pathFile");
        }


    }

    @Override
    public int compare(String o1, String o2) {
        if (o1.length() > o2.length()) {
            return 1;
        } else if (o2.length() > o1.length()) {
            return -1;

        } else {
            return 0;
        }
    }
}

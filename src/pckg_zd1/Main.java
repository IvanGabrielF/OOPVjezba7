package pckg_zd1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("auto");
        list.add("svemirski brod");
        list.add("avion");
        list.add("helikopter");
        list.add("jedrilica");
        list.add("gliser");
        list.add("romobil");
        list.add("bicikla");

        System.out.println("Bez sort-a: ");
        for (String str : list) {
            System.out.println(str);
        }
        Collections.sort(list);
        System.out.println("-----------------------------------------");
        System.out.println("Abecedno: ");
        for (String str : list) {
            System.out.println(str);
        }

        Collections.sort(list, new LengthStrComparator());
        System.out.println("-----------------------------------------");
        System.out.println("Po duljini stringa: ");
        for (String str : list) {
            System.out.println(str);
        }

        Collections.sort(list, new DescendingStrComparator());
        System.out.println("-----------------------------------------");
        System.out.println("Silazno abecedno: ");
        for (String str : list) {
            System.out.println(str);
        }
    }


    }


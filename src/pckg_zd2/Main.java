package pckg_zd2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    private static final int MAX = 1000;
    private static final int MIN = 10;

    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList = popuni(integerArrayList, 10);

        System.out.println("Prije sorta:");
        System.out.println(integerArrayList);

        Collections.sort(integerArrayList);
        System.out.println("Poslije sorta:");
        System.out.println(integerArrayList);

        ReverseOrder reverse = new ReverseOrder() {
            @Override
            public void revOrder(ArrayList<Integer> arrayList) {
                Collections.reverse(arrayList);
                System.out.println("Unatrag:");
                System.out.println(arrayList);
            }
        };

        reverse.revOrder(integerArrayList);
    }

    public static ArrayList<Integer> popuni(ArrayList<Integer> arrayList, int numEl) {
        for (int i = 0; i < numEl; i++) {
            arrayList.add(ThreadLocalRandom.current().nextInt(MIN, MAX));
        }
        return arrayList;
    }

    interface ReverseOrder {
        void revOrder(ArrayList<Integer> arrayList);
    }
}

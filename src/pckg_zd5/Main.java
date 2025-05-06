package pckg_zd5;

import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> vehicles = new LinkedList<>();
        vehicles.add("car");
        vehicles.add("helicopter");
        vehicles.add("electronic bike");
        vehicles.add("truck");
        vehicles.add("motorcycle");
        vehicles.add("carriage");
        printList(vehicles);

        Iterator<String> iterator = vehicles.iterator();
        System.out.println("+++++++++");
        while (iterator.hasNext()){
            String iter = iterator.next();
            System.out.println(iter + " ");
            if ("carriage".equals(iter)){
                vehicles.remove("carriage");
            }
        }
        System.out.println("After loop: ");
        printList(vehicles);
        ListProcessing.insertVehicle(vehicles);
        printList(vehicles);

    }
    private static void printList(LinkedList<String> list){
        System.out.println("for each: ");
        for (String str : list){
            System.out.println(str);
        }
    }
}

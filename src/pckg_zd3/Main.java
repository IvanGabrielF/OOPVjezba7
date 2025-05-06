package pckg_zd3;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Main {
    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);
        queue.add(1);
        queue.add(5);
        queue.add(10);
        queue.add(15);
        queue.add(20);

        System.out.println(queue);

        try {
            queue.add(25);
        }catch (IllegalStateException ise){
            System.out.println("Queue full!");
        }

        removeEl(queue);
        System.out.println(queue);

        addNewEl(queue, 289);
        System.out.println(queue);

        removeEl(queue);
        addNewEl(queue, 291);
        System.out.println(queue);





    }
    public static void removeEl(Queue<Integer> queue){
        if (!queue.isEmpty()){
            System.out.println("Uklonjen: " + queue.peek());
        }else {
            System.out.println("Queue empty");
        }
    }

    public static void addNewEl(Queue<Integer> queue, int newEl){
        try {
            queue.add(newEl);
            System.out.println("Adding new element!");
        }catch (IllegalStateException ise){
            System.out.println("Queue full!");
        }
    }
}

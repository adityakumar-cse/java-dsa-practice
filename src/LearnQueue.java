import java.util.LinkedList;
import java.util.Queue;

public class LearnQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(12);
        queue.offer(17);
        queue.offer(13);
        queue.offer(18); // add
        System.out.println(queue);
        System.out.println(queue.poll()); // remove
        System.out.println(queue);
        System.out.println(queue.peek());
    }
}

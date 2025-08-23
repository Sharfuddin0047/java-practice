import java.util.*;
import java.util.LinkedList;

public class QueueC {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();   // you can also implement using ArrayDeque
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}

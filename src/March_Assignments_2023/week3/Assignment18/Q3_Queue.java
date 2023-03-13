package March_Assignments_2023.week3.Assignment18;

import java.util.PriorityQueue;
import java.util.Queue;

public class Q3_Queue {

    public static void main(String[] args) {
        Queue<Integer> queue= new PriorityQueue<>();
        queue.add(40);
        queue.add(54);
        queue.add(688);
        queue.add(879);
        queue.add(8989);

        System.out.println("Original Queue : "+ queue);

        queue.poll();
        System.out.println("Queue after Removal : "+ queue);

        System.out.println("Peek : "+ queue.peek());
        System.out.println("Is queue Empty ? "+ queue.isEmpty());
    }
}
/*
Original Queue : [40, 54, 688, 879, 8989]
Queue after Removal : [54, 879, 688, 8989]
Peek : 54
Is queue Empty ? false
*/
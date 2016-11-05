package solution;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.next());
        int count = 0;

        Comparator<Integer> comparator = (o1, o2) -> {
            if( o1 < o2 ){
                return -1;
            }
            if( o1 > o2 ){
                return 1;
            }
            return 0;
        };

        Queue<Integer> queue = new PriorityQueue<>(comparator);

        for (int i = 0; i < num; i++) {
            int first = scanner.nextInt();
            if (first == 1) {
                queue.add(scanner.nextInt());
            } else {
                count++;
            }
        }

        for (int i = 0; i < count; i++) {
            System.out.println(queue.poll());
        }


    }

}

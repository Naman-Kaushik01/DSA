package queue;

import java.util.ArrayDeque;



import java.util.Queue;

public interface Main {
	public static void main(String[] args) {
		Queue<Integer> queue = new ArrayDeque<>();
		queue.offer(10);
		queue.offer(20);
		queue.offer(30);
		queue.offer(40);
		
		System.out.println("Queue Elements :"+queue);
		queue.poll();
		queue.poll();
		
		System.out.println("After Deletion Queue Elements "+queue);
		
	}

}

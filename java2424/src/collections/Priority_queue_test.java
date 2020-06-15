package collections;

import java.util.PriorityQueue;

public class Priority_queue_test {
	public static void main(String[] args) {
		
	
	PriorityQueue<Object> pq =new PriorityQueue<Object>();
	
	pq.add("1nagaraj");
	System.out.println(pq);
	pq.add("nani");
	pq.add("sri ram");
	pq.add("naga");
    pq.add("venkat");
	System.out.println(pq);
	pq.remove("2nagaraj");
	System.out.println(pq.peek());//shows the peek value
	System.out.println(pq.poll());//show and removes the peek value
	System.out.println(pq.poll());
	System.out.println(pq.element());


}}

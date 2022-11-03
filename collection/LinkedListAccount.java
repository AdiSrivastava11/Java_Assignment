package collection;

import java.util.*;
import java.util.LinkedList;

public class LinkedListAccount {

	public static void main(String[] args) {
		
        Queue<Account> q = new PriorityQueue<Account>();

        q.offer(new Account("Aditya",23000,88551));
        q.offer(new Account("John",24000,99662));
        q.offer(new Account("Mark",25000,774411));
        q.offer(new Account("Sam",26000,663301));
        //peek returns element at the mouth but does not remove it
      	//poll returns element at the mouth also removes it from there
      	//next elements then moves in to mouth
        System.out.println(q.peek());
        System.out.println(q.size());
        System.out.println(q.poll());
        System.out.println(q.size());

        System.out.println(q);

        //linked list - FIFO Structure

        Queue<Account> q1 =new LinkedList<Account>();

        q1.offer(new Account("Alpha",30000,7869));
        q1.offer(new Account("Beta",31000,3389));
        q1.offer(new Account("Gamma",32200,9086));
        q1.offer(new Account("Delta",33330,8696));

        //peek returns element at the mouth but does not remove it
      	//poll returns element at the mouth also removes it from there
      	//next elements then moves in to mouth
        System.out.println(q1.peek());
        System.out.println(q.size());

        System.out.println(q1.poll());
        System.out.println(q1.size());

        System.out.println(q1);

	}

}

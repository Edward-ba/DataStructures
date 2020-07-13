package com.company;
import java.lang.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        Stack stk = new Stack();
        Queue queue = new Queue();

        stk.push(4);
        System.out.println(stk.pop().num);
        System.out.println(stk.pop().num);

        queue.push(4);
        System.out.println(queue.pop().num);
        queue.push(3);
        queue.push(5);
        queue.push(7);
        queue.push(6);
        queue.push(9);
        queue.push(8);
        queue.push(1);
        queue.push(2);
        queue.push(10);
        queue.push(43);
        queue.push(111);
        System.out.println(queue.pop().num);
        System.out.println(queue.pop().num);
        System.out.println(queue.pop().num);
        System.out.println(queue.pop().num);
        System.out.println(queue.pop().num);
        System.out.println(queue.pop().num);
        System.out.println(queue.pop().num);
        System.out.println(queue.pop().num);
        System.out.println(queue.pop().num);
        System.out.println(queue.pop().num);
        System.out.println(queue.pop().num);
    }
}

package com.company;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        Stack stk = new Stack(10);
        Queue queue = new Queue(10);

        stk.push(4);
        System.out.println(stk.pop().bool);
        System.out.println(stk.pop().bool);

        queue.push(4);
        queue.push(2);
        System.out.println(queue.pop().num);
        System.out.println(queue.pop().num);
    }
}

package com.company;
import java.lang.*;
import java.util.*;

public class Queue {
    int size = 10;
    int[] arr = new int[size];
    int last = 0;
    int first = 0;
    int numInArray = 0;


    public boolean push(int num) {
        if (numInArray == size) {
            System.out.println("sorry but your queue is full.");
            return false;
        }
        arr[last] = num;
        ++last;
        ++numInArray;
        if (last == size)
        {
            last = 0;
        }
        return true;
    }

    public IntBool pop()
    {
        IntBool intBool = new IntBool();
        if (numInArray == 0) {
            intBool.bool = false;
            System.out.println("sorry but your queue is empty.");
            return intBool;
        }
        intBool.num = arr[first];
        intBool.bool = true;
        arr[first] = 0;
        --numInArray;
        ++first;
        if (first == size){
            first = 0;
        }
        return intBool;
    }
}

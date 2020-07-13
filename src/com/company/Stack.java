package com.company;
import java.lang.*;
import java.util.*;

public class Stack {
    int[] arr = new int[10];
    int last = 0;
    int size;

    void Display()
    {
        for (int i = 0;i < last;++i)
            System.out.print(arr[i]);
        System.out.println();
    }

    public boolean push(int num) {
        if (last >= arr.length)
            return false;
        arr[last] = num;
         ++last;
        return true;
    }

    public IntBool pop() {
        IntBool intBool = new IntBool();
        if (last == 0) {
            intBool.bool = false;
            return intBool;
        }
        --last;
        intBool.num = arr[last];
        intBool.bool = true;
        return intBool;
    }

    public IntBool peek(int index) {
        IntBool intBool = new IntBool();
        if (last == 0 || index >= last) {
            intBool.bool = false;
            return intBool;
        }
        intBool.bool = true;
        intBool.num = arr[index];
        return intBool;
    }

    public IntBool stackTop() {
        IntBool intBool = new IntBool();
        if (!isEmpty()) {
            intBool.bool = false;
            return intBool;
        }
        intBool.num = arr[last - 1];
        intBool.bool = true;
        return intBool;
    }

    public boolean isEmpty() {
        if (last == 0)
            return true;
        return false;
    }

    public boolean isFull() {
        if (last == size - 1)
            return true;
        return false;
    }

}

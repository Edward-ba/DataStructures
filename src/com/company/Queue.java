package com.company;

public class Queue {
    int[] arr = new int[2147483647];
    int last = 0;
    int first = 0;

    public boolean push(int num)
    {
        arr[last] = num;
        ++last;
        return true;
    }

    public IntBool pop()
    {
        IntBool intBool = new IntBool();
        if (last == first)
        {
            intBool.bool = false;
            return intBool;
        }

        intBool.num = arr[first];
        intBool.bool = true;
        ++first;

        return intBool;
    }
}

package com.company;

public class Que {
    int[] arr;
    int sz;
    int last = 0;

    Que(int sz)
    {
        this.arr = new int[sz];
        this.sz = sz;
    }

    public boolean push(int num)
    {
        if (last >= sz)
            return false;
        arr[last] = num;
        ++last;
        return true;
    }

    public IntBool pop()
    {
        int tmp;
        IntBool intBool = new IntBool();
        if (last <= 0)
        {
            intBool.bool = false;
            return intBool;
        }

        intBool.num = arr[0];
        intBool.bool = true;

        for (int i = 0; i < last; ++i)
        {
            tmp = arr[i + 1];
            arr[i] = tmp;
        }
        --last;
        return intBool;
    }
}

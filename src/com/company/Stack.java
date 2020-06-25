package com.company;

public class Stack {
    public int[] stack;
    int last = 0;

    Stack(int sz) {
        this.stack = new int[sz];
    }

    public boolean push(int num) {
        if (last >= stack.length)
        {
            return false;
        }
        stack[last] = num;
         ++last;
        return true;
    }

    public IntBool pop() {
        IntBool intBool = new IntBool();
        if (last == 0)
        {
            intBool.bool = false;
            return intBool;
        }
        --last;
        intBool.num = stack[last];
        intBool.bool = true;
        return intBool;
    }

}

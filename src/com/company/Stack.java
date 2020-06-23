package com.company;

public class Stack {
    int stack[];
    int last = 0;

    Stack(int sz) {
        stack = new int[sz];
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
        intBool.num = stack[last];
        --last;
        return intBool;
    }

}

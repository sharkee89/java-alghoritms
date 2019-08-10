package com.stefan.alghoritms;

import java.util.Arrays;

public class TheStack {

    private String[] stackArray;
    private int stackSize;
    private int topOfTheStack = -1;

    public TheStack(int size) {
        stackSize = size;
        stackArray = new String[stackSize];
        Arrays.fill(stackArray,"-1");
    }

    public String[] getStack() {
        return stackArray;
    }

    public void push (String item) {
        if (topOfTheStack < stackSize - 1) {
            topOfTheStack++;
            stackArray[topOfTheStack] = item;
        } else {
            System.out.println("Stack is full");
        }
    }

    public void pop () {
        if (topOfTheStack >= 0) {
            stackArray[topOfTheStack] = "-1";
            topOfTheStack--;
        } else {
            System.out.println("Stack is already empty so you can't pop the element.");
        }
    }

    public String peek () {
        if (topOfTheStack >= 0) {
            return stackArray[topOfTheStack];
        } else {
            return "Stack is empty.";
        }
    }

    public void pushMany(String items) {
        String[] itemList = items.split(" ");
        for (int i = 0; i < itemList.length; i++) {
            push(itemList[i]);
        }
    }

    public void popAll () {
        if (topOfTheStack >= 0) {
            for (int i = topOfTheStack; i >= 0; i--) {
                pop();
            }
        } else {
            System.out.println("Stack is empty you can't pop all.");
        }
    }

}

package com.stefan.alghoritms;

import java.util.Arrays;

public class TheQueue {

    private String[] queueArray;
    private int queueSize;
    private int front = 0;
    private int rear = 0;
    private int numOfItems = 0;

    public TheQueue(int size) {
        queueSize = size;
        queueArray = new String[queueSize];
        Arrays.fill(queueArray, "-1");
    }

    public String[] getQueue () {
        return queueArray;
    }

    public void insert (String item) {
        if (numOfItems + 1 < queueSize) {
            queueArray[rear] = item;
            rear++;
            numOfItems++;
        } else {
            System.out.println("Queue reached maximum size.");
        }
    }

    public void priorityInsert (String item) {
        int i = 0;
        if (numOfItems == 0) {
            insert(item);
        } else {
            for (i = numOfItems - 1; i >= 0; i--) {
                if (Integer.parseInt(item) > Integer.parseInt(queueArray[i])) {
                    queueArray[i + 1] = queueArray[i];
                } else {
                    break;
                }
            }
            queueArray[i + 1] = item;
            rear++;
            numOfItems++;
        }
    }

    public void remove () {
        if (numOfItems > 0) {
            queueArray[front] = "-1";
            front++;
            numOfItems--;
        } else {
            System.out.println("Queue is empty.");
        }
    }

    public String peek () {
        if (numOfItems > 0) {
            return queueArray[front];
        } else {
            return "Queue is empty.";
        }
    }

}

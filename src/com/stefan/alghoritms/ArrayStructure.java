package com.stefan.alghoritms;

public class ArrayStructure {

    private int[] theArray = new int[50];
    private int arraySize = 10;

    public void generateRandomArray() {
        for (int i = 0; i < arraySize; i++) {
            theArray[i] = (int)(Math.random() * 10) + 10;
        }
    }

    public void printArray() {
        System.out.println("----------");
        for(int i = 0; i < arraySize; i++){
            System.out.print("| " + i + " | ");
            System.out.println(theArray[i] + " |");
            System.out.println("----------");
        }
    }

    public int getValueAtIndex(int index) {
        if (index < arraySize) return theArray[index];
        return 0;
    }

    public boolean doesArrayContainsValue(int value) {
        boolean containsValue = false;
        for (int i = 0; i < arraySize; i++) {
            if (theArray[i] == value) {
                containsValue = true;
                return containsValue;
            }
        }
        return containsValue;
    }

    public void deleteIndex(int index) {
        if (index < arraySize) {
            for (int i = index; i < (arraySize - 1); i++) {
                theArray[i] = theArray[i + 1];
            }
            arraySize--;
        }
    }

    public void insertValue(int value) {
        if (arraySize < 50) {
            theArray[arraySize] = value;
            arraySize++;
        }
    }

    public String linearSearchForValue(int value) {
        String foundIndexes = "";
        boolean foundValue = false;
        for (int i = 0; i < arraySize; i++) {
            if (theArray[i] == value) {
                foundValue = true;
                foundIndexes += i + " ";
            }
        }
        if (!foundValue) {
            foundIndexes = "None";
        }
        return foundIndexes;
    }

}

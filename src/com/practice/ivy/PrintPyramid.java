package com.practice.ivy;

public class PrintPyramid {
    public static void main(String[] args) {
        int levels = 4;
        PrintPyramid printPyramid = new PrintPyramid();
        printPyramid.displayPyramid(levels,1,levels);
    }

    void displayPyramid(int level,int limit,int counter){
        if(counter >0){
            int spaceCounter = level-1;
            while(spaceCounter > 0){
                System.out.println(" ");
                spaceCounter--;
            }
            while(limit > 0){
                System.out.println(limit+"\n");
                limit--;
            }
            displayPyramid(level - 1, limit + 2,counter--);
        }

    }
}

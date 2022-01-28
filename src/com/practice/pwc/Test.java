package com.practice.pwc;

public class Test implements Runnable{
    private int start ;
    private int end;
    Test(int s, int e){
        this.start = s;
        this.end = e;
    }

    @Override
    public void run() {
        printNumber(start, end);
    }

    void printNumber(int s, int e){
            while(s <= e){
                System.out.println(s);
                s++;
            }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new Test(1,10));
        Thread t2 = new Thread(new Test(11,20));
        Thread t3 = new Thread(new Test(21,30));
        t1.start();
        Thread.sleep(1000);
        t2.start();
        Thread.sleep(1000);
        t3.start();
    }
}

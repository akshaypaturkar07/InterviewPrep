package com.practice.altimetrik;

public class C extends B{
    C(){
        System.out.println("Class C constructor");
    }

    void print(){
        System.out.println("printing from class C");
    }

    public static void main(String[] args) {
        C c = new C();
        c.print();
        A a = new C();
        a.print();
    }
}

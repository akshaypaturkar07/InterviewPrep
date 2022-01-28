package com.practice.synechron;

public class CheckoOutput {
    public static void main(String[] args) {
      CheckoOutput checkoOutput = new CheckoOutput();
        System.out.println(checkoOutput.demoMethod());
    }
    public int demoMethod(){
        try{
            System.out.println("inside try");
            return 0;
        }
        finally{
            System.out.println("inside finally");
            return 1;
        }
    }
}

package com.practice;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Sun@rise";
        System.out.println(printReversed(str)); //esi@rnus
    }

    static String printReversed(String str){
        int index = str.indexOf("@");
        StringBuffer sb = new StringBuffer();
        int counter =0;
        for(int i = str.length()-1; i>=0;i--){
            counter++;
            if(counter == index+1){
                sb.append("@");
            }else if(str.charAt(i) == '@'){
                sb.append(str.charAt(counter));
            }else{
                sb.append(str.charAt(i));
            }

        }
        return sb.toString();
    }
}

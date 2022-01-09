package com.practice.tavant;

import java.util.LinkedHashMap;
import java.util.Map;
/**
 *  Programme to check first repeated character in a String
 *  input String str = "my name is akshay"
 *  output Character result = n
 */
public class FirstRepeatedChar {
    public static void main(String[] args) {
        String str = "my name is akshay";
        char[] arr = str.toCharArray();
        Map<Character,Integer> map = new LinkedHashMap<>();
        for(int i=0;i< arr.length;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],1);
            }else{
                map.put(arr[i],map.get(arr[i])+1);
            }
        }
        System.out.println(printFirstRepeatedChar(map));
    }
    
    static Character printFirstRepeatedChar(Map<Character,Integer> map){
        Character result = null; 
       for(Map.Entry<Character,Integer> entry:map.entrySet()){
           if(entry.getValue() == 1){
               result = entry.getKey();
               break;
           }
       }
       return result;
    }
}

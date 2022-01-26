package com.practice.FIS;

import java.util.HashMap;
import java.util.Map;

public class CharachterCount {
    public static void main(String[] args) {
            String str = "aaabaabbcccdd";
            Map<Character,Integer> charMap = new HashMap<>();
            char[] chars = str.toCharArray();
            for(char c: chars){
                if(!charMap.containsKey(c)){
                    charMap.put(c,1);
                }else{
                    charMap.put(c,charMap.get(c)+1);
                }
            }

            for(Map.Entry<Character,Integer> entry :charMap.entrySet()){
                int max  = entry.getValue();

            }
    }
}

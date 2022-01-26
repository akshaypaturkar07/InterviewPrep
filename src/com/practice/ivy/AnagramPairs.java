package com.practice.ivy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class AnagramPairs {
    public static void main(String[] args) {
        String [] strs = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> list = checkAnagram(strs);
        list.stream().forEach(e->System.out.println(e));

    }

    static List<List<String>> checkAnagram(String[] strs){
        List<List<String>> list = new ArrayList<>();
        HashMap<String , ArrayList<String>> map = new HashMap<>();
        for(String s : strs){
            char[] ch = s.toCharArray();
            //sorted strings with same chars, will be the same
            Arrays.sort(ch);
            String sorted_string = new String(ch);
            if(map.containsKey(sorted_string)){
                ArrayList<String> currlist = map.get(sorted_string);
                currlist.add(s);
                map.put(sorted_string,currlist);
            }
            else{
                ArrayList<String> li = new ArrayList();
                li.add(s);
                map.put(sorted_string,li);
            }
        }
        for(String s : map.keySet()){
            list.add(new ArrayList(map.get(s)));
        }
        return list;
    }
}

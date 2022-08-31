package com.itheima.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

    public static void main(String[] args) {
      String digits = "23";
        Map<Character,String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        List <String> list =  dfs (digits,new StringBuffer(), 0, map,new ArrayList<String>());
        System.out.println(list);

    }



    public static List<String> dfs(String digits, StringBuffer stringBuffer, int index, Map<Character, String> map,List <String> list) {
        if (index == digits.length()) {
            list.add(stringBuffer.toString());
            return null;
        }else{
            String str = new String(map.get(digits.charAt(index)));
            int size = str.length();
            char [] c = str.toCharArray();
            for (int i = 0; i < size; i++) {
                stringBuffer.append(c[i]);
                dfs(digits , stringBuffer ,index+1, map,list);
                stringBuffer.deleteCharAt(index);
            }
        }
        return list;
    }
}

package com.example.tanzilyayakshimbetova.javatest;
import java.util.List;
import java.util.Collections;

public class LongestWord {
    public String findLongestWord(String s, List<String> d) {
        Collections.sort(d);
        int max = 0;
        String result = "";
        for (int i = 0; i < d.size(); i++) {
            String str = d.get(i);
            char [] array = str.toCharArray();
            int start = -1;
            boolean check = true;
            for (int j = 0; j < array.length; j++) {
                int index = s.indexOf(array[j], start+1);
                if ( index >= 0 && index > start) {
                    start = index;
                }
                else {
                    check = false;
                    break;
                }
            }
            if (check == true) {
                if (str.length() > max) {
                    max = str.length();
                    result = str;
                }
            }
        }
        return result;
    }
}

package com.program.general;

public class Anagram {

    boolean isAnagram(String s , String t){

        if(s.length()!=t.length()){
            return false;
        }

        int [] counts = new  int [26];

        for(int i=0;i<s.length();i++){
            int k = counts[s.charAt(i) -'a']++;
            int r = counts[t.charAt(i)-'a']--;
        }
        for(int c:counts){
            if(c!=0){
                return false;
            }
        }
        return true;
    }
}

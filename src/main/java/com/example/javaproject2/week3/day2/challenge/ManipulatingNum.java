package com.example.javaproject2.week3.day2.challenge;

class Solution4 {
    public String solution4(int[] numLog){
        String result = "";
        for(int i = 0; i < numLog.length - 1; i++){
            switch (numLog[i + 1] - numLog[i]){
                case 1 :
                    result += "w";
                    break;
                case -1 :
                    result += "s";
                    break;
                case 10 :
                    result += "d";
                    break;
                case -10 :
                    result += "a";
                    break;
            }
        }
        return result;
    }
}
public class ManipulatingNum {
    public static void main(String[] args) {
        int[] log = {0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1};
        Solution4 s4 = new Solution4();
        System.out.println(s4.solution4(log));
    }
}

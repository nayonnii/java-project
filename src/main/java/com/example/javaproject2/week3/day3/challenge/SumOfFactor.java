package com.example.javaproject2.week3.day3.challenge;

class Solution{
    public int solution(int n){
        int answer = 0;
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) answer += i;
        }
        return answer;
    }
}
public class SumOfFactor {
    public static void main(String[] args) {
        int n = 12;
        Solution s = new Solution();
        System.out.println(s.solution(n));
    }
}

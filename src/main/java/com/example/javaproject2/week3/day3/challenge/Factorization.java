package com.example.javaproject2.week3.day3.challenge;

import java.util.Arrays;

class Solution2 {
    public int[] solution2(int num) {
        String primeFactor = "";  // 소인수를 저장할 변수 선언

        for (int i = 2; i <= num; i++) {   //소인수 구하기
            if (num % i == 0) {
                primeFactor += i + " ";
                if (num / i == 1) break;

                num /= i;
                i = 1;
            } else {
                continue;
            }
        }

        String[] primeFactorArr = primeFactor.split(" "); //문자열로 저장된 소인수를 .split()을 통해 valArr배열에 저장
        String newPrimeFactor = ""; // 소인수에서 중복된 숫자를 제거한 문자열을 저장할 변수 선언

        for (int i = 0; i < primeFactorArr.length; i++) {   // 중복 숫자 제거하기
            if (primeFactorArr[i] != primeFactorArr[primeFactorArr.length - 1] && primeFactorArr[i].equals(primeFactorArr[i + 1])) {
                continue;
            }
            newPrimeFactor += primeFactorArr[i] + " ";
        }

        String[] newPrimeFactorArr = newPrimeFactor.split(" ");  //중복이 제거된 소인수 문자열을 .split을 통해 answerString배열에 저장

        int[] answer = new int[newPrimeFactorArr.length];    //중복까지 제거된 소인수를 int형으로 저장할 배열 선언

        for (int i = 0; i < answer.length; i++) {       //int형으로 변환
            answer[i] = Integer.parseInt(newPrimeFactorArr[i]);
        }
        return answer;
    }
}

public class Factorization {
    public static void main(String[] args) {
        int num = 420;
        Solution2 s2 = new Solution2();
        for (int i = 0; i < s2.solution2(num).length; i++) {
            System.out.println(s2.solution2(num)[i]);
        }
    }
}

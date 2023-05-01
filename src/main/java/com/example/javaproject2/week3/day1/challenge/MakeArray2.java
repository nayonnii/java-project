package com.example.javaproject2.week3.day1.challenge;

import java.util.Arrays;

class Solution4 {
    public int[] solution4(int l, int r) {
        int[] arr = new int[63];    // 1 <= 1 <= r <= 1,000,000일 때 나올 수 있는 0과 5 조합의 숫자는 최대 63개
        int count = 0;              // 0과 5조합의 숫자가 있을 경우 중가하는 count

        for(int i = l; i <= r; i++) {
            int num = i;

            NumCheck:   // num의 각 자릿수가 5 혹은 0으로 이루어져있는지 판별하는 loop
            while(true){
                if(num % 10 == 5 || num % 10 == 0) {    // 1. num의 해당하는 자릿수가 5 혹은 0일 경우,
                    if(num / 10 == 0) {                 // 1-1. 이 때 num이 일의자리 수일 경우
                        arr[count] = i;                 //      arr배열에 해당 값 저장
                        count++;                        //      count는 배열에 값이 저장될 때마다 +1씩 증가
                        break NumCheck;                 //      NumCheck while문 빠져나감
                    } else {                            // 1-2. num이 일의자리 수가 아닐 경우
                        num /= 10;                      //      다음 자릿수를 구하기 위해 num / 10 한 후
                        continue;                       //      NumCheck while문 계속 진행
                    }
                } else {                                // 2. 해당하는 자릿수가 5 혹은 0이 아닐 경우,
                    break NumCheck;                     //    NumCheck while문에서 빠져나감
                }
            }
        }

        if(count > 0) {                 // 0과 5 조합의 숫자가 1개 이상일 경우
            int[] answer = new int[count];
            for(int i = 0; i < answer.length; i++){
                answer[i] = arr[i];
            }
            return answer;
        } else {                        // 0과 5 조합의 숫자가 하나도 없을 경우
            int[] answer = {-1};
            return answer;
        }
    }
}

public class MakeArray2 {
    public static void main(String[] args) {
        int l = 1;
        int r = 1000000;

        Solution4 s4 = new Solution4();
        System.out.println(Arrays.toString(s4.solution4(l, r)));
        System.out.println(s4.solution4(l, r).length);
    }
}
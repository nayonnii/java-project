package com.example.javaproject2.week3.day3.challenge;

class Solution2 {
    /*     코드 리팩토링
        1. String타입 제거(int타입만 사용하도록 변경)
        2. 소인수 구할 때 중복까지 제거되도록 변경
        3. while문 풀이 추가
    */
    public int[] solution4(int num) {
        int[] primeFactorArr = new int[num + 1];   //소인수를 저장할 배열 선언(num만큼)


//내 풀이(for문 사용)
        for (int i = 2; i <= num; i++) {   //소인수 구하기
            if (num % i == 0) {
                primeFactorArr[i] = i;        // 소인수 중복제거
                if (num / i == 1) break;
                num /= i;
                i = 1;
            } else {
                continue;
            }
        }

/*
//강사님 풀이(while문 활용)
        int divisor = 2;
        while(num > 1){
            if(num % divisor == 0) {    // 나누어 떨어지는지 체크
                primeFactorArr[divisor] = divisor;
                num /= divisor;
            } else {                    // 나누어 떨어지지 않는 경우(12 -> 6 -> 3이 되어 2로 나누어 지지 않는 경우)
                divisor++;
            }
        }
*/

        int count = 0;
        int idx = 0;
        for(int i = 0; i < primeFactorArr.length; i++){    // 0이 아닌 숫자 개수 체크
            if(primeFactorArr[i] != 0) count++;
        }

        int[] newPrimeFactorArr = new int[count];          // 0을 제거한 소인수 배열 선언
        for(int i = 0; i < primeFactorArr.length; i++){
            if(primeFactorArr[i] != 0){
                newPrimeFactorArr[idx] = primeFactorArr[i];
                idx++;
            } else {
                continue;
            }
        }

        return newPrimeFactorArr;
    }
}

public class Factorization {
    public static void main(String[] args) {
        int num = 420;
        Solution2 s2 = new Solution2();
        for (int i = 0; i < s2.solution4(num).length; i++) {
            System.out.printf("%d ", s2.solution4(num)[i]);
        }
    }
}

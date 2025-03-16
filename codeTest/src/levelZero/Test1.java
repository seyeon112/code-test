package levelZero;

public class Test1 {

	
//알고리즘
//switch문 사용
int solution(int angle) {
    if (0 < angle && angle <= 180) {
        int answer = 0;
       if(0 < angle && angle < 90) {
           answer = 1;
       }else if(angle == 90) {
           answer = 2;
       }else if(90 < angle && angle < 180) {
           answer = 3;
       }else{
           answer = 4;
       }
        return answer;
    }
}

// 다른 방법으로 풀어보기!
int solution(int num1, int num2) {
    int answer = 0;
    if((0 <= num1 && num1 <= 10000)&&(0 <= num2 && num2 <= 10000)) {
        answer = num1 == num2 ? 1 : -1;
    }
    return answer;
}

// 선생님의 나이 구하기
int solution(int age) {
    int answer = 0;
    if(0 < age && age <= 120) {
        answer = 2022 - age + 1;
    }
    return answer;
}

int solution(int num1, int num2) {
    int answer = 0;
    if ((-50000 <= num1 && num1 <= 50000)&&(-50000 <= num2 && num2 <= 50000)) {
        answer = num1 - num2;
    }
    return answer;
}


int solution(int num1, int num2) {
    int answer = -1;
    if ((0 < num1 && num1 <= 100)&&(0 < num2 && num2 <= 100)) {
        answer = num1 % num2;
    }
    return answer;
}
	
int solution(int num1, int num2) {
    if((num1 >= -50000)&&(num2 >= -50000)) {
        int answer = num1 - num2;
        return answer;
    }
   
}

int solution(int num1, int num2) {
    if((0 < num1 && num1 <= 100)&&(0 < num2 && num2 <= 100)) {
      int answer = (double)num1 / num2 * 1000;
      return answer;
    }
 
}
//1인분에 12,000원
//음료수 2,000원
//단, 10인분 먹으면 음료수 하나는 공짜

int solution(int n, int k) {
    int answer = 0;
    if((0 < n && n < 1000)&&(n/10 <= k && k < 1000)) {
        k = k - (n / 10);
        answer = (n * 12000) + (k * 2000);
    }
    return answer;
}

int solution(int num1, int num2) {
    if((0 < num1 && num1 <= 100)&&(0 < num2 && num2 <= 100)) {
      int answer = (double)num1 / num2 * 1000;
      return answer;
    }
 
}
	
function solution(arr) {
    return arr.reduce((acc, cur) => acc + cur) / arr.length;
}

	
int solution(int num1, int num2) {
    if((0 < num1 && num1 <= 100)&&(0 < num2 && num2 <= 100)) {
        int answer = num1 / num2;
        return answer;
    }
}

int solution(int n) {
    int answer = 0;
    if(0 < n && n <= 1000){
        for (int i = 0; i <= n; i += 2){
            answer += i;
        }
    }
    return answer;
}

int solution(int age) {
    if(0 < age && age <= 120) {
        int answer = (2022 - age) + 1;
        return answer;
    }  
}

int solution(int n, int t) {
    int answer = 0;
    if((1 <= n && 10 >= n) && (1 <= t && 15 >= t)) {
        for(int i = 1; i <= t; i++) {
            n *= 2;
        }
    }
    return n;
}

int solution(int slice, int n) {
    int answer = 0;
    if ((1 <= n && n <= 100)&&(2 <= slice && 10 >= slice)) {
       if (n % slice == 0) {
           answer = n / slice;
       }else {
           answer = n / slice + 1;
       }
    }
    return answer;
}


// numbers_len은 배열 numbers의 길이입니다.
double solution(int numbers[], size_t numbers_len) {
    double answer = 0;
    int length = numbers_len;
        for(int i = 0; i < length; i++) {
            answer += numbers[i];
        }
    answer = answer / length;
    
    return answer;
}

// array_len은 배열 array의 길이입니다.
int solution(int array[], size_t array_len, int height) {
    int answer = 0;
    for(int i = 0; i < array_len; i++) {
        if(array[i] > height) {
            answer++;
        }
    }
    return answer;
}

int solution(int n) {
    int answer = 2;

    for (int i = 1 ; i * i <= n ; i++)
    {
        if (i * i == n)
        {
            answer = 1;
            break;
        }
    }

    return answer;
}

int solution(int n) {
    int answer = 0;

    //10으로 나머지 연산을 하면 1의 자리 수가 나온다
    //10으로 나누면 1의 자리 수가 없어진다
    while(n != 0)
    {
        answer += n % 10;
        n = n/ 10;
    }

    return answer;
}

import java.util.stream.IntStream;
class Solution {
    public int[] solution(int n) {

        return IntStream.rangeClosed(0, n)
            .filter(e -> e % 2 != 0)
            .toArray();
    }
}

class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        if(1 <= strlist.length && strlist.length <= 100) {
            for(int i = 0; i < answer.length; i++) {
                answer[i] = strlist[i].length();
            }
            
        }
        return answer;
    }
}

class Solution {
    public int solution(String str1, String str2) {
        if (str1.contains(str2)) {
            return 1;
        }
        return 2;
    }
}

class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        
        answer[0] = money / 5500;
        answer[1] = money - (answer[0] * 5500);
        
        return answer;
    }
}


class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        answer[0] = num_list[num_list.length-1];
        for(int i=1; i<num_list.length; i++) {
            answer[i] = num_list[num_list.length-(i+1)];
        }
        return answer;
    }
}

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        for (int i=0; i<numbers.length; i++) {
            for (int j=0; j<numbers.length; j++) {
                if (i != j) {
                    answer = Math.max(answer, numbers[i] * numbers[j]);
                }
            }
        }
        return answer;
    }
}


class Solution {
    public int solution(String message) {
        int answer = 0;
        if (message != null) {
            answer += message.length() * 2;


        }
        return answer;
    }
}

class Solution {
    public String solution(String my_string, String letter) {
        my_string = my_string.replace(letter, "");
        return my_string;
    }
}


class Solution {
    public String solution(String my_string, int n) {
        String answer = "";

        for(int i=0; i<my_string.length(); i++){
            for(int j=0; j<n; j++){
                answer+=my_string.charAt(i);
            }
        }

        return answer;
    }
}


class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2 - num1 + 1];

        for (int i = num1; i <= num2; i++) {
            answer[i -num1] = numbers[i];
        }

        return answer;
    }
}


class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];

        for(int i = 0 ; i < num_list.length ; i++){
            if(num_list[i]%2==0){
                answer[0]++;
            }else{
                answer[1]++;
            }
        }

        return answer;
    }
}

//좀 더 직관적인, 쉬운 풀이 참고하기
import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {

        int even = 0;
        int odd = 0;

        for(int num : num_list){
            if(num %2 == 0){
                even++;
            }else{
                odd++;
            }

        }

        return new int[]{even, odd};
    }
}


class Solution {
    public String solution(String my_string) {
        String answer = "";

        for(int i=my_string.length()-1; i>=0; i--){
            answer+=my_string.charAt(i);
        }

        return answer;
    }
}

class Solution {
    public int solution(int[] dot) {
        int answer = 0;
        if(dot[0] > 0 && dot[1] >0){
            answer = 1;
        }else if(dot[0] > 0 && dot[1] <0){
            answer = 4;
        }else if(dot[0] < 0 && dot[1] >0){
            answer = 2;
        }else{
            answer = 3;
        }

        return answer;
    }
}

class Solution {
    public int[] solution(int money) {
        int[] answer = {};
        answer = new int[2];
        int price = 5500;

        answer[0] = money/price;
        answer[1] = money%price;

        return answer;
    }
}

// 더 간단하게
class Solution {
    public int[] solution(int money) {
        int[] answer = {0, 0};
        answer[0] = money / 5500;
        answer[1] = money % 5500;
        return answer;
    }
}

class Solution {
    public int solution(int n) {
        int answer = 0;
        if (n % 7 == 0) {
            answer = n / 7;
        } else {
            answer = (n / 7) + 1;
        }
        return answer;
    }
}

class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        if(1 <= strlist.length && strlist.length <= 100) {
            for(int i = 0; i < answer.length; i++) {
                answer[i] = strlist[i].length();
            }
            
        }
        return answer;
    }

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        if((1 <= num_list.length && num_list.length <= 100) && (0 <= num_list.length && num_list.length <= 1000)) {
            for (int i = 0; i <= num_list.length; i++) {
                 if(num_list[i] % 2 == 0) {
                    answer[0]++;
                } else {
                    answer[1]++;
                }
            } 
        }
        return answer;
    }
}

class Solution {
    public int solution(int price) {
        if(price >= 500000) {
            price *= 0.8;
        } else if(price >= 300000) {
            price *= 0.9;
        } else if(price >= 100000) {
            price *= 0.95;
        }
        return price;
    }
}

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }   
    }
}

#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int n) {
    int answer = 0;
     for(int i=0;i<=1000;i++)
    {
        if(i*i==n)
        {
            answer=1;
            break;
        }
        else
        {
            answer=2;
        }
    }
    return answer;
}

class Solution {
    public int solution(String message) {
        int answer = 0;
        if (1 <= message.length() && message.length() <= 50) {
            answer += message.length() * 2;
        }
        return answer;
    }
}

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int[] arrays = array;
        for(int i = 0; i < arrays.length; i++) {
            if(arrays[i] == n) {answer += 1;}
        }
        return answer;
    }
}


class Solution {
    public int solution(int hp) {
        int answer = hp/5;
        int num = hp%5;

        if (num==0){
            return answer;
        } else if(num%2==0){
            answer += 2;
        } else {
            answer += 1;
        }

        return answer;
    }
}

import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        
        int[] answer = Arrays.copyOfRange(numbers, num1, num2 + 1);
              
        return answer;
    }
}

class Solution {
    public int solution(int n) {
        int answer = 0;
        int a, b;
        if (a * b == n) {
            for (int i = 0; i++) {
                answer++;
            }
        } else {
            continue;
        }
     
        return answer;
    }
}


class Solution {

    public String solution(String my_string, int k) {
        String answer = "";

        for (int i = 0; i < k; i++) {
            answer += my_string;
        }
        return answer;
    }
}

#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int slice, int n) {
    int answer = 0;
    if ((1 <= n && n <= 100)&&(2 <= slice && 10 >= slice)) {
       if (n % slice == 0) {
           answer = n / slice;
       }else {
           answer = n / slice + 1;
       }
    }
    return answer;
}

function solution(names) {
    let answer = [];
    
    for (let i = 0; i < names.length; i+=5) {
        answer.push(names[i]);
    }
    
    return answer;
}
}



	
}

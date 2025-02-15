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

	
}

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
	
}

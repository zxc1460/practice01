package practice01;

import java.util.Scanner;

public class Prob3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int num = scanner.nextInt();
		int sum = 0;
		
		if(num % 2 == 0){
			for( int i = 2; i <= num; i += 2){
				sum += i;
			}
			System.out.println("결과 값: " + sum);
		}else{
			for( int i = 1; i <= num; i += 2){
				sum += i;
			}
			System.out.println("결과 값: " + sum);
			
		}

	}

}

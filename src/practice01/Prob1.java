package practice01;

import java.util.Scanner;

public class Prob1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		
		System.out.print("수를 입력하시오 : ");
		int num = scanner.nextInt();
		
		if(num % 3 == 0){
			System.out.println("3의 배수 입니다.");
		} else{
			System.out.println("3의 배수가 아닙니다.");
		}	

	}
}


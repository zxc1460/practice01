package practice01;

public class Prob5 {

	public static void main(String[] args) {
		for( int i = 1; i <= 99; i++){
			int ten = i / 10; // 십의 자리
			int one = i % 10; // 일의 자리
			int result = 0;
			

			if(one == 3 || one == 6 || one == 9){ // 일의 자리가 3,6,9이면
				result++;
			}
			if(ten == 3 || ten == 6 || ten == 9){ // 십의 자리가 3,6,9이면
				result++;
			}
			
			switch(result){
				case 2:{ //십의 자리, 일의 자리가 모드 3,6,9일 경우
					System.out.println( i + " 짝짝");
					break;
				}
				case 1:{ //일의 자리만 3,6,9인 경우
					System.out.println( i + " 짝");
					break;
				}
			}
		}
	}
}

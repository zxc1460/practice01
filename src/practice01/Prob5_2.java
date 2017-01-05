package practice01;

public class Prob5_2 {

	public static void main(String[] args) {
		for(int i = 1; i <= 999; i++){
			String num = String.valueOf(i);
			int length = num.length();
			int count = 0;
			for(int j = 0; j <length; j++){
				char digit = num.charAt(j);
				if(digit == '3' || digit == '6' || digit == '9'){
					count++;
				}
			}
			if(count > 0){
			System.out.print(i + " ");
			for(int k = 1; k <= count; k++){
				System.out.print("¦");
			}
			System.out.println();
			}
		}
	}
}

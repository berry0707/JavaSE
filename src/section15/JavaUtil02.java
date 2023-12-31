package section15;

import java.util.Random;

public class JavaUtil02 {
	public static void main(String[] args) {
		
		int[] lNum = new int[45];
		
		for(int i = 0; i < lNum.length; i++) {
			lNum[i] = i + 1;
		}
		Random ran = new Random();
		
		for (int i = 0; i < lNum.length; i++) {
			
			// 0~44 까지 숫자중 임의 값 반환
			int changeIndex = ran.nextInt(45);
			
			// 값을 변환하려면 3개의 변수 필요
			int tmp = lNum[i];
			lNum[i] = lNum[changeIndex];
			lNum[changeIndex] = tmp;
			
		}
		
		for(int i = 0; i < 6; i++) {
			System.out.print(lNum[i]+ "/");
		}
	}

}

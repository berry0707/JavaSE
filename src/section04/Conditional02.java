package section04;
/*
 * 1-2 if ~ else문
 *  if(조건식) {
 *  	조건식 true일 때 실행 명령문
 *  }else {
 *  	조건식 false일 때 실행 명령문
 *  }
 * 
 */
public class Conditional02 {
	public static void main(String[] args) {
		int num = 11;
		
		if(num % 2 == 0) {
			System.out.println("num은 짝수 입니다.");
		}else {
			System.out.println("num은 홀수 입니다.");
		}
		
		
		// 실행 명령어가 한줄일 경우 중괄호 생략 가능!
		if(num % 2 == 0)
			System.out.println("num은 짝수 입니다.");
		else 
			System.out.println("num은 홀수 입니다.");
	}

}

package section04;

public class Conditional05 {
	public static void main(String[] args) {
		/*
		 * 환불 상태코드
		 * 01 : 환불신청중
		 * 02 : 환불처리중
		 * 03 : 환불취소
		 * 04 : 계좌이체중
		 * 05 : 환불완료
		 * 01, 02, 04 상태일때 환불불가!
		 * 
		 */
		
		String rtcd = "02";
		switch(rtcd) {
		case "01":
		case "02":
		case "04":
			System.out.println("환불불가, 관리자에게 문의하세요.");
			System.out.println("환불상태코드: " + rtcd);
		}
		System.out.println();
		
		if(rtcd == "01" || rtcd == "02" || rtcd == "04") {
			System.out.println("환불불가, 관리자에게 문의하세요.");
			System.out.println("환불상태코드: " + rtcd);
		}
	}

}

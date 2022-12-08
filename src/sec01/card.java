package sec01;

import java.util.Scanner;

public class card {
	public static void main(String[] args) {
		int m = 120000;
		System.out.println("결제할 금액은 " + m + "원 입니다.\n");
		
		
		System.out.println("{카드 할인 정보} \n* 카드 할인은 1인, 일1회, 연5회 제공됩니다.\n");
		System.out.println("- 삼성카드 : 이용권 30% 할인\n"
				+ "- 하나카드 : 이용권 50% 할인\n"
				+ "- 신한카드 : 이용권 30% 할인\n"
				+ "- 현대카드 : 이용권 30% 할인\n"
				+ "- B  C카드 : 이용권 50% 할인\n");
		System.out.println("[1] 결제취소\n[2] 카드결제");
		

		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
			
		if(a == 1) {
			pay.main(args);
		}else {
			try {												// 딜레이 넣음.
				System.out.println("카드를 삽입하세요.");
				Thread.sleep(2000);
				}catch (InterruptedException e){
					e.printStackTrace();
				}
				System.out.println("결제 되었습니다.");
				System.out.println("안녕히 가세용 ~.~");
				return;
		}
			Scanner scanner2 = new Scanner(System.in);
			System.out.println("* 포인트를 적립하시겠습니까? *");
			System.out.println("[1] 포인트 적립 하기\n[2] 포인트 적립 안함");
			
			int b = scanner.nextInt();
			if(b == 1) {
				System.out.println("휴대폰 번호를 입력해주세요.  ex)01012341234");
				String c = scanner.next();
				System.out.println("적립되었습니다.");
				System.out.println("안녕히 가세용 ~.~");
				System.out.println("========================================="
							+ "===============================\n");
			}else{
				System.out.println("안녕히 가세용 ~.~");
		}
	}
}
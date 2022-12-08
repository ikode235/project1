package sec01;

import java.util.Scanner;

// 상품권 선택 창
public class gift_card1 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		for(;;) {
			System.out.println("상품권을 선택하세요.");
			System.out.println("[1] 롯데 상품권 \n[2] 문화 상품권");
			int gift_cash_1 = scanner.nextInt();
		
			if(gift_cash_1 == 1) {
				System.out.println("롯데 상품권을 선택하셨습니다.");
				break;
			}else if(gift_cash_1 == 2){
				System.out.println("문화 상품권을 선택하셨습니다.");
				break;
			}else {
				System.out.println("숫자를 다시 입력해주세요");
				System.out.println("\n========================================="
						+ "===============================\n");
				}
		}
			
			
		System.out.println("금액권을 선택해주세요.");
		System.out.println("[1] 100000 \n[2] 50000");
		int total = 100000;   //  -------------------------------- 나중에 수정하기^^^^^^^
		int gift_cash_2 = scanner.nextInt();
		if(gift_cash_2 == 1) {
			gift_cash_2 = 100000;
		}else {
			gift_cash_2 = 50000;
		}
		if(gift_cash_2 == total){
			System.out.println(total + " - " + gift_cash_2 + " = " + "0" +"모두 결제 하셨습니다.");
		}else {
			System.out.println("\n========================================="
					+ "===============================\n");
			System.out.println("잔액은: " + (total - gift_cash_2) + "원 입니다.");
			System.out.println("잔액 결제 수단을 선택해주세요.");
			gift_card2.main(args);
		}
		
	}
}

package sec01;

import java.util.Scanner;

public class pay {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("* 결제 수단 선택 *");
		System.out.println("[1] 카드 결제\n[2] 현금 결제\n[3] 상품권 결제");
		
		int a = scanner.nextInt();
		
		if(a == 1) {
			card.main(args);
		}else if(a == 2) {
			cash.main(args);
		}else {
			gift_card1.main(args);
		}
	}
	public static void main_pay2(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("* 결제 수단 선택 *");
		System.out.println("[1] 카드 결제\n[2] 현금 결제\n[3] 상품권 결제");
		
int a = scanner.nextInt();
		
		if(a == 1) {
			card.main(args);
		}else if(a == 2) {
			cash.main(args);
		}else {
			gift_card1.main(args);
		}
	}
	
}
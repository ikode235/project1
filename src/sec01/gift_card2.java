package sec01;

import java.util.Scanner;

public class gift_card2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("[1] 카드 결제\n[2] 현금 결제");
		
		int a = scanner.nextInt();
		
		if(a == 1) {
			try {
				System.out.println("카드를 삽입하세요.");
				Thread.sleep(2000);
				}catch (InterruptedException e){
					e.printStackTrace();
				}
				System.out.println("결제 되었습니다.");
				// 값 받아서 결제 넣기. 수정.
		}else{
			cash.main(args);
		}
	}
}
package sec01;

import java.util.Scanner;

public class gift_card2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("[1] ī�� ����\n[2] ���� ����");
		
		int a = scanner.nextInt();
		
		if(a == 1) {
			try {
				System.out.println("ī�带 �����ϼ���.");
				Thread.sleep(2000);
				}catch (InterruptedException e){
					e.printStackTrace();
				}
				System.out.println("���� �Ǿ����ϴ�.");
				// �� �޾Ƽ� ���� �ֱ�. ����.
		}else{
			cash.main(args);
		}
	}
}
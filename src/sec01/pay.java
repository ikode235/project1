package sec01;

import java.util.Scanner;

public class pay {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("* ���� ���� ���� *");
		System.out.println("[1] ī�� ����\n[2] ���� ����\n[3] ��ǰ�� ����");
		
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
		
		System.out.println("* ���� ���� ���� *");
		System.out.println("[1] ī�� ����\n[2] ���� ����\n[3] ��ǰ�� ����");
		
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
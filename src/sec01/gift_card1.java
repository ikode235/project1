package sec01;

import java.util.Scanner;

// ��ǰ�� ���� â
public class gift_card1 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		for(;;) {
			System.out.println("��ǰ���� �����ϼ���.");
			System.out.println("[1] �Ե� ��ǰ�� \n[2] ��ȭ ��ǰ��");
			int gift_cash_1 = scanner.nextInt();
		
			if(gift_cash_1 == 1) {
				System.out.println("�Ե� ��ǰ���� �����ϼ̽��ϴ�.");
				break;
			}else if(gift_cash_1 == 2){
				System.out.println("��ȭ ��ǰ���� �����ϼ̽��ϴ�.");
				break;
			}else {
				System.out.println("���ڸ� �ٽ� �Է����ּ���");
				System.out.println("\n========================================="
						+ "===============================\n");
				}
		}
			
			
		System.out.println("�ݾױ��� �������ּ���.");
		System.out.println("[1] 100000 \n[2] 50000");
		int total = 100000;   //  -------------------------------- ���߿� �����ϱ�^^^^^^^
		int gift_cash_2 = scanner.nextInt();
		if(gift_cash_2 == 1) {
			gift_cash_2 = 100000;
		}else {
			gift_cash_2 = 50000;
		}
		if(gift_cash_2 == total){
			System.out.println(total + " - " + gift_cash_2 + " = " + "0" +"��� ���� �ϼ̽��ϴ�.");
		}else {
			System.out.println("\n========================================="
					+ "===============================\n");
			System.out.println("�ܾ���: " + (total - gift_cash_2) + "�� �Դϴ�.");
			System.out.println("�ܾ� ���� ������ �������ּ���.");
			gift_card2.main(args);
		}
		
	}
}

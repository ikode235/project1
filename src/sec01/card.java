package sec01;

import java.util.Scanner;

public class card {
	public static void main(String[] args) {
		int m = 120000;
		System.out.println("������ �ݾ��� " + m + "�� �Դϴ�.\n");
		
		
		System.out.println("{ī�� ���� ����} \n* ī�� ������ 1��, ��1ȸ, ��5ȸ �����˴ϴ�.\n");
		System.out.println("- �Ｚī�� : �̿�� 30% ����\n"
				+ "- �ϳ�ī�� : �̿�� 50% ����\n"
				+ "- ����ī�� : �̿�� 30% ����\n"
				+ "- ����ī�� : �̿�� 30% ����\n"
				+ "- B  Cī�� : �̿�� 50% ����\n");
		System.out.println("[1] �������\n[2] ī�����");
		

		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
			
		if(a == 1) {
			pay.main(args);
		}else {
			try {												// ������ ����.
				System.out.println("ī�带 �����ϼ���.");
				Thread.sleep(2000);
				}catch (InterruptedException e){
					e.printStackTrace();
				}
				System.out.println("���� �Ǿ����ϴ�.");
				System.out.println("�ȳ��� ������ ~.~");
				return;
		}
			Scanner scanner2 = new Scanner(System.in);
			System.out.println("* ����Ʈ�� �����Ͻðڽ��ϱ�? *");
			System.out.println("[1] ����Ʈ ���� �ϱ�\n[2] ����Ʈ ���� ����");
			
			int b = scanner.nextInt();
			if(b == 1) {
				System.out.println("�޴��� ��ȣ�� �Է����ּ���.  ex)01012341234");
				String c = scanner.next();
				System.out.println("�����Ǿ����ϴ�.");
				System.out.println("�ȳ��� ������ ~.~");
				System.out.println("========================================="
							+ "===============================\n");
			}else{
				System.out.println("�ȳ��� ������ ~.~");
		}
	}
}
package sec01;

import java.util.Scanner;

public class discount {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("========================================="
				+ "===============================\n");
		System.out.println("* ���� �ȳ� *");
		System.out.println("- ī�� ����: �Ｚ, �ϳ�, ����, ����, BCī�� �ִ� 50% ����"
				+ "\n- ��Ż� ����: LG U+ ����� 30% ����"
				+ "\n- �л�(��~����л�, ����(��)��) ����: ����� 20,000��"
				+ "\n- ��� ����: 65�� �̻� / ����� / ����������"
				+ " ����� 30,000��");
		System.out.println("\n========================================="
				+ "===============================\n");
		
		System.out.println("���� ����� �������ּ���.");
		System.out.println("[1] ī������\n[2] ��Ż� ����\n[3] �л� ����\n[4] ��� ����");
		
		int a = scanner.nextInt();
		System.out.println("========================================="
				+ "===============================\n");
		for(;;) {
			if(a == 1) {
				card.main(args);
				break;
			}else if(a == 2) {
				System.out.println("========================================="
						+ "===============================\n");
					try {												// ������ ����.
						System.out.println("LG U+ ����� ���ڵ带 ��ĵ���ּ���");
						Thread.sleep(2000);
						}catch (InterruptedException e){
							e.printStackTrace();
						}
					System.out.println("Ȯ�εǾ����ϴ�.\n");
					System.out.println("========================================="
							+ "===============================\n");
					
					pay.main_pay2(args);
					break;
			}else if(a == 3) {
				try {												// ������ ����.
					System.out.println("�л����� ��ĵ���ּ���.");
					Thread.sleep(2000);
					}catch (InterruptedException e){
						e.printStackTrace();
					}
				
				
				System.out.println("\nȮ�εǾ����ϴ�.");
				System.out.println("========================================="
						+ "===============================\n");
				pay.main(args);
				return;
				
			}else if(a == 4) {
				try {												// ������ ����.
					System.out.println("Ȯ�� ������ �ź����� ��ĵ���ּ���.");
					Thread.sleep(2000);
					}catch (InterruptedException e){
						e.printStackTrace();
					}
				System.out.println("\nȮ�εǾ����ϴ�.");
				System.out.println("========================================="
						+ "===============================\n");
				pay.main(args);
				return;
				
			}
		}
	}
}
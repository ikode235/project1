package sec01;

import java.util.Scanner;

public class discount {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("========================================="
				+ "===============================\n");
		System.out.println("* 할인 안내 *");
		System.out.println("- 카드 할인: 삼성, 하나, 신한, 현대, BC카드 최대 50% 할인"
				+ "\n- 통신사 할인: LG U+ 멤버십 30% 할인"
				+ "\n- 학생(중~고등학생, 대학(원)생) 할인: 입장권 20,000원"
				+ "\n- 우대 할인: 65세 이상 / 장애인 / 국가유공자"
				+ " 입장권 30,000원");
		System.out.println("\n========================================="
				+ "===============================\n");
		
		System.out.println("혜택 방법을 선택해주세요.");
		System.out.println("[1] 카드할인\n[2] 통신사 할인\n[3] 학생 할인\n[4] 우대 할인");
		
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
					try {												// 딜레이 넣음.
						System.out.println("LG U+ 멤버십 바코드를 스캔해주세요");
						Thread.sleep(2000);
						}catch (InterruptedException e){
							e.printStackTrace();
						}
					System.out.println("확인되었습니다.\n");
					System.out.println("========================================="
							+ "===============================\n");
					
					pay.main_pay2(args);
					break;
			}else if(a == 3) {
				try {												// 딜레이 넣음.
					System.out.println("학생증을 스캔해주세요.");
					Thread.sleep(2000);
					}catch (InterruptedException e){
						e.printStackTrace();
					}
				
				
				System.out.println("\n확인되었습니다.");
				System.out.println("========================================="
						+ "===============================\n");
				pay.main(args);
				return;
				
			}else if(a == 4) {
				try {												// 딜레이 넣음.
					System.out.println("확인 가능한 신분증을 스캔해주세요.");
					Thread.sleep(2000);
					}catch (InterruptedException e){
						e.printStackTrace();
					}
				System.out.println("\n확인되었습니다.");
				System.out.println("========================================="
						+ "===============================\n");
				pay.main(args);
				return;
				
			}
		}
	}
}
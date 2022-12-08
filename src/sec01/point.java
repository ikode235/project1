package sec01;
//
//import java.util.Scanner;
//// 보류
//public class point {
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("* 포인트 적립 *");
//		System.out.println("[1] 포인트 적립 하기\n[2] 포인트 적립 안함");
//		
//		int a = scanner.nextInt();
//		if(a == 1) {
//			System.out.println("휴대폰 번호를 입력해주세요.  ex)01012341234");
//			String b = scanner.next();
//			System.out.println("적립되었습니다.");
//			System.out.println("========================================="
//						+ "===============================\n");
//			System.out.println("카드를 삽입하세요.");
//			// 값 받아서 결제 넣기. 수정.
//		}else{
//			System.out.println("카드를 삽입하세요.");
//			// 값 받아서 결제 하기. 수정.
//	



// 계산 코드 나중에 참고하기

//importjava.util.Scanner;
//
//
//public class point{
//publicstaticvoidmain(String[]args) {
//System.out.println("[캐시백 계산]");

//intcash;
//intcashb=0;
//
//
//System.out.printf("결제 금액을 입력해 주세요.(금액):");
//Scannerscanner=newScanner(System.in);
//cash=scanner.nextInt();
//cashb=cash/10;
//if(cashb>=300) {
//cashb=300;
//System.out.println(String.format("결제 금액은 %d원이고, 캐시백은 %d원 입니다.",cash,cashb));
//}elseif(cashb<300&&cash>=200) {
//cashb=200;
//System.out.println(String.format("결제 금액은 %d원이고, 캐시백은 %d원 입니다.",cash,cashb));
//}elseif(cashb<200&&cash>=100) {
//cashb=100;
//System.out.println(String.format("결제 금액은 %d원이고, 캐시백은 %d원 입니다.",cash,cashb));
//}elseif(cashb<100) {
//cashb=0;
//System.out.println(String.format("결제 금액은 %d원이고, 캐시백은 %d원 입니다.",cash,cashb));
//}
//}
//}






//국가유공자 할인 계산기참고하기
import java.util.Scanner;


public class point{
public static void main(String[]args) {
Scanner scan = new Scanner(System.in);
byte age = 0;
int admissionTime = 0;
int menOfMationalMerit = 10000;
int WelfareCard = 8000;
int kids = 4000;


System.out.println("[입장권 계산]");
System.out.print("나이를 입력해 주세요.(숫자)");
age = scan.nextByte();
System.out.print("입장시간을 입력해 주세요.(숫자입력)");
admissionTime = scan.nextInt();
System.out.print("국가유공자 여부를 입력해 주세요(y/n)");
char kie = scan.next().charAt(0);
System.out.print("복지카드 여부를 입력해 주세요(y/n)");
char card = scan.next().charAt(0);

if(age < 3){
admissionTime = 0;
System.out.println(String.format("입장료 : %d",admissionTime));
}else if (kie == 'y' || card == 'y') {
admissionTime = menOfMationalMerit;
System.out.println(String.format("입장료 : %d",menOfMationalMerit));
}else if (age >= 3 && age < 13) {
menOfMationalMerit = kids;
System.out.println(String.format("입장료 : %d",kids));
}else if (admissionTime >= 17){
menOfMationalMerit = kids;
System.out.println(String.format("입장료: %d",admissionTime));
}else {
System.out.println(String.format("입장료: %d",menOfMationalMerit));
}
scan.close();

}
}
//			}
//		}
//	}

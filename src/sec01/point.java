package sec01;
//
//import java.util.Scanner;
//// ����
//public class point {
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("* ����Ʈ ���� *");
//		System.out.println("[1] ����Ʈ ���� �ϱ�\n[2] ����Ʈ ���� ����");
//		
//		int a = scanner.nextInt();
//		if(a == 1) {
//			System.out.println("�޴��� ��ȣ�� �Է����ּ���.  ex)01012341234");
//			String b = scanner.next();
//			System.out.println("�����Ǿ����ϴ�.");
//			System.out.println("========================================="
//						+ "===============================\n");
//			System.out.println("ī�带 �����ϼ���.");
//			// �� �޾Ƽ� ���� �ֱ�. ����.
//		}else{
//			System.out.println("ī�带 �����ϼ���.");
//			// �� �޾Ƽ� ���� �ϱ�. ����.
//	



// ��� �ڵ� ���߿� �����ϱ�

//importjava.util.Scanner;
//
//
//public class point{
//publicstaticvoidmain(String[]args) {
//System.out.println("[ĳ�ù� ���]");

//intcash;
//intcashb=0;
//
//
//System.out.printf("���� �ݾ��� �Է��� �ּ���.(�ݾ�):");
//Scannerscanner=newScanner(System.in);
//cash=scanner.nextInt();
//cashb=cash/10;
//if(cashb>=300) {
//cashb=300;
//System.out.println(String.format("���� �ݾ��� %d���̰�, ĳ�ù��� %d�� �Դϴ�.",cash,cashb));
//}elseif(cashb<300&&cash>=200) {
//cashb=200;
//System.out.println(String.format("���� �ݾ��� %d���̰�, ĳ�ù��� %d�� �Դϴ�.",cash,cashb));
//}elseif(cashb<200&&cash>=100) {
//cashb=100;
//System.out.println(String.format("���� �ݾ��� %d���̰�, ĳ�ù��� %d�� �Դϴ�.",cash,cashb));
//}elseif(cashb<100) {
//cashb=0;
//System.out.println(String.format("���� �ݾ��� %d���̰�, ĳ�ù��� %d�� �Դϴ�.",cash,cashb));
//}
//}
//}






//���������� ���� ���������ϱ�
import java.util.Scanner;


public class point{
public static void main(String[]args) {
Scanner scan = new Scanner(System.in);
byte age = 0;
int admissionTime = 0;
int menOfMationalMerit = 10000;
int WelfareCard = 8000;
int kids = 4000;


System.out.println("[����� ���]");
System.out.print("���̸� �Է��� �ּ���.(����)");
age = scan.nextByte();
System.out.print("����ð��� �Է��� �ּ���.(�����Է�)");
admissionTime = scan.nextInt();
System.out.print("���������� ���θ� �Է��� �ּ���(y/n)");
char kie = scan.next().charAt(0);
System.out.print("����ī�� ���θ� �Է��� �ּ���(y/n)");
char card = scan.next().charAt(0);

if(age < 3){
admissionTime = 0;
System.out.println(String.format("����� : %d",admissionTime));
}else if (kie == 'y' || card == 'y') {
admissionTime = menOfMationalMerit;
System.out.println(String.format("����� : %d",menOfMationalMerit));
}else if (age >= 3 && age < 13) {
menOfMationalMerit = kids;
System.out.println(String.format("����� : %d",kids));
}else if (admissionTime >= 17){
menOfMationalMerit = kids;
System.out.println(String.format("�����: %d",admissionTime));
}else {
System.out.println(String.format("�����: %d",menOfMationalMerit));
}
scan.close();

}
}
//			}
//		}
//	}

package sec01;
   
import java.util.Scanner;

public class cash {

      public static void main(String[] args) {
         int asd = 120000;
         System.out.println("���� �ݾ���" + asd +"�Դϴ�");
         Scanner sc = new Scanner(System.in);
         
         
         // ��� �ֱ�. ����.
      
         System.out.println("���� �������� �Ͻðڽ��ϱ�?");
         System.out.println("[1] �ϰڽ��ϴ�. [2] �����ʰڽ��ϴ�");
         int asd_ca = sc.nextInt();
         
         System.out.println();
       
         
         for(;;) {
          if(asd_ca == 1) {
             System.out.println("��ȣ�� �Է����ּ���");
             Scanner sc1 = new Scanner(System.in);
            int SC1 = sc1.nextInt();
               System.out.println("�Է��Ͻ� ��ȣ�� �½��ϱ�? [1] �½��ϴ� , [2] �ƴմϴ�");
            int SC2 = sc.nextInt();     
            if(SC2 == 1) {
               System.out.println("���� �������� �߱��ϰڽ��ϴ�");  // 
            System.out.println("\n========================================="
                  + "===============================\n");
               break;
         }
            System.out.println("��ȣ�� �ٽ� �Է����ּ���.");
      }
       System.out.println("�Ϸ�Ǿ����ϴ�.");
       break;
      } return;
      }
   }
   

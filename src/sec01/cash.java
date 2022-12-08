package sec01;
   
import java.util.Scanner;

public class cash {

      public static void main(String[] args) {
         int asd = 120000;
         System.out.println("현재 금액은" + asd +"입니다");
         Scanner sc = new Scanner(System.in);
         
         
         // 계산 넣기. 수정.
      
         System.out.println("현금 영수증을 하시겠습니까?");
         System.out.println("[1] 하겠습니다. [2] 하지않겠습니다");
         int asd_ca = sc.nextInt();
         
         System.out.println();
       
         
         for(;;) {
          if(asd_ca == 1) {
             System.out.println("번호를 입력해주세요");
             Scanner sc1 = new Scanner(System.in);
            int SC1 = sc1.nextInt();
               System.out.println("입력하신 번호가 맞습니까? [1] 맞습니다 , [2] 아닙니다");
            int SC2 = sc.nextInt();     
            if(SC2 == 1) {
               System.out.println("현금 영수증을 발급하겠습니다");  // 
            System.out.println("\n========================================="
                  + "===============================\n");
               break;
         }
            System.out.println("번호를 다시 입력해주세요.");
      }
       System.out.println("완료되었습니다.");
       break;
      } return;
      }
   }
   

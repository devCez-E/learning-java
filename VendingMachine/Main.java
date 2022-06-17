package VendingMachine;

import java.util.Scanner;

public class Main {

    String[] baverageName = {"스프라이트", "콜라", "밀키스"};
    int[] baverageCost = {1100, 900, 1400};
    int[] baverageStock = {4, 3, 2};
    int index = 0;
    int money = 0;
    int selectBeverage = -1;
    int isExit = 0;

    public static void main(String[] args) {    
        Main main = new Main();
        main.SelectDrinks();
    }

    void SelectDrinks(){
        do{
            for(index = 0; index < 3; index++){
                System.out.println(String.format("%d.%s (%d원)", index, baverageName[index], baverageCost[index]));
            }
            do{
                Scanner scanner = new Scanner(System.in);
                System.out.println("돈을 투입해주세요.");
                money += scanner.nextInt();
        
                do{
                    System.out.println("음료를 선택해주세요.");
                    selectBeverage = scanner.nextInt();
        
                    if(baverageStock[selectBeverage] <= 0) System.out.printf("%s 음료가 존재하지 않습니다. 다른 음료를 선택해주세요.\n", baverageName[selectBeverage]);
        
                }while(baverageStock[selectBeverage] <= 0);
            }while(baverageCost[selectBeverage] > money);

            money -= baverageCost[selectBeverage];
            baverageStock[selectBeverage] -= 1;

            System.out.printf("%s 음료를 구입했습니다.\n", baverageName[selectBeverage]);
            System.out.printf("남은 금액은 %d원 입니다.\n", money);
            System.out.println("거스름 돈을 반환 받으시겠습니까?(yes는 1/ no는 0");
            Scanner scanner = new Scanner(System.in);
            isExit = scanner.nextInt();
        }while(isExit == 0);
    }
}

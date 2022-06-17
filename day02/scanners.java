package day02;
import java.util.Scanner;

public class scanners {
    public void InputData(){
        Scanner scanner = new Scanner(System.in);
        String name = "코드라떼";
        String day = scanner.nextLine();
        String str = String.format("이 사이트는 %s이고 오늘은 %s일이다.", name, day);
        System.out.println(str);
    }
}

package day01;

public class conditionalExample {
    public static void main(String[] args) {
        // 조건문
        boolean goodWeather = false;
        boolean rainy = true;

        if(goodWeather){
            System.out.println("바다로 간다");
        } else if(!rainy){
            System.out.println("공원을 간다.");
        } else{
            System.out.println("집에 있는다.");
        }


        boolean isHandsome = false;
        if(!isHandsome){
            System.out.println("꽃단장을 한다.");
        }

        System.out.println("데이트를 하러 나간다.");

        int num = 2;
        switch(num){
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
                break;
            case 3:
                System.out.println(3);
                break;
            default:
                System.out.println("Default");
        }
    }
}

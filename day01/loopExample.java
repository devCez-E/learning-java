package day01;

public class loopExample {
    public static void main(String[] args) {
        //while문
        int num = 0;
        while(num < 5){
            num++;
            if(num%2 == 0) continue;

            System.out.println("While 밥을 먹는다 " + num);
        }

        // do...while 문
        num = 0;
        do{
            num++;
            System.out.println("Do While 밥을 먹는다 " + num);
        } while(num < 5);

        // for
        for(int i = 0; i < 5; i++){
            System.out.println("For 밥을 먹는다 " + i);
        }

        //for in
        int[] numArray = {10, 20, 30, 40};
        for(int na : numArray){
            System.out.println("For in 밥을 먹는다 " + na);
        }
    }
}

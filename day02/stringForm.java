package day02;

public class stringForm {
    void Example_1(){
        String name = "록카";
        String output = String.format("내이름은 %s이다.", name);
        System.out.println(output);
    }

    void Example_2(){
        float temperature = 23.5f;
        String output = String.format("오늘의 온도는 %f도이다.", temperature);
        System.out.println(output);
    }

    void Example_3(){
        char grade = 'A';
        String output = String.format("내 학점은 %c", grade);
        System.out.print(output);
    }

    void Example_4(){
        int age = 15;
        String output = String.format("내 나이는 %d이다.", age);
        System.out.println(output);
    }

    void Example_5(){
        String name = "록카";
        int age = 15;

        String output = String.format("내 이름은 %s이고 %d살이다.", name, age);
        System.out.println(output);
    }
}

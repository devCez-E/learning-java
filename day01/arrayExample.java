package day01;

public class arrayExample {
    public void main(String[] args) {
        // 배열의 선언
        int[] boxArray1 = {10, 20};
        int[] boxArray2 = new int[]{10,20};
        int boxArray3[] = new int[3];

        // 배열에 저장(Save)
        boxArray3[0] = 10;
        boxArray3[1] = 20;
        boxArray3[2] = 30;

        // 배열을 읽음(Read)
        System.out.println(boxArray1[0]);
        System.out.println(boxArray2[1]);
        System.out.println(boxArray3[2]);
        System.out.println(boxArray3[1]);
        System.out.println(boxArray3[0]);

        System.out.println(boxArray1.length);

        // 2차원 배열의 선언
        int [][] boxArray = new int[2][3];
        
        // 2차원 배열의 저장
        boxArray[0][0] = 1;
        boxArray[0][1] = 2;
        boxArray[0][2] = 3;
        boxArray[1][0] = 4;
        boxArray[1][1] = 5;
        boxArray[1][2] = 6;

        // 2차원 배열을 읽음
        System.out.println(boxArray[0][1]);
        System.out.println(boxArray[1][2]);
    }
}

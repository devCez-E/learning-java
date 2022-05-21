package day01;

class varExample{
    public static void main(String[] args) {
        // 변수의 선언
        int winterClothesBox;
        int num1;

        // 변수의 저장(Save)
        winterClothesBox = 1000;

        // 변수 선언과 저장 동시에
        int summerClothesBox = 1000;

        // 변수를 읽기
        num1 = summerClothesBox;

        System.out.println(winterClothesBox);
        System.out.println(summerClothesBox);
        System.out.println(num1);

        // 상수
        final int num;
        num = 1;

        //num = 4;          변경할 수 없다.
        System.out.println(num);


        // 형 변환(Conversion)
        // 암시적 형 변환(Implicit Conversion)
        byte a = 32;
        short b = a;
        int c = b;
        long d = c;
        // 명시적 형 변환(Implicit Conversion)
        c = (int)d;
        b = (short)c;
        a = (byte)b;

        float f = 32.123F;
        int i = (int)f;

        System.out.println(i);
    }
}

package day02;

public class evenNumber {
    public static void main(String[] args) {
        stringForm sf = new stringForm();
        //scanners sc = new scanners();
        MultipleTable mt = new MultipleTable();

        int evenNum = 1;
        do{
            if(evenNum % 2 == 0) System.out.println(evenNum);
            evenNum++;
        }while(evenNum < 11);

        sf.Example_1();
        sf.Example_2();
        sf.Example_3();
        sf.Example_4();
        sf.Example_5();

        //sc.InputData();

        mt.multipleTable();
    }
}

package day02;

public class MultipleTable {
    public void multipleTable(){
        for(int bigSeqNum = 2; bigSeqNum < 10; bigSeqNum++){
            for(int i = 1; i < 10; i++){
                String str = String.format("%d * %d = %d",bigSeqNum, i, bigSeqNum*i);
                System.out.println(str);
            }
        }
    }
}

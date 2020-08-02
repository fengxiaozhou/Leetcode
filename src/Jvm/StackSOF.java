package Jvm;

public class StackSOF {

    private int stackInt = 1;

    public void StackLeak() {
        stackInt++;
        StackLeak();
    }

    public static void main(String[] args) {
        StackSOF sof = new StackSOF();
        try {
            sof.StackLeak();
        } catch (Throwable e) {
            System.out.println(sof.stackInt);
            throw e;
        }
    }
}

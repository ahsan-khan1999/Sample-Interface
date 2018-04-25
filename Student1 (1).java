public class Student1 implements Person {

    private int i;
    public Student1() {

    }
    public Student1(int i) {
        this.i = i;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public void displayData(){
        System.out.println("Heres The interface method");

    }

}

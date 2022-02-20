public class MyFirstClass {
    public static void main(String[] args) {
        MySecondClass mySecondClass = new MySecondClass();
        System.out.println(mySecondClass.workString());
    }

    public static String workString(String string){
        String print = "---<%s>---";
        return String.format(print, string);
    }
}

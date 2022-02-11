public class MySecondClass {
    int i = 33;

    public String workString() {
        String print = "---<%s>---";
        System.out.println(String.format(print, i));
        return String.format(print, i);
    }
}

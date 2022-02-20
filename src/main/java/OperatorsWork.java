public class OperatorsWork {


    public static void main(String[] args) {

        int a = 1;
        int b = 3;
        int c = 3;
        int d = 6;

        int SummAB = a + b;
        int SummCD = c + d;

        System.out.println(SummAB > SummCD);

        System.out.println(SummAB += 1);

        System.out.println(SummCD -= 1);

        System.out.println(SummAB > SummCD);

        System.out.println(SummAB % 2 == 0 || SummCD % 2 == 0);
    }
}

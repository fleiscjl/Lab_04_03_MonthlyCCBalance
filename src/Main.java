public class Main {
    public static void main(String[] args)

    { System.out.println();

        String Month;
     int Balance = 5000;
     double intRate = 0.17;
     double Interest;
     int T = 2;
     Interest = Balance * intRate;

     System.out.println("Interest due after one month is" + " " + Interest);
     System.out.println("Interest due after two months is" + " " + Interest * T);
    }
}

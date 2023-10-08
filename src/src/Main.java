import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MercedesInterface BasicMercedes = new BasicMercedes();
        BasicMercedes.ChooseMercedes();

        System.out.println("-------------------------------------");

        MercedesInterface SportMercedes = new SportMercedes(new BasicMercedes());
        SportMercedes.ChooseMercedes();


        System.out.println("-------------------------------------");

        MercedesInterface LuxuryMercedes = new LuxuryMercedes(new SportMercedes(new BasicMercedes()));
        LuxuryMercedes.ChooseMercedes();


    }
}
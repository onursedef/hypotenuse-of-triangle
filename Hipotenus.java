import java.util.Scanner;

public class Hipotenus
{
    public static void main(String[] args)
    {
        int alan, cevre, c, b, a;
        Scanner inp = new Scanner(System.in);

        System.out.println("Lütfen kenar uzunluklarını girin");
        System.out.println("Taban uzunluğu => ");
        a = inp.nextInt();
        System.out.println("Yüksekliği => ");
        b = inp.nextInt();

        c = (int) Math.sqrt(((a*a) + (b * b)));
        System.out.println("Üçgenin hipotenüsü => " + c);
        cevre = (int) (a+b+c);
        System.out.println("Üçgenin çevresi => " + cevre);
        alan = (int) ((a * b) / 2);
        System.out.println("Üçgenin alanı => " + alan);
    }
}

import java.util.Scanner;

public class basamaklarınToplami {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int a, topla = 0;

        System.out.print("Sayi giriniz : ");
        a = inp.nextInt();

        while (a!=0)
        {
            topla=(a%10)+topla;
            a /= 10;
        }
        System.out.print("toplam : "+topla);
    }
}

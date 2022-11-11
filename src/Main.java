import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp=new Scanner(System.in);
        int no,sum=0;

        System.out.print("Bir sayı giriniz: ");
        no=inp.nextInt();

        for (int i=1; i<no;i++) // girilen sayıya kadar döngü
        {
            if(no%i==0) // girilen sayının çarpanlarını bulup sum içinde topluyoruz
                sum+=i;
        }
        if(no==sum)
            System.out.println(no+" sayısı mükemmel sayıdır.!");
        else
            System.out.println(no+" sayısı mükemmel sayı değildir.!");
    }
}
import java.util.Scanner;

public class hesapmakinesi {
    public static void main(String[] args){
        int n1, n2, select;

        Scanner input = new Scanner(System.in);
        System.out.println("birinci sayıyı giriniz: ");
        n1 = input.nextInt();
        System.out.println("ikinci sayıyı giriniz: ");
        n2 = input.nextInt();

        System.out.println("1-toplama \n2-çıkarma \n3- çarpma \n4-bölme");
        System.out.println("seçiminiz: ");
        select = input.nextInt();


        switch (select){
            case 1:
                System.out.println("toplam :" + (n1+n2));
                break;
            case 2:
                System.out.println("çıkarma :" + (n1-n2));
                break;
            case 3:
                System.out.println("çarpma :" + (n1*n2));
                break;
            case 4:
                if(n2 != 0){System.out.println("bölme :" + (n1/n2));}
                else{
                    System.out.println("bir sayı 0'a bölünemez");
                }
                break;
            default:
                System.out.println("yanlış seçim yaptınız tekrar deneyin");
        }


    }
}

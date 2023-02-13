import java.util.Scanner;
public class EtkinlikOnerisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
        System.out.print("Hava Sıcaklığını Giriniz:");
        int sicaklik = input.nextInt();
        if(sicaklik<=5){
            System.out.print("Kayak");
        }
        else if(sicaklik>5 && sicaklik <=15){
            System.out.print("Sinema");
        }
        else if(sicaklik>15 && sicaklik <=25){
            System.out.print("Piknik");
        }
        else{
            System.out.print("Yüzme");
        }
         */
        int sicaklik;
        System.out.println("1:5'den küçük\n2:5-15 arasında\n3:15-25 arasında\n4:25'ten büyük");
        System.out.println("Hava Sıcaklık Değeri Seçin:");
        sicaklik = input.nextInt();
        switch (sicaklik){
            case 1:
                System.out.println("Kayak");
                break;
            case 2:
                System.out.println("Sinema");
                break;
            case 3:
                System.out.println("Piknik");
                break;
            case 4:
                System.out.println("Yüzme");
                break;
            default:
                System.out.println("Yanlış Değer Girdiniz.");
        }
    }

}

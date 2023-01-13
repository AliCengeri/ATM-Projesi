import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String id, pass;
        int right = 3;
        int balance = 3500;
        int slct;
        while (right > 0) {
            System.out.print("Kullanıcı adını giriniz: ");
            id = input.nextLine();
            System.out.print("Şifreyi giriniz: ");
            pass = input.nextLine();
            if (id.equals("Ali") && pass.equals("123")) {
                System.out.println("Merhaba, CNG Bankasına hoş geldiniz.");
                do {
                    System.out.println("1-Para Yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiyeyi Sorgula\n" +
                            "4-Çıkış Yap");
                    System.out.print("Yapmak istediğiniz işlemi seçiniz: ");
                    slct = input.nextInt();
                    switch (slct) {
                        case 1:
                            System.out.print("Yatırmak istediğiniz tutarı giriniz: ");
                            int yatir = input.nextInt();
                            balance += yatir;
                            break;
                        case 2:
                            System.out.print("Çekmek istediğiniz tutarı giriniz: ");
                            int cek = input.nextInt();
                            if (cek > balance) {
                                System.out.println("Bakiye yetersiz.");
                            } else {
                                balance -= cek;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz: " + balance);
                            break;
                    }
                } while (slct != 4);
                System.out.println("İyi Günler.");
                break;
            } else {
                right--;
                System.out.println("Kullanıcı adı veya şifre hatalı!");
                if (right == 0) {
                    System.out.println("Hesabınız bloke edilmiştir.");
                    break;
                } else {
                    System.out.println("Kalan hakkınız: " + right);
                }
            }
        }
    }
}
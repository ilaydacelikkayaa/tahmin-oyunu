import java.util.Random;
import java.util.Scanner;
public class sayitahmin {
    public static void main(String[] args) {
        int tahmin=1,can=5;
        Random rand=new Random();
        int sayi=rand.nextInt(100);
        Scanner scanner=new Scanner(System.in);
        while(can>0){
        System.out.println("tahmin et kac tuttum:");
        int tahminsayi=scanner.nextInt();
        if(sayi==tahminsayi){
            System.out.println("tebrikler oyunu "+tahmin+".tahminde bildiniz");
            break;
        }
        else{
            can--;
            System.out.println("maalesef yanlış tahmin");
            System.out.println(can+" tane canın kaldı");
            if(can<=0){
                System.out.println("hakkın kalmadı maalesef");
                break;
            }
            tahmin++;
            
            if(sayi>tahminsayi){
                System.out.println("biraz daha yukari cikmalisin");
            }
            else{
                System.out.println("biraz daha aşağıya inmelisin");
            }
        }
    }
}
}

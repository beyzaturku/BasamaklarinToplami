package basamaklarintoplami;
import java.util.*;
public class BasamaklarinToplami {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Dört basamaklı bir sayı giriniz:");
        int sayi = input.nextInt();
        
        int binlerBas = sayi/1000;
        int yuzlerBas = (sayi%1000)/100;
        int onlarBas = ((sayi%1000)%100)/10;
        int birlerBas= (((sayi%100)%100)%10)/1;
        
        int toplam = (binlerBas+yuzlerBas+onlarBas+birlerBas);
        
        System.out.println(sayi+"="+binlerBas+"+"+yuzlerBas+"+"+onlarBas+"+"+birlerBas+"=" + toplam);
    }
    
}

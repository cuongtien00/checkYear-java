import java.util.Scanner;

public class checkYear {
    public static void main(String[] args) {
        int year;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi nhap nam");
        year = scanner.nextInt();
        if(year%4 == 0 && year%100 != 0) {
            System.out.println(year + " la nam nhuan");
        }else if( year%100==0 && year%400!=0) {
            System.out.println(year + " khong phai la nam nhuan");
        }else if(year%100==0 && year%400==0) {
            System.out.println(year + " la nam nhuan");
        }
    }
}


import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class Helloword2 {
    public static void main(String args[]) {
       /* System.out.print("Chao cac ");
        System.out.println("Chao cac ban hoc vien ihub");

        System.out.print("Ket Thuc ");

        System.out.printf("so nguyen %d", 10);
        System.out.printf("so nguyen %.3f", 9.22);
        System.out.printf("%s so nguyen ", "90");
        System.out.println();
        System.out.println("================");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap Ten");
System.out.println("Nhap Tuoi");
        scanner.nextInt();

       // System.out.println(scanner.nextLine());

*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap Ten");
        scanner.nextLine();

        int a = 5;
        int b = 4;
        //System.out.println(a + b);

        System.out.println(LocalDate.now());
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:sss");
        System.out.println(df.format(new Date()));


    }

}

import java.util.Scanner;

public class StringCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập chuỗi ");
        String string = sc.nextLine();
        int lenght = string.split("").length - 1;
        System.out.println("số kí tự trong chuổi là: " + lenght);
    }
}

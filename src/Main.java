import java.awt.*;
import java.util.Scanner;
import java.util.Stack;

public class Main {


    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();


        do {

            System.out.println("****************JAVA-HACKATHON-05-ADVANCE-1-MENU***************\n" +
                    "1. Nhập URL muốn truy cập\n" +
                    "2. Quay lại\n" +
                    "3. Thoát");
            System.out.println("chọn: ");
            Scanner input = new Scanner(System.in);
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Nhập URL: ");
                    input.nextLine();
                    String url = input.nextLine();
                    stack.push(url);
                    break;
                case 2:
                    stack.peek();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("chọn lại");
            }
        }while (true);
    }
}
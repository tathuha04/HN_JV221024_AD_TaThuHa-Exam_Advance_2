import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void Menu() {
        System.out.println("****************JAVA-HACKATHON-05-ADVANCE-1-MENU***************\n" +
                "1. Nhập URL muốn truy cập\n" +
                "2. Quay lại\n" +
                "3. Thoát");
    }

    public static void main(String[] args) {
        Menu();
        Scanner input = new Scanner(System.in);
        System.out.println("chọn: ");
        int choice = Integer.parseInt(input.nextLine());
        while (true){
        switch (choice){
            case 1:
                break;
            case 2:
                break;
            case 3:
                System.exit(0);
                break;
            default:
                System.out.println("chọn lại");
        }
    }
    }
}
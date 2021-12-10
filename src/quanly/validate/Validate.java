package quanly.validate;

import quanly.view.Main;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Validate {
    static Scanner scanner = new Scanner(System.in);
    public static int checkGroup() {
        boolean checkGroup;
        int group = 0;
        do {
            System.out.println("nhap age");
            checkGroup = true;
            try {
                group = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                checkGroup = false;
                System.out.println("Age phải là số!!!");
            }
        } while (!checkGroup);
        return group;
    }

    public static String checkPhoneNumber() {
        String phoneNumber = "";
        while (true) {
            System.out.println("Nhập số điện thoại: ");
            phoneNumber = scanner.nextLine();
            Pattern m = Pattern.compile("^0[0-9]{9}$");
            if (m.matcher(phoneNumber).find()) {
                System.out.println("PhoneNumber: " + phoneNumber);
                break;
            }
            else {
                checkQuit();
            }
        }
        return phoneNumber;
    }

    public static String name(){
        String name = "";
        while (true) {
            System.out.println("Nhập tên : ");
            name = scanner.nextLine();
            Pattern m = Pattern.compile("^\\pL+[\\pL\\pZ\\pP ]{0,}$");
            if (m.matcher(name).find()) {
                System.out.println("Name: " + name);
                break;
            }
            else {
                checkQuit();
            }
        }
        return name;
    }

    public static String gender(){
        String gender = "";
        while (true) {
            System.out.println("Nhập giới tính vào: ");
            gender = scanner.nextLine();
            Pattern m = Pattern.compile("^\\pL+[\\pL\\pZ\\pP ]{0,}$");
            if (m.matcher(gender).find()) {
                System.out.println("Gender: Male/Female : " + gender);
                break;
            }
            else {
                checkQuit();
            }
        }
        return gender;

    }

    public static String mail(){
        String mail = "";
        while (true) {
            System.out.println("Nhập email  vào: ");
            mail = scanner.nextLine();
            Pattern m = Pattern.compile("^[a-zA-Z][a-zA-Z0-9]+@[a-zA-Z]{2,5}(\\.[a-zA-Z]+){1,3}$");
            if (m.matcher(mail).find()) {
                System.out.println("Mail : " + mail);
                break;
            }
            else {
                checkQuit();
            }
        }
        return mail;

    }

    public static String address(){
        String address = "";
        while (true) {
            System.out.println("Nhập địa chỉ  vào: ");
            address = scanner.nextLine();
            Pattern m = Pattern.compile("^\\pL+[\\pL\\pZ\\pP ]{0,}$");
            if (m.matcher(address).find()) {
                System.out.println("Address: " + address);
                break;
            }
            else {
                checkQuit();
            }
        }
        return address;

    }public static String facebook(){
        String facebook = "";
        while (true) {
            System.out.println("Nhập facebook vào: ");
            facebook = scanner.nextLine();
            Pattern m = Pattern.compile("^\\pL+[\\pL\\pZ\\pP ]{0,}$");
            if (m.matcher(facebook).find()) {
                System.out.println("FaceBook: " + facebook);
                break;
            }
            else {
                checkQuit();
            }
        }
        return facebook;
    }

    public static int checkChoice() {
        Scanner scanner = new Scanner(System.in);
        boolean checkChoice;
        int choice = 0;
        do {
            checkChoice = true;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                checkChoice = false;
                System.err.println("---Mời nhập lại số có trong menu!!!---");
            }
        } while (!checkChoice);
        return choice;
    }

    public static void checkQuit(){
        System.err.println("-----Tiếp tục !!! Or Enter QUIT to back MENU---- ");
        String back = scanner.next();
        if (back.equalsIgnoreCase("quit")) {
            new Main();
        }
    }
}

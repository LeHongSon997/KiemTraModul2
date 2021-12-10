package quanly.view;

import quanly.controller.ContactController;
import quanly.io.ReadAndWrite;
import quanly.validate.Validate;

public class Main {
    public Main() {
        ContactController controller = new ContactController();


        System.out.println("                                                       ★----*★*Merry*★*-----MENU-----★*Christmas*★----★");
        System.out.println("                                                       ★              1. Xem danh sách                  ★");
        System.out.println("                                                       ★              2. Thêm mới                       ★");
        System.out.println("                                                       ★              3. Cập nhật                       ★");
        System.out.println("                                                       ★              4. Xóa                            ★");
        System.out.println("                                                       ★              5. Tìm kiếm                       ★");
        System.out.println("                                                       ★              6. Đọc file                       ★");
        System.out.println("                                                       ★              7. Ghi file                       ★");
        System.out.println("                                                       ★              0. Thoát                          ★");
        System.out.println("                                                       ★________________________________________________★");
        System.out.println("                                                                       ★★★Nhập lựa chọn★★★");
        int choice;
        do {
            choice = Validate.checkChoice();
            if (choice >= 0 && choice <= 7) {
                switch (choice) {
                    case 1: {
                        controller.showStudent();
                        break;
                    }
                    case 2: {
                        controller.addStudent();
                        break;
                    }
                    case 3: {
                        controller.editStudent();
                        break;
                    }
                    case 4: {
                        controller.deleteStudent();
                        break;
                    }
                    case 5: {
                        controller.searchByPhoneNumber();
                        break;
                    }
                    case 6: {
                        ReadAndWrite.readFile();
                        break;
                    }
                    case 7: {
                        ReadAndWrite.writeToFile();
                        break;
                    }
                }
            } else {
                System.err.println("---- Nhập lại lựa chọn !!! ----");
            }
        } while (choice != 0);
        System.err.println("----Bạn vừa thoát khỏi chương trình----");
    }


    public static void main(String[] args) {
        new Main();
    }
}

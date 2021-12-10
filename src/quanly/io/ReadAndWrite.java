package quanly.io;

import quanly.model.Contact;
import quanly.service.ContactService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ReadAndWrite {
    static ContactService contactService = new ContactService();

    public static void readFile(){
        try {
            FileReader fileReader = new FileReader("C:\\Users\\a\\Desktop\\TestModul2\\src\\quanly\\file\\Contact.txt");
            BufferedReader br = new BufferedReader(fileReader);
            String line = null;
            while ((line = br.readLine()) != null){
                String readFile[] = line.split(" , ");

                String name = readFile[0];
                String phoneNumber = readFile[1];
                int group = Integer.parseInt(readFile[2]);
                String render = readFile[3];
                String address  = readFile[4];
                String email  = readFile[5];
                String facebook  = readFile[6];


                Contact contact = new Contact(name, phoneNumber, group, render, address, email, facebook);
                contactService.add(contact);
            }
            System.out.println("Đọc file thành công");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeToFile() {
        List<Contact> contactList = contactService.showAll();
        try {
            FileWriter fileWriter = new FileWriter("C:\\Users\\a\\Desktop\\TestModul2\\src\\quanly\\file\\Contact.txt");
            for (Contact st : contactList) {
                fileWriter.write(st.toString() + " \n");
            }
            System.out.println("Ghi file thành công");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

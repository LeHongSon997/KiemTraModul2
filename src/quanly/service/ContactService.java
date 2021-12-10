package quanly.service;

import quanly.model.Contact;

import java.util.ArrayList;
import java.util.List;

public class ContactService {
    static List<Contact> contactList = new ArrayList<>();

    static {
        contactList.add(new Contact("Sơn","0287654123",1,"Nam","HN","son@gmail.com","sonle"));
        contactList.add(new Contact("Nam","0387654456",1,"Nam","HN","son@gmail.com","sonle"));
        contactList.add(new Contact("Vinh","0487654789",1,"Nam","HN","son@gmail.com","sonle"));
        contactList.add(new Contact("Lê","0587654012",1,"Nam","HN","son@gmail.com","sonle"));
        contactList.add(new Contact("Anh","0687654000",1,"Nam","HN","son@gmail.com","sonle"));
    }

    public List<Contact> showAll() {
        return contactList;
    }

    public void add(Contact contact) {
        contactList.add(contact);
    }

    public void edit(int index,Contact student) {
        contactList.set(index,student);
    }

    public void delete(int index) {
        contactList.remove(index);
    }

    public int findIndexByPhoneNumber(String phoneNumber) {
        for (int i = 0; i < contactList.size(); i++) {
            if (contactList.get(i).getPhoneNumber().equals(phoneNumber)) {
                return i;
            }
        }
        return -1;
    }
}

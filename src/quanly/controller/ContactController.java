package quanly.controller;

import quanly.model.Contact;
import quanly.service.ContactService;
import quanly.validate.Validate;

import java.util.List;

public class ContactController {
    ContactService contactService = new ContactService();
    List<Contact> contactList = contactService.showAll();


    public void showStudent() {
        for (Contact st: contactList) {
            System.out.println(st);
        }
        Validate.checkQuit();
    }

    public void addStudent() {
        while (true) {
            String phoneNumber = Validate.checkPhoneNumber();
            Contact contact = getStudent(phoneNumber);
            contactService.add(contact);
            Validate.checkQuit();
        }
    }

    private Contact getStudent(String phoneNumber) {
        String name = Validate.name();
        int group = Validate.checkGroup();
        String render = Validate.gender();
        String address = Validate.address();
        String email = Validate.mail();
        String facebook = Validate.facebook();
        return new Contact(name, phoneNumber, group, render, address, email, facebook);
    }

    public void editStudent() {
        while (true) {
            for (Contact st: contactList) {
                System.out.println(st);
            }
            String phoneNumber = Validate.checkPhoneNumber();
            int index = contactService.findIndexByPhoneNumber(phoneNumber);
            String phoneNumber1 = Validate.checkPhoneNumber();
            Contact contact = getStudent(phoneNumber1);
            contactService.edit(index, contact);
            Validate.checkQuit();
        }
    }

    public void deleteStudent() {
        while (true) {
            for (Contact st: contactList) {
                System.out.println(st);
            }
            String phoneNumber = Validate.checkPhoneNumber();
            int index = contactService.findIndexByPhoneNumber(phoneNumber);
            contactService.delete(index);
            Validate.checkQuit();
        }
    }

    public void searchByPhoneNumber() {
        String phoneNumber = Validate.checkPhoneNumber();
        for (int i = 0; i < contactList.size(); i++) {
            if (contactList.get(i).getPhoneNumber().equals(phoneNumber));
            System.out.println(contactList.get(i));
            break;
        }
    }
}

package prac;

import java.util.Scanner;

class Contact {
    private String name;  //이름 저장하는 문자열
    private String phoneNumber;  //전화번호 저장 문자열

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    } //이름과 전화번호 초기화

    public String getName() {
        return name;
    } //이름 반환

    public String getPhoneNumber() {
        return phoneNumber;
    } //전화번호 반환
}

public class PhoneBook {
    public static void main(String[] args) {
        System.out.print("Number of Person>> ");
        Scanner scanner = new Scanner(System.in);
        
        int numberOfPeople = scanner.nextInt();
        
        scanner.nextLine(); 

        Contact[] contacts = new Contact[numberOfPeople];

        for (int i = 0; i < numberOfPeople; i++) {
            System.out.println("Name and Phonesumber (ex. 홍길동 010-1234-5678) >> ");
            String input = scanner.nextLine();
            String[] parts = input.split(" "); //이름과 전화번호를 공백으로 구분하여 입력 받음
            
            if (parts.length == 2) {
                String name = parts[0];
                String phoneNumber = parts[1];
                contacts[i] = new Contact(name, phoneNumber);
            } else {
                System.out.println("error");
                i--; // 정확하지 않은 입력을 받을 땐 다시 수행
            }
        }
         
        System.out.println("Store Done");

        while (true) {
            System.out.print("Name to search >> ");
            String searchName = scanner.nextLine();

            if (searchName.equals("Stop")) {
                break;
            } else {
                boolean found = false;
                for (Contact contact : contacts) {
                    if (contact != null && contact.getName().equals(searchName)) {
                        System.out.println(contact.getName() + "'s number is " + contact.getPhoneNumber());
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.out.println(searchName + " not found");
                }
            }
        }
    }
}

            /*if (searchName.equals("Stop")) {
                break;
            }
            
            else if (contact.getName().equals(searchName)) {
            	System.out.println(contact.getName() + "'s number is " + contact.getPhoneNumber());
            }
            else {
            	System.out.println(searchName + "not found");
            }*/

           
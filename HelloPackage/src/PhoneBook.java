import java.util.Scanner;

class Contact {
    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}

public class PhoneBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number of Person>> ");
        int numberOfPeople = scanner.nextInt();
        scanner.nextLine(); // 개행 문자 처리

        Contact[] contacts = new Contact[numberOfPeople];

        for (int i = 0; i < numberOfPeople; i++) {
            System.out.println("Name and Phonesumber (ex. 홍길동 010-1234-5678) >> ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("Stop")) {
                break;
            }
            String[] parts = input.split(" ");
            if (parts.length >= 2) {
                String name = parts[0];
                String phoneNumber = parts[1];
                contacts[i] = new Contact(name, phoneNumber);
            } else {
                System.out.println("잘못된 입력 형식입니다. 이름과 전화번호를 공백으로 구분해 입력하세요.");
                i--; // 유효하지 않은 입력을 처리하고 다시 입력하도록 합니다.
            }
        }

        if (contacts[0] != null) {
            System.out.print("Name to search ");
            String searchName = scanner.nextLine();

            while (!searchName.equalsIgnoreCase("Stop")) {
                boolean found = false;
                for (Contact contact : contacts) {
                    if (contact != null && contact.getName().equals(searchName)) {
                        System.out.println(contact.getName() + "'s number is " + contact.getPhoneNumber());
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    //System.out.println(contact.getName() + " not found");
                }

                System.out.print("Name and Phonesumber (ex. 홍길동 010-1234-5678) >> ");
                searchName = scanner.nextLine();
            }
        } else {
            //System.out.println(contact.getName() + " not found");
        }
    }
}

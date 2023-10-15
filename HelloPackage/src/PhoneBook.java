import java.util.Scanner;

public class PhoneBook {
    public static void main(String[] args) {
        System.out.print("Number of Person>> ");  //입력받을 사람 수 입력
        Scanner scanner = new Scanner(System.in);
        
        int numberOfPeople = scanner.nextInt();
        
        scanner.nextLine(); 

        Contact[] contacts = new Contact[numberOfPeople];

        for (int i = 0; i < numberOfPeople; i++) {
            System.out.print("Name and Phonenumber (ex. 홍길동 010-1234-5678) >> ");
            String input = scanner.nextLine();
            String[] parts = input.split(" "); //이름과 전화번호를 공백으로 구분하여 입력 받음
            
            if (parts.length == 2) {
                String name = parts[0];
                String phoneNumber = parts[1];
                contacts[i] = new Contact(name, phoneNumber);
            } //공백으로 정확하게 구분되었을 때 첫번째는 이름, 두번째는 전화번호를 저장
            else {
                System.out.println("error");
                i--; // 정확하지 않은 입력을 받을 땐 다시 수행
            }
        }
         
        System.out.println("Store Done");

        while (true) {
            System.out.print("Name to search >> ");
            String searchName = scanner.nextLine();  //검색 단어를 searchName으로 저장

            if (searchName.equalsIgnoreCase("Stop")) {
                break;
            } //Stop 입력시 종료
            else {
                boolean found = false;
                for (Contact contact : contacts) { //contacts 배열에 저장된 모든 연락처를 순서대로 contact 변수에 할당
                    if (contact.getName().equals(searchName)) {  //찾고자 하는 이름 (searchName)이 contact.getName()과 같을 때
                        System.out.println(contact.getName() + "'s number is " + contact.getPhoneNumber()); //번호 출력
                        found = true;
                        break; //연락처 찾으면 루프 종료
                    }
                }
                if (found==false) { //찾고자 하는 연락처 없을 때
                    System.out.println(searchName + " not found");
                }
            }
        }
    }
}
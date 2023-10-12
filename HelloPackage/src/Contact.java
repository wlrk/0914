
public class Contact {
    private String name; //연락처 이름 저장 변수
    private String phoneNumber;  //연락처 번호 저장 변수

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    } //이름과 전화번호를 받아 변수에 할당 (생성자 method)

    public String getName() {
        return name;
    } //이름 반환 method

    public String getPhoneNumber() {
        return phoneNumber;
    } //번호 반환 method
}

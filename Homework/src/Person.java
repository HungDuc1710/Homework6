import java.util.Scanner;

public class Person {
    public String name;
    public String gender;
    public String address;
    public String dateOfBirth;

    public Person(String name, String gender, String address, String dateOfBirth) {
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
    }

    public Person() {
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên: ");
        name = sc.nextLine();
        System.out.print("Nhập giới tính: ");
        gender = sc.nextLine();
        System.out.print("Nhập địa chỉ: ");
        address = sc.nextLine();
        System.out.print("Nhập sinh nhật: ");
        dateOfBirth = sc.nextLine();
    }

    public void output() {
        System.out.print("\nTên sinh viên là: " + name + "\tGiới tính sinh viên là: " + gender
                + "\tĐịa chỉ sinh viên ở: " + address + "\tSinh nhật vào ngày " + dateOfBirth);
    }

}

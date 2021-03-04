import java.util.Scanner;

public class Student extends Person {
    public float CPA;
    public String email;

     public Student(String name, String gender, String address, String dateOfBirth, float CPA, String email) {
         super(name, gender, address, dateOfBirth);
         this.CPA = CPA;
         this.email = email;
    }
    
    
    @Override
    public void input() {
        // TODO Auto-generated method stub
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập điểm trung bình: ");
        CPA = sc.nextFloat();
        sc.nextLine();
        System.out.print("Nhập email: ");
        email = sc.nextLine();
    }
    @Override
    public void output() {
        // TODO Auto-generated method stub
        super.output();
        System.out.print("\tĐiểm trung bình: "+CPA+"\tEmail: "+email+"\n");
    }

    public Student() {
    }
}

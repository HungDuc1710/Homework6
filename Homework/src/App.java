import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Nhập số lượng sinh viên: ");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        Person person[] = new Person[n];
        
        for(int i = 0; i < n; i++){
            person[i] = new Student();
            person[i].input();
            person[i].output();
            System.out.println("------Hết thông tin sinh viên "+(i+1)+"------\n");
        }
    }
}

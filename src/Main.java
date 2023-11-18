import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Enter how many students you want to add: " );
        int numberOfStudents = scan.nextInt();

        for(int i=0; i<numberOfStudents; i++){
            System.out.println("Enter " + (++i) +". students name:");
            String studentName = scan.next();

            System.out.println("Enter " + i + ".students id");
            int studentId = scan.nextInt();

            OnlineStudent student = new OnlineStudent(studentName,studentId);
            System.out.println("Added student with name: " + student.getStudentName()  );
        }
        System.out.println(OnlineStudent.howManyStudent() +"students are active on the system");
        scan.close();
    }
}
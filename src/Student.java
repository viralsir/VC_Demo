import java.util.Scanner;

/*
   define memeber variable and member function represent student
   and add Entry and view logic for at least one student.

 */
public class Student
{
     int rollno;
     String name;
     int maths;
     int science;


     void setStudent(){
         Scanner scanner=new Scanner(System.in);

         System.out.println("Enter Student Roll No:");
         rollno=scanner.nextInt();
         System.out.println("Enter Student Name:");
         name=scanner.next();
         System.out.println("Enter Student Maths Marks:");
         maths= scanner.nextInt();
         System.out.println("Enter Student Science Marks:");
         science=scanner.nextInt();

     }

     void getStudent(){
         System.out.println("Roll No :"+rollno);
         System.out.println("Name:"+name);
         System.out.println("Maths :"+maths);
         System.out.println("Science :"+science);
     }

    public static void main(String[] args) {
          Student student=new Student();

          student.setStudent();
          student.getStudent();

    }



}

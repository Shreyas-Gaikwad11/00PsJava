package Inheritance;

public class StudentTest {
    public static void main(String[] args) {

        Student1 obj = new Student1();
        obj.setName("Shreyas G");
        obj.setRollNo(11);
        obj.setYear("Last Year");
        obj.setStream("Chemistry");
        obj.setPercentage(70.20F);

        System.out.println("\nStudent 1 info : ");
        System.out.println("Name   : "+obj.getName());
        System.out.println("RollNo : "+obj.getRollNo());
        System.out.println("Year   : "+obj.getYear());
        System.out.println("Stream : "+obj.getStream());
        System.out.println("Percentage : "+obj.getPercentage());

        Student2 obj2 = new Student2();

        obj2.setName("Shrey");
        obj2.setRollNo(12);
        obj2.setYear("First Year");
        obj2.setStream("IT");

        System.out.println("\nStudent 2 info : ");
        System.out.println("Name   : "+ obj2.getName());
        System.out.println("RollNo : "+ obj2.getRollNo());
        System.out.println("Year   : "+ obj2.getYear());
        System.out.println("Stream : "+ obj2.getStream());

    }
}

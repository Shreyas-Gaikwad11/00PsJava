package EncapsulationTest;

public class Test {

    public static void main(String[] args) {

        Encapsulation1 A = new Encapsulation1();
        A.setName("Shreyas");
        A.setAge(21);
        A.setMobNo(86002202L);


        System.out.println("Name : "+A.getName());
        System.out.println("Age : "+A.getAge());
        System.out.println("Mobile no : "+A.getMobNo());
    }
}

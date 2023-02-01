package EncapsulationTest;

public class Encapsulation1 {
    private String name;
    private int age;
    private long mobNo;

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getAge() {
        if (age >= 18){
            System.out.println("\n(Eligible for Police Bharati)");
        }
        else{
            System.out.println("\n(Not Eligible For Police Bharati)");
        }
        return age;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public long getMobNo() {
        if (mobNo >= 10){
            System.out.println("\n(Mobile no. is Correct)");
        }
        else {
            System.out.println("\n(Mobile no. is Incorrect)");
        }
        return mobNo;
    }

    public void setMobNo(long mobNo) {

        this.mobNo = mobNo;
    }
}

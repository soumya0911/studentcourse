class Student {
    String name;
    int age;
    String DOB;

    Student(String name, int age, String DOB){
        this.name=name;
        this.age=age;
        this.DOB=DOB;
    }
    void display(){
        System.out.println("Student Name:"+name+" Student age:"+age+" Student DOB:"+DOB);
    }
}
public class StudentInfo{
    public static void main(String[] args) {
        Student s1= new Student("Soumya",20,"09-11-2005");
        s1.display();
    }
}

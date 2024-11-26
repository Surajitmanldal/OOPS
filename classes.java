public class classes {
    public static void main(String[] args) {
        Student surajit =new Student();
        Student rohit=new Student(5,"rohit",45.21f);
        Student kunal=new Student(9);
//        System.out.println(rohit.name);
//        surajit.rno=3;
//        surajit.name="surajit";
//        surajit.marks=23.4f;
//        System.out.println(surajit.rno);
//        kunal.greeting();
//        Student random=new Student(surajit);
//        System.out.println(random.name);
//        System.out.println(kunal.name);

        Student one=new Student();
        Student two=one;
        two.name="ola";
        System.out.println(one.name);
    }
}
class Student{
    int rno;
    String name;
    float marks;

   //method
    void greeting(){
        System.out.println(this.name + " good evening");
    }
Student (Student other){
        this.name=other.name;
        this.rno=other.rno;
        this.marks=other.marks;
}
    //Default Constructor
    Student (){
        this.rno=3;
        this.name="surajit";
        this.marks=34.21f;
    }
    Student (int roll){
        this(roll,"kunal",45.32f);// this constructor call three parameter constructor
    }
    //parameterized constructor
    Student (int roll, String name, float mark){
        this.rno=roll;
        this.name=name;
        this.marks=mark;
    }
}

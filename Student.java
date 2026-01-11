public class Student {
    private int studentId;
    private String name;
    private double gpa;
    private int studentType;

    Student () {
        studentId =0;
        name = "";
        gpa = 0.00;
        studentType = 0;

    }

    Student (int studentId, String name, double gpa, int studentType) {
        this.studentId = studentId;
        this.name = name;
        this.gpa = gpa;
        this.studentType = studentType;

    }

    public String getName (){
        return name;
    }
    public int getstudentId (){
        return studentId;
    }
    public double getgpa (){
        return gpa;
    }
    public int getstudentType () {
        return studentType;
    }

    public void setName (String name){
        this.name = name;
    }
    public void setstudentId (int studentId){
        this.studentId = studentId;
    }
    public void setgpa (double gpa){
        this.gpa = gpa ;
    }
    public void setstudentType (int studentType) {
        this.studentType = studentType ;

    }

    public void enrollCourse(String courseName) {
        System.out.println(name + "has enrolled in " + courseName);


    }

    public void dropCourse (String courseName) {
        System.out.println(name +"has dropped " + courseName);

    }
    abstract  calculateStatus<T> extends toString<T> {

    }
    



}



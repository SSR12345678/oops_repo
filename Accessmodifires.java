import java.util.Scanner;
class Student {
    public String name;
    protected int rollNumber;
    private double gpa;
    
    public Student(String name, int rollNumber, double gpa) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.gpa = gpa;
    }

    public void displayInfo() {  
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("GPA: " + gpa);   
    }

    
    private void privateMethod() {
        System.out.println("This is a private method. GPA: " + gpa);
    }

  
    protected void protectedMethod() {
        System.out.println("This is a protected method. Roll Number: " + rollNumber);
    }
}

class GraduateStudent extends Student {

    
    public GraduateStudent(String name, int rollNumber, double gpa) {
        super(name, rollNumber, gpa);
    }

    
    @Override
    protected void protectedMethod() {
        System.out.println("Graduate Student's protected method.");
        
        System.out.println("Roll Number from parent class: " + rollNumber);
    }

  
    public void showGraduateDetails() {
        System.out.println("Graduate Student Name: " + name);
        protectedMethod(); 
    }
}

class Accessmodifires {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name for Student: ");
        String studentName = sc.nextLine();

        System.out.println("Enter roll number for Student: ");
        int studentRollNumber = sc.nextInt();

        System.out.println("Enter GPA for Student: ");
        double studentGpa = sc.nextDouble();

    
        Student student = new Student(studentName, studentRollNumber, studentGpa);
        student.displayInfo(); 

        System.out.println();

        
        sc.nextLine();
        System.out.println("Enter name for Graduate Student: ");
        String gradStudentName = sc.nextLine();

        System.out.println("Enter roll number for Graduate Student: ");
        int gradStudentRollNumber = sc.nextInt();

        System.out.println("Enter GPA for Graduate Student: ");
        double gradStudentGpa = sc.nextDouble();

        GraduateStudent gradStudent = new GraduateStudent(gradStudentName, gradStudentRollNumber, gradStudentGpa);
        gradStudent.showGraduateDetails(); 

        sc.close();
    }
}

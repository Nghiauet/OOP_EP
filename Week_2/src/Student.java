// Class Student
public class Student {
    // Attributes
    public String name;
    public int age;

    // Static variable to keep track of student count
    public static int studentCount = 0;

    // Constructor to initialize name and age, and increment studentCount
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        studentCount++;
    }

    // Method to display student info
    public void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Static method to get the student count
    public static int getStudentCount() {
        return studentCount;
    }
}
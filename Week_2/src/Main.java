// Main class to test Person
public class Main {
    public static void main(String[] args) {
        // Create a Person object
        Person person = new Person("John", 30, "123 Street");

        // Access public and protected attributes directly
        System.out.println(person.name);  // Accessible
        System.out.println(person.age);   // Accessible within the same package

        // The address is private, so it can't be accessed directly
        // System.out.println(person.address);  // This will cause a compilation error

        // Accessing address using the getter
        System.out.println(person.getAddress());  // Accessible via method

        // Display all info using showInfo()
        person.showInfo();

        // Create a Circle object with a radius of 5
        Circle circle = new Circle(5.0);

        // Calculate and display the area
        System.out.println("Area of the circle: " + circle.calculateArea());

        // Attempt to modify PI (this will cause an error)
        // Circle.PI = 3.14;  // Compilation error: Cannot assign a value to final variable 'PI'



        // Create 5 Student objects
        Student student1 = new Student("Alice", 20);
        Student student2 = new Student("Bob", 21);
        Student student3 = new Student("Charlie", 22);
        Student student4 = new Student("David", 23);
        Student student5 = new Student("Eve", 24);

        // Display the total number of students
        System.out.println("Total students: " + Student.getStudentCount());

        // You can also display each student's info
        student1.showInfo();
        student2.showInfo();
        student3.showInfo();
        student4.showInfo();
        student5.showInfo();
    }
}
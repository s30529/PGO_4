public class Main {
    public static void main(String[] args) {

        StudentGroup group1 = new StudentGroup("Group1");


        Student student1 = new Student("John", "Doe", "12345", group1, "john@example.com", "123 Main St");
        Student student2 = new Student("Jane", "Smith", "54321", group1, "jane@example.com", "456 Oak St");


        student1.addGrade(4.0);
        student1.addGrade(3.5);
        student2.addGrade(3.0);
        student2.addGrade(4.5);


        try {
            group1.addStudent(student1);
            group1.addStudent(student2);
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            System.out.println("Average grade for student 1: " + student1.averageGrade());
            System.out.println("Average grade for student 2: " + student2.averageGrade());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

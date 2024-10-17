package NestedClass.schoolManagementSystem;

public class SchoolManagementSystem {
    public static void main(String[] args) {
        // Create a school
        School school = new School("Greenfield Academy");

        // Add departments
        school.addDepartment("Mathematics");
        school.addDepartment("Computer Science");

        // Add teachers to departments
        School.Department mathDepartment = school.findDepartment("Mathematics");
        if (mathDepartment != null) {
            mathDepartment.addTeacher("Alice", "Calculus");
            mathDepartment.addTeacher("Bob", "Algebra");
        }

        School.Department csDepartment = school.findDepartment("Computer Science");
        if (csDepartment != null) {
            csDepartment.addTeacher("Charlie", "Data Structures");
            csDepartment.addTeacher("Dave", "Algorithms");
        }

        // Add students
        school.addStudent("John", 18, "Mathematics");
        school.addStudent("Emily", 19, "Computer Science");
        school.addStudent("Michael", 20, "Mathematics");

        // Display school information
        school.displaySchoolInfo();
        csDepartment.displayDepartmentInfo();
    }
}

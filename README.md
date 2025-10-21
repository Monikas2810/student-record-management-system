# student-record-management-system
This is a simple Java based student record management that allows users to manage student records. It supports adding, viewing, updating, and deleting student information.
Main.java         # Contains the main menu and logic for managing students 
student.java      # Defines the Student class with ID, name, and mark
1. compile file
   javac student.java Main.java
- Run the program:
java Main
Features
- Add Student: Enter ID, name, and mark to add a new student.
- View Students: Displays all student records.
- Update Student: Modify name and mark by entering the student ID.
- Delete Student: Remove a student by ID.
- Exit: Close the application.
Sample Interaction
--- Student Menu ---
1. Add Student
2. View Students
3. Update Student
4. Delete Student
5. Exit
Enter choice: 1
Enter ID: 101
Enter Name: Alice
Enter Mark: 89.5
Student added.

Requirements
- Java Development Kit (JDK) 8 
-  VS Code
 Notes
- The student list is stored in memory (ArrayList) and will reset when the program exits.
- Class name student should ideally be capitalized (Student) to follow Java naming conventions.

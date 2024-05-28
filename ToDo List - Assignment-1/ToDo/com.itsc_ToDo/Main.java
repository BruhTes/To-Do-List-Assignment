public class Main {
    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();

        toDoList.addToDo(new Task("Attend Lecture", "Attend the Data Structures and Algorithm lecture at 1:30 PM"));
        toDoList.addToDo(new Task("Submit Assignment", "Submit the Applied Math 3 assignment by 3:30 PM"));
        toDoList.addToDo(new Task("Study for Exam", "Study for the Database midterm exam"));
        toDoList.addToDo(new Task("Data Center Visit", "Visit AAiT Data Center in group at 4 PM"));

        System.out.println("Tasks in the ToDoList:");
        toDoList.viewToDoList();

        toDoList.markToDoAsCompleted("Study for Exam");
        toDoList.markToDoAsCompleted("Data Center Visit");

        System.out.println("\nTasks in the ToDoList after marking some as completed:");
        toDoList.viewToDoList();
    }
}

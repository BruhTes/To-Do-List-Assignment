public class ToDoList {
    private Node head;
    
    // Constructor to create an empty to-do list.
    public ToDoList() {
        this.head = null;
    }
    
    // Method to add a new task to the end of the to-do list.
    public void addToDo (Task task) {
        Node newNode = new Node(task);

        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode; 
        }
    }

    // This Method Marks the task with the given title as completed.
    public void markToDoAsCompleted(String title) {
        Node current = head;
        while (current != null) {
            if (current.task.getTitle().equals(title)) {
                current.task.markCompleted();
                return;
            }
            current = current.next;
        }
        System.out.println("Task with title '" + title + "' not found.");
    }

    // Method that Displays all the tasks in the to-do list.
    public void viewToDoList() {
        Node current = head;
        while (current != null) {
            System.out.println(current.task); 
            current = current.next;
        }
    }
}

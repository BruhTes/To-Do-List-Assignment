public class Node {
    public Task task;
    public Node next;
    
    // Constructor to create a new node with the given task.
    public Node(Task task) {
        this.task = task;
        next = null;
    }
}
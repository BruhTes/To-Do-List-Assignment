public class Task {
    private String title, description;
    private boolean completed;

    // Constructor to create a new task with the given title and description.
    Task (String title, String description) {
        this.title = title;
        this.description = description;
        this.completed = false;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void markCompleted() {
        this.completed = true;
    }
    
    // Method to change the Printed tasks to Human Readable Format
    public String toString() {
        return "Task [title=" + title + ", description=" + description + ", completed=" + completed + "]";
    }

}
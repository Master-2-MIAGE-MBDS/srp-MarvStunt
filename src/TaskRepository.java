import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    private static List<Task> tasks = new ArrayList<>();

    public TaskRepository() {
        tasks = new ArrayList<>();
    }

    public static void addTask(String title, String description) {
        tasks.add(new Task(title, description));
    }

    // Marquer une tâche comme terminée
    public void markTaskAsComplete(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.get(index).setCompleted(true);
        }
    }

    public List<Task> getTasks() {
        return tasks;
    }
}

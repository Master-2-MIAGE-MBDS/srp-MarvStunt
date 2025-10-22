import java.util.List;

public class Main {
    public static void main(String[] args) {
        TaskRepository taskRepository = new TaskRepository();
        TaskRepository.addTask("Tache 1", "Description de la tache 1");
        TaskRepository.addTask("Tache 2", "Description de la tache 2");
        TaskRepository.addTask("Tache 3", "Description de la tache 3");

        taskRepository.markTaskAsComplete(1);

        TaskPrinting taskPrinting = new TaskPrinting();
        taskPrinting.printCompletedTasks(taskRepository.getTasks());
        taskPrinting.printPendingTasks(taskRepository.getTasks());
    }
}

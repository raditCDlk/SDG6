
import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    // Data Structure to hold the objects

    private List<Task> taskList = new ArrayList<>();

    public void viewAllTask() {
        if (taskList.isEmpty()) {
            System.out.println("No tasks available.");
            return;
        }
        for (Task t : taskList) {
            System.out.println(t.toString());
        }
    }
}

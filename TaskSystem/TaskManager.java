package TaskSystem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<Task> tasks;

    public TaskManager() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public Boolean removeTaskById(int taskId) {
        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).getTaskId() == taskId) {
                tasks.remove(i);
                return true;
            }
        }
        return false;
    }

    public Boolean updateTaskById(int taskId, String taskName, String description, LocalDate dueDate, Boolean status) {
        for (Task task : tasks) {
            if (task.getTaskId() == taskId) {
                task.setTaskName(taskName);
                task.setDescription(description);
                task.setDueDate(dueDate);
                task.setStatus(status);
                return true;
            }
        }
        return false;
    }

    public Task getTaskById(int taskId) {
        for (Task task : tasks) {
            if (task.getTaskId() == taskId) {
                return task;
            }
        }
        return null;
    }

    public List<Task> showAllTasks() {
        return tasks;
    }

    public List<Task> pendingTasks() {
        List<Task> pendingTasks = new ArrayList<>();
        for (Task task : tasks) {
            if (!task.getStatus()) {
                pendingTasks.add(task);
            }
        }
        return pendingTasks;
    }

    public List<Task> completedTasks() {
        List<Task> completedTasks = new ArrayList<>();
        for (Task task : tasks) {
            if (task.getStatus()) {
                completedTasks.add(task);
            }
        }
        return completedTasks;
    }
}

package TaskSystem;

import java.time.LocalDate;

public class Task {
    private int taskId;
    private String taskName, description;
    private LocalDate dueDate;
    private Boolean status;

    public Task() {

    }

    public Task(int taskId, String taskName, String description, LocalDate dueDate) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.description = description;
        this.dueDate = dueDate;
        this.status = false;
    }

    public Task(int taskId, String taskName, String description, LocalDate dueDate, Boolean status) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.description = description;
        this.dueDate = dueDate;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Task [task Id=" + taskId + ", task Name=" + taskName + ", description=" + description + ", due Date="
                + dueDate + ", status=" + status + "]";
    }

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

}

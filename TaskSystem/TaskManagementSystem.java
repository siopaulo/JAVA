package TaskSystem;

import java.time.LocalDate;
import java.util.Scanner;

public class TaskManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskManager taskManager = new TaskManager();

        while (true) {
            System.out.println("Choose on of the choices and input the number.");
            System.out.println("1. Add a new Task");
            System.out.println("2. Delete a task");
            System.out.println("3. Update a task");
            System.out.println("4. Get task details by task ID");
            System.out.println("5. List all tasks");
            System.out.println("6. list pending tasks");
            System.out.println("7. List completed tasks");
            System.out.println("8. Exit the program...");

            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.println("ID of your task: ");
                    int idTask = Integer.parseInt(scanner.nextLine());
                    System.out.println("How are you gonna call this task: ");
                    String taskName = scanner.nextLine();
                    System.out.println("Description of the task: ");
                    String description = scanner.nextLine();
                    System.out.println("When is the dead line (yyyy-mm-dd): ");
                    LocalDate dueTime = LocalDate.parse(scanner.nextLine());

                    Task task = new Task(idTask, taskName, description, dueTime);
                    taskManager.addTask(task);
                    System.out.println("Task has been added successfully!");
                    break;

                case 2:
                    System.out.println("Write ID of the task you want to delete");
                    int idTaskToDelete = Integer.parseInt(scanner.nextLine());
                    taskManager.removeTaskById(idTaskToDelete);
                    break;

                case 3:
                    System.out.println("Which ID you want to change: ");
                    int changeId = Integer.parseInt(scanner.nextLine());
                    System.out.println("Change task name: ");
                    String changeName = scanner.nextLine();
                    System.out.println("Change task description: ");
                    String changeDescription = scanner.nextLine();
                    System.out.println("Change task due date: ");
                    LocalDate changeDueDate = LocalDate.parse(scanner.nextLine());
                    System.out.println("Change task status: ");
                    Boolean changeStatus = Boolean.parseBoolean(scanner.nextLine());

                    taskManager.updateTaskById(changeId, changeName, changeDescription, changeDueDate, changeStatus);
                    System.out.println("Task has been successfully updated!");
                    break;

                case 4:
                    System.out.println("Write Id to get details: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.println(taskManager.getTaskById(id));
                    break;

                case 5:
                    System.out.println(taskManager.showAllTasks());
                    break;

                case 6:
                    System.out.println(taskManager.pendingTasks());
                    break;

                case 7:
                    System.out.println(taskManager.completedTasks());
                    break;

                case 8:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);

                default:
            }
        }
    }
}

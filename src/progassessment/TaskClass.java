package progassessment;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class TaskClass extends WorkerClass {

    private List<TaskClass> tasks = new ArrayList<>();

    // Checks if the task description is under 50 characters
    public boolean checkTaskDescription(String taskDescription) {
        return taskDescription.length() <= 50;

    }

    // Creates task ID for the user
    public String createTaskID() {
        String taskNamePrefix = getTaskName().substring(0, 2).toUpperCase();
        String developerSuffix = getDeveloperDetails().substring(getDeveloperDetails().length() - 3).toUpperCase();
        return taskNamePrefix + ":" + getTaskNumber() + ":" + developerSuffix;
    }

    // Prints the details of the tasks
    public void printTaskDetails(int numTasks) {
        StringBuilder messageBuilder = new StringBuilder();
        WorkerClass[] taskList = new WorkerClass[numTasks];

        for (int i = 0; i < numTasks; i++) {
            taskList[i] = new WorkerClass();

        }
        for (WorkerClass task : taskList) {
            messageBuilder.append("Task name: ").append(task.getTaskName()).append("\n");
            messageBuilder.append("Developer Details: ").append(task.getDeveloperDetails()).append("\n");
            messageBuilder.append("Task Number: ").append(task.getTaskNumber()).append("\n");
            messageBuilder.append("Task Name: ").append(task.getTaskName()).append("\n");
            messageBuilder.append("Task Description: ").append(task.getTaskDescription()).append("\n");
            messageBuilder.append("Task ID: ").append(task.getTaskID()).append("\n");
            messageBuilder.append("Task Duration: ").append(task.getTaskDuration()).append("\n");
            messageBuilder.append("\n");

        }
        JOptionPane.showMessageDialog(null, messageBuilder.toString());
    }

    // Returns the total hours of all tasks
    public static int returnTotalHours() {
        List<TaskClass> tasks = new ArrayList<>();
        int totalHours = 0;
        for (TaskClass task : tasks) {
            totalHours += task.getTaskDuration();
        }
        return totalHours;
    }

}

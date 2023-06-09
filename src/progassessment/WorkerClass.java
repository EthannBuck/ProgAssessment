package progassessment;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class WorkerClass {

    public static int taskCount = 0;
    public static int totalHours;
    public String taskName;
    public String taskDescription;
    public String developerDetails;
    public int taskDuration;
    public String taskID;
    public String taskStatus;
    public int taskNumber;
    public List<TaskClass> tasks = new ArrayList<>();

    // Setter methods
    /**
     * @param taskName the taskName to set
     */
    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    /**
     * @param taskDescription the taskDescription to set
     */
    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    /**
     * @param developerDetails the developerDetails to set
     */
    public void setDeveloperDetails(String developerDetails) {
        this.developerDetails = developerDetails;
    }

    /**
     * @param taskDuration the taskDuration to set
     */
    public void setTaskDuration(int taskDuration) {
        this.taskDuration = taskDuration;
    }

    /**
     * @param taskID the taskID to set
     */
    public void setTaskID(String taskID) {
        this.taskID = taskID;
    }

    /**
     * @param taskStatus the taskStatus to set
     */
    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    /**
     * @param taskNumber the taskStatus to set
     */
    public void setTaskNumber(int taskNumber) {
        this.taskNumber = taskNumber;
    }

    /**
     * @return the taskName
     */
    public String getTaskName() {
        return taskName;
    }

    /**
     * @return the taskDescription
     */
    public String getTaskDescription() {
        return taskDescription;
    }

    /**
     * @return the developerDetails
     */
    public String getDeveloperDetails() {
        return developerDetails;
    }

    /**
     * @return the taskDuration
     */
    public int getTaskDuration() {
        return taskDuration;
    }

    /**
     * @return the taskID
     */
    public String getTaskID() {
        return taskID;
    }

    /**
     * @return the taskStatus
     */
    public String getTaskStatus() {
        return taskStatus;
    }
    /**
     * @return the taskNumber
     */
    public int getTaskNumber() {
        return taskNumber;
    }

    public String correctTaskDes() {
            String output = null;
            output = "Task successfully captured";
            JOptionPane.showMessageDialog(null, output);
            return output;
        }
    
    public String incorrectTaskDes() {
            String output = null;
            output = "Please enter a task description of less than 50 characters";
            JOptionPane.showMessageDialog(null, output);
            return output;
        }
    
    // Displays a welcome message
    public void welcomeMessage() {
        JOptionPane.showMessageDialog(null, "Welcome to EasyKanban");
    }

    // Displays the main menu and handles user choice
    public void welcome() {
        Boolean quit = false;
        while (!quit) {
            int choice = showMenu();

            switch (choice) {
                case 1 ->
                    addTasks();
                case 2 ->
                    showReport();
                case 3 ->
                    quit = true;
                default ->
                    JOptionPane.showMessageDialog(null, "Invalid choice, Try again.");

            }
        }
    }

    // Displays the report message
    public static void showReport() {
        JOptionPane.showMessageDialog(null, "Coming Soon");
    }
    
    // Displays the main menu and returns the user's choice
    public static int showMenu() {
        String menu = "Select an option:" + "\r\n"
                + "1. Add Tasks" + "\r\n"
                + "2. Show Report" + "\r\n"
                + "3. Quit";

        String menus = JOptionPane.showInputDialog(menu);
        int choice = Integer.parseInt(menus);
        return choice;

    }
    
    // Add tasks based on user input
    public void addTasks() {

        String tasks = JOptionPane.showInputDialog("Enter the number of tasks");
        int numTasks = Integer.parseInt(tasks);

        WorkerClass[] taskList = new WorkerClass[numTasks];

        for (int i = 0; i < numTasks; i++) {
            WorkerClass task = new WorkerClass();
            TaskClass tasksss = new TaskClass();

            // Task name input
            String taskName = JOptionPane.showInputDialog("Enter the task name");
            task.setTaskName(taskName);

            // Task description input
            String taskDescription = JOptionPane.showInputDialog("Enter the task description");
            boolean validDescription = tasksss.checkTaskDescription(taskDescription);
            if (validDescription == true) {
                correctTaskDes();
            } else {
                incorrectTaskDes();
            }
            task.setTaskDescription(taskDescription);

            // Developer first name input
            String developerFirstName = JOptionPane.showInputDialog("Enter the developer's first name");
            
            // Developer last name input
            String developerLastName = JOptionPane.showInputDialog("Enter the developer's last name");
            task.setDeveloperDetails(developerFirstName + " " + developerLastName);

            // Task duration input
            String taskDurationsString = JOptionPane.showInputDialog("Enter the duration of the task");
            int taskDuration = Integer.parseInt(taskDurationsString);
            task.setTaskDuration(taskDuration);
            totalHours += taskDuration;

            // Task ID code
            String taskID = taskName.substring(0, 2).toUpperCase() + ":" + i + ":"
                    + developerLastName.substring(developerLastName.length() - 3).toUpperCase();
            task.setTaskID(taskID);

            // Task status input
            String[] statusOptions = {"To Do", "Done", "Doing"};
            String taskStatus = (String) JOptionPane.showInputDialog(null, "Select task status:", "Task Status", JOptionPane.PLAIN_MESSAGE, null, statusOptions, statusOptions[0]);
            task.setTaskStatus(taskStatus);
            
            // Sets the task number
            task.setTaskNumber(i);
            taskList[i] = task;
            
        }
        
        
        
        // Generate task details
        StringBuilder messageBuilder = new StringBuilder();
        for (WorkerClass task : taskList) {
            messageBuilder.append("Task Name: ").append(task.getTaskName()).append("\n");
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

    // Displays the total hours of all tasks
    public void displayTotalHours() {
        JOptionPane.showMessageDialog(null, "Total Task Duration: " + totalHours + " hours");
    }

}

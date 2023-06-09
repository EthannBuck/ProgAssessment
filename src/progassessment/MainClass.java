package progassessment;

public class MainClass {

    public static void main(String[] args) {

        LoginClass login = new LoginClass();
        login.printRegister();
        
        WorkerClass worker = new WorkerClass();
        worker.welcomeMessage();
        worker.welcome();
        worker.displayTotalHours();
        
        TaskClass task = new TaskClass();
        task.printTaskDetails(0);
        
        

        

        

        }
    }



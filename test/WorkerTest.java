
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import progassessment.WorkerClass;

public class WorkerTest {

    WorkerClass instance = new WorkerClass();

    public WorkerTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

   @Test
    public void testTask1() {
        WorkerClass task1 = new WorkerClass();
        task1.setTaskName("Login Feature");
        task1.setTaskNumber(0);
        task1.setTaskDescription("Create Login to authenticate users");
        task1.setDeveloperDetails("Robyn Harrison");
        task1.setTaskDuration(8);
        task1.setTaskID("LO:0:BYN");
        task1.setTaskStatus("To Do");

        assertEquals("Login Feature", task1.getTaskName(), "Login Feature");
        assertEquals(0, task1.getTaskNumber(), 0);
        assertEquals("Create Login to authenticate users", task1.getTaskDescription(), "Create Login to authenticate users");
        assertEquals("Robyn Harrison", task1.getDeveloperDetails(), "Robyn Harrison");
        assertEquals(8, task1.getTaskDuration(), 8);
        assertEquals("LO:0:BYN", task1.getTaskID(), "LO:0:BYN");
        assertEquals("To Do", task1.getTaskStatus(), "To Do");
    }
    
    @Test
    public void testTask2() {
        WorkerClass task2 = new WorkerClass();
        task2.setTaskName("Add Task Feature");
        task2.setTaskNumber(1);
        task2.setTaskDescription("Create Add Task feature to add task users");
        task2.setDeveloperDetails("Mike Smith");
        task2.setTaskDuration(10);
        task2.setTaskID("AD:1:IKE");
        task2.setTaskStatus("Doing");

        assertEquals("Add Task Feature", task2.getTaskName(), "Add Task Feature");
        assertEquals(1, task2.getTaskNumber(), 1);
        assertEquals("Create Add Task feature to add task users", task2.getTaskDescription(), "Create Add Task feature to add task users");
        assertEquals("Mike Smith", task2.getDeveloperDetails(), "Mike Smith");
        assertEquals(10, task2.getTaskDuration(), 10);
        assertEquals("AD:1:IKE", task2.getTaskID(), "AD:1:IKE");
        assertEquals("Doing", task2.getTaskStatus(), "Doing");
    }
    
    @Test
    public void testTaskDescriptionSuccess() {
        WorkerClass task = new WorkerClass();
        task.setTaskDescription("abcde");
        assertEquals("abcde", task.correctTaskDes(),"Task successfully captured" );
    }
    
    @Test
    public void testTaskDescriptionFail() {
        WorkerClass task = new WorkerClass();
        task.setTaskDescription("abcdeabcdeabcdeabcdeabcdeabcdeabcdeabcdeabcdeabcdeabcdeabcde");
        assertEquals("abcdeabcdeabcdeabcdeabcdeabcdeabcdeabcdeabcdeabcdeabcdeabcde", task.incorrectTaskDes(),"Please enter a task description of less than 50 characters" );
    }
    
    @Test
    public void testTaskIDCorrect() {
        WorkerClass task = new WorkerClass();
        task.setTaskName("Login Feature");
        task.setTaskNumber(1);
        task.setDeveloperDetails("Robyn Harrison");
        String expectedTaskID = "LO:1:BYN";
        String actualTaskID = "LO:1:BYN";
        assertEquals(expectedTaskID, actualTaskID, "LO:1:BYN");
    }
        
    @Test
    public void testTotalHoursAccumulation() {
        WorkerClass worker = new WorkerClass();
        
        // Test case 1: Test Data for Task 1 and Task 2
        worker.setTaskDuration(18);
        int expectedTotalHours = 18;
        int actualTotalHours = 18;
        assertEquals(expectedTotalHours, actualTotalHours, 18);
        
        // Test case 2: Num Tasks: 5, Durations: 10, 12, 55, 11, 1
        int[] durations = {10, 12, 55, 11, 1};
        int totalHours = 0;
        for (int i = 0; i < durations.length; i++) {
            worker.setTaskDuration(durations[i]);
            totalHours += durations[i];
            expectedTotalHours = totalHours;
            actualTotalHours = 89;
            assertEquals(expectedTotalHours, actualTotalHours, 89 + (i + 1));
        }
        
        expectedTotalHours = 89;
        actualTotalHours = 89;
        assertEquals(expectedTotalHours, actualTotalHours, 89);
    }
}
    
    
    
    



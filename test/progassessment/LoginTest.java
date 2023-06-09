
package progassessment;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class LoginTest {
    
    public LoginTest() {
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

    /**
     * Test of checkuserName method, of class LoginClass.
     */
    @Test
    public void testCheckuserNameSuccess() {
        LoginClass instance = new LoginClass();
        instance.setfirstName("Ethan");
        instance.setlastName("Buck");
        instance.setuserName("kyl_1");
        instance.setpassword("Keir@2002");
        assertEquals("Welcome Ethan, Buck it is great to see you", instance.registerUser());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        }

    /**
     * Test of checkuserName method, of class LoginClass.
     */
    @Test
    public void testCheckuserNameFail() {
        LoginClass instance = new LoginClass();
        instance.setfirstName("Ethan");
        instance.setlastName("Buck");
        instance.setuserName("kyle!!!!!!!");
        instance.setpassword("Keir@2023");
        assertEquals("Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length.", instance.registerUser());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
 
    /**
     * Test of checkpasswordcomplexity method, of class LoginClass.
     */
    
    @Test
    public void testCheckpasswordcomplexitySuccess() {
        LoginClass instance = new LoginClass();
        instance.setfirstName("Ethan");
        instance.setlastName("Buck");
        instance.setuserName("eth_");
        instance.setpassword("Ch&&sec@ke99!");
        assertEquals("Welcome Ethan, Buck it is great to see you", instance.registerUser());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of checkpasswordcomplexity method, of class LoginClass.
     */
    @Test
    public void testCheckpasswordcomplexityFail() {
        LoginClass instance = new LoginClass();
        instance.setfirstName("Ethan");
        instance.setlastName("Buck");
        instance.setuserName("eth_");
        instance.setpassword("password");
        assertEquals("Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number and a special character.", instance.registerUser());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of LoginClass method, of class LoginClass.
     */
    @Test
    public void testLoginSuccess() {
        LoginClass instance = new LoginClass();
        instance.setfirstName("Ethan");
        instance.setlastName("Buck");
        instance.setuserName("eth_");        
        instance.setpassword("Keir@1234");
        assertTrue(instance.loginUser());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
   
    /**
     * Test of LoginClass method, of class LoginClass.
     */
    @Test
    public void testLoginFail() {
        LoginClass instance = new LoginClass();
        instance.setfirstName("Ethan");
        instance.setlastName("Buck");
        instance.setuserName("ethan1");        
        instance.setpassword("Keira1");
        assertFalse(instance.loginUser());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
        
    /**
     * Test of checkuserName method, of class LoginClass.
     */
    @Test
    public void testuserNameSuccess() {
        LoginClass instance = new LoginClass();        
        instance.setfirstName("Ethan");
        instance.setlastName("Buck");
        instance.setuserName("eth_");        
        instance.setpassword("Keir@1234");
        assertTrue(instance.checkuserName());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of checkuserName method, of class LoginClass.
     */
    @Test
    public void testuserNameFail() {
        LoginClass instance = new LoginClass();    
        instance.setfirstName("Ethan");
        instance.setlastName("Buck");
        instance.setuserName("ethan123");        
        instance.setpassword("Keir@1234");
        assertFalse(instance.checkuserName());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of checkpasswordcomplexity method, of class LoginClass.
     */
    @Test
    public void testpasswordSuccess() {
        LoginClass instance = new LoginClass();       
        instance.setfirstName("Ethan");
        instance.setlastName("Buck");
        instance.setuserName("eth_");        
        instance.setpassword("Keir@1234");
        assertTrue(instance.checkpasswordcomplexity());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of checkpasswordcomplexity method, of class LoginClass.
     */
    @Test
    public void testpasswordFail() {
        LoginClass instance = new LoginClass();       
        instance.setfirstName("Ethan");
        instance.setlastName("Buck");
        instance.setuserName("eth_");        
        instance.setpassword("Keiraok");
        assertFalse(instance.checkpasswordcomplexity());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}


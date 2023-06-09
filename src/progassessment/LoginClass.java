package progassessment;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class LoginClass extends UserClass {

    // This module checks if the Username is valid
    public boolean checkuserName() {
        boolean checkuserTest;
        checkuserTest = false;
        if (count() < 6 && cont() == true) {
            checkuserTest = true;
        }
        return checkuserTest;
    }

    // This module checks if the password is valid
    public boolean checkpasswordcomplexity() {
        boolean passwordCompTest;
        return passwordCompTest = password.length() > 7 && password.matches(".*[A-Z].*") && password.matches(".*\\d.*") && password.matches(".*[§±!@#$%^&*()\\-_=+\\\\|\\[{\\]}:;'\"<,>/?].*");

    }

    // This module registers the UserClass if the Username and password is valid
    public String registerUser() {
        String output = null;
        if (checkuserName() == false) {
            output = "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length.";
        }
        if (checkpasswordcomplexity() == false) {
            output = "Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number and a special character.";
        }
        if (checkuserName() == true && checkpasswordcomplexity() == true) {
            output = "Welcome " + firstName + ", " + lastName + " it is great to see you";
        }
        return output;
    }

    // This module logs the UserClass in with their set Username and password
    public boolean loginUser() {
        boolean loginUserTest;
        loginUserTest = false;
        if (userLogin.equals(userName) && passwordLogin.equals(password)) {
            loginUserTest = true;
        }
        return loginUserTest;
    }

    // This module welcomes the UserClass after they have logged in
    public String returnLoginStatus() {
        String output = null;
        if (loginUser() == false) {
            output = "Username or password incorrect, please try again.";
        } else {
            output = "Welcome " + firstName + " " + lastName + " it is great to see you again!";
        }
        
        return output;
    }

    public void printRegister() {

        LoginClass z = new LoginClass();

        while (z.checkuserName() == false || z.checkpasswordcomplexity() == false) {

            Scanner input = new Scanner(System.in);

            // Please enter your First name
            String firstName = JOptionPane.showInputDialog("Enter your first name: ");
            z.setfirstName(firstName);

            // Please enter your Last name
            String lastName = JOptionPane.showInputDialog("Enter your last name: ");
            z.setlastName(lastName);

            // Please enter your Username
            String userName = JOptionPane.showInputDialog("Enter your username: ");
            z.setuserName(userName);

            // Please enter your Password
            String password = JOptionPane.showInputDialog("Enter your password: ");
            z.setpassword(password);

            // Registers the UserClass if all fields are met
            JOptionPane.showMessageDialog(null, z.registerUser());

            while (z.loginUser() == false) {

                // Please enter your Username and password in order to login
                JOptionPane.showMessageDialog(null, "Enter your username and password: ");

                // Please enter your Username which you have set
                String userLogin = JOptionPane.showInputDialog("Enter your username: ");
                z.setuserLogin(userLogin);

                // Please enter your Password which you have set
                String passwordLogin = JOptionPane.showInputDialog("Enter your password: ");
                z.setpasswordLogin(passwordLogin);

                // Welcomes the user
                JOptionPane.showMessageDialog(null, z.returnLoginStatus());
            }
        }

    }
}

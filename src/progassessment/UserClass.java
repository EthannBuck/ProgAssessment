package progassessment;

public class UserClass {

    // Declaring the modules
    public String userName = "xyz";
    public String password = "xyz";
    public String userLogin = "xyz";
    public String passwordLogin = "xyz";
    public String firstName;
    public String lastName;

    // Sets the Username of the UserClass
    public void setuserName(String u) {
        userName = u;
    }

    // Gets the Username of the UserClass
    public String getuserName() {
        return userName;
    }

    // Sets the password of the UserClass
    public void setpassword(String p) {
        password = p;
    }

    // Gets the password of the UserClass
    public String getpassword() {
        return password;
    }

    // gets the Username of the UserClass
    public void setuserLogin(String ul) {
        userLogin = ul;
    }

    // Sets the password login of the UserClass
    public void setpasswordLogin(String pl) {
        passwordLogin = pl;
    }

    // Sets the First name of the UserClass
    public void setfirstName(String f) {
        firstName = f;
    }

    // Gets the First name of the UserClass
    public String getfirstName() {
        return firstName;
    }

    // Sets the Last name of the UserClass
    public void setlastName(String l) {
        lastName = l;
    }

    // Gets the Last name of the UserClass
    public String getlastName() {
        return lastName;
    }

    // Counts the number of characters in Username
    public int count() {
        int num;
        num = userName.length();
        return num;
    }

    // Username must contain a "_"
    public boolean cont() {
        Boolean con;
        con = userName.contains("_");
        return con;
    }

}

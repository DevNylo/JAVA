public class User {

    private String firstName;
    private String lastName;
    private final int ID = 12345678;
    private boolean login;

    public User(String firstName) {
        this.firstName = firstName;
    }

    public User() {
    }

    public String getFirstName(){
        return this.firstName;
    }
    public void setFirstName(String fn){
        this.firstName = fn;
    }

    public String getLastName(){
        return this.lastName;
    }
    public void setLastName(String ln){
        this.lastName = ln;
    }

    public int getID(){
        return this.ID;
    }

    public boolean getLogin(){
        return this.login;
    }
    public void setLogin(boolean login){
        this.login = login;
    }

    public void apresentar(){
        System.out.println("Seja bem-vindo(a) "+getFirstName()+ " " +getLastName());
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", ID=" + ID +
                ", login=" + login +
                '}';
    }
    public void logar(){
        setLogin(true);
    }
}

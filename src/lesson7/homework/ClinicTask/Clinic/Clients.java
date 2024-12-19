package lesson7.homework.ClinicTask.Clinic;

public class Clients {

    private String firstName;
    private String lastName;
    private int request;

    public Clients(String firstName, String lastName, int request) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.request = request;


    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setRequest(int request) {
        this.request = request;

    }
    public int getRequest() {
        return request;
    }
}

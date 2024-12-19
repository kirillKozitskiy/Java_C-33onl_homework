package lesson7.homework.ClinicTask.Clinic;

public class Main {

    public static void main(String[] args) {

//        ClinicFunction clinic1 = new ClinicFunction(new Surgeon("surgeon","surgeon"),
//                new Therapist("therapist", "therapist"),
//                        new Dental("dental", "dental"));

        ClinicFunction clinic1 = new ClinicFunction();

        Clients client1 = new Clients("Artem","Kozitskiy", 1);



        clinic1.getTherapist().getRequest(client1.getRequest());





    }

}

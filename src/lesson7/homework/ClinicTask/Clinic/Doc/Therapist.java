package lesson7.homework.ClinicTask.Clinic.Doc;

import lesson7.homework.ClinicTask.Clinic.Doctors;

public class Therapist extends Doctors {
    public Therapist(String name, String surname) {
        super(name, surname);
        toHeal();

    }

    public void toHeal(){
        System.out.println("I am a therapist"+getName()+" and I help choose you a doctor");
    }

    public void getRequest(int request){
        if(request == 1){
            Surgeon surgeon = new Surgeon("Archil", "Something");
        }
        else if(request == 2){
            Dental dental = new Dental("Dental", "Dental");
        }
        else {
            System.out.println("Invalid Request");
        }
    }
}

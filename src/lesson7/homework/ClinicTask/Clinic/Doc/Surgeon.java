package lesson7.homework.ClinicTask.Clinic.Doc;

import lesson7.homework.ClinicTask.Clinic.Doctors;

public class Surgeon extends Doctors {

    public Surgeon(String name, String surname) {
        super(name, surname);
        toHeal();

    }
    public void toHeal(){
        System.out.println("I am a SURGEON, my name is "+getName() +" "+getSurname()+ " and I can take away your tooth");
    }


}

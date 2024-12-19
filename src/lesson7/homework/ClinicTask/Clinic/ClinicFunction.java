package lesson7.homework.ClinicTask.Clinic;

import lesson7.homework.ClinicTask.Clinic.Doc.Dental;
import lesson7.homework.ClinicTask.Clinic.Doc.Surgeon;
import lesson7.homework.ClinicTask.Clinic.Doc.Therapist;

public class ClinicFunction {

    public Surgeon surgeon;

    public Therapist therapist;

    public Dental dental;

    public Clients clients;

//    public ClinicFunction(Surgeon surgeon, Therapist therapist, Dental dental) {
//        this.surgeon = surgeon;
//        this.therapist = therapist;
//        this.dental = dental;
//    }
    public ClinicFunction(){

    }

    public Surgeon getSurgeon() {
        return surgeon;
    }

    public Therapist getTherapist() {
        return new Therapist("Therapist", "Therapist");
    }

    public Dental getDental() {
        return dental;
    }
}

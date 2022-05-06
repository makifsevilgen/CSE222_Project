package users;

import javax.print.Doc;

import org.junit.platform.console.shadow.picocli.CommandLine.Spec;

import systems.Prescription;

/**
 *
 * @author Yusuf Talha Altun
 */
public class Secreter extends Worker{
    public Secreter(String name, String surname, String id, int age, String email, String password) {
        super(name, surname, id, age, email ,  password);
    }

    public void prescribePatient(Patient patient, Prescription pres , String note) {
        patient.addPrescription(pres);
    }

    public void displayQueue(Doctor doctor){
        doctor.waitingPatients();
    }

    public static void main(String[] args) {

        System.out.println("\n\n\n------------ Testing Secreter------------\n");
        
        String name = "name";
        String surname = "surname";
        String id = "id";
        int age = 30;
        String email = "email";
        String password = "password";
        Secreter sec = new Secreter(name, surname, id, age, email, password);
        Doctor doc = new Doctor(name, surname, id, age, email, password);
        Patient patient = new Patient(name, surname, id, age);
        Prescription pres = new Prescription("medicine", "instruction", "note");

        long startTime = System.nanoTime();
        testPrescribePatient(100, patient, pres, "note");
        long endTime = System.nanoTime();
        System.out.println("Running time for prescribing to a patient in the 100 elements : " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        testPrescribePatient(1000, patient, pres, "note");
        endTime = System.nanoTime();
        System.out.println("Running time for prescribing to a patient in the 1000 elements : " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        testPrescribePatient(10000, patient, pres, "note");
        endTime = System.nanoTime();
        System.out.println("Running time for prescribing to a patient in the 10000 elements : " + (endTime - startTime) + " ns");



        startTime = System.nanoTime();
        testDisplayQueue(100, doc);
        endTime = System.nanoTime();
        System.out.println("Running time for displaying queue in the 100 elements : " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        testDisplayQueue(1000, doc);
        endTime = System.nanoTime();
        System.out.println("Running time for displaying queue in the 1000 elements : " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        testDisplayQueue(10000, doc);
        endTime = System.nanoTime();
        System.out.println("Running time for displaying queue in the 10000 elements : " + (endTime - startTime) + " ns");

    }
    public static void testPrescribePatient(int counter, Patient patient, Prescription pres, String note){
        Secreter sec = new Secreter("name", "surname", "id", 30, "email", "password");
        for(int i = 0 ; i < counter ; i++){
            sec.prescribePatient(patient, pres, note);
        }

    }

    public static void testDisplayQueue(int counter, Doctor doctor){
        Secreter sec = new Secreter("name", "surname", "id", 30, "email", "password");
        for(int i = 0 ; i < counter ; i++){
            sec.displayQueue(doctor);
        }
    }
}
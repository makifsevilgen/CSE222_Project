import departments.Lab;
import departments.Reception;
import systems.Appointment;
import systems.HMSystem;
import tests.BloodTest;
import tests.CovidTest;
import tests.RadiologicalTest;
import unit_tests.TestAdvisor;
import unit_tests.TestTechnician;
import unit_tests.ut_polyclinic;
import users.Doctor;
import users.Manager;
import users.Nurse;
import users.Patient;
import users.Secreter;
import users.Worker;

/**
 * Main Class for running the Group 3's CSE222-Project implementation of Hospital Management System. 
 */
public class Group3Main {

    /**
     * The main function is the entry point of the program
     */
    public static void main(String[] args) {
        
        //HMSystem myHospital = new HMSystem();

        Doctor.main(args);
        TestAdvisor.main(args);
        Nurse.main(args);
        Patient.main(args);
        TestTechnician.main(args);
        Secreter.main(args);
        Manager.main(args);


        BloodTest.main(args);
        CovidTest.main(args);
        RadiologicalTest.main(args);
       
        Appointment.main(args);
        
        Lab.main(args);
        Reception.main(args);
        ut_polyclinic.main(args);
        

    }
}


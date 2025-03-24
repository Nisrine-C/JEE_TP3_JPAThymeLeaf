package ma.enset.jee_tp2;

import ma.enset.jee_tp2.entities.Patient;
import ma.enset.jee_tp2.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class JeeTp2Application implements CommandLineRunner {

    @Autowired
    private PatientRepository patientRepository;

    public static void main(String[] args) {
        SpringApplication.run(JeeTp2Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        /*
        Patient patient = new Patient(null, "Imane", new Date(), false, 209);
        patientRepository.save(patient);
        patientRepository.save(new Patient(null, "Hanane", new Date(), false, 209));
        patientRepository.save(new Patient(null, "Mohammed", new Date(), false, 209));
        System.out.println(patient.getScore());
        */
    }
}

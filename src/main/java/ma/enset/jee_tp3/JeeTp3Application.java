package ma.enset.jee_tp3;

import ma.enset.jee_tp3.entities.*;
import ma.enset.jee_tp3.repository.PatientRepository;
import ma.enset.jee_tp3.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class JeeTp3Application {

    public static void main(String[] args) {
        SpringApplication.run(JeeTp3Application.class, args);
    }
    /*
    @Bean
    CommandLineRunner start(
            IHospitalService hospitalService,
            PatientRepository patientRepository,
            MedecinRepository medecinRepository,
            RendezVousRepository rendezVousRepository){
        return args -> {
            Stream.of("Mohamed","Najat","Wiam")
                    .forEach(name->{
                        Patient patient = new Patient();
                        patient.setNom(name);
                        patient.setDateNaissance(new Date());
                        patient.setMalade(true);
                        patient.setScore(300);
                        hospitalService.savePatient(patient);
                    });
            Stream.of("Achraf","Najat","Wiam")
                    .forEach(name->{
                        Medecin medecin = new Medecin();
                        medecin.setNom(name);
                        medecin.setEmail(name+"@gmail.com");
                        medecin.setSpecialite(Math.random()>0.5?"Cardio":"Dentiste");
                        hospitalService.saveMedecin(medecin);
                    });
            Patient patient = patientRepository.findById(1L).orElse(null);
            Patient patient1 = patientRepository.findFirstByNom("Mohamed");

            Medecin medecin = medecinRepository.findById(2L).orElse(null);
            Medecin medecin1 = medecinRepository.findFirstByNom("Najat");

            RendezVous rendezVous = new RendezVous();
            rendezVous.setDate(new Date());
            rendezVous.setStatus(StatusRDV.PENDING);
            rendezVous.setMedecin(medecin);
            rendezVous.setPatient(patient);
            hospitalService.saveRendezVous(rendezVous);

            RendezVous rendezVous1 = rendezVousRepository.findById(1L).orElse(null);
            Consultation consultation = new Consultation();
            consultation.setDateConsultation(new Date());
            consultation.setRendezVous(rendezVous1);
            consultation.setRapport("Rapport");
            hospitalService.saveConsultation(consultation);
        };
    }*/
    @Bean
    CommandLineRunner start(UserService userService){
        return args -> {
            User user = new User();
            user.setUsername("user1");
            user.setPassword("123456");
            userService.addNewUser(user);
            User user2 = new User();
            user.setUsername("user2");
            user.setPassword("123456");
            userService.addNewUser(user);
            User admin = new User();
            user.setUsername("admin");
            user.setPassword("123456");
            userService.addNewUser(user);

            Stream.of("STUDENT","USER","ADMIN")
                    .forEach(name->{
                Role role1 = new Role();
                role1.setRoleName(name);
                userService.addNewRole(role1);
            });

            userService.addRoleToUser("user1","STUDENT");
            userService.addRoleToUser("user1","USER");
            userService.addRoleToUser("admin","ADMIN");
            userService.addRoleToUser("admin","USER");

            try {
                User user4 = userService.authenticate("user1","123456");
                System.out.println(user4.getUserId());
                System.out.println(user4.getUsername());
                System.out.println("Roles ==>");
                user4.getRoles().forEach(r->{
                    System.out.println("Roles=>"+r.getRoleName());
                });
            }catch(Exception e) {
                e.printStackTrace();
            }
        };

    }

}

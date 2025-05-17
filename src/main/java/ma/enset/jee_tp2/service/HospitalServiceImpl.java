package ma.enset.jee_tp2.service;

import jakarta.transaction.Transactional;
import ma.enset.jee_tp2.entities.Consultation;
import ma.enset.jee_tp2.entities.Medecin;
import ma.enset.jee_tp2.entities.Patient;
import ma.enset.jee_tp2.entities.RendezVous;
import ma.enset.jee_tp2.repository.ConsultationRepository;
import ma.enset.jee_tp2.repository.MedecinRepository;
import ma.enset.jee_tp2.repository.PatientRepository;
import ma.enset.jee_tp2.repository.RendezVousRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class HospitalServiceImpl implements IHospitalService{
    @Autowired
    PatientRepository patientRepository;
    @Autowired
    MedecinRepository medecinRepository;
    @Autowired
    RendezVousRepository rendezVousRepository;
    @Autowired
    ConsultationRepository consultationRepository;

    public HospitalServiceImpl(PatientRepository patientRepository, MedecinRepository medecinRepository, RendezVousRepository rendezVousRepository, ConsultationRepository consultationRepository) {
        this.patientRepository = patientRepository;
        this.medecinRepository = medecinRepository;
        this.rendezVousRepository = rendezVousRepository;
        this.consultationRepository = consultationRepository;
    }

    @Override
    public Patient savePatient(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public Medecin saveMedecin(Medecin medecin) {
        return medecinRepository.save(medecin);
    }

    @Override
    public RendezVous saveRendezVous(RendezVous rendezVous) {
        return rendezVousRepository.save(rendezVous);
    }

    @Override
    public Consultation saveConsultation(Consultation consultation) {
        return consultationRepository.save(consultation);
    }
}

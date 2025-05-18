package ma.enset.jee_tp3.service;

import ma.enset.jee_tp3.entities.Consultation;
import ma.enset.jee_tp3.entities.Medecin;
import ma.enset.jee_tp3.entities.Patient;
import ma.enset.jee_tp3.entities.RendezVous;

public interface IHospitalService {
    Patient savePatient(Patient patient);
    Medecin saveMedecin(Medecin medecin);
    RendezVous saveRendezVous(RendezVous rendezVous);
    Consultation saveConsultation(Consultation consultation);
}

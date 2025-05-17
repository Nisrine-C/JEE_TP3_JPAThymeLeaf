package ma.enset.jee_tp2.service;

import ma.enset.jee_tp2.entities.Consultation;
import ma.enset.jee_tp2.entities.Medecin;
import ma.enset.jee_tp2.entities.Patient;
import ma.enset.jee_tp2.entities.RendezVous;

public interface IHospitalService {
    Patient savePatient(Patient patient);
    Medecin saveMedecin(Medecin medecin);
    RendezVous saveRendezVous(RendezVous rendezVous);
    Consultation saveConsultation(Consultation consultation);
}

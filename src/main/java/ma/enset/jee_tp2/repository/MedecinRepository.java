package ma.enset.jee_tp2.repository;

import ma.enset.jee_tp2.entities.Medecin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedecinRepository extends JpaRepository<Medecin,Long> {
    Medecin findFirstByNom(String nom);
}

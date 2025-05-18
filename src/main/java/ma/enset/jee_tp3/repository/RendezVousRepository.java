package ma.enset.jee_tp3.repository;

import ma.enset.jee_tp3.entities.RendezVous;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RendezVousRepository extends JpaRepository<RendezVous,Long> {
}

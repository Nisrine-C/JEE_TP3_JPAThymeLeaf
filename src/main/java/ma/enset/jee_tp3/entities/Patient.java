package ma.enset.jee_tp3.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.DecimalMin;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Collection;
import java.util.Date;
@Entity
@Data @AllArgsConstructor @NoArgsConstructor  @Builder
public class Patient {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty()
    @Size(min=4,max=40,message = "Le nom doit contenir entre 4 et 40 caractères")
    private String nom;

    @Temporal(TemporalType.DATE)
    @NotNull(message = "La date de naissance est requise")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date dateNaissance;

    private boolean malade;

    @DecimalMin(value="100",message = "Le score doit être supérieur ou égal à 100")
    private int score;

    @OneToMany(mappedBy = "patient",fetch=FetchType.LAZY)
    private Collection<RendezVous> rendezVous;
}

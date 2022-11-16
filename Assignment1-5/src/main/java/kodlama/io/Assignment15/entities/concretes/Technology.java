package kodlama.io.Assignment15.entities.concretes;

import kodlama.io.Assignment15.entities.concretes.ProgrammingLanguage;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "technologies")
public class Technology {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private  int id;
    @Column(name = "name")
    private String name;
    @ManyToOne
    @JoinColumn(name = "programmingLanguage_id")
    private ProgrammingLanguage programmingLanguage;
}

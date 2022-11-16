package kodlama.io.Assignment15.dataAccess.abstracts;

import kodlama.io.Assignment15.entities.concretes.ProgrammingLanguage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProgrammingLanguageRepository extends JpaRepository<ProgrammingLanguage,Integer> {
    ProgrammingLanguage findById(int id);
    ProgrammingLanguage findByName(String name);
}

package kodlama.io.Assignment15.dataAccess.abstracts;

import kodlama.io.Assignment15.entities.concretes.Technology;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TechnologyRepository extends JpaRepository<Technology,Integer> {
    Technology findById(int id);
}

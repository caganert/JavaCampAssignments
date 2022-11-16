package kodlama.io.Assignment15.business.concretes;

import kodlama.io.Assignment15.business.abstracts.ProgrammingLanguageService;
import kodlama.io.Assignment15.business.abstracts.ProgrammingLanguageService;
import kodlama.io.Assignment15.business.abstracts.TechnologyService;
import kodlama.io.Assignment15.business.requests.TechnologyRequest;
import kodlama.io.Assignment15.business.responses.TechnologyResponse;
import kodlama.io.Assignment15.dataAccess.abstracts.TechnologyRepository;
import kodlama.io.Assignment15.entities.concretes.ProgrammingLanguage;
import kodlama.io.Assignment15.entities.concretes.ProgrammingLanguage;
import kodlama.io.Assignment15.entities.concretes.Technology;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TechnologyManager implements TechnologyService {
    private TechnologyRepository technologyRepository;
    private ProgrammingLanguageService programmingLanguageService;

    public TechnologyManager(TechnologyRepository technologyRepository, ProgrammingLanguageService programmingLanguageService) {
        this.technologyRepository = technologyRepository;
        this.programmingLanguageService = programmingLanguageService;
    }

    @Override
    public List<TechnologyResponse> getAll() {
        List<Technology> technologies = technologyRepository.findAll();
        List<TechnologyResponse> responses = new ArrayList<>();
        for (Technology technology: technologies){
            TechnologyResponse technologyResponse = new TechnologyResponse();
            technologyResponse.setName(technology.getName());
            technologyResponse.setProgrammingLanguageId(technology.getProgrammingLanguage().getId());
            technologyResponse.setId(technology.getId());
            technologyResponse.setProgrammingLanguageName(technology.getProgrammingLanguage().getName());
            responses.add(technologyResponse);
        }
        return responses;
    }

    @Override
    public void add(TechnologyRequest technologyRequest) {
        Technology technology = new Technology();
        ProgrammingLanguage programmingLanguage = programmingLanguageService.getById(technologyRequest.getProgrammingLanguageId());
        technology.setName(technologyRequest.getName());
        technology.setProgrammingLanguage(programmingLanguage);
        technologyRepository.save(technology);
    }

    @Override
    public void update(TechnologyRequest technologyRequest,int id) {
        Technology updateTechnology = technologyRepository.findById(id);
        ProgrammingLanguage updateProgrammingLanguageId = programmingLanguageService.getById(technologyRequest.getProgrammingLanguageId());
        updateTechnology.setName(technologyRequest.getName());
        updateTechnology.setProgrammingLanguage(updateProgrammingLanguageId);
        technologyRepository.save(updateTechnology);
    }

    @Override
    public void delete(int id) {
        technologyRepository.deleteById(id);
    }
}

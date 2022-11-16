package kodlama.io.Assignment15.business.concretes;

import kodlama.io.Assignment15.business.abstracts.ProgrammingLanguageService;
import kodlama.io.Assignment15.business.requests.ProgrammingLanguageRequest;
import kodlama.io.Assignment15.business.responses.ProgrammingLanguageResponse;
import kodlama.io.Assignment15.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.Assignment15.entities.concretes.ProgrammingLanguage;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {
    ProgrammingLanguageRepository programmingLanguageRepository;

    public ProgrammingLanguageManager(ProgrammingLanguageRepository programmingLanguageRepository) {
        this.programmingLanguageRepository = programmingLanguageRepository;
    }


    @Override
    public List<ProgrammingLanguageResponse> getALL() {
        List<ProgrammingLanguage> languages = programmingLanguageRepository.findAll();
        List<ProgrammingLanguageResponse> responses = new ArrayList<>();
        for(ProgrammingLanguage programmingLanguage: languages){
            ProgrammingLanguageResponse responseItem = new ProgrammingLanguageResponse();
            responseItem.setId(programmingLanguage.getId());
            responseItem.setName(programmingLanguage.getName());
            responses.add(responseItem);
        }
        return responses;
    }

    @Override
    public ProgrammingLanguageResponse getResponseById(int id) {
        ProgrammingLanguage programmingLanguage = programmingLanguageRepository.findById(id);
        ProgrammingLanguageResponse languageResponse = new ProgrammingLanguageResponse();
        languageResponse.setName(programmingLanguage.getName());
        languageResponse.setId(programmingLanguage.getId());
        return languageResponse;
    }

    @Override
    public ProgrammingLanguage getById(int id) {
        return programmingLanguageRepository.findById(id);
    }

    @Override
    public void add(ProgrammingLanguageRequest languageRequest) throws Exception {
        checkNameValid(languageRequest.getName());
        ProgrammingLanguage programmingLanguage = new ProgrammingLanguage();
        programmingLanguage.setName(languageRequest.getName());
        programmingLanguageRepository.save(programmingLanguage);
    }

    @Override
    public void delete(int id)  {
        programmingLanguageRepository.deleteById(id);
    }

    @Override
    public void update(ProgrammingLanguageRequest languageRequest,int id) throws Exception {
        checkNameValid(languageRequest.getName());
        ProgrammingLanguage programmingLanguage = programmingLanguageRepository.findById(id);
        programmingLanguage.setName(languageRequest.getName());
        programmingLanguageRepository.save(programmingLanguage);
    }
    private void checkNameValid(String name) throws Exception {
        ProgrammingLanguage isExist = programmingLanguageRepository.findByName(name);
        if (isExist != null){
            throw new Exception("This name already exist!");
        }
        if (name.isBlank()){
            throw new Exception("Name can't be null");
        }
    }
}

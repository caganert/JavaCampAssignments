package kodlama.io.Assignment15.business.abstracts;

import kodlama.io.Assignment15.business.requests.ProgrammingLanguageRequest;
import kodlama.io.Assignment15.business.responses.ProgrammingLanguageResponse;
import kodlama.io.Assignment15.entities.concretes.ProgrammingLanguage;

import java.util.List;

public interface ProgrammingLanguageService {
    List<ProgrammingLanguageResponse> getALL();
    kodlama.io.Assignment15.business.responses.ProgrammingLanguageResponse getResponseById(int id);
    ProgrammingLanguage getById(int id);
    void add(ProgrammingLanguageRequest languageRequest) throws Exception;
    void delete(int id);
    void update(ProgrammingLanguageRequest languageRequest,int id) throws Exception;
}

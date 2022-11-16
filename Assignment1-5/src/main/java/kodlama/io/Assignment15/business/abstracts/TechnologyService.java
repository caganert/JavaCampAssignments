package kodlama.io.Assignment15.business.abstracts;

import kodlama.io.Assignment15.business.requests.TechnologyRequest;
import kodlama.io.Assignment15.business.responses.TechnologyResponse;

import java.util.List;

public interface TechnologyService {
    List<TechnologyResponse> getAll();
    void add(TechnologyRequest technologyRequest);
    void update(TechnologyRequest technologyRequest,int id);
    void delete(int id);

}

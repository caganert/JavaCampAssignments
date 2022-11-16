package kodlama.io.Assignment15.webApi.controllers;

import kodlama.io.Assignment15.business.abstracts.ProgrammingLanguageService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/programminglanguages")
public class ProgrammingLanguagesController {
    ProgrammingLanguageService programmingLanguageService;

    public ProgrammingLanguagesController(ProgrammingLanguageService programmingLanguageService) {
        this.programmingLanguageService = programmingLanguageService;
    }

    @GetMapping("/getall")
    public List<kodlama.io.Assignment15.business.responses.ProgrammingLanguageResponse> getAll(){
        return  programmingLanguageService.getALL();
    }
    @GetMapping("/getbyid")
    public kodlama.io.Assignment15.business.responses.ProgrammingLanguageResponse getById(@RequestParam int id){
        return  programmingLanguageService.getResponseById(id);
    }
    @PostMapping("/add")
    public void add(@RequestBody kodlama.io.Assignment15.business.requests.ProgrammingLanguageRequest languageRequest) throws Exception {
        programmingLanguageService.add(languageRequest);
    }
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable int id){
        programmingLanguageService.delete(id);
    }
    @PutMapping("/update/{id}")
    public void update(@RequestBody kodlama.io.Assignment15.business.requests.ProgrammingLanguageRequest languageRequest, @PathVariable int id) throws Exception {
        programmingLanguageService.update(languageRequest,id);
    }

}

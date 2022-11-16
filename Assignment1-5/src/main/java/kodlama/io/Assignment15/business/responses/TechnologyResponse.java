package kodlama.io.Assignment15.business.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TechnologyResponse {
    private int id;
    private int programmingLanguageId;
    private String programmingLanguageName;
    private String name;
}

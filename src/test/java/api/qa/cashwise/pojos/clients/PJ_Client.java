package api.qa.cashwise.pojos.clients;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)

public class PJ_Client {

    private String company_name;
    private String email;
    private List<PJ_ClientTags> tags;
    private List<String> details;
    private String message;

}
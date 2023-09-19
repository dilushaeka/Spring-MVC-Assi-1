package lk.ijse.gde.springmvcassi1.api;

/*This Application Is Copyright Protected
    Author : Dilusha Ekanayaka
    Email  : dilushaeka99@gmail.com
    Date   : 9/15/2023
    Time   : 9:33 PM 
*/

import lk.ijse.gde.springmvcassi1.dto.TechLeadDTO;
import lk.ijse.gde.springmvcassi1.service.TechLeadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/techlead")
public class TechLeadController {
    @Autowired
    TechLeadService techLeadService;

    @PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    TechLeadDTO saveTechLead(@RequestPart String tlId,@RequestPart String tlName,@RequestPart String projectName){
        TechLeadDTO tmpTl=new TechLeadDTO();
       return null;
    }
}

package lk.ijse.gde.springmvcassi1.service.util;

/*This Application Is Copyright Protected
    Author : Dilusha Ekanayaka
    Email  : dilushaeka99@gmail.com
    Date   : 9/15/2023
    Time   : 9:39 PM 
*/


import lk.ijse.gde.springmvcassi1.dto.TechLeadDTO;
import lk.ijse.gde.springmvcassi1.entity.TechLead;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class EntityDTOConversion {
    private final ModelMapper modelMapper;
    public EntityDTOConversion(ModelMapper modelMapper) {this.modelMapper = modelMapper;}

    public TechLead getTLEntity(TechLeadDTO techLeadDTO){return modelMapper.map(TechLeadDTO,TechLead.class);}
    public TechLeadDTO getTLDTO(TechLead techLead){return modelMapper.map(techLead,TechLeadDTO.class)}
}

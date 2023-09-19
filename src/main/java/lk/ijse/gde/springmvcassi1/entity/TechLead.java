package lk.ijse.gde.springmvcassi1.entity;

/*This Application Is Copyright Protected
    Author : Dilusha Ekanayaka
    Email  : dilushaeka99@gmail.com
    Date   : 9/15/2023
    Time   : 6:28 PM 
*/


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class TechLead implements SuperEntity{
    @Id
    private String tlId;
    private String tlName;
    private String tlEmail;
    private String tlNo;
    @OneToMany(mappedBy = "techlead",targetEntity = Project.class)
    private List<Project>projectList;


}

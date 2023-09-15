package lk.ijse.gde.springmvcassi1.entity;

/*This Application Is Copyright Protected
    Author : Dilusha Ekanayaka
    Email  : dilushaeka99@gmail.com
    Date   : 9/15/2023
    Time   : 6:28 PM 
*/

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class TechLead implements SuperEntity{
    @Id
    private String tlId;

}

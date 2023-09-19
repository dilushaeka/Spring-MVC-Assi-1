package lk.ijse.gde.springmvcassi1.entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Data
@Table(name = "project")

public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String pId;
    private String pName;
    private String pNo;
    private String pDescription;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "pId")
    @ToString.Exclude
    private Project project;
}

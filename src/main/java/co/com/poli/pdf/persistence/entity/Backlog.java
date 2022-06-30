package co.com.poli.pdf.persistence.entity;


import lombok.*;

import javax.persistence.*;
import java.util.List;
@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
//@Entity
//@Table(name = "BACKLOG")
public class Backlog {

//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name = "ID")
    private Long id;

//    @Column(name = "PROJECT_IDENTIFIER")
    private String projectIdentifier;

//    @Column(name = "PROJECT")
//    @OneToOne(fetch = FetchType.EAGER)
    private Project project;

//    @Column(name = "PROJECT_TASK")
//    @OneToMany(mappedBy = "backlog",fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST})
    private List<ProjectTask> projectTask;

}

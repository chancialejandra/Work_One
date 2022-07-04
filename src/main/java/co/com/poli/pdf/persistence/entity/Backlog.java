package co.com.poli.pdf.persistence.entity;


import lombok.*;

import javax.persistence.*;
import java.util.List;
@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "backlog")
public class Backlog {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long backlogId;

    @Column(name = "project_identifier")
    private String projectIdentifier;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id", referencedColumnName = "project_identifier")
    private Project project;

    @JoinColumn(name = "project_task")
    @OneToMany(mappedBy = "backlogId",fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST})

    private List<Task> projectTask;

}

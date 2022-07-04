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
    @Column(name = "id_backlog")
    private Long backlogId;

    @Column(name = "project_identifier")
    private String projectIdentifier;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_project", referencedColumnName = "id_project")
    private Project project;

    @OneToMany(mappedBy = "backlog",fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
    private List<Task> projectTask;

}

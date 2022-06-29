package co.com.poli.pdf.persistence.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "PROJECT")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;

    @Column(name = "PROJECT_NAME")
    private String projectName;

    @Column(name = "PROJECT_IDENTIFIER")
    private String ProjectIdentifier;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "START_DATE")
    private Date startDate;

    @Column(name = "END_DATE")
    private Date endDate;

    @Column(name = "BACKLOG")
    @OneToOne(mappedBy = "project", fetch = FetchType.EAGER,cascade = CascadeType.PERSIST)
    private Backlog backlog;

}

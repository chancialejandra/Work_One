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
@Table(name = "project_task")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_task")
    private Long id;

    private String name;

    private String summary;

    @Column(name = "acceptance_criteria")
    private String acceptanceCriteria;

    private String status;

    private int priority;

    private Double hours;

    @Column(name = "start_date")
    private Date startDate;

    @Column(name = "end_date")
    private Date endDate;

    @Column(name = "project_identifier")
    private String productIdentifier;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST})
    @JoinColumn(name = "id_backlog")
    private Backlog backlog;

}

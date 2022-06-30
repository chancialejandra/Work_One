package co.com.poli.pdf.persistence.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
//@Entity
//@Table(name= "PROJECTTASK")
public class ProjectTask {

//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name = "ID")
    private Long id;

//    @Column(name = "NAME")
    private String name;

//    @Column(name = "SUMMARY")
    private String summary;

//    @Column(name = "ACCEPTANCE_CRITERIA")
    private String acceptanceCriteria;

//    @Column(name = "STATUS")
    private String status;

//    @Column(name = "PRIORITY")
    private int priority;

//    @Column(name = "HOURS")
    private Double hours;

//    @Column(name = "START_DATE")
    private Date startDate;

//    @Column(name = "END_DATE")
    private Date endDate;

//    @Column(name = "PROJECT_IDENTIFIER")
    private String proctIdentifier;

//    @Column(name = "BACKLOG")
//    @ManyToOne(fetch = FetchType.EAGER)
    private Backlog backlog;

}

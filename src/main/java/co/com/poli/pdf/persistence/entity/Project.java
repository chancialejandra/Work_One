package co.com.poli.pdf.persistence.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "project")
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "project_id")
    private Long id;

    @Column(name = "project_name")
    private String projectName;

    @Column(name = "project_identifier")
    private String projectIdentifier;

    private String description;

    @Column(name = "start_date")
    private LocalDate startDate;

    @Column(name = "end_date")
    private LocalDate endDate;

    @OneToOne(mappedBy = "project", fetch = FetchType.EAGER,cascade = CascadeType.PERSIST)
    private Backlog backlog;

}

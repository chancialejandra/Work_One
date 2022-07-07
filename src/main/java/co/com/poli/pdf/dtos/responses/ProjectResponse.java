package co.com.poli.pdf.dtos.responses;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.util.Date;
@Data
@Builder
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class ProjectResponse {

    private Long id;
    private String projectName;
    private String projectIdentifier;
    private String description;
    private LocalDate startDate;
    private LocalDate endDate;

}

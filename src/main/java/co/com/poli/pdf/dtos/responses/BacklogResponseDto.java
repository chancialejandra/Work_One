package co.com.poli.pdf.dtos.responses;

import co.com.poli.pdf.persistence.entity.Project;
import co.com.poli.pdf.persistence.entity.ProjectTask;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Builder;
import lombok.Data;
import java.util.List;

@Data
@Builder
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class BacklogResponseDto {

    private Long id;
    private String projectIdentifier;
    private Project project;
    private List<ProjectTask> projectTask;
}

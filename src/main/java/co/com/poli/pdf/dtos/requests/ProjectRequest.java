package co.com.poli.pdf.dtos.requests;

import co.com.poli.pdf.persistence.entity.Backlog;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class ProjectRequest {

    @NotBlank(message = "Project Name can't be empty.")
    private String projectName;

    @NotBlank(message = "Project Identifier can't be empty.")
    @Size(min= 5, max = 7, message = "The length of the project identifier must be between 5 and 50 characters\"")
    private String ProjectIdentifier;

    @NotBlank(message = "Description can't be empty.")
    private String description;

    private Date startDate;

    private Date endDate;

    @Valid
    private Backlog backlog;
}

package co.com.poli.pdf.dtos.requests;

import co.com.poli.pdf.persistence.entity.Project;
import co.com.poli.pdf.persistence.entity.Task;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class BacklogRequest {

    @NotBlank(message = "Project Identifier can't be empty.")
    private String projectIdentifier;

//    @Valid
    private Project project;

//    @NotEmpty(message = "List can't be empty")
    private List<@Valid Task> projectTask;
}

package co.com.poli.pdf.dtos.requests;

import co.com.poli.pdf.persistence.entity.Backlog;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class TaskRequestDto {

    @NotBlank(message = "Task Name can't be empty.")
    private String name;

    @NotBlank(message = "Summary can't be empty.")
    private String summary;

    private String acceptanceCriteria;

    private String status;

    @Min(value= 1, message = "La prioridad minima es 1")
    @Max(value = 5, message = "La prioridad máxima es 5")
    private Integer priority;

    @Min(value= 1, message = "Lo minimo es 1 hora")
    @Max(value =8, message = "La máximo son 8 horas")
    @Positive
    private Double hours;

    private Date startDate;

    private Date endDate;

    private String proctIdentifier;

    @Valid
    private Backlog backlog;
}

package co.com.poli.pdf.dtos.requests;

import co.com.poli.pdf.persistence.entity.Backlog;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import lombok.*;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.Date;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class ProjectRequest {

    @NotEmpty(message = "El nombre del proyecto no puede estar vacío.")
    private String projectName;

    @NotBlank(message = "El identificador de proyecto no puede estar vacío")
    @Size(min= 5, max = 7, message = "La longitud del identificador del proyecto debe tener entre 5 y 7 caracteres")
    private String ProjectIdentifier;

    @NotBlank(message = "La descripción no puede estar vacía.")
    private String description;

    private LocalDate startDate;

    private LocalDate endDate;

}

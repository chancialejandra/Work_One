package co.com.poli.pdf.dtos.responses;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Builder;
import lombok.Data;

import java.util.Date;
@Data
@Builder
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class TaskResponse {

    private Long id;
    private String name;
    private String summary;
    private String acceptanceCriteria;
    private String status;
    private int priority;
    private Double hours;
    private Date startDate;
    private Date endDate;
    private String productIdentifier;


}

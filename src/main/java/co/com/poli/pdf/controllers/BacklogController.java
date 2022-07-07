package co.com.poli.pdf.controllers;

import co.com.poli.pdf.dtos.requests.BacklogRequest;
import co.com.poli.pdf.exceptions.ApiError;
import co.com.poli.pdf.exceptions.ControllerExceptionHandler;
import co.com.poli.pdf.services.BacklogService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Validated
@RestController
@RequestMapping("/backlogs")
@RequiredArgsConstructor
public class BacklogController {

    private final BacklogService backlogService;

    @PostMapping()
    public ResponseEntity saveBacklogs(@Valid @RequestBody BacklogRequest backlog){
        var response = backlogService.saveBacklog(backlog);
        if (response == null){
            ApiError apiError = ApiError.builder()
                    .error("La entrada no es válida")
                    .message("project_identifier no es igual al del project")
                    .status(HttpStatus.BAD_REQUEST.value()).build();
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(apiError);
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

}

package co.com.poli.pdf.controllers;

import co.com.poli.pdf.dtos.requests.BacklogRequest;
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
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

}

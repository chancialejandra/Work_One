package co.com.poli.pdf.controllers;

import co.com.poli.pdf.dtos.requests.BacklogRequestDto;
import co.com.poli.pdf.dtos.responses.BacklogResponseDto;
import co.com.poli.pdf.services.interfaces.IBacklogService;
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

    private final IBacklogService backlogService;

    @PostMapping()
    public ResponseEntity saveBacklogs(@Valid @RequestBody BacklogRequestDto backlog){
        var response = backlogService.saveBacklog(backlog);
//        if (response.isEmpty()) {
//
//        }
//        var response1 = BacklogResponseDto.builder().build();
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

}

package co.com.poli.pdf.controllers;


import co.com.poli.pdf.dtos.requests.ProjectRequest;
import co.com.poli.pdf.dtos.responses.ProjectResponse;
import co.com.poli.pdf.persistence.entity.Project;
import co.com.poli.pdf.services.ProjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Validated
@RestController
@RequestMapping("/projects")
@RequiredArgsConstructor
public class ProjectController {

    private final ProjectService projectService;

    @PostMapping()
    public ResponseEntity saveProjects(@Valid @RequestBody ProjectRequest project){
        var response = projectService.saveProject(project);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @GetMapping()
    public List<Project> findAll(){
        return projectService.findAll();
    }
}

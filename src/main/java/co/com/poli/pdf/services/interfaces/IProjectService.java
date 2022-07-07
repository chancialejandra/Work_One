package co.com.poli.pdf.services.interfaces;

import co.com.poli.pdf.dtos.requests.ProjectRequest;
import co.com.poli.pdf.dtos.responses.ProjectResponse;
import co.com.poli.pdf.persistence.entity.Project;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IProjectService {
    ProjectResponse saveProject(ProjectRequest projectRequest);
    List<Project> findAll();


}

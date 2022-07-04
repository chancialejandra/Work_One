package co.com.poli.pdf.services.interfaces;

import co.com.poli.pdf.dtos.requests.ProjectRequest;
import co.com.poli.pdf.dtos.responses.ProjectResponse;
import org.springframework.stereotype.Service;

@Service
public interface IProjectService {
    ProjectResponse saveProject(ProjectRequest projectRequest);
}

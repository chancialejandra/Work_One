package co.com.poli.pdf.services;

import co.com.poli.pdf.dtos.requests.ProjectRequest;
import co.com.poli.pdf.dtos.responses.ProjectResponse;
import co.com.poli.pdf.mappers.ProjectRequestToProject;
import co.com.poli.pdf.persistence.entity.Project;
import co.com.poli.pdf.persistence.repository.IProjectRepository;
import co.com.poli.pdf.services.interfaces.IProjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.validation.constraints.Null;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProjectService implements IProjectService {

    private final IProjectRepository projectRepository;
    private final ProjectRequestToProject mapper;
    @Override
    public ProjectResponse saveProject(ProjectRequest projectRequest) {
        Project project = mapper.map(projectRequest);
        ProjectResponse projectResponse = null;

        try{
            var response = projectRepository.save(project);
            projectResponse = ProjectResponse.builder()
                    .id(response.getId())
                    .projectName(response.getProjectName())
                    .projectIdentifier(response.getProjectIdentifier())
                    .description(response.getDescription())
                    .startDate(response.getStartDate())
                    .endDate(response.getEndDate())
                    .build();
            return projectResponse;
        }catch(Exception ex){
            System.out.println("Error guardando");
        }
        return projectResponse;
    }

    @Override
    public List<Project> findAll() {
        return projectRepository.findAll();
    }


}

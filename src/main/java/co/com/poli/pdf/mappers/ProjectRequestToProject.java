package co.com.poli.pdf.mappers;

import co.com.poli.pdf.dtos.requests.ProjectRequest;
import co.com.poli.pdf.persistence.entity.Project;
import org.springframework.stereotype.Component;

@Component
public class ProjectRequestToProject implements  IMapper<ProjectRequest, Project> {
    @Override
    public Project map(ProjectRequest in) {
        Project project = new Project();
        project.setProjectName(in.getProjectName());
        project.setProjectIdentifier(in.getProjectIdentifier());
        project.setDescription(in.getDescription());
        project.setStartDate(in.getStartDate());
        project.setEndDate(in.getEndDate());
        return project;
    }
}

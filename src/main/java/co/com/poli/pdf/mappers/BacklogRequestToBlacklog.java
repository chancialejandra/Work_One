package co.com.poli.pdf.mappers;

import co.com.poli.pdf.dtos.requests.BacklogRequest;
import co.com.poli.pdf.dtos.requests.ProjectRequest;
import co.com.poli.pdf.persistence.entity.Backlog;
import co.com.poli.pdf.persistence.entity.Project;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class BacklogRequestToBlacklog implements IMapper<BacklogRequest, Backlog>{

//    @Override
    public Backlog mapp(BacklogRequest backlog, Project project ) {
            Backlog backlogmapper = new Backlog();
            backlogmapper.setProjectIdentifier(backlog.getProjectIdentifier());
            backlogmapper.setProject(project);
//            backlog.getProjectTask(in.getProjectTask());
        return backlogmapper;

    }

    @Override
    public Backlog map(BacklogRequest in) {
        Backlog backlog = new Backlog();
        backlog.setProjectIdentifier(in.getProjectIdentifier());
//        backlog.setProject(in.getProject());
        return null;
    }
}

package co.com.poli.pdf.mappers;

import co.com.poli.pdf.dtos.requests.BacklogRequest;
import co.com.poli.pdf.persistence.entity.Backlog;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class BacklogRequestToBlacklog implements IMapper<BacklogRequest, Backlog>{

    @Override
    public Backlog map(BacklogRequest in) {
            Backlog backlog = new Backlog();
            backlog.setProjectIdentifier(in.getProjectIdentifier());
//            backlog.setProject(in.getProject());
//            backlog.getProjectTask(in.getProjectTask());
        return backlog;

    }
}

package co.com.poli.pdf.services.interfaces;

import co.com.poli.pdf.dtos.requests.BacklogRequest;
import co.com.poli.pdf.dtos.responses.BacklogResponse;

import co.com.poli.pdf.persistence.entity.Backlog;
import org.springframework.stereotype.Service;

@Service
public interface IBacklogService {

    BacklogResponse saveBacklog(Backlog backlog);

    BacklogResponse saveBacklog(BacklogRequest backlogRequest);
}

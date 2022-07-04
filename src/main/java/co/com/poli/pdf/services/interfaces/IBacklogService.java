package co.com.poli.pdf.services.interfaces;

import co.com.poli.pdf.dtos.requests.BacklogRequest;
import co.com.poli.pdf.dtos.responses.BacklogResponse;

import org.springframework.stereotype.Service;

@Service
public interface IBacklogService {

    BacklogResponse saveBacklog(BacklogRequest backlogRequest);
}

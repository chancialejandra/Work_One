package co.com.poli.pdf.services;

import co.com.poli.pdf.dtos.requests.BacklogRequest;
import co.com.poli.pdf.dtos.responses.BacklogResponse;
import co.com.poli.pdf.mappers.BacklogRequestToBlacklog;
import co.com.poli.pdf.persistence.entity.Backlog;
import co.com.poli.pdf.persistence.repository.IBacklogRepository;
import co.com.poli.pdf.services.interfaces.IBacklogService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class BacklogService implements IBacklogService {

    private final IBacklogRepository backlogRepository;
    private final BacklogRequestToBlacklog mapper;

    @Override
    public BacklogResponse saveBacklog(BacklogRequest backlogRequest) {
        BacklogResponse backlogResponse = null;
        Backlog backlog = mapper.map(backlogRequest);

        if (backlog.getProjectIdentifier().equals(backlog.getProject().getProjectIdentifier())) {
            try {
                var response = backlogRepository.save(backlog);
                backlogResponse = BacklogResponse.builder()
                        .id(response.getBacklogId())
                        .projectIdentifier(response.getProjectIdentifier())
                        .build();
                return backlogResponse;
            } catch (Exception e) {
                System.out.println("Error guardando");
            }
        }
        return backlogResponse;
    }
}

package co.com.poli.pdf.services;

import co.com.poli.pdf.dtos.requests.BacklogRequestDto;
import co.com.poli.pdf.dtos.responses.BacklogResponseDto;
import co.com.poli.pdf.services.interfaces.IBacklogService;
import org.springframework.stereotype.Service;

@Service
public class BacklogService implements IBacklogService {
    @Override
    public BacklogResponseDto saveBacklog(BacklogRequestDto backlog) {
        return BacklogResponseDto.builder().build();
    }
}

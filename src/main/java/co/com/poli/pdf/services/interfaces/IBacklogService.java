package co.com.poli.pdf.services.interfaces;

import co.com.poli.pdf.dtos.requests.BacklogRequestDto;
import co.com.poli.pdf.dtos.responses.BacklogResponseDto;

public interface IBacklogService {

    BacklogResponseDto saveBacklog(BacklogRequestDto backlog);
}

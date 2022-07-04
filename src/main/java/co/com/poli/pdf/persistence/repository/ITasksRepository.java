package co.com.poli.pdf.persistence.repository;

import co.com.poli.pdf.persistence.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITasksRepository extends JpaRepository<Task,Long> {
}

package co.com.poli.pdf.persistence.repository;

import co.com.poli.pdf.persistence.entity.Backlog;
import co.com.poli.pdf.persistence.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProjectRepository extends JpaRepository<Project,Long> {
}

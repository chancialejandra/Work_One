package co.com.poli.pdf.persistence.repository;

import co.com.poli.pdf.persistence.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProjectRepository extends JpaRepository<Project,Long> {
}

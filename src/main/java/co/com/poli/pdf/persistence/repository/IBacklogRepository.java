package co.com.poli.pdf.persistence.repository;

import co.com.poli.pdf.persistence.entity.Backlog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBacklogRepository extends JpaRepository<Backlog,Long> {

}

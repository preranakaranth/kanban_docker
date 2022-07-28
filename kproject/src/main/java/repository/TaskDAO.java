package repository;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import entity.Task;



public interface TaskDAO extends JpaRepository<Task, Long>{
	
	 
	 @Query(value = "SELECT * FROM task t order by t.deadline", nativeQuery = true)
	
	 List<Task> getTasksByPriority(String tstatus);

	
	

	

}

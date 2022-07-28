package services;
import java.util.Optional;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entity.Task;
import repository.TaskDAO;

@Service
public class TaskService {
	 @Autowired
	    public TaskDAO taskDao;

	    public Task postTask(Task newTask) {
	        return taskDao.save(newTask);
	    }

	    public Task getTask(Long TaskId) {
//	        Optional<Task> findById = taskDao.findById(TaskId);
//	        return findById.get(); 
	    	return taskDao.findById(TaskId).orElse(null);
	    }

	    public List<Task> getTasksByPriority(String tstatus){
	        return taskDao.getTasksByPriority(tstatus);
	    }

	    

	    public Optional<Task> updateTask(Long TaskId,Task newTask) {
	        
	    	return taskDao.findById(TaskId).map(task->{
	            
	            if(newTask.getDescription()!=null)task.setDescription(newTask.getDescription());
	            if(newTask.getPriority()!=null)task.setPriority(newTask.getPriority());
	            if(newTask.getTstatus()!=null)task.setTstatus(newTask.getTstatus());
	            
	            return taskDao.save(task);
	        });
	    }

		public List<Task> getAll() {
			return taskDao.findAll();
		}
		
		public String deletetask(Long task_id) {
			taskDao.deleteById(task_id);
			return "Task deleted ";
		}


	
}


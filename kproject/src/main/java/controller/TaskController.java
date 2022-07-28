package controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import entity.Task;
import services.TaskService;

@RestController
@RequestMapping("/task")
@CrossOrigin(origins = "http://localhost:3000/")
public class TaskController {
	
	@Autowired
	private TaskService taskService;
	
	@GetMapping("/getAll")
	public List<Task> getAll()
	{
		return taskService.getAll();
	}

	@GetMapping("/getTask/{task_id}")
	public Task getTask(@PathVariable("task_id") Long task_id) {
		//System.out.println(task_id);
		return taskService.getTask(task_id);
		
	}
	
	@GetMapping("/getTask/{status}")
    public List<Task> getAllp(@PathVariable("status") String tstatus)
    {
        return taskService.getTasksByPriority(tstatus);
    }
	
	
	
	@PostMapping("/postTask")
    public Task save(@RequestBody Task newtask){
        
        return taskService.postTask(newtask);
    }
	@PutMapping("/updateTask/{task_id}")
    Optional<Task> update(@PathVariable Long task_id, @RequestBody Task newTask){
        return taskService.updateTask(task_id,newTask);
    }
	
	@DeleteMapping("/delete/{task_id}")
	public String deletetask(@PathVariable("task_id")Long task_id) {
		return taskService.deletetask(task_id);
	}
	
	 

	
}
	



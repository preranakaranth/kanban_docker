package entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="task")
public class Task {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	private Long task_id;
	
	@Column
	private String description;
	
	@Column
	private String tstatus;
	
	@Column
	private String priority;
	
	@Column
	private String deadline;
	
	
	
	public Task() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Task(Long task_id, String descr, String tstatus, String priority, String deadline) {
		super();
		this.task_id = task_id;
		this.description = description;
		this.tstatus = tstatus;
		this.priority = priority;
		this.deadline = deadline;
	}

	public Long getTask_id() {
		return task_id;
	}

	public void setTask_id(Long task_id) {
		this.task_id = task_id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTstatus() {
		return tstatus;
	}

	public void setTstatus(String tstatus) {
		this.tstatus = tstatus;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getDeadline() {
		return deadline;
	}

	public void setDeadline(String deadline) {
		this.deadline = deadline;
	}

	

	
	
	
	
	
	
}
	



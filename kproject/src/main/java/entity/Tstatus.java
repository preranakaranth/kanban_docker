package entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tstatus")
public class Tstatus {
	
	@Id
	@Column(name = "statusname")
	private String statusname;

	
	
	public Tstatus() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tstatus(String statusname) {
		super();
		this.statusname = statusname;
	}

	public String getStatusname() {
		return statusname;
	}

	public void setStatusname(String statusname) {
		this.statusname = statusname;
	}
	
	

}

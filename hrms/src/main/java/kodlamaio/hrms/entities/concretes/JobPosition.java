package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.Data;

@Data
@Entity 
@Table(name="job_positions")
//Anatasyon = bir classın derleme yada çalışma anında 
//onunla ilgili bilgi toplama yapmak için kullanılan yapıdır.

public class JobPosition {
	
	@Id
	@GeneratedValue
	//Bir bir artılacağını belirtir
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String jobPositionName;

}

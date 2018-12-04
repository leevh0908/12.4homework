package cn.com.tj.pojo2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Bag {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Integer id;// id
	@Column(name = "bname", nullable = true, length = 20)
	private String bname;
	@Column(name = "bvalue", nullable = true, length = 20)
	private String bvalue;
	public Bag(Integer id, String bname, String bvalue) {
		super();
		this.id = id;
		this.bname = bname;
		this.bvalue = bvalue;
	}
	public Bag() {
		super();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getBvalue() {
		return bvalue;
	}
	public void setBvalue(String bvalue) {
		this.bvalue = bvalue;
	}
	@Override
	public String toString() {
		return "Bag [id=" + id + ", bname=" + bname + ", bvalue=" + bvalue + "]";
	}
	
	

}

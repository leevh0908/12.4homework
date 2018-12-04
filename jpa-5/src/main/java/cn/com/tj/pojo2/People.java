package cn.com.tj.pojo2;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class People {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Integer id;// id
	@Column(name = "name", nullable = true, length = 20)
	private String name;
	
    @JoinColumn(name = "BAG")
    @OneToMany(cascade = {CascadeType.REMOVE})
    private List<Bag> bList;

	public People() {
		super();
	}

	public People(Integer id, String name, List<Bag> bList) {
		super();
		this.id = id;
		this.name = name;
		this.bList = bList;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Bag> getbList() {
		return bList;
	}

	public void setbList(List<Bag> bList) {
		this.bList = bList;
	}

	@Override
	public String toString() {
		return "People [id=" + id + ", name=" + name + ", bList=" + bList + "]";
	}
	
    
}

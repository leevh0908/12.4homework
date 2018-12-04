package cn.com.tj.pojo1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import cn.com.tj.pojo1.*;

import java.util.List;


@Entity
public class Student {

	 	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Integer id;
	    @Column(nullable = false)
	    private String name; 
	    @ManyToMany(mappedBy = "stulist")
	    private List<Teacher> tealist;
		public Student(Integer id, String name, List<Teacher> tealist) {
			super();
			this.id = id;
			this.name = name;
			this.tealist = tealist;
		}
		public Student() {
			super();
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
		public List<Teacher> getTealist() {
			return tealist;
		}
		public void setTealist(List<Teacher> tealist) {
			this.tealist = tealist;
		}
		@Override
		public String toString() {
			return "Student [id=" + id + ", name=" + name + ", tealist=" + tealist + "]";
		}
	    
	    
	    
}

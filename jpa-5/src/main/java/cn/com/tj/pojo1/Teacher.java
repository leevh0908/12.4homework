package cn.com.tj.pojo1;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.JoinColumn;


import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Teacher {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false, length = 20, unique = true)
    private String name; 
	@ManyToMany
    @JoinTable(name = "tea_stu",joinColumns = @JoinColumn(name = "tea_id"),
    inverseJoinColumns = @JoinColumn(name = "stu_id"))

    private List<Student> stulist;
	public Teacher() {
		super();
	}
	public Teacher(Integer id, String name, List<Student> stulist) {
		super();
		this.id = id;
		this.name = name;
		this.stulist = stulist;
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
	public List<Student> getStulist() {
		return stulist;
	}
	public void setStulist(List<Student> stulist) {
		this.stulist = stulist;
	}
	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", stulist=" + stulist + "]";
	}
	
	
}

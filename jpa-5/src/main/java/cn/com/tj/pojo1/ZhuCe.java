package cn.com.tj.pojo1;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;



import cn.com.tj.pojo1.Address;

@Entity
public class ZhuCe {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Integer id;// id
	@Column(name = "name", nullable = true, length = 20)
	private String name;
	@Column(name = "pwd", nullable = true, length = 20)
	private String pwd;
	@Column(name = "sex", nullable = true, length = 3)
	private String sex;// 性别
	@OneToOne(cascade = CascadeType.ALL) 
	@JoinColumn(name = "address_id", referencedColumnName = "id") // people中的address_id字段参考address表中的id字段
	private Address address;// 地址
	
	
	public ZhuCe() {
		super();
	}
	public ZhuCe(Integer id, String name, String pwd, String sex, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.pwd = pwd;
		this.sex = sex;
		this.address = address;
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
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}

	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "ZhuCe [id=" + id + ", name=" + name + ", pwd=" + pwd + ", sex=" + sex + ", address=" + address + "]";
	}
	
	
	
}

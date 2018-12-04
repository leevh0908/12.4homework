package cn.com.tj.pojo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import cn.com.tj.pojo1.Address;
import cn.com.tj.pojo1.ZhuCe;

public class Test_homework {

	
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpa-5");

		EntityManager entityManager = factory.createEntityManager();

		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
//添加
/*		User user = new User();
		user.setId(9);
		user.setName("sdas");
		user.setPwd("2132");
		entityManager.persist(user);*/
		
	//删除	
		entityManager.remove(entityManager.find(User.class, 9));
		
		ZhuCe zhuCe =new ZhuCe();
		zhuCe.setName("dsa");
		zhuCe.setPwd("123");
		zhuCe.setSex("nan");
		zhuCe.setAddress(new Address());
		
		

//-----------------
		transaction.commit();

		entityManager.close();

		factory.close();
		
	}
}

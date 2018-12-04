package cn.com.tj.pojo1;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import cn.com.tj.pojo1.Address;
import cn.com.tj.pojo1.ZhuCe;
import cn.com.tj.pojo2.Bag;

public class Test_homework {

	
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpa-5");

		EntityManager entityManager = factory.createEntityManager();

		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
//添加
		List<Student> sList = entityManager.createQuery("FROM Student where 1=1").getResultList();
Teacher teacher=new Teacher();
		teacher.setName("sdd");
		teacher.setStulist(sList);
		entityManager.persist(teacher);
//-----------------
		transaction.commit();

		entityManager.close();

		factory.close();
		
	}
}

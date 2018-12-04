package cn.com.tj.pojo2;

import java.util.List;

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
//----------------------
		List<Bag> bList = entityManager.createQuery("SELECT a FROM Bag a where id in (1,3)").getResultList();
		People people=new People();
		people.setName("sdsd");
		people.setbList(bList);
		
		entityManager.persist(people);

//-----------------
		transaction.commit();

		entityManager.close();

		factory.close();
		
	}
}

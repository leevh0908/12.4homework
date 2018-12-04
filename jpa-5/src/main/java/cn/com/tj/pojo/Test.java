package cn.com.tj.pojo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

public class Test {

 

	public static void main(String[] args) {
		// 1. 鍒涘缓EntityManagerFactory
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpa-5");

		// 2. 鍒涘缓EntityManager
		EntityManager entityManager = factory.createEntityManager();

		// 3.寮�鍚簨鍔�
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();

		// 4. 鎸佷箙鍖栨搷浣�
		User user = new User();
		user.setId(9);
		user.setName("sdas");
		user.setPwd("2132");
		
		
		
		

		// 娣诲姞user鍒版暟鎹簱锛岀浉褰撲簬hibernate鐨剆ave();
		entityManager.persist(user);

		// 5. 鎻愪氦浜嬪姟
		transaction.commit();

		// 6. 鍏抽棴EntityManager
		entityManager.close();

		// 7. 鍏抽棴EntityManagerFactory
		factory.close();
	}
	
	

 

}

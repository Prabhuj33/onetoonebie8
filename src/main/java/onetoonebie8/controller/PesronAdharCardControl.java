package onetoonebie8.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import onetoonebie8.dao.AadharCardDao;
import onetoonebie8.dao.PersonDao;
import onetoonebie8.dto.AadharCard;
import onetoonebie8.dto.Person;

public class PesronAdharCardControl {

	public static void main(String[] args) {
//		Person person=new Person();
//		person.setId(3);
//		person.setName("Riya");
//		person.setAddress("Kochi");
//		
//		
//		AadharCard aadharCard=new AadharCard();
//		aadharCard.setId(103);
//		aadharCard.setName("Renu");
//		aadharCard.setAge(13);
//		
//		
//		
//		person.setAadharCard(aadharCard);
//		aadharCard.setPerson(person);
////		
//		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
//		EntityManager entityManager=entityManagerFactory.createEntityManager();
//		EntityTransaction entityTransaction=entityManager.getTransaction();
//		entityTransaction.begin();
//		entityManager.persist(person);
//		entityManager.persist(aadharCard);
//		entityTransaction.commit();
		
		
		
       //update		
		
//		Person p=new Person();
//		p.setId(3);
//		p.setName("Poojitha");
//		p.setAddress("Kovai");
//		
//		PersonDao da=new PersonDao();
//		da.upadetPerson(3, p);
//		
//		AadharCard a=new AadharCard();
//		a.setId(103);
//		a.setName("Pooji");
//		a.setAge(29);
//		
//		AadharCardDao ad=new AadharCardDao();
//		ad.updateAadharCard(103, a);
		
		
//		PersonDao d=new PersonDao();
//        d.deletePerson(3);		
//		
//		AadharCardDao d=new AadharCardDao();
//		d.deleteAadharCard(103);

		PersonDao d=new PersonDao();
        d.findPerson(3);

//        AadharCardDao cardDao=new AadharCardDao();
//        cardDao.findAadharCard(101);
		
		
		
	}

}
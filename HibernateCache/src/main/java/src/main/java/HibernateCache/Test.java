package src.main.java.HibernateCache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class Test {

	public static void main(String[] args) {
		
//		  Alien a1 = new Alien(11, "Rud", "Yellow"); Alien a2 = new Alien(12,
//		  "Amol", "Red"); Alien a3 = new Alien(13, "Bhushan", "Green"); Alien a4 = new
//		  Alien(14, "Mahesh", "Black"); Alien a5 = new Alien(15, "Kamal", "While");
		
		
   Configuration con= new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Alien.class);
   SessionFactory sf = con.buildSessionFactory();
   Session s1 = sf.openSession();
   Transaction tr = s1.beginTransaction();
		
//		  s1.save(a1); s1.save(a2); s1.save(a3); s1.save(a4); s1.save(a5);
		
   Alien a = (Alien)s1.get(Alien.class,15);
   System.out.println(a);
   s1.flush();
   tr.commit();
   Session s2 = sf.openSession();
   Transaction tr1 = s2.beginTransaction();
   Alien a1 = (Alien)s2.get(Alien.class,15);
   System.out.println(a1);
   s2.flush();
   tr1.commit();
	}

}

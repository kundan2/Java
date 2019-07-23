import java.util.Iterator;
import java.util.List;
//Ashish
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Test {
public static void main(String[] args) {
	
	Student s=new Student();
	//s.setRollno();
	//s.setName("bbb");
	//s.setMark(44);
	//s.setCity("Pune1");
	Configuration cfg=new Configuration();
	cfg.configure("hibernate.cfg.xml");
	SessionFactory sf=cfg.buildSessionFactory();
	Session ses=sf.openSession();
	//ses.save(s);
	//ses.persist(s);
	//ses.update(s);
	//ses.delete(s);
	//s = (Student)ses.get(Student.class, 3);
	//s = (Student)ses.load(Student.class,5);
	List<Student> list = ses.createQuery("from Student").list();
	Iterator<Student> it=list.iterator();
	while(it.hasNext())
	{
		s=it.next();
	System.out.println("\nRoll NO : "+s.getRollno());
	System.out.println("Name : "+s.getName());
	System.out.println("Mark : "+s.getMark());
	System.out.println("City : "+s.getCity());
	}
	Transaction tx=ses.beginTransaction();
	tx.commit();
	
}
}

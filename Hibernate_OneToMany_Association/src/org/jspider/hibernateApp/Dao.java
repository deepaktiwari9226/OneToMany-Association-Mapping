package org.jspider.hibernateApp;
import java.util.*;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;
public class Dao
{
	public static void main(String[] args) 
	{
     Car c1 = new Car();
     c1.setCar_name("Alto");
     c1.setCar_model("MaruthiSuzuki");
     
     Car c2 = new Car();
     c2.setCar_name("Nano");
     c2.setCar_model("Tata");
     
     Car c3 = new Car();
     c3.setCar_name("Seltos");
     c3.setCar_model("Kia");
     
     List <Car> carlist = new ArrayList<Car>();
     carlist.add(c1);
     carlist.add(c2);
     carlist.add(c3);
     
     Person person = new Person();
     person.setPerson_name("Deepak");
     person.setListofcars(carlist);
     
     Configuration conf = new Configuration();
     conf.configure();
     SessionFactory sef = conf.buildSessionFactory();
     Session ses = sef.openSession();
     Transaction tran = ses.beginTransaction();
     ses.save(person);
     tran.commit();
     ses.close();
	}
}

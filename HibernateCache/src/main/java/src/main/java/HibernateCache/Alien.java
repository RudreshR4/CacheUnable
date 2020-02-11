package src.main.java.HibernateCache;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
//@Table(name="Alien Table")
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class Alien {
@Id	
int aid;
String aname;
String color;

public Alien(int aid, String aname, String color) {
	super();
	this.aid = aid;
	this.aname = aname;
	this.color = color;
}



public Alien() {
	super();
	
}



public int getAid() {
	return aid;
}



public void setAid(int aid) {
	this.aid = aid;
}



public String getAname() {
	return aname;
}



public void setAname(String aname) {
	this.aname = aname;
}



public String getColor() {
	return color;
}



public void setColor(String color) {
	this.color = color;
}



@Override
public String toString() {
	return "Alien [aid=" + aid + ", aname=" + aname + ", Color=" + color + "]";
}

}

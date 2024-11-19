import javax.persistence.Column;
import javax.persistence.Embeddable;
@Embeddable
public class Address 
{
  @Column(name="hno", length =3)	
  int hno;
  @Column(name="hname", length =15)
  String hname;
  @Column(name="street", length =15)
  String street;
  @Column(name="city", length =15)
  String city;
public Address() {
	super();
	// TODO Auto-generated constructor stub
}
public Address(int hno, String hname, String street, String city) {
	super();
	this.hno = hno;
	this.hname = hname;
	this.street = street;
	this.city = city;
}
public int getHno() {
	return hno;
}
public void setHno(int hno) {
	this.hno = hno;
}
public String getHname() {
	return hname;
}
public void setHname(String hname) {
	this.hname = hname;
}
public String getStreet() {
	return street;
}
public void setStreet(String street) {
	this.street = street;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
@Override
public String toString() {
	return "Address [hno=" + hno + ", hname=" + hname + ", street=" + street + ", city=" + city + "]";
}
  
}

package dam2.jtengo.Practica.Model;

public class Client extends Persona{
public String adresa;
public String email;

public Client() {
	super();
}

public String getAdresa() {
	return adresa;
}

public void setAdresa(String adresa) {
	this.adresa = adresa;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

}

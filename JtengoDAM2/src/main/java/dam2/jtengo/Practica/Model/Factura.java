package dam2.jtengo.Practica.Model;

public class Factura extends Tiquet {
public Client client;

public Factura() {
	super();
}

public Client getClient() {
	return client;
}

public void setClient(Client client) {
	this.client = client;
	
}
}

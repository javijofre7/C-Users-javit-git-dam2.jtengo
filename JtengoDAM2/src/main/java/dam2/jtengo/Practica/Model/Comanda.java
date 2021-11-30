package dam2.jtengo.Practica.Model;

import java.util.ArrayList;

public class Comanda {
public int NumComanda;
public Client client;
public double total;
public ArrayList<LineaComanda> liniesComanda;

public Comanda() {
	super();
}

public int getNumComanda() {
	return NumComanda;
}

public void setNumComanda(int numComanda) {
	NumComanda = numComanda;
}

public Client getClient() {
	return client;
}

public void setClient(Client client) {
	this.client = client;
}

public double getTotal() {
	return total;
}

public void setTotal(double total) {
	this.total = total;
}

public ArrayList<LineaComanda> getLiniesComanda() {
	return liniesComanda;
}

public void setLiniesComanda(ArrayList<LineaComanda> liniesComanda) {
	this.liniesComanda = liniesComanda;
}
}

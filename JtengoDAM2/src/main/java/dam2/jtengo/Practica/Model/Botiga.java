package dam2.jtengo.Practica.Model;

import java.util.ArrayList;

public class Botiga {
public int idBotiga;
public String adresa;
public Magatzem magatzem;
public ArrayList<Venedor> venedor;

public Botiga() {
	
}

public int getIdBotiga() {
	return idBotiga;
}

public void setIdBotiga(int idBotiga) {
	this.idBotiga = idBotiga;
}

public String getAdresa() {
	return adresa;
}

public void setAdresa(String adresa) {
	this.adresa = adresa;
}

public Magatzem getMagatzem() {
	return magatzem;
}

public void setMagatzem(Magatzem magatzem) {
	this.magatzem = magatzem;
}

public ArrayList<Venedor> getVenedor() {
	return venedor;
}

public void setVenedor(ArrayList<Venedor> venedor) {
	this.venedor = venedor;
}
}

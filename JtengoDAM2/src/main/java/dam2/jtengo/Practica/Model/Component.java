package dam2.jtengo.Practica.Model;

import java.util.ArrayList;

public class Component extends Article {
public ArrayList<Bicicleta> llista;

public Component() {
	super();
}

public ArrayList<Bicicleta> getLlista() {
	return llista;
}

public void setLlista(ArrayList<Bicicleta> llista) {
	this.llista = llista;
}
}

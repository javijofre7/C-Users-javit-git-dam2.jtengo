package dam2.jtengo.Practica.Model;

import java.util.ArrayList;

public class Tiquet {
public int idTiquet;
public ArrayList<LineaTiquet> liniesTiquet;
public double total;

public Tiquet() {
	
}

public int getIdTiquet() {
	return idTiquet;
}

public void setIdTiquet(int idTiquet) {
	this.idTiquet = idTiquet;
}

public ArrayList<LineaTiquet> getLiniesTiquet() {
	return liniesTiquet;
}

public void setLiniesTiquet(ArrayList<LineaTiquet> liniesTiquet) {
	this.liniesTiquet = liniesTiquet;
}

public double getTotal() {
	return total;
}

public void setTotal(double total) {
	this.total = total;
}
}

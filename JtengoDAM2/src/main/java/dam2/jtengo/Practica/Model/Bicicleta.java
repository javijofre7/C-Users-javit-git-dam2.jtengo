package dam2.jtengo.Practica.Model;

public class Bicicleta extends Article{
public String talla;
public float midaRoda;
public int numPinyons;
public String color;
public String model;

public Bicicleta() {
	super();
}

public String getTalla() {
	return talla;
}

public void setTalla(String talla) {
	this.talla = talla;
}

public float getMidaRoda() {
	return midaRoda;
}

public void setMidaRoda(float midaRoda) {
	this.midaRoda = midaRoda;
}

public int getNumPinyons() {
	return numPinyons;
}

public void setNumPinyons(int numPinyons) {
	this.numPinyons = numPinyons;
}

public String getColor() {
	return color;
}

public void setColor(String color) {
	this.color = color;
}

public String getModel() {
	return model;
}

public void setModel(String model) {
	this.model = model;
}

}

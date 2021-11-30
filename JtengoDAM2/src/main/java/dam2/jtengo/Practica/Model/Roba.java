package dam2.jtengo.Practica.Model;

public class Roba extends Article{
public String marca;
public String talla;

public Roba() {
	super();
}

public String getMarca() {
	return marca;
}

public void setMarca(String marca) {
	this.marca = marca;
}

public String getTalla() {
	return talla;
}

public void setTalla(String talla) {
	this.talla = talla;
}
}

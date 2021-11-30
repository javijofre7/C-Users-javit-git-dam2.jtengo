package dam2.jtengo.Practica.Model;

public class Article {
public int ID_Article;
public String descripcio;
public double preuCompra;
public double preuVenda;

public Article() {
	
}

public int getID_Article() {
	return ID_Article;
}

public void setID_Article(int iD_Article) {
	ID_Article = iD_Article;
}

public String getDescripcio() {
	return descripcio;
}

public void setDescripcio(String descripcio) {
	this.descripcio = descripcio;
}

public double getPreuCompra() {
	return preuCompra;
}

public void setPreuCompra(double preuCompra) {
	this.preuCompra = preuCompra;
}

public double getPreuVenda() {
	return preuVenda;
}

public void setPreuVenda(double preuVenda) {
	this.preuVenda = preuVenda;
}
}

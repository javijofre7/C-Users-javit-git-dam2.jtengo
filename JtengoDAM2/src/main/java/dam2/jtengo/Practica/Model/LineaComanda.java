package dam2.jtengo.Practica.Model;

public class LineaComanda {
public int codiLinea;
public Comanda comanda;
public Article article;
public int unitats;
public double preuUnitats;

public LineaComanda() {
	
}

public int getCodiLinea() {
	return codiLinea;
}

public void setCodiLinea(int codiLinea) {
	this.codiLinea = codiLinea;
}

public Comanda getComanda() {
	return comanda;
}

public void setComanda(Comanda comanda) {
	this.comanda = comanda;
}

public Article getArticle() {
	return article;
}

public void setArticle(Article article) {
	this.article = article;
}

public int getUnitats() {
	return unitats;
}

public void setUnitats(int unitats) {
	this.unitats = unitats;
}

public double getPreuUnitats() {
	return preuUnitats;
}

public void setPreuUnitats(double preuUnitats) {
	this.preuUnitats = preuUnitats;
}

}

package dam2.jtengo.Practica.Model;

public class MovimentMagatzem {
public int idMoviment;
public Magatzem origen;
public Magatzem desti;
public Article article;
public int unitats;

public MovimentMagatzem() {
	
}

public int getIdMoviment() {
	return idMoviment;
}

public void setIdMoviment(int idMoviment) {
	this.idMoviment = idMoviment;
}

public Magatzem getOrigen() {
	return origen;
}

public void setOrigen(Magatzem origen) {
	this.origen = origen;
}

public Magatzem getDesti() {
	return desti;
}

public void setDesti(Magatzem desti) {
	this.desti = desti;
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
}

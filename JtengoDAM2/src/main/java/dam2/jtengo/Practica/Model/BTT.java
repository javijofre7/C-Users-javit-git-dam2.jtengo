package dam2.jtengo.Practica.Model;

public class BTT extends Bicicleta{
public String TipusSupensio;
public int numPlats;
public BTT() {
	super();
}
public String getTipusSupensio() {
	return TipusSupensio;
}
public void setTipusSupensio(String tipusSupensio) {
	TipusSupensio = tipusSupensio;
}
public int getNumPlats() {
	return numPlats;
}
public void setNumPlats(int numPlats) {
	this.numPlats = numPlats;
}
}

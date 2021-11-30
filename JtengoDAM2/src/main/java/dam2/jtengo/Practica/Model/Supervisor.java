package dam2.jtengo.Practica.Model;

public class Supervisor extends Venedor{
public Botiga botiga;
public int telefon;

public Supervisor() {
	super();
}

public Botiga getBotiga() {
	return botiga;
}

public void setBotiga(Botiga botiga) {
	this.botiga = botiga;
}

public int getTelefon() {
	return telefon;
}

public void setTelefon(int telefon) {
	this.telefon = telefon;
}

}

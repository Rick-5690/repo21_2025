// eve 1
public class Evento {
	private String nome,luogo,data;
	private int ora;
	public Evento(String nome, String luogo, String data, int ora) {
		super();
		this.nome = nome;
		this.luogo = luogo;
		this.data = data;
		this.ora = ora;
	}
	public String getNome() {
		return nome;
	}
	public String getLuogo() {
		return luogo;
	}
	public String getData() {
		return data;
	}
	public int getOra() {
		return ora;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setLuogo(String luogo) {
		this.luogo = luogo;
	}
	public void setData(String data) {
		this.data = data;
	}
	public void setOra(int ora) {
		this.ora = ora;
	}
	public String toString() {
		String s="Nome: "+nome+"\nLuogo: "+luogo+"\nData: "+data+"\nOra: "+ora+"\n";
		return s;
	}
	
	public static void main(String[] args) {
		Evento e1=new Evento("Festa","Casarano","31/02/2025",17);
		System.out.println(e1);
	}
}

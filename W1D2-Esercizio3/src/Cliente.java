
public class Cliente {
	String codiceCliente;
	String nomeCliente;
	String email;
	String dataIscrizione;
	
	public Cliente(String codiceCliente ,String nomeCliente ,String email , String dataIscrizione) {
		this.codiceCliente = codiceCliente;
		this.nomeCliente = nomeCliente;
		this.email = email;
		this.dataIscrizione = dataIscrizione;
	}
	
	public void datiCliente() {
		System.out.println("Codice Cliente: " + this.codiceCliente);
		System.out.println("Nome Cliente: " + nomeCliente);
		System.out.println("Email: " + email);
		System.out.println("dataIscrizione: " + dataIscrizione);
	}
}


public class TesteReferencias {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		
		System.out.println("saldo da priemira conta: " + primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		
		System.out.println("saldo da segunda conta: " + segundaConta.saldo);
		
		if(primeiraConta == segundaConta) {
			System.out.println("são a mesmissa conta");
		}
		
		System.out.println(primeiraConta);
	}

}

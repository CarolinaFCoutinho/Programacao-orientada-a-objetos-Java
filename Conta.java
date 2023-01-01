public abstract class Conta implements IOperacoes{
	private int id;
	private String numero;
	private float saldo;
	
	@Override
	public float consultaSaldo() {
		return this.saldo;
	}
	@Override
	public void realizaSaque(float valor) {
		this.saldo -= valor;
		
	}
	@Override
	public void realizaDeposito(float valor) {
		this.saldo += valor;
	}

  @Override
  public String toString() {
	return "ID: " + getId() + "\nNumero: " + getNumero() + "\nSaldo: " + getSaldo();
  }

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

}
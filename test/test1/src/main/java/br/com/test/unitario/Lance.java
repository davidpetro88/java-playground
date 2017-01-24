package br.com.test.unitario;

public class Lance {

	private Usuario usuario;
	private double valor;
	
	public Lance(Usuario usuario, double valor) {
		if(valor<=0) throw new IllegalArgumentException();
		this.usuario = usuario;
		this.valor = valor;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public double getValor() {
		return valor;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Lance lance = (Lance) o;

		if (Double.compare(lance.valor, valor) != 0) return false;
		return usuario.equals(lance.usuario);

	}

	@Override
	public int hashCode() {
		int result;
		long temp;
		result = usuario.hashCode();
		temp = Double.doubleToLongBits(valor);
		result = 31 * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
}

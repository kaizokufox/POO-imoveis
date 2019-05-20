
public class Religioso extends Imovel {
	
	protected  float percDesc;
	
	public float showPreco() {
		return this.preco-this.preco*this.percDesc;
	}
}

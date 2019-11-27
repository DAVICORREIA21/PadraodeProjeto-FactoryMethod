package factory.method;

public class FabricaDeServico implements FabricaDeGastos {

	@Override
	public Gastos criarGasto(String gasto) {

		if (gasto.equals("Arrumadeira")) {

			return new Arrumadeira();

		} else

			return new Lavadeira();

	}

}

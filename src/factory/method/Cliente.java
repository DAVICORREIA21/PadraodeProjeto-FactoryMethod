package factory.method;

public class Cliente {

	

	public static void main(String[] args)  {
		FabricaDeGastos fabrica = new FabricaDeConsumo();
		
		Gastos gasto = fabrica.criarGasto("Agua");
		gasto.exibirMenssagem();
		System.out.println();
		
		fabrica = new  FabricaDeConsumo();
		gasto = fabrica.criarGasto("Cerveja");
		gasto.exibirMenssagem();
		System.out.println();
		
		fabrica = new FabricaDeServico();
		gasto = fabrica.criarGasto("Arrumadeira");
		gasto.exibirMenssagem();
		System.out.println();
		
		fabrica = new FabricaDeServico();
		gasto = fabrica.criarGasto("Lavadeira");
		gasto.exibirMenssagem();
		System.out.println();
		
		

	}

}

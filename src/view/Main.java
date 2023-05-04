package view;

import controller.EncadeamentoControll;
import matheus.ListaInt.ListaInt;


public class Main {

	public static void main(String[] args) 
	{
		ListaInt list = new ListaInt();
		EncadeamentoControll controll = new EncadeamentoControll();
		int vet[] = {1, 2, 6, 7, 8};
		
		
		controll.criaList(vet, list);
		
		controll.listEncadeado(list);
		
		
		while(!list.isEmpty())
		{
			try {
				System.out.println(list.get(0));
				list.remove(0);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
	}

}

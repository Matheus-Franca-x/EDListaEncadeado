package view;

import controller.EncadeamentoControll;
import matheus.ListaInt.ListaInt;


public class Main {

	public static void main(String[] args) 
	{
		ListaInt list = new ListaInt();
		EncadeamentoControll controll = new EncadeamentoControll();
		int vet[] = {3, 3, 9, 6, 9, 8, 9, 5, 7, 10, 4, 8, 10, 8};
		
		
		controll.listEncadeado(list, vet);
		
		
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

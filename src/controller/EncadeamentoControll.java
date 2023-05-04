package controller;

import matheus.ListaInt.ListaInt;

public class EncadeamentoControll {
	
	public EncadeamentoControll() 
	{
		super();
	}
	
	public void listEncadeado(ListaInt lista, int[] vet)
	{
		for (int each: vet)
		{
			boolean test = true;
			try {
				for (int i = 0; i < lista.size(); i++)
				{
					if(each == lista.get(i))
					{
						test = false;
						break;
					}
				}
				if(test)
				{
					if(lista.isEmpty())
					{
						lista.addFirst(each);
					}
					else
					{
						lista.addLast(each);
					}
				}
				else if (each % 2 == 0)
				{
					lista.add(each, 2);
				}
				else
				{
					lista.add(each, 1);					
				}
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
	}
	

}

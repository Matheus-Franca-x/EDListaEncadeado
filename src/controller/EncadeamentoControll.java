package controller;

import model.ListaInt;

public class EncadeamentoControll {
	
	public EncadeamentoControll() 
	{
		super();
	}
	
	public void criaList(int[] vet, ListaInt lista)
	{
		
		for (int each: vet)
		{
			if(lista.isEmpty())
			{
				lista.addFirst(each);
			}
			else
			{
				try {
					lista.addLast(each);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		
	}
	
	public void listEncadeado(ListaInt lista)
	{
		while(lista.size() < 14)
		{
			int rand = (int) (Math.random() * 14) + 1;
			boolean test = true;
			try {
				for (int i = 0; i < lista.size(); i++)
				{
					if(rand == lista.get(i))
					{
						test = false;
						break;
					}
				}
				if(test)
				{
					lista.addLast(rand);					
				}
				else if (rand % 2 == 0)
				{
					lista.add(rand, 2);
				}
				else
				{
					lista.add(rand, 1);					
				}
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
	}
	

}

package array.list;

//IMPLEMENTADO PELA INTERFACE LIST
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ArrayListCarros {

	public static void main(String[] args) {

			
		ArrayList<String> carros = new ArrayList<>();
		//ADICIONANDO VALOR
		carros.add("FLUENCE");
		carros.add("KOMBI");
		carros.add("JAGUA");
		carros.add("BMW");
		carros.add("MERCEDES");
		carros.add("FUSCA");
		carros.add("VECTRA");
		System.out.println(carros);
		
		/*ALTERANDO VALOR*/
		carros.set(4, "MITSUBISHI");
		System.out.println(carros);
		
		/*REMOVENDO VALOR*/
		carros.remove("VECTRA");
		System.out.println(carros);
		
       /*ADICIONANDO  CARRO AO ARRAY LIST COM JOPTIONPANE*/
		carros.add(JOptionPane.showInputDialog("Informe a marca do carro"));
		System.out.println(carros);
	
		/*ESVAZIANDO O ARRAY*/
		//carros.clear();
		//System.out.println(carros);
	
		
		/*VERIFICANDO SE O ARRAY ESTÁ VAZIO*/
		if(carros.isEmpty()) {
			System.out.println("NÃO");	
		}
		/* VERIFICANDO SE O CONTÚEDO ESTÁ CONTIDO DENTRO DO ARRAYLIST */
		if(carros.contains("BMW")) {
			for (int i=0;  i< carros.size(); i++) {
				//CAPTURANDO BMW PELO GET e SUBSTITUINDO O VALOR
				if("BMW-M3".equals(carros.get(i))) {
					carros.set(i, "BUGATTI");
				  break;
				}else {System.out.println("NÃO ENCONTREI O ARGUMENTO PESQUISADO");}
			}
		}
		System.out.println(carros);
	}

}

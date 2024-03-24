package array.list.treino;   
import javax.swing.JOptionPane;
import array.list.treino.Aluno.CURSO;
/*  
 *    TESTAR MÉTODOS DO ARRAY-LIST NA APLICAÇÃO 
 * */

public class Start {

	public static void main(String[] args) {
      
		
		boolean resp = true;
		while(resp) {
		  String number = JOptionPane.showInputDialog(" 1-PARA CADASTRAR ALUNO | 2- SAIR");
		 
		  switch(number) {
		   case "1":
			  String nome = JOptionPane.showInputDialog("NOME: ");
		      String idade =  JOptionPane.showInputDialog("IDADE: ");
			  		      String numero =  JOptionPane.showInputDialog("ESCOLHA O CURSO \n"
		      		+ "1-LOGICA_PROGRAMACAO \n" 
		    		  + "2-FRONT_END \n" +
		    		  "3-BACK_END \n" +
		    		  "4-DADOS \n" +
		    		  "5-DEVOPS \n" +
		    		  "6-SQL "
		    		  );
		      if(numero.equals("1")) {
		  		Aluno aluno = new Aluno(nome,idade,CURSO.LOGICA_PROGRAMACAO);		    	
		  	     
		  		 Cadastros cad = new Cadastros();
				 cad.cadastrarAluno(aluno);  
				 cad.exibirAlunos();
		      }else if(numero.equals("2")) {
		    	Aluno aluno = new Aluno(nome,idade,CURSO.FRONT_END);		    	
		        Cadastros cad = new Cadastros();
				cad.cadastrarAluno(aluno);
				  cad.exibirAlunos();
		      }else if(numero.equals("3")) {
		    	Aluno aluno = new Aluno(nome,idade,CURSO.BACK_END);		    	    	  
		        Cadastros cad = new Cadastros();
				cad.cadastrarAluno(aluno);
			    cad.exibirAlunos();
		      }else if(numero.equals("4")) {
		    	Aluno aluno = new Aluno(nome,idade,CURSO.DADOS);		    	    	  
		        Cadastros cad = new Cadastros();
				cad.cadastrarAluno(aluno);
				cad.exibirAlunos();
		      }else if(numero.equals("5")) {
		    	Aluno aluno = new Aluno(nome,idade,CURSO.DEVOSP);		    	    	  
		        Cadastros cad = new Cadastros();
				cad.cadastrarAluno(aluno);
				cad.exibirAlunos();
		      }else if(numero.equals("6")) {
		    	Aluno aluno = new Aluno(nome,idade,CURSO.SQL);		    	    	  
		        Cadastros cad = new Cadastros();
			    cad.cadastrarAluno(aluno);
			    cad.exibirAlunos();
		      }
		   number = JOptionPane.showInputDialog("DESEJA SAIR? DIGITE 2 OUTRO VALOR PARA CONTINUAR");
		    if(number.equals("2")) {

				JOptionPane.showMessageDialog(null, "FIM DO PROGRAMA");
		    	resp=false;
		    }
			break;
		   case "2":
			   JOptionPane.showMessageDialog(null, "FIM DO PROGRAMA");
			resp = false;
			
		   break;
		  }
		  
		}
	}

}

package array.list.treino;

//IMPORTAÇÃO DE ARRAY-LIST
import java.util.ArrayList;

//import array.list.treino.Aluno;

public class Cadastros implements Cadastro{
  
	/* ARRAYLIST => COLLECTIONS JAVA  */
	ArrayList<Aluno> alunos = new ArrayList<>();
	
	
	//MÉTODO IMPLEMENTADO DA INTERFACE  => "CADASTRO"
	@Override
	public void cadastrarAluno(Aluno aluno) {
	  this.alunos.add(aluno);
	 
	}
	
	 //MÉTODO PARA EXIBIR => ALUNOS
	public void exibirAlunos() {
	 /*EXIBIÇÃO DE ALUNOS CADASTRADOS*/
       System.out.println(this.alunos);
	}
		
}
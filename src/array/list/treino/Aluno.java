package array.list.treino;

public class Aluno {
  private String nome ;
  private String idade;
  private CURSO cursos;
  
  //SOBRECARGA DE CONSTRUTOR VÁRIOS PARÂMETROS
  public Aluno(String nome,String idade,CURSO cursos) {
	  this.nome = nome;
	  this.idade = idade;
	  this.cursos = cursos;
  }
  
  //VALORES CONSTANTES POSSÍVEIAS PARA UM ATRIBUTO
  enum CURSO{
	  LOGICA_PROGRAMACAO,
      FRONT_END,
	  BACK_END,
	  DADOS,
	  DEVOSP,
	  SQL
  }


  
	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade +   ", cursos=" + cursos + "]";
	}
  
  
}

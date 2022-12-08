package br.edu.infnet.matricula;

import br.edu.infnet.matricula.entidade.Aluno;
import br.edu.infnet.matricula.entidade.Disciplina;
import br.edu.infnet.matricula.persistencia.AlunoDAO;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AlunoDAO dao = new AlunoDAO();
    	
    	Aluno aluno = new Aluno();
    	
    	aluno.setNome("Marina");
    	aluno.setCPF("01014968186");
    	aluno.setMatricula(20030);
    	aluno.setEndereço("QD 07 LOTE 3 CASA 5");
    	
    	Disciplina disciplina = new Disciplina();
    	
    	disciplina.setHoras(40);
    	disciplina.setNome("Logica I");
    	disciplina.setPeriodo(0);
    	
    	dao.requistosMatricula(0, "nenhum");
    	dao.retornar("01014968186");
    	dao.listaTodos();
    }
}

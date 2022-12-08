package br.edu.infnet.matricula.persistencia;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.EntityManager;
import jakarta.persistence.OneToMany;

import br.edu.infnet.matricula.entidade.Aluno;

public abstract class JpaDAO<T> implements IDAO<T>{

	protected EntityManager em;
	
	private Class<T> entityClass;
	
	public JpaDAO() {
		ParameterizedType generic = (ParameterizedType) getClass().getGenericSuperclass();
		this.entityClass = (Class<T>) generic.getActualTypeArguments()[0];
		em = JpaUtil.createEntityManager();
	}

	public void salvar(T t) {
		em.getTransaction().begin();
		em.persist(t);
		em.getTransaction().commit();
	}

	
	public void atualizar(T t) {
		em.getTransaction().begin();
		em.merge(t);
		em.getTransaction().commit();
	}

	
	public void deletar(T t) {
		em.getTransaction().begin();
		em.remove(t);
		em.getTransaction().commit();
	}

	public T retornar(String CPF) {
		return em.find(entityClass, CPF);
	}

	@OneToMany(cascade = CascadeType.ALL)
	public List<T> listaTodos() {
		return em.createQuery("from " + entityClass.getName()).getResultList();
	}
	
	public void requistosMatricula(int i, String nome) {
		if(i == 0 || nome == "nenhuma") {
			System.out.println("Você deve se matricular na disciplinda de Lógica I");
		}
		
		if(i == 1 || nome == "Lógica I") { 
			System.out.println("Você deve se matricular na disciplinda de Lógica II");
		}
		
		if(i == 2 || nome == "Lógica II") {
			System.out.println("Você deve se matricular na disciplinda de Lógica III");
		}
		
		if(i == 3 || nome == "Lógica III") {
			System.out.println("Você deve se matricular na disciplinda de Orientação a Objeto");
		}
		
		if(i == 4 || nome == "Lógica Orientação a Objeto") {
			System.out.println("Você deve se matricular na disciplinda de Programação I");
		}
		
	}
}
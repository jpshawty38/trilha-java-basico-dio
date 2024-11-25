package list;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
	
	
	private List<Tarefa> tarefaList;
	
	public ListaTarefa() {
		this.tarefaList = new ArrayList<Tarefa>();
	}	

	public void adicionarTarefa(String descricao) {
		tarefaList.add(new Tarefa(descricao));
	}
	
	public void removerTarefa(String descricao) {
		List<Tarefa> tarefasParaRemover = new ArrayList<>();
		for(Tarefa t: tarefaList) {
			if(t.getDescricao().equalsIgnoreCase(descricao)) {
				tarefasParaRemover.add(t);
			}
		}
		
		tarefaList.removeAll(tarefasParaRemover);
	}
	
	
	public int obterNumeroTotalDeTarefas() {
		return tarefaList.size();
	}
	
	public void oberDescricaoTarefas() {
		System.out.println(tarefaList);
	}
	
	public static void main(String[] args) {
		ListaTarefa listaTarefa = new ListaTarefa();
		
		
		listaTarefa.adicionarTarefa("adicionando a primeira tarefa");
		listaTarefa.removerTarefa("adicionando a primeira tarefa");

		
		System.out.println(listaTarefa.obterNumeroTotalDeTarefas());
				
	}
	
}


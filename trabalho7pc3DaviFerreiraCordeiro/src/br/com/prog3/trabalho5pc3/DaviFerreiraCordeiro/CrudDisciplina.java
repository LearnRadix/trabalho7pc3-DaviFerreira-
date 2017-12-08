package br.com.prog3.trabalho5pc3.DaviFerreiraCordeiro;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class CrudDisciplina{
        private static Map<Integer, Disciplina> mapaDisciplina;
       
       public CrudDisciplina() {};
       
       public CrudDisciplina(Map<Integer, Disciplina> mapaDisciplina){
         Disciplina d1 = new Disciplina();
         Disciplina d2 = new Disciplina();
    	 
         d1.setCodigo(1);
         d1.setCargaHoraria(72);
         d1.setDescricao("Matematica");
         
         d2.setCodigo(2);
         d2.setCargaHoraria(72);
         d2.setDescricao("Portugues");
         
         mapaDisciplina.put(d1.getCodigo(), d1);
         mapaDisciplina.put(d2.getCodigo(), d2);
     
       }
       
       public List<Disciplina> listarTodos(){
    	   List<Disciplina> lista = new ArrayList();
    	   
    	   for(int i = 0; i<mapaDisciplina.size(); i++) {
    		   lista.add(mapaDisciplina.get(i));
    	    }
    	  return lista;
         }
       
       public static Map<Integer, Disciplina> getMapaDisciplina() {
		return mapaDisciplina;
	}

	public static void setMapaDisciplina(Map<Integer, Disciplina> mapaDisciplina) {
		CrudDisciplina.mapaDisciplina = mapaDisciplina;
	}

	public Disciplina buscarPeloCodigo(int codigo) {
       return mapaDisciplina.get(codigo);
    	   
       }
       
       public void inserir(Disciplina d) {
    	   mapaDisciplina.put(d.getCodigo(), d);
       }
       
       public void excluir(Disciplina d) {
           if(mapaDisciplina.containsKey(d.getCodigo())){
        	   mapaDisciplina.remove(d.getCodigo());     	   
           }
       }
       
       public void alterar(Disciplina d) {
       if(mapaDisciplina.containsKey(d.getCodigo())) {
    	   mapaDisciplina.replace(d.getCodigo(), d); 
          }   
       }
       
}
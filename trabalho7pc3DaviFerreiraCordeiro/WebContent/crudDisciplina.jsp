<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Resultado</title>
</head>
<body>
<%@page import="br.com.prog3.trabalho5pc3.DaviFerreiraCordeiro.CrudDisciplina" %>
<%@page import="br.com.prog3.trabalho5pc3.DaviFerreiraCordeiro.Disciplina" %>
<%@page import="java.util.List" %>
<%@page import="java.util.Map" %>
<%@page import="java.util.ArrayList" %>

<% String crud = request.getParameter("crud");
 Disciplina Materia = new Disciplina();
 CrudDisciplina Crud = new CrudDisciplina();
 %>
 
<%if(crud.equals("Pesquisar")){
    List<Disciplina> l1 = new ArrayList<>();
    l1 = Crud.listarTodos();
    while(!l1.isEmpty()){ %>
    <%=l1%>
    <%
    }
}
    %>
    
 <% 
    if(crud.equals("Alterar")){
      	Crud.alterar(Materia);
      	%> Alterado com sucesso! <% 
    }
    
    if(crud.equals("Excluir")){
    	Crud.excluir(Materia);%>
    	Excluido com sucesso! <% 
    }
    
    if(crud.equals("Incluir")){
    	Crud.inserir(Materia);%>
    	Inserido com sucesso <% 
    }
   
%>
	

</body>
</html>
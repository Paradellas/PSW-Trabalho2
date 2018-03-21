package com.mycompany.trabalho2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Paradellas
 */
@WebServlet("/situacaoServlet")
public class situacaoServlet extends HttpServlet {
    /**Lista que guarda todos os objetos aluno */
    List<Aluno> lista= new ArrayList();
    /**Variável para receber um aluno */
    Aluno b;
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /**Pega a informação do formulário na chave aluno*/
        String aluno = req.getParameter("aluno");
        /**Pega a informação do formulário da chave frequencia*/
        Float freq= Float.parseFloat(req.getParameter("frequencia"));
        /**Pega a informação do formulário da chave mediaNormal*/
        Float mn= Float.parseFloat(req.getParameter("mediaNormal"));
        /**Pega a informação do formulário da chave mediaFinal*/
        Float mf= Float.parseFloat(req.getParameter("mediaFinal"));
        /**Cria um objeto aluno e adciona todos os atributos pegos no formulário */
        Aluno a = new Aluno(aluno,freq,mn,mf);
        lista.add(a);
        resp.getWriter().print("<html>");
        resp.getWriter().print("<body>");
        resp.getWriter().print("<h1>Todos os alunos </h1>");
        resp.getWriter().print("<table border=1px style=\"width:100%\">");
        resp.getWriter().print("<tr>");
        resp.getWriter().print("<th>Nome</th>");
        resp.getWriter().print("<th>Frequência</th>");
        resp.getWriter().print("<th>Nota normal</th>");
        resp.getWriter().print("<th>Nota final</th>");
        resp.getWriter().print("<th>Situação</th>");
        resp.getWriter().print("</tr>");
        
        /**Printa todas as informações de aluno que estão na lista*/
        for(int i=0; i< lista.size(); i++){
            b=lista.get(i);
            resp.getWriter().print("<tr>");
            resp.getWriter().print("<td><center>"+b.getNome()+"</center></td>");
            resp.getWriter().print("<td><center>"+b.getFrequencia()+"</center></td>");
            resp.getWriter().print("<td><center>"+b.getNotaNormal()+"</center></td>");
            resp.getWriter().print("<td><center>"+b.getNotaFinal()+"</center></td>");
            resp.getWriter().print("<td><center>"+b.getSituacao()+"</center></td>");
            resp.getWriter().print("</tr>");
        }
        
        
        resp.getWriter().print("</table>");
        resp.getWriter().print("<body>");
        resp.getWriter().print("<html>");
        
    }

    
    
}
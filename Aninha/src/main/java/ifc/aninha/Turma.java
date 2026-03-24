/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifc.aninha;

import java.util.HashSet;

/**
 *
 * @author aluno
 */
public class Turma {
    private Discente discente = new Discente();
    private Disciplina disciplina = new Disciplina();
   private professor professor  = new professor();
   
   private Set<Estudante> discente = new HashSet<Estudante>();
   private Set<Disciplina> disciplina = new HashSet<Disciplina>();
   private Set<professor> professor = new HashSet<professor>();
}


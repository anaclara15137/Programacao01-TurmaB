/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ana;

import java.util.Date;
import javax.xml.crypto.Data;

/**
 *
 * @author aluno
 */

public class Estudante {

   private String nome;
   private Date dataNascimento;
   private String cpf;
   private char genero;
   private String matricula;
   private String email;
   
   public Estudante(){
       nome = "Nobody";
   }
   
   public int obterIdade(Date hoje){
       int idade = 0;
       //lógica de calculo  de idade
       return idade;
   
    }
   public String getNome(){
   return nome;
}

   public void setNome(String _nome){
    nome = _ nome;
    
   }
   public Date getdataNascimento (){
       return dataNascimento = _dataNascimento;
   }
public void setDate (Date _dataNascimento){
dataNascimento = _dataNascimento;
}
   public String getcpf(){
return cpf;
}
   public void setcpf (String _cpf){
   cpf = _cpf;
}
    

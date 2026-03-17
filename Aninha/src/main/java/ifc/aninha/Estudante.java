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
    private String nivelEnsino;
    private int telefone;
    private int anosin;
    private String semestre;
    private String situacao;

    public Estudante() {
        nome = "Nobody";
    }

    public int obterIdade(Date hoje) {
        int idade = 0;
        //lógica de calculo  de idade
        return idade;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String _nome) {
        nome = _nome;

    }

    public Date getdataNascimento() {
        return dataNascimento;
    }

    public void setDate(Date _dataNascimento) {
        dataNascimento = _dataNascimento;
    }

    public String getcpf() {
        return cpf;
    }

    public void setcpf(String _cpf) {
        cpf = _cpf;
    }

    public char getgenero() {
        return genero;

    }

    public void getgenero(char _genero) {
        genero = _genero;

    }

    public String getmatricula() {
        return matricula;

    }

    public String setmatricula(String _matricula) {
        matricula = _matricula;

    }

    public String getmail() {
        return email;

    }

    public void setemail(String _email) {
        email = _email;

    }
    public String nivelEnsino(){
        return nivelEnsino;
    }
            
    public int gettelefone() {
        return telefone;

    }

    public void setTelefone(int _telefone) {
        telefone = _telefone;

    }

    public int getanosin() {
        return telefone;
    }

    public void setanosin(int _anosin) {
        anosin = anosin;
    }

    public String getsemestre() {
        return semestre;
    }
    public void setsemestre(String _semestre){
        semestre = _semestre;
    }
    public String getsituacao(){
        return semestre;
        
    }
    public void setsituacao(String _situacao){
        situacao = _situacao;
    }
}

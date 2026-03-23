/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifc.aninha;

/**
 *
 * @author aluno
 */
public class Professor {

    private String nomeCompleto;
    private int SIAPE;
    private String email;
    private int telefone;
    private String titulaçaoAcademica;
    private String areaAtuacao;
    private String regimeTrabalho;
    private int dataingresso;
    private String formacaoDoutorado;

    public Professor() {
        nomeCompleto = "Nobody";
    }

    public int getSIAPE() {
        return SIAPE;
    }

    public void setSIAPE(int _SIAPE) {
        SIAPE = _SIAPE;

    }

    public String getemail() {
        return email;
    }

    public void setemail(String _email) {
        email = _email;
    }

    public int gettelefone() {
        return telefone;
    }

    public void settelefone(int _telefone) {
        telefone = _telefone;
    }

    public String gettitulaçaoAcademica() {
        return titulaçaoAcademica;
    }

    public void settitulaçaoAcademica(String _titulaçaoAcademica) {
        titulaçaoAcademica = _titulaçaoAcademica;
    }

    public String getareaAtuacao() {
        return areaAtuacao;
    }

    public String setareaAtuacao(String _areaAtuacao) {
        areaAtuacao = _areaAtuacao;
    }

    public String getregimeTrabalho() {
        return regimeTrabalho;
    }

    public String setregimeTrabalho(String _regimeTrabalho) {
        regimeTrabalho = _regimeTrabalho;
    }

    public int getdataingresso() {
        return dataingresso;
    }

    public void setdataingresso(int _dataingresso) {
        dataingresso = _dataingresso;
    }

    public String getformacaoDoutorado() {
        return formacaoDoutorado;
    }

    public void setformacaoDoutorado(String _formacaoDoutorado) {
        formacaoDoutorado = _formacaoDoutorado;
    }
}

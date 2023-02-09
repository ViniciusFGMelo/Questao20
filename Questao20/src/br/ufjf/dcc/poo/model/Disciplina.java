package br.ufjf.dcc.poo.model;

import java.util.ArrayList;

public class Disciplina {

	// Uma Disciplina pode ser lecionada por somente um Professor
	// QuantidadeAcademicos (void), imprimirDiario (void)
	/// NomeDisciplina(String), período(integer), livroTexto(String)
	private String nomeDisciplina;
	private int periodo;
	private String livroTexto;
	private ArrayList<Academico> academicos;


	public String getNomeDisciplina() {
		return nomeDisciplina;
	}

	public void setNomeDisciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	}

	public int getPeriodo() {
		return periodo;
	}

	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}

	public String getLivroTexto() {
		return livroTexto;
	}

	public void setLivroTexto(String livroTexto) {
		this.livroTexto = livroTexto;
	}

	public ArrayList<Academico> getAcademicos() {
		return academicos;
	}

	public void setAcademicos(ArrayList<Academico> academicos) {
		this.academicos = academicos;
	} 

	public void quantidadeAcademicos() {
		
	} 

	public void imprimirDiario() {
		
	}
	
}

package br.ufjf.dcc.poo.model;

import java.util.ArrayList;

public class Academico extends Pessoa{

	private int academicoId;
	private ArrayList<Disciplina> disciplinas;
	
	public Academico(int academicoId, ArrayList<Disciplina> disciplinas) {
		super();
		this.academicoId = academicoId;
		this.disciplinas = disciplinas;
	}

	public Academico() {
		
	}

	public int getAcademicoId() {
		return academicoId;
	}


	public void setAcademicoId(int academicoId) {
		this.academicoId = academicoId;
	}


	public ArrayList<Disciplina> getDisciplinas() {
		return disciplinas;
	}


	public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	public void imprimirGrade() {
		
	}
	
}

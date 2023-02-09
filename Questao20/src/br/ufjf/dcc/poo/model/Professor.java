package br.ufjf.dcc.poo.model;

import java.util.ArrayList;

public class Professor extends Pessoa{

	// Atributos: salarioBase(float), numAulas(integer), numDisciplinas(integer)
	private float salarioBase;
	private int numAulas;
	private int numDisciplinas;
	private ArrayList<Disciplina> disciplinas;
	
	public Professor(float salarioBase, int numAulas, int numDisciplinas, ArrayList<Disciplina> disciplinas) {
		super();
		this.salarioBase = salarioBase;
		this.numAulas = numAulas;
		this.numDisciplinas = numDisciplinas;
		this.disciplinas = disciplinas;
	}

	public Professor() {
		
	}

	public float getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}

	public int getNumAulas() {
		return numAulas;
	}

	public void setNumAulas(int numAulas) {
		this.numAulas = numAulas;
	}

	public int getNumDisciplinas() {
		return numDisciplinas;
	}

	public void setNumDisciplinas(int numDisciplinas) {
		this.numDisciplinas = numDisciplinas;
	}

	public ArrayList<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	public void salario() {
		
	}
	
}

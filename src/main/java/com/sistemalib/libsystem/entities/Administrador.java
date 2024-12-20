package com.sistemalib.libsystem.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_admins")
@PrimaryKeyJoinColumn(name = "usuario_id")
public class Administrador extends Usuario {
	
    private String cargo;
    
	public Administrador() {
	}
	
    public Administrador(String nome, String email, String senha, String cpf, String cargo) {
        super(nome, email, senha, cpf);
        this.cargo = cargo;
    }

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

//    public void cadastrarCliente(Cliente cliente) {
//        System.out.println("Cadastrando cliente: " + cliente.getNome());
//    }
//
//    public void editarCliente(Cliente cliente) {
//        System.out.println("Editando cliente: " + cliente.getNome());
//    }
//
//    public void removerCliente(Cliente cliente) {
//        System.out.println("Removendo cliente: " + cliente.getNome());
//    }
//
//    public void cadastrarFuncionario(Funcionario funcionario) {
//        System.out.println("Cadastrando funcionário: " + funcionario.getNome());
//    }
//
//    public void editarFuncionario(Funcionario funcionario) {
//        System.out.println("Editando funcionário: " + funcionario.getNome());
//    }
//
//    public void removerFuncionario(Funcionario funcionario) {
//        System.out.println("Removendo funcionário: " + funcionario.getNome());
//    }
//
//    public void cadastrarLivro(LivroFisico livroFisico) {
//        System.out.println("Cadastrando livro físico: " + livroFisico.getTitulo() + " (ISBN: " + livroFisico.getISBN() + ")");
//    }
//
//    public void editarLivro(LivroFisico livroFisico) {
//        System.out.println("Editando livro físico: " + livroFisico.getTitulo() + " (ISBN: " + livroFisico.getISBN() + ")");
//    }
//
//    public void removerLivro(LivroFisico livroFisico) {
//        System.out.println("Removendo livro físico: " + livroFisico.getTitulo() + " (ISBN: " + livroFisico.getISBN() + ")");
//    }
//
//    public void cadastrarLivro(LivroDigital livroDigital) {
//        System.out.println("Cadastrando livro digital: " + livroDigital.getTitulo() + " (ISBN: " + livroDigital.getISBN() + ")");
//    }
//
//    public void editarLivro(LivroDigital livroDigital) {
//        System.out.println("Editando livro digital: " + livroDigital.getTitulo() + " (ISBN: " + livroDigital.getISBN() + ")");
//    }
//
//    public void removerLivro(LivroDigital livroDigital) {
//        System.out.println("Removendo livro digital: " + livroDigital.getTitulo() + " (ISBN: " + livroDigital.getISBN() + ")");
//    }
}
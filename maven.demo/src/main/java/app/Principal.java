package app;

import java.util.List;
import java.util.Scanner;
import dao.DAO;
import dao.UsuarioDAO;
import model.Usuario;

public class Aplicacao {
	
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite a opcao que deseja selecionar [1- Listar, 2- Inserir, 3- Excluir, 4- Atualizar, 5- Sair]");
		int opcao = scanner.nextInt();
		do{
			switch(opcao)
			        case 1:  
					usuarios = usuarioDAO.getOrderByCodigo();
				        for (Usuario u: usuarios) {
						System.out.println(u.toString());
					}
              			break;
			        case 2:  
              				System.out.println("\n\n==== Inserir === ");
					Usuario usuario = new Usuario(11, "pablo", "pablo",'M');
					if(usuarioDAO.insert(usuario) == true) {
						System.out.println("Inserção com sucesso -> " + usuario.toString());
					}
              			break;
				case 3:  
              				System.out.println("\n\n==== Excluir (código " + usuario.getCodigo() + ") === ");
					usuarioDAO.delete(usuario.getCodigo());
              			break;
				case 4:  
              				System.out.println("\n\n==== Atualizar senha (código (" + usuario.getCodigo() + ") === ");
					usuario.setSenha(DAO.toMD5("pablo"));
					usuarioDAO.update(usuario);
              			break;
				case 5:  
              				System.out.println("\n\n==== Saindo === ");
              			break;				
			
		}while(opcao != 5);
		scanner.close();
	}
}

//Listar inserir exluir atualizar sair


package Controller;

import Controller.Helper.LoginHelper;
import Model.DAO.UsuarioDAO;
import Model.Usuario;
import View.Login;
import View.MenuPrincipal;


public class LoginController {

    private final Login view;
    private LoginHelper helper;

    public LoginController(Login view) {
        this.view = view;
        this.helper = new LoginHelper(view);
    }
    
    public void entrarNoSistema(){
        
        //Pegar um usuario da View
        Usuario usuario = helper.obterModelo();
        
        
        //Pesquisar o usuario no Banco
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        Usuario usuarioAutenticado = usuarioDAO.selectPorNomeESenha(usuario);
        
        //Se o usuario da View tiver o mesmo usario e senha que o usuario vindo do banco, direcionar para o menu principal
        //se não, mostrar uma mensagem para o usuario " usuario ou senha invalidos"
        if(usuarioAutenticado != null){
            MenuPrincipal menu = new MenuPrincipal();
            menu.setVisible(true);
            this.view.dispose();
        }else{
            view.exibeMensagem("usuario ou senha  invalidos");
        }
        
        
        
    }
    
    public void fizTarefa(){
        System.out.println("Busquei algo do bando de dados");
        
        this.view.exibeMensagem("Executei o fiz tarefa");
    }
            
    
    
    
}


package View;

import Model.Agendamento;
import Model.Cliente;
import Model.Servico;
import Model.Usuario;

public class Main {
    
    public static void main(String[] args){
        
        Servico servico = new Servico(1, "Barba", 30);
        
        System.out.println(servico.getDescricao());
        System.out.println(servico.getValor());
        
        Cliente cliente = new Cliente(1, "João", "rua teste 122", "90600100");
        System.out.println(cliente.getNome());
        
        Usuario usuario = new Usuario(1, "barbeiro 1", "senha123");
        System.out.println(usuario.getNome());
        
        Agendamento agendamento = new Agendamento(1, cliente, servico, 30, "11/03/2023 10:30");
        System.out.println(agendamento.getCliente().getNome());
        
    }
    
    
    
}


package DAO;

import java.sql.Connection;
import DTO.UsuarioDTO;
import com.mysql.jdbc.PreparedStatement;
import javax.swing.JOptionPane;



public class CadastroDAO {
    
    Connection conn2;
    PreparedStatement pstm2;
    
    public void cadastrarpessoa (UsuarioDTO objCadastroDAO){
        
        String sqlI = "insert into tb_login (Id, Nome, Senha, Usuario) values(?,?,?,?) ";
        
        conn2 = new ConexaoDAO().conectBD();
        
        try{
            
            pstm2 = (PreparedStatement) conn2.prepareStatement(sqlI);
            pstm2.setInt(1, objCadastroDAO.getId_usuario());
            pstm2.setString(2, objCadastroDAO.getNome_usuario());
            pstm2.setString(3, objCadastroDAO.getSenha_usuario());
            pstm2.setString(4, objCadastroDAO.getUsuario_usuario());
            
            pstm2.execute();
            pstm2.close();
        
        }catch(Exception erro){
            
            JOptionPane.showMessageDialog(null, "FuncionarioSAO" + erro);
            
        }
        
        
    }
    
}

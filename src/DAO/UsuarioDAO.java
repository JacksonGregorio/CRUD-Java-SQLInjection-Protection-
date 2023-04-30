package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import DTO.UsuarioDTO;
import com.mysql.jdbc.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.SQLException;

public class UsuarioDAO {
    
    Connection conn;
    
    public ResultSet autenticacaoUsuario (UsuarioDTO objusuarioDTO){
        
        conn = new ConexaoDAO().conectBD();
        
        try{
            
            String sql = "Select * from tb_login where Usuario = ? and Senha = ?";
            
            PreparedStatement pstm = (PreparedStatement) conn.prepareStatement(sql);
            pstm.setString(1, objusuarioDTO.getNome_usuario());
            pstm.setString(2, objusuarioDTO.getSenha_usuario());
            
            ResultSet rs = pstm.executeQuery();
            return rs;
                
        
        }
        catch(SQLException erro){
            
            JOptionPane.showMessageDialog(null, "Usuario Dao" + erro);
            return null;
        
        }
        
    }
    
    
}

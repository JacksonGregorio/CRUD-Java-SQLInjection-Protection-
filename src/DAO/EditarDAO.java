
package DAO;

import java.sql.Connection;
import DTO.UsuarioDTO;
import com.mysql.jdbc.PreparedStatement;
import javax.swing.JOptionPane;

public class EditarDAO {
    
    Connection conn5;
    PreparedStatement pstm5;
    
    public void editarpessoa (UsuarioDTO objUsuarioDTO){
        
        String sqlE = "update tb_login set Nome=?, Usuario=? where Id = ? ";
                                                        
        
        conn5 = new ConexaoDAO().conectBD();
        
        try{
            
            pstm5 = (PreparedStatement) conn5.prepareStatement(sqlE);

            pstm5.setString(1, objUsuarioDTO.getNome_usuario());
            pstm5.setString(2, objUsuarioDTO.getUsuario_usuario());
            pstm5.setInt(3, objUsuarioDTO.getId_usuario());
            
            pstm5.execute();
            pstm5.close();
        
        }catch(Exception erro){
            
            JOptionPane.showMessageDialog(null, "EditarDAO" + erro);
            
        }
    }
}

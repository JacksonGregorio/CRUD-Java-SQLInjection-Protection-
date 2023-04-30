
package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import DTO.UsuarioDTO;
import com.mysql.jdbc.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.util.ArrayList;


public class PesquisarDAO {
    
     Connection conn3;
     PreparedStatement pstm3;
     ResultSet rs2;
     Connection conn4;
     PreparedStatement pstm4;
     ResultSet rs3;
     
     ArrayList <UsuarioDTO> lista =  new ArrayList<>();
    
     public ArrayList <UsuarioDTO> PesquisarUsuario(){
     
         String sql3 = "select * from tb_login ";
         conn3 = new ConexaoDAO().conectBD();
         
         
         try {
             
             pstm3 = (PreparedStatement) conn3.prepareStatement(sql3);
             rs2 = pstm3.executeQuery(sql3);
             
             while(rs2.next()){
             UsuarioDTO objUsuarioDTO = new UsuarioDTO();
             objUsuarioDTO.setId_usuario(rs2.getInt("Id"));
             objUsuarioDTO.setNome_usuario(rs2.getString("Nome"));
             objUsuarioDTO.setUsuario_usuario(rs2.getString("Usuario"));
             
             lista.add(objUsuarioDTO);
             
             }
             
             
         } catch (SQLException erro) {
             
             JOptionPane.showMessageDialog(null, " PesquisarDAO " + erro);
             
             
         }
         
         return lista;
     
     }
     
      public ArrayList <UsuarioDTO> PesquisarListagem(String lista_usuario){
          

     
         String sql4 = "select * from tb_login WHERE Nome LIKE  ? ";
         conn4 = new ConexaoDAO().conectBD();
         
         
         try {
             
             pstm4 = (PreparedStatement) conn4.prepareStatement(sql4);
             pstm4.setString(1, "%" + lista_usuario + "%");
             rs2 = pstm3.executeQuery(sql4);
             
             while(rs2.next()){
             UsuarioDTO objUsuarioDTO = new UsuarioDTO();
             objUsuarioDTO.setId_usuario(rs2.getInt("Id"));
             objUsuarioDTO.setNome_usuario(rs2.getString("Nome"));
             objUsuarioDTO.setUsuario_usuario(rs2.getString("Usuario"));
             
             lista.add(objUsuarioDTO);
             
             }
             
             
         } catch (SQLException erro) {
             
             JOptionPane.showMessageDialog(null, " PesquisarDAO " + erro);
             
             
         }
         
         return lista;
     
     }
     
     
}

package DAO;

import java.sql.Connection;
import DTO.UsuarioDTO;
import com.mysql.jdbc.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.SQLException;


public class ExcluirDAO {

    Connection conn6;
    PreparedStatement pstm6;

    public void excluirUsuario(UsuarioDTO objUsuarioDTO) {

        conn6 = new ConexaoDAO().conectBD();
        String sqlX = "Delete from tb_login where Id = ? ";

        try {
            pstm6 = (PreparedStatement) conn6.prepareStatement(sqlX);
            pstm6.setInt(1, objUsuarioDTO.getId_usuario());
            pstm6.execute();
            pstm6.close();

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "Erro ExcluirDAO" + erro);

        }

    }

}

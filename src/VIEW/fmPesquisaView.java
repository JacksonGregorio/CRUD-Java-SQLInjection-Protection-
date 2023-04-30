package VIEW;

import DAO.EditarDAO;
import DAO.ExcluirDAO;
import DAO.PesquisarDAO;
import DTO.UsuarioDTO;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class fmPesquisaView extends javax.swing.JFrame {

    public fmPesquisaView() {
        initComponents();
        pesquisarUsuarios();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbUsuario = new javax.swing.JTable();
        btnPesquisar = new javax.swing.JButton();
        voltarlogin = new javax.swing.JButton();
        txtEditId = new javax.swing.JTextField();
        txtEditNome = new javax.swing.JTextField();
        txtEditUsuario = new javax.swing.JTextField();
        btnEditcadastro = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnLimpar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Id", "Nome", "Usuário"
            }
        )
        {public boolean isCellEditable(int row, int column) {
            return false;
        };}
    );
    tbUsuario.setFocusable(false);
    tbUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            tbUsuarioMouseClicked(evt);
        }
    });
    jScrollPane1.setViewportView(tbUsuario);

    btnPesquisar.setText("Atualizar Tabela");
    btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnPesquisarActionPerformed(evt);
        }
    });

    voltarlogin.setText("Voltar");
    voltarlogin.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            voltarloginActionPerformed(evt);
        }
    });

    txtEditId.setEditable(false);

    btnEditcadastro.setText("Editar");
    btnEditcadastro.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnEditcadastroActionPerformed(evt);
        }
    });

    jLabel1.setText("Id");

    jLabel2.setText("Nome");

    jLabel3.setText("Usuário");

    btnLimpar.setText("Limpar");
    btnLimpar.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnLimparActionPerformed(evt);
        }
    });

    btnExcluir.setText("Excluir");
    btnExcluir.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnExcluirActionPerformed(evt);
        }
    });

    jLabel4.setText("@feito por Jackson Lima");

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtEditId)
                        .addComponent(txtEditNome)
                        .addComponent(txtEditUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)))
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel2))
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel3))
                .addGroup(layout.createSequentialGroup()
                    .addGap(33, 33, 33)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnEditcadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnLimpar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnExcluir)))))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(voltarlogin, javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap())
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(84, 84, 84))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(voltarlogin)
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtEditId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtEditNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel3)
                            .addGap(11, 11, 11)
                            .addComponent(txtEditUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnLimpar)
                                .addComponent(btnExcluir))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnEditcadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(27, 27, 27)
                    .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jLabel4))
            .addContainerGap(20, Short.MAX_VALUE))
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        pesquisarUsuarios();
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void voltarloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarloginActionPerformed
        fmLogin objfmLogin = new fmLogin();

        objfmLogin.setVisible(true);

        dispose();
    }//GEN-LAST:event_voltarloginActionPerformed

    private void tbUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbUsuarioMouseClicked
        setarUsuario();
    }//GEN-LAST:event_tbUsuarioMouseClicked

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed

        limparCampos();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnEditcadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditcadastroActionPerformed
        editarUsuario();
        pesquisarUsuarios();
        limparCampos();
    }//GEN-LAST:event_btnEditcadastroActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        excluirUsuario();
        pesquisarUsuarios();
        limparCampos();
    }//GEN-LAST:event_btnExcluirActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fmPesquisaView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditcadastro;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbUsuario;
    private javax.swing.JTextField txtEditId;
    private javax.swing.JTextField txtEditNome;
    private javax.swing.JTextField txtEditUsuario;
    private javax.swing.JButton voltarlogin;
    // End of variables declaration//GEN-END:variables

    private void pesquisarUsuarios() {

        try {

            PesquisarDAO objPesquisarDAO = new PesquisarDAO();

            DefaultTableModel model = (DefaultTableModel) tbUsuario.getModel();
            model.setNumRows(0);

            ArrayList<UsuarioDTO> lista = objPesquisarDAO.PesquisarUsuario();

            for (int conta = 0; conta < lista.size(); conta++) {
                model.addRow(new Object[]{
                    lista.get(conta).getId_usuario(),
                    lista.get(conta).getNome_usuario(),
                    lista.get(conta).getUsuario_usuario()

                });
            };

        } catch (Exception erro) {

            JOptionPane.showMessageDialog(null, "Falha ao pesquisar" + erro);

        };
    }

    private void setarUsuario() {

        int setar = tbUsuario.getSelectedRow();

        txtEditId.setText(tbUsuario.getModel().getValueAt(setar, 0).toString());
        txtEditNome.setText(tbUsuario.getModel().getValueAt(setar, 1).toString());
        txtEditUsuario.setText(tbUsuario.getModel().getValueAt(setar, 2).toString());

    }

    private void limparCampos() {

        txtEditId.setText("");
        txtEditNome.setText("");
        txtEditUsuario.setText("");
        txtEditId.requestFocus();

    }

    private void editarUsuario() {
        if (txtEditNome.getText().equals("") || txtEditUsuario.getText().equals("")) {

            JOptionPane.showMessageDialog(null, "Insira dados em Nome ou Usuario");

        } else {

            try {

                int id_usuario;
                String nome_usuario, usuario_usuario;

                id_usuario = Integer.parseInt(txtEditId.getText());
                nome_usuario = txtEditNome.getText();
                usuario_usuario = txtEditUsuario.getText();

                UsuarioDTO objUsuarioDTO = new UsuarioDTO();
                objUsuarioDTO.setId_usuario(id_usuario);
                objUsuarioDTO.setNome_usuario(nome_usuario);
                objUsuarioDTO.setUsuario_usuario(usuario_usuario);

                EditarDAO objeditardao = new EditarDAO();
                objeditardao.editarpessoa(objUsuarioDTO);

            } catch (Exception erro) {

                JOptionPane.showMessageDialog(null, "Falha ao Editar" + erro);

            }

        }

    }

    private void excluirUsuario() {

        int id_usuario;

        id_usuario = Integer.parseInt(txtEditId.getText());

        UsuarioDTO objusuarioDTO = new UsuarioDTO();
        objusuarioDTO.setId_usuario(id_usuario);

        ExcluirDAO objexcluirdao = new ExcluirDAO();
        objexcluirdao.excluirUsuario(objusuarioDTO);

    }

}

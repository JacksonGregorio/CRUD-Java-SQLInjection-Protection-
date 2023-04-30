package VIEW;

import DAO.CadastroDAO;
import DTO.UsuarioDTO;
import javax.swing.JOptionPane;

public class fmCadastroView extends javax.swing.JFrame {

    public fmCadastroView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtnomeCa = new javax.swing.JTextField();
        txtusuarioCa = new javax.swing.JTextField();
        txtnsenhaCa = new javax.swing.JTextField();
        txtidCa = new javax.swing.JTextField();
        btncadastrar = new javax.swing.JButton();
        voltarlogin = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nome");

        jLabel2.setText("Usuario");

        jLabel3.setText("Senha");

        jLabel4.setText("ID");

        txtusuarioCa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusuarioCaActionPerformed(evt);
            }
        });

        btncadastrar.setText("Cadastrar");
        btncadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncadastrarActionPerformed(evt);
            }
        });

        voltarlogin.setText("Voltar");
        voltarlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarloginActionPerformed(evt);
            }
        });

        jLabel5.setText("@feito por Jackson Lima");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(txtnomeCa)
                    .addComponent(txtusuarioCa)
                    .addComponent(txtnsenhaCa)
                    .addComponent(txtidCa, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(voltarlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
            .addGroup(layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(btncadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(voltarlogin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtnomeCa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtusuarioCa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(11, 11, 11)
                        .addComponent(txtnsenhaCa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtidCa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btncadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel5)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtusuarioCaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusuarioCaActionPerformed

    }//GEN-LAST:event_txtusuarioCaActionPerformed

    private void btncadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncadastrarActionPerformed

        if (txtnsenhaCa.getText().equals("") || txtnomeCa.getText().equals("") || txtidCa.getText().equals("") || txtusuarioCa.getText().equals("")) {

            JOptionPane.showMessageDialog(null, "Prencha Todos os Campos");

        } else {

            CadastrarUsuario();
            JOptionPane.showMessageDialog(null, "Cafastro Efetuado Com Sucesso");
        }

    }//GEN-LAST:event_btncadastrarActionPerformed

    private void voltarloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarloginActionPerformed

        fmLogin objfmLogin = new fmLogin();

        objfmLogin.setVisible(true);

        dispose();
    }//GEN-LAST:event_voltarloginActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fmCadastroView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncadastrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtidCa;
    private javax.swing.JTextField txtnomeCa;
    private javax.swing.JTextField txtnsenhaCa;
    private javax.swing.JTextField txtusuarioCa;
    private javax.swing.JButton voltarlogin;
    // End of variables declaration//GEN-END:variables

    private void CadastrarUsuario() {

        String nome_usuario, senha_usuario, usuario_usuario;
        int id_usuario = 0;

        nome_usuario = txtusuarioCa.getText();
        senha_usuario = txtnsenhaCa.getText();
        id_usuario = Integer.parseInt(txtidCa.getText());
        usuario_usuario = txtnomeCa.getText();

        UsuarioDTO objUsuariodto = new UsuarioDTO();
        objUsuariodto.setNome_usuario(nome_usuario);
        objUsuariodto.setSenha_usuario(senha_usuario);
        objUsuariodto.setId_usuario(id_usuario);
        objUsuariodto.setUsuario_usuario(usuario_usuario);

        CadastroDAO objCadastrodao = new CadastroDAO();
        objCadastrodao.cadastrarpessoa(objUsuariodto);

    }
}

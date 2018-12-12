
package View;




import Controler.BancoDeDadosControler;
import Controler.ProjetoControler;
import Model.Professor;
import Model.Projeto;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class projetoSelecionadoView extends javax.swing.JFrame {

	public projetoSelecionadoView(Projeto p) {

		initComponents();
		jLabel6.setVerticalAlignment(JLabel.BOTTOM);
		jLabel6.setText(p.getNome());
		jLabel7.setVerticalAlignment(JLabel.BOTTOM);
		jLabel7.setText(p.getProfessorResponsavel().getNome());
		String aux = " ";
		
		for (Professor a : p.getColaboradores()){
			aux += a.getNome()+ ", ";
		}
		jLabel10.setVerticalAlignment(JLabel.BOTTOM);
		jLabel10.setText(aux);
		jTextArea1.setEditable(false);
		jTextArea1.setLineWrap(true);
		jTextArea1.setWrapStyleWord(true);
		
		jTextArea1.setText(p.getResumo());
	}

	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jLabel1 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jLabel5 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		jLabel7 = new javax.swing.JLabel();
		jLabel9 = new javax.swing.JLabel();
		jLabel10 = new javax.swing.JLabel();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTextArea1 = new javax.swing.JTextArea();

	   // setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jLabel1.setText("Nome: ");

		jLabel3.setText("Professor Responsavél: ");

		jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
		jLabel4.setText("Dados do Projeto");

		jButton1.setText("Aceitar");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jButton2.setText("Recusar");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jLabel5.setText("Resumo:");

		jLabel9.setText("Colaboradores:");

		jTextArea1.setColumns(20);
		jTextArea1.setRows(5);
		jScrollPane1.setViewportView(jTextArea1);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
			layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(layout.createSequentialGroup()
				.addGap(25, 25, 25)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
					.addGroup(layout.createSequentialGroup()
						.addGap(1, 1, 1)
						.addComponent(jLabel1)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGroup(layout.createSequentialGroup()
						.addComponent(jLabel5)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jScrollPane1))
					.addGroup(layout.createSequentialGroup()
						.addComponent(jLabel3)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGroup(layout.createSequentialGroup()
						.addComponent(jLabel9)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
							.addGroup(layout.createSequentialGroup()
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jButton1)
								.addGap(80, 80, 80)
								.addComponent(jButton2)
								.addGap(211, 211, 211))
							.addGroup(layout.createSequentialGroup()
								.addGap(53, 53, 53)
								.addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(0, 19, Short.MAX_VALUE)))))
				.addContainerGap())
			.addGroup(layout.createSequentialGroup()
				.addGap(262, 262, 262)
				.addComponent(jLabel4)
				.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		layout.setVerticalGroup(
			layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(layout.createSequentialGroup()
				.addContainerGap()
				.addComponent(jLabel4)
				.addGap(17, 17, 17)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
					.addComponent(jLabel1)
					.addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
				.addGap(18, 18, 18)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
					.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
							.addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
							.addComponent(jLabel3))
						.addGap(18, 18, 18)
						.addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
					.addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
				.addGap(28, 28, 28)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
					.addComponent(jLabel5)
					.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
					.addComponent(jButton2)
					.addComponent(jButton1))
				.addGap(19, 19, 19))
		);

		pack();
	}// </editor-fold>//GEN-END:initComponents

	
	//Botao aceita projeto
	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
	   ProjetoControler p = ProjetoControler.getInstance();	  
	   BancoDeDadosControler bControler = new BancoDeDadosControler();
	   bControler.autorizaProjeto(jLabel6.getText());
	   p.buscaProjetosPendentes();
	   JOptionPane.showMessageDialog(this, "Projeto aceito com sucesso");
	   this.setVisible(false);
	  
	}//GEN-LAST:event_jButton1ActionPerformed
	
	
	//Botao recusa projeto
	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
		BancoDeDadosControler bControler = new BancoDeDadosControler();
		ProjetoControler p = ProjetoControler.getInstance();	  
		bControler.removeProjeto(jLabel6.getText());
		p.buscaProjetosPendentes();
		JOptionPane.showMessageDialog(this, "O Projeto não foi Aceito");
		this.setVisible(false);
	
	}//GEN-LAST:event_jButton2ActionPerformed

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTextArea jTextArea1;
	// End of variables declaration//GEN-END:variables
}

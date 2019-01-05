package work;


import java.awt.BorderLayout;
import java.awt.EventQueue;



import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.proteanit.sql.DbUtils;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JTabbedPane;
//import javafx.scene.control.ScrollBar;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.DefaultComboBoxModel;



public class Sklad extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sklad frame = new Sklad();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
Connection connection = null;
private JTable table_3;
private JTable table_4;
private JTable table_5;
private JTable table_6;
private JTable table_7;
private JTable table_8;
private JTable table_9;
private JTable table_1;
private JTextField textField_1;
private JTextField textField_2;
private JTextField textField_3;
private JTextField textField_4;
private JTextField textField_5;
private JTable table_2;
private JTextField textField;
private JTextField textField_6;
private JTextField textField_7;
private JTextField textField_8;
private JTextField textField_9;
private JTextField textField_10;
private JTextField textField_11;
private JTextField textField_12;
private JTextField textField_13;
private JTextField textField_14;
private JTextField textField_15;
private JTextField textField_16;
private JTextField textField_17;
private JTextField textField_18;
private JTextField textField_19;
private JTextField textField_20;
private JTextField textField_21;
private JTextField textField_22;
private JTextField textField_23;
private JTextField textField_24;
private JTextField textField_25;
private JTextField textField_26;
private JTextField textField_27;
private JTextField textField_28;
private JTextField textField_29;
private JTextField textField_30;
private JTextField textField_31;
private JTextField textField_32;
private JTextField textField_33;
private JTextField textField_34;
private JTextField textField_35;
private JTextField textField_36;
private JTextField textField_37;
private JTextField textField_38;
private JTextField textField_39;
private JTextField textField_40;
private JTextField textField_41;
private JTextField textField_42;
private JTextField textField_43;
private JTextField textField_44;
private JTextField textField_45;
private JTextField textField_46;
private JTextField textField_47;
private JTextField textField_48;
private JTextField textField_49;
private JTextField textField_50;
private JTextField textFieldid_s;
private JTextField textField_51;
private JTextField textField_52;
private JTextField textField_59;
private JTextField textField_53;
private JTextField textField_54;
private JTextField textField_55;
private JTextField textField_56;
private JTextField textField_57;
private JTextField textField_58;
private JTextField textField_60;
private JTextField textField_61;
private JTextField textFieldSearch;
private JComboBox comboBoxSelection;

public void refreshTable(){
	try{ 	
		String query="select * from sklad";
		PreparedStatement pst = connection.prepareStatement(query);
		ResultSet rs = pst.executeQuery();
		table.setModel(DbUtils.resultSetToTableModel(rs));
		pst.close();
		rs.close();
		
		//JOptionPane.showMessageDialog(null, null);
		
	
		
		
	}catch(Exception z){
		z.printStackTrace();
	}
	
}
//////////////////////////////
public void refreshTable1(){
	try{ 	
		String query="select * from zamdet";
		PreparedStatement pst = connection.prepareStatement(query);
		ResultSet rs = pst.executeQuery();
		table_1.setModel(DbUtils.resultSetToTableModel(rs));
		pst.close();
		rs.close();
		

		
		
	}catch(Exception z1){
		z1.printStackTrace();
	}
	
}
//////////////////////
public void refreshTable3(){
	try{ 	
		String query="select * from staticticprodajiv";
		PreparedStatement pst = connection.prepareStatement(query);
		ResultSet rs = pst.executeQuery();
		table_3.setModel(DbUtils.resultSetToTableModel(rs));
		pst.close();
		rs.close();
		
	;
		
		
	}catch(Exception z12){
		z12.printStackTrace();
	}
	
}
////////////////////////////
public void refreshTable4(){
	try{ 	
		String query="select * from postachalnikifirma";
		PreparedStatement pst = connection.prepareStatement(query);
		ResultSet rs = pst.executeQuery();
		table_4.setModel(DbUtils.resultSetToTableModel(rs));
		pst.close();
		rs.close();
		
	
		
		
	}catch(Exception z012){
		z012.printStackTrace();
	}
	
}
//////////////////////////////////////

public void refreshTable5(){
	try{ 	
		String query="select * from postachalnikidileri";
		PreparedStatement pst = connection.prepareStatement(query);
		ResultSet rs = pst.executeQuery();
		table_5.setModel(DbUtils.resultSetToTableModel(rs));
		pst.close();
		rs.close();
		
	
		
		
	}catch(Exception z0123){
		z0123.printStackTrace();
	}
	
}
///////////////////////////
public void refreshTable6(){
	try{ 	
		String query="select * from postachalnikinevelikivirobnitstva";
		PreparedStatement pst = connection.prepareStatement(query);
		ResultSet rs = pst.executeQuery();
		table_6.setModel(DbUtils.resultSetToTableModel(rs));
		pst.close();
		rs.close();
		
	
		
		
	}catch(Exception z01234){
		z01234.printStackTrace();
	}
	
}
///////////////////
public void refreshTable7(){
	try{ 	
		String query="select * from postachalnikidribni";
		PreparedStatement pst = connection.prepareStatement(query);
		ResultSet rs = pst.executeQuery();
		table_7.setModel(DbUtils.resultSetToTableModel(rs));
		pst.close();
		rs.close();
		
	
		
		
	}catch(Exception z012346){
		z012346.printStackTrace();
	}
	
}
///////////////////////////
public void refreshTable8(){
	try{ 	
		String query="select * from postachalnikimagazini";
		PreparedStatement pst = connection.prepareStatement(query);
		ResultSet rs = pst.executeQuery();
		table_8.setModel(DbUtils.resultSetToTableModel(rs));
		pst.close();
		rs.close();
		
	
		
		
	}catch(Exception z012345){
		z012345.printStackTrace();
	}
	
}
/////////////////
public void refreshTable2(){
	try{ 	
		String query="select * from brak";
		PreparedStatement pst = connection.prepareStatement(query);
		ResultSet rs = pst.executeQuery();
		table_2.setModel(DbUtils.resultSetToTableModel(rs));
		pst.close();
		rs.close();
		
	
		
		
	}catch(Exception z0123457){
		z0123457.printStackTrace();
	}
	
}
/////////////////////
public void refreshTable9(){
	try{ 	
		String query="select (username) from EmployeeInfo";
		PreparedStatement pst = connection.prepareStatement(query);
		ResultSet rs = pst.executeQuery();
		table_9.setModel(DbUtils.resultSetToTableModel(rs));
		pst.close();
		rs.close();
		
	
		
		
	}catch(Exception z0123458){
		z0123458.printStackTrace();
	}
	
}
//////////////////////




	/**
	 * Create the frame.
	 */
	public Sklad() {
		connection = Second2.dbConnector();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 842, 671);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 806, 399);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Склад", null, panel, null);
		panel.setLayout(null);
		
		JButton btnLoadTable = new JButton("Загрузити");
		btnLoadTable.setBounds(674, 5, 117, 44);
		panel.add(btnLoadTable);
		
		btnLoadTable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
					try{
						String query="select  * from Sklad";
						PreparedStatement pst = connection.prepareStatement(query);
						ResultSet rs=pst.executeQuery();
						table.setModel(DbUtils.resultSetToTableModel(rs));
						
					}catch(Exception e){
						e.printStackTrace();
					}
					
			}
		});
		
				
				
				JScrollPane scrollPane = new JScrollPane();
				scrollPane.setBounds(214, 61, 577, 294);
				panel.add(scrollPane);
				
				table = new JTable();
				scrollPane.setViewportView(table);
				
				JLabel label = new JLabel("\u041D\u0430\u0437\u0432\u0430 \u0442\u043E\u0432\u0430\u0440\u0443");
				label.setFont(new Font("Arial", Font.PLAIN, 15));
				label.setBounds(10, 53, 95, 32);
				panel.add(label);
				
				JLabel lblNewLabel = new JLabel("\u041A\u0456\u043B\u044C\u043A\u0456\u0441\u0442\u044C");
				lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 15));
				lblNewLabel.setBounds(10, 96, 76, 32);
				panel.add(lblNewLabel);
				
				JLabel lblNewLabel_1 = new JLabel("\u0426\u0456\u043D\u0430");
				lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 15));
				lblNewLabel_1.setBounds(10, 139, 60, 23);
				panel.add(lblNewLabel_1);
				
				JLabel label_1 = new JLabel("\u0427\u0430\u0441 \u043D\u0430 \u0441\u043A\u043B\u0430\u0434\u0456");
				label_1.setFont(new Font("Arial", Font.PLAIN, 15));
				label_1.setBounds(10, 173, 95, 17);
				panel.add(label_1);
				
				textField_1 = new JTextField();
				textField_1.setBounds(118, 59, 86, 20);
				panel.add(textField_1);
				textField_1.setColumns(100);
				
				textField_2 = new JTextField();
				textField_2.setBounds(117, 102, 86, 20);
				panel.add(textField_2);
				textField_2.setColumns(100);
				
				textField_3 = new JTextField();
				textField_3.setBounds(117, 136, 86, 20);
				panel.add(textField_3);
				textField_3.setColumns(100);
				
				textField_4 = new JTextField();
				textField_4.setBounds(118, 170, 86, 20);
				panel.add(textField_4);
				textField_4.setColumns(100);
				
				textField_5 = new JTextField();
				textField_5.setBounds(117, 200, 86, 20);
				panel.add(textField_5);
				textField_5.setColumns(100);
				
				JButton AddButton = new JButton("\u0414\u043E\u0434\u0430\u0442\u0438");
				AddButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						try{
							String query="insert into sklad (id_s,nazvatovar,kilkist,price,chasnaskladi,ukogokuplyali ) values (?,?,?,?,?,?)";
							PreparedStatement pst = connection.prepareStatement(query); 
							pst.setString(1, textFieldid_s.getText());
							pst.setString(2, textField_1.getText());
							pst.setString(3, textField_2.getText());
							pst.setString(4, textField_3.getText());
							pst.setString(5, textField_4.getText());
							pst.setString(6, textField_5.getText());
							
							
							pst.execute();
							
							JOptionPane.showMessageDialog(null, "Дані додано");
							
							pst.close();
							
							
						}catch(Exception e){
							e.printStackTrace();
						}
						refreshTable();
					

					}
				});
				AddButton.setBounds(35, 225, 131, 32);
				panel.add(AddButton);
				
				JButton button_9 = new JButton("\u0412\u0438\u043F\u0440\u0430\u0432\u0438\u0442\u0438");
				button_9.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						
						try{ 	
							String query="Update sklad set id_s ='" +  textFieldid_s.getText() +"',nazvatovar ='"+ textField_1.getText() +"',kilkist ='" + textField_2.getText() +"',price ='" + textField_3.getText() +"',chasnaskladi ='" + textField_4.getText() +"',ukogokuplyali ='" + textField_5.getText() +"' where id_s ='"+  textFieldid_s.getText() +"' ";
							PreparedStatement pst = connection.prepareStatement(query);
							
							pst.execute();
							
							JOptionPane.showMessageDialog(null, "Дані оновлено");
							
							pst.close();
							
							
						}catch(Exception q){
							q.printStackTrace();
						}
						refreshTable();
					}
				});
				button_9.setBounds(35, 262, 131, 32);
				panel.add(button_9);
				
				JLabel label_46 = new JLabel("id_\u0441\u043A\u043B\u0430\u0434");
				label_46.setFont(new Font("Arial", Font.PLAIN, 15));
				label_46.setBounds(10, 10, 95, 32);
				panel.add(label_46);
				
				textFieldid_s = new JTextField();
				textFieldid_s.setColumns(10);
				textFieldid_s.setBounds(115, 17, 89, 20);
				panel.add(textFieldid_s);
				
				JButton button_19 = new JButton("\u0412\u0438\u0434\u0430\u043B\u0438\u0442\u0438");
				button_19.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						try{ 	
							String query="delete from sklad  where id_s ='"+  textFieldid_s.getText() +"' ";
							PreparedStatement pst = connection.prepareStatement(query);
							
							pst.execute();
							
							JOptionPane.showMessageDialog(null, "Дані видалено");
							
							pst.close();
							
							
						}catch(Exception ex){
							ex.printStackTrace();
						}
						refreshTable();
					}
				});
				
				button_19.setBounds(35, 301, 131, 32);
				panel.add(button_19);
				
				textFieldSearch = new JTextField();
				textFieldSearch.addKeyListener(new KeyAdapter() {
					@Override
					public void keyReleased(KeyEvent arg0) {
						try{
						String selection = (String) comboBoxSelection.getSelectedItem();
						String query = "select * from sklad where "+selection+"=?";
						
						System.out.println(query);
						
						PreparedStatement pst = connection.prepareStatement(query);
						pst.setString(1, textFieldSearch.getText());
						ResultSet rs = pst.executeQuery();
						
						table.setModel(DbUtils.resultSetToTableModel(rs));
						pst.close();
						
						}catch(Exception ex) {
							
							ex.printStackTrace();
						}
						
						
					}
				});
				textFieldSearch.setBounds(462, 11, 202, 32);
				panel.add(textFieldSearch);
				textFieldSearch.setColumns(10);
				
				 comboBoxSelection = new JComboBox();
				comboBoxSelection.setModel(new DefaultComboBoxModel(new String[] {"nazvatovar", "kilkist", "price", "ukogokuplyali"}));
				comboBoxSelection.setBounds(285, 11, 136, 32);
				panel.add(comboBoxSelection);
	

		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Замовлення деталей", null, panel_2, null);
		panel_2.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("Загрузити");
		btnNewButton_1.setBounds(492, 11, 117, 44);
		panel_2.add(btnNewButton_1);
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
					try{
						String query="select  * from Zamdet";
						PreparedStatement pst = connection.prepareStatement(query);
						ResultSet rs=pst.executeQuery();
						table_1.setModel(DbUtils.resultSetToTableModel(rs));
						
					}catch(Exception e){
						e.printStackTrace();
					}
					
			}
		});

		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(214, 61, 577, 294);
		panel_2.add(scrollPane_1);
		
		table_1 = new JTable();
		scrollPane_1.setViewportView(table_1);
		
		JLabel label_3 = new JLabel("\u041D\u0430\u0437\u0432\u0430 \u0442\u043E\u0432\u0430\u0440\u0443");
		label_3.setFont(new Font("Arial", Font.PLAIN, 15));
		label_3.setBounds(10, 52, 95, 32);
		panel_2.add(label_3);
		
		JLabel label_4 = new JLabel("\u041A\u0456\u043B\u044C\u043A\u0456\u0441\u0442\u044C");
		label_4.setFont(new Font("Arial", Font.PLAIN, 15));
		label_4.setBounds(10, 80, 76, 32);
		panel_2.add(label_4);
		
		JLabel label_5 = new JLabel("\u0426\u0456\u043D\u0430");
		label_5.setFont(new Font("Arial", Font.PLAIN, 15));
		label_5.setBounds(10, 111, 60, 23);
		panel_2.add(label_5);
		
		JLabel lblNewLabel_2 = new JLabel("\u0427\u0430\u0441 \u0437\u0430\u043C\u043E\u0432\u043B\u0435\u043D\u043D\u044F");
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(10, 133, 110, 32);
		panel_2.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(118, 59, 86, 20);
		panel_2.add(textField);
		textField.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(118, 87, 86, 20);
		panel_2.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(118, 113, 86, 20);
		panel_2.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(130, 140, 74, 20);
		panel_2.add(textField_8);
		textField_8.setColumns(10);
		
		JButton button = new JButton("\u0414\u043E\u0434\u0430\u0442\u0438");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{ 	
					String query="insert into zamdet (id_z,nazvatovar,kilkist,price,chaszamovlenya,id_s ) values (?,?,?,?,?,?)";
					PreparedStatement pst = connection.prepareStatement(query); 
					pst.setString(1, textField_53.getText());
					pst.setString(2, textField.getText());
					pst.setString(3, textField_6.getText());
					pst.setString(4, textField_7.getText());
					pst.setString(5, textField_8.getText());
					pst.setString(6, textField_51.getText()); 
				
					
					pst.execute();
					
					JOptionPane.showMessageDialog(null, "Дані додано");
					
					pst.close();
					
					
				}catch(Exception b){
					b.printStackTrace();
				}
				
				refreshTable1();

			}
		});
		
		button.setBounds(45, 205, 131, 32);
		panel_2.add(button);
		
		JButton button_10 = new JButton("\u0412\u0438\u043F\u0440\u0430\u0432\u0438\u0442\u0438");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try{ 	
					String query="Update zamdet set id_z ='"+ textField_53.getText() +"',nazvatovar ='"+ textField.getText() +"',kilkist ='" + textField_6.getText() +"',price ='" + textField_7.getText() +"',chaszamovlenya ='" + textField_8.getText() +"',id_s ='" + textField_51.getText() +"' where id_z ='"+  textField_53.getText() +"' ";
					PreparedStatement pst = connection.prepareStatement(query);
					
					pst.execute();
					
					JOptionPane.showMessageDialog(null, "Дані оновлено");
					
					pst.close();
					
					
				}catch(Exception w){
					w.printStackTrace();
				}
				
				refreshTable1();
			}
		});
		button_10.setBounds(45, 248, 131, 32);
		panel_2.add(button_10);
		
		JLabel label_47 = new JLabel("id_\u0441\u043A\u043B\u0430\u0434");
		label_47.setFont(new Font("Arial", Font.PLAIN, 15));
		label_47.setBounds(10, 162, 95, 32);
		panel_2.add(label_47);
		
		textField_51 = new JTextField();
		textField_51.setColumns(10);
		textField_51.setBounds(118, 171, 89, 20);
		panel_2.add(textField_51);
		
		JLabel label_49 = new JLabel("id_\u0441\u043A\u043B\u0430\u0434");
		label_49.setFont(new Font("Arial", Font.PLAIN, 15));
		label_49.setBounds(10, 16, 95, 32);
		panel_2.add(label_49);
		
		textField_53 = new JTextField();
		textField_53.setColumns(10);
		textField_53.setBounds(118, 23, 89, 20);
		panel_2.add(textField_53);
		
		JButton button_20 = new JButton("\u0412\u0438\u0434\u0430\u043B\u0438\u0442\u0438");
		button_20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				try{ 	
					String query="delete from zamdet  where id_z ='"+  textField_53.getText() +"' ";
					PreparedStatement pst = connection.prepareStatement(query);
					
					pst.execute();
					
					JOptionPane.showMessageDialog(null, "Дані видалено");
					
					pst.close();
					
					
				}catch(Exception ex){
					ex.printStackTrace();
				}
				refreshTable1();
			}
		});
		button_20.setBounds(45, 291, 131, 32);
		panel_2.add(button_20);
		
		
		
		
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Статистика продажів", null, panel_3, null);
		panel_3.setLayout(null);
		
		JButton btnNewButton_2 = new JButton("Загрузити");
		btnNewButton_2.setBounds(492, 11, 117, 44);
		panel_3.add(btnNewButton_2);
		
		
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
					try{
						String query="select  * from staticticprodajiv";
						PreparedStatement pst = connection.prepareStatement(query);
						ResultSet rs=pst.executeQuery();
						table_3.setModel(DbUtils.resultSetToTableModel(rs));
						
					}catch(Exception e){
						e.printStackTrace();
					}
					
			}
		});
		
				
				JScrollPane scrollPane_4 = new JScrollPane();
				scrollPane_4.setBounds(214, 61, 577, 294);
				panel_3.add(scrollPane_4);
				
				table_3 = new JTable();
				scrollPane_4.setViewportView(table_3);
				
				JLabel label_6 = new JLabel("\u041D\u0430\u0437\u0432\u0430 \u0442\u043E\u0432\u0430\u0440\u0443");
				label_6.setFont(new Font("Arial", Font.PLAIN, 15));
				label_6.setBounds(7, 36, 95, 32);
				panel_3.add(label_6);
				
				JLabel label_7 = new JLabel("\u041A\u0456\u043B\u044C\u043A\u0456\u0441\u0442\u044C");
				label_7.setFont(new Font("Arial", Font.PLAIN, 15));
				label_7.setBounds(7, 66, 76, 32);
				panel_3.add(label_7);
				
				JLabel label_8 = new JLabel("\u0426\u0456\u043D\u0430");
				label_8.setFont(new Font("Arial", Font.PLAIN, 15));
				label_8.setBounds(7, 101, 60, 23);
				panel_3.add(label_8);
				
				JLabel label_9 = new JLabel("\u0427\u0430\u0441 \u043F\u043E\u043A\u0443\u043F\u043A\u0438");
				label_9.setFont(new Font("Arial", Font.PLAIN, 15));
				label_9.setBounds(7, 135, 95, 23);
				panel_3.add(label_9);
				
				JLabel label_10 = new JLabel("\u0423 \u043A\u043E\u0433\u043E \u043A\u0443\u043F\u043B\u044F\u043B\u0438");
				label_10.setFont(new Font("Arial", Font.PLAIN, 15));
				label_10.setBounds(7, 169, 108, 23);
				panel_3.add(label_10);
				
				textField_9 = new JTextField();
				textField_9.setBounds(112, 48, 86, 20);
				panel_3.add(textField_9);
				textField_9.setColumns(10);
				
				textField_10 = new JTextField();
				textField_10.setBounds(112, 73, 86, 20);
				panel_3.add(textField_10);
				textField_10.setColumns(10);
				
				textField_11 = new JTextField();
				textField_11.setBounds(112, 103, 86, 20);
				panel_3.add(textField_11);
				textField_11.setColumns(10);
				
				textField_12 = new JTextField();
				textField_12.setBounds(112, 137, 86, 20);
				panel_3.add(textField_12);
				textField_12.setColumns(10);
				
				textField_13 = new JTextField();
				textField_13.setBounds(115, 171, 86, 20);
				panel_3.add(textField_13);
				textField_13.setColumns(10);
				
				JButton button_1 = new JButton("\u0414\u043E\u0434\u0430\u0442\u0438");
				button_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						try{ 	
							String query="insert into staticticprodajiv (id_st,nazvatovar,kilkistdet,price,chaspokypki, ukogokuplyali, id_s ) values (?,?,?,?,?,?,?)";
							PreparedStatement pst = connection.prepareStatement(query); 
							pst.setString(1, textField_54.getText());
							pst.setString(2, textField_9.getText());
							pst.setString(3, textField_10.getText());
							pst.setString(4, textField_11.getText());
							pst.setString(5, textField_12.getText());
							pst.setString(6, textField_13.getText());
							pst.setString(7, textField_52.getText());
							
							pst.execute();
							
							JOptionPane.showMessageDialog(null, "Дані додано");
							
							pst.close();
							
							
						}catch(Exception c){
							c.printStackTrace();
						}
						
						refreshTable3();

					}
				});
				
						
				
				button_1.setBounds(33, 234, 131, 32);
				panel_3.add(button_1);
				
				JButton button_11 = new JButton("\u0412\u0438\u043F\u0440\u0430\u0432\u0438\u0442\u0438");
				button_11.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {

						try{ 	
							String query="Update staticticprodajiv set id_st ='"+ textField_54.getText() +"',nazvatovar ='"+ textField_9.getText() +"',kilkistdet ='" + textField_10.getText() +"',price ='" + textField_11.getText() +"',chaspokypki ='" + textField_12.getText() +"',ukogokuplyali ='"+ textField_13.getText() +"',id_s ='" + textField_52.getText() +"' where id_st ='"+  textField_54.getText() +"' ";
							PreparedStatement pst = connection.prepareStatement(query);
							
							pst.execute();
							
							JOptionPane.showMessageDialog(null, "Дані оновлено");
							
							pst.close();
							
							
						}catch(Exception w){
							w.printStackTrace();
						}
						refreshTable3();
					}
				});
				button_11.setBounds(33, 272, 131, 32);
				panel_3.add(button_11);
				
				JLabel label_48 = new JLabel("id_\u0441\u043A\u043B\u0430\u0434");
				label_48.setFont(new Font("Arial", Font.PLAIN, 15));
				label_48.setBounds(7, 191, 95, 32);
				panel_3.add(label_48);
				
				textField_52 = new JTextField();
				textField_52.setColumns(10);
				textField_52.setBounds(112, 203, 89, 20);
				panel_3.add(textField_52);
				
				JLabel label_50 = new JLabel("id_\u0441\u043A\u043B\u0430\u0434");
				label_50.setFont(new Font("Arial", Font.PLAIN, 15));
				label_50.setBounds(7, 11, 95, 32);
				panel_3.add(label_50);
				
				textField_54 = new JTextField();
				textField_54.setColumns(10);
				textField_54.setBounds(112, 18, 89, 20);
				panel_3.add(textField_54);
				
				JButton button_21 = new JButton("\u0412\u0438\u0434\u0430\u043B\u0438\u0442\u0438");
				button_21.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						
						try{ 	
							String query="delete from staticticprodajiv  where id_st ='"+  textField_54.getText() +"' ";
							PreparedStatement pst = connection.prepareStatement(query);
							
							pst.execute();
							
							JOptionPane.showMessageDialog(null, "Дані видалено");
							
							pst.close();
							
							
						}catch(Exception ex){
							ex.printStackTrace();
						}
						refreshTable3();
					}
				});
				button_21.setBounds(33, 312, 131, 32);
				panel_3.add(button_21);
		
		
		
		
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("Фірми постачальники", null, panel_4, null);
		panel_4.setLayout(null);
		
		JButton btnNewButton_3 = new JButton("Загрузити");
		btnNewButton_3.setBounds(492, 11, 117, 44);
		panel_4.add(btnNewButton_3);
		
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
					try{
						String query="select  * from postachalnikifirma";
						PreparedStatement pst = connection.prepareStatement(query);
						ResultSet rs=pst.executeQuery();
						table_4.setModel(DbUtils.resultSetToTableModel(rs));
						
					}catch(Exception e){
						e.printStackTrace();
					}
					
			}
		});

		
		JScrollPane scrollPane_5 = new JScrollPane();
		scrollPane_5.setBounds(214, 61, 577, 294);
		panel_4.add(scrollPane_5);
		
		table_4 = new JTable();
		scrollPane_5.setViewportView(table_4);
		
		JLabel label_15 = new JLabel("\u041D\u0430\u0437\u0432\u0430 \u0444\u0456\u0440\u043C\u0438");
		label_15.setFont(new Font("Arial", Font.PLAIN, 15));
		label_15.setBounds(10, 34, 95, 32);
		panel_4.add(label_15);
		
		JLabel label_16 = new JLabel("\u041D\u0430\u0437\u0432\u0430 \u0442\u043E\u0432\u0430\u0440\u0443");
		label_16.setFont(new Font("Arial", Font.PLAIN, 15));
		label_16.setBounds(10, 70, 95, 32);
		panel_4.add(label_16);
		
		JLabel label_17 = new JLabel("\u041A\u0456\u043B\u044C\u043A\u0456\u0441\u0442\u044C \u0434\u0435\u0442\u0430\u043B\u0435\u0439");
		label_17.setFont(new Font("Arial", Font.PLAIN, 15));
		label_17.setBounds(10, 105, 121, 32);
		panel_4.add(label_17);
		
		JLabel label_18 = new JLabel("\u0426\u0456\u043D\u0430");
		label_18.setFont(new Font("Arial", Font.PLAIN, 15));
		label_18.setBounds(10, 139, 95, 32);
		panel_4.add(label_18);
		
		JLabel label_19 = new JLabel("\u0427\u0430\u0441 \u043F\u043E\u043A\u0443\u043F\u043A\u0438");
		label_19.setFont(new Font("Arial", Font.PLAIN, 15));
		label_19.setBounds(10, 172, 95, 32);
		panel_4.add(label_19);
		
		JLabel lblId_1 = new JLabel("id_\u0441\u043A\u043B\u0430\u0434");
		lblId_1.setFont(new Font("Arial", Font.PLAIN, 15));
		lblId_1.setBounds(10, 206, 95, 32);
		panel_4.add(lblId_1);
		
		textField_19 = new JTextField();
		textField_19.setBounds(115, 46, 89, 20);
		panel_4.add(textField_19);
		textField_19.setColumns(10);
		
		textField_20 = new JTextField();
		textField_20.setBounds(115, 82, 89, 20);
		panel_4.add(textField_20);
		textField_20.setColumns(10);
		
		textField_21 = new JTextField();
		textField_21.setBounds(141, 112, 63, 20);
		panel_4.add(textField_21);
		textField_21.setColumns(10);
		
		textField_22 = new JTextField();
		textField_22.setBounds(118, 146, 86, 20);
		panel_4.add(textField_22);
		textField_22.setColumns(10);
		
		textField_23 = new JTextField();
		textField_23.setBounds(115, 179, 86, 20);
		panel_4.add(textField_23);
		textField_23.setColumns(10);
		
		textField_24 = new JTextField();
		textField_24.setBounds(115, 213, 86, 20);
		panel_4.add(textField_24);
		textField_24.setColumns(10);
		
		JButton button_3 = new JButton("\u0414\u043E\u0434\u0430\u0442\u0438");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try{ 	
					String query="insert into postachalnikifirma (id_f,firmanazva,nazvatovar,kilkistdet,pokupkunasumu, chaspokypki, id_s ) values (?,?,?,?,?,?,?)";
					PreparedStatement pst = connection.prepareStatement(query);
					pst.setString(1, textField_60.getText());
					pst.setString(2, textField_19.getText());
					pst.setString(3, textField_20.getText());
					pst.setString(4, textField_21.getText());
					pst.setString(5, textField_22.getText());
					pst.setString(6, textField_23.getText());
					pst.setString(7, textField_24.getText());
					
					pst.execute();
					
					JOptionPane.showMessageDialog(null, "Дані додано");
					
					pst.close();
					
					
				}catch(Exception f){
					f.printStackTrace();
				}
				refreshTable4();
			

		
			}
		});
		button_3.setBounds(35, 236, 131, 32);
		panel_4.add(button_3);
		
		JButton button_12 = new JButton("\u0412\u0438\u043F\u0440\u0430\u0432\u0438\u0442\u0438");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				try{ 	
					String query="Update postachalnikifirma set id_f ='"+ textField_60.getText() +"',firmanazva ='"+ textField_19.getText() +"',nazvatovar ='" + textField_20.getText() +"',kilkistdet ='" + textField_21.getText() +"',pokupkunasumu ='" + textField_22.getText() +"', chaspokypki ='"+ textField_23.getText() +"',id_s ='" + textField_24.getText() +"' where id_f ='"+  textField_60.getText() +"' ";
					PreparedStatement pst = connection.prepareStatement(query);
					
					pst.execute();
					
					JOptionPane.showMessageDialog(null, "Дані оновлено");
					
					pst.close();
					
					
				}catch(Exception w){
					w.printStackTrace();
				}
				refreshTable4();
			}
		});
		button_12.setBounds(35, 279, 131, 32);
		panel_4.add(button_12);
		
		textField_60 = new JTextField();
		textField_60.setColumns(10);
		textField_60.setBounds(115, 18, 89, 20);
		panel_4.add(textField_60);
		
		JLabel label_55 = new JLabel("id_\u0441\u043A\u043B\u0430\u0434");
		label_55.setFont(new Font("Arial", Font.PLAIN, 15));
		label_55.setBounds(10, 11, 95, 32);
		panel_4.add(label_55);
		
		JButton button_22 = new JButton("\u0412\u0438\u0434\u0430\u043B\u0438\u0442\u0438");
		button_22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{ 	
					String query="delete from postachalnikifirma  where id_f ='"+  textField_60.getText() +"' ";
					PreparedStatement pst = connection.prepareStatement(query);
					
					pst.execute();
					
					JOptionPane.showMessageDialog(null, "Дані видалено");
					
					pst.close();
					
					
				}catch(Exception ex){
					ex.printStackTrace();
				}
				
				refreshTable4();
				
			}
		});
		button_22.setBounds(35, 323, 131, 32);
		panel_4.add(button_22);
		
		
		
		
		
		JPanel panel_5 = new JPanel();
		tabbedPane.addTab("Постачальники дилери", null, panel_5, null);
		panel_5.setLayout(null);
		
		JButton btnNewButton_4 = new JButton("Загрузити");
		btnNewButton_4.setBounds(492, 11, 117, 44);
		panel_5.add(btnNewButton_4);
		
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
					try{
						String query="select  * from postachalnikidileri";
						PreparedStatement pst = connection.prepareStatement(query);
						ResultSet rs=pst.executeQuery();
						table_5.setModel(DbUtils.resultSetToTableModel(rs));
						
					}catch(Exception e){
						e.printStackTrace();
					}
					
			}
		});

		
		JScrollPane scrollPane_6 = new JScrollPane();
		scrollPane_6.setBounds(211, 72, 580, 283);
		panel_5.add(scrollPane_6);
		
		table_5 = new JTable();
		scrollPane_6.setViewportView(table_5);
		
		JLabel label_20 = new JLabel("\u041F\u043E\u0441\u0442\u0430\u0447\u0430\u043B\u044C\u043D\u0438\u043A \u0434\u0438\u043B\u0435\u0440");
		label_20.setFont(new Font("Arial", Font.PLAIN, 15));
		label_20.setBounds(10, 35, 141, 32);
		panel_5.add(label_20);
		
		JLabel label_21 = new JLabel("\u041D\u0430\u0437\u0432\u0430 \u0442\u043E\u0432\u0430\u0440\u0443");
		label_21.setFont(new Font("Arial", Font.PLAIN, 15));
		label_21.setBounds(10, 60, 95, 32);
		panel_5.add(label_21);
		
		JLabel label_22 = new JLabel("\u041A\u0456\u043B\u044C\u043A\u0456\u0441\u0442\u044C \u0434\u0435\u0442\u0430\u043B\u0435\u0439");
		label_22.setFont(new Font("Arial", Font.PLAIN, 15));
		label_22.setBounds(10, 95, 121, 32);
		panel_5.add(label_22);
		
		JLabel label_23 = new JLabel("\u0426\u0456\u043D\u0430");
		label_23.setFont(new Font("Arial", Font.PLAIN, 15));
		label_23.setBounds(10, 129, 95, 32);
		panel_5.add(label_23);
		
		JLabel label_24 = new JLabel("\u0427\u0430\u0441 \u043F\u043E\u043A\u0443\u043F\u043A\u0438");
		label_24.setFont(new Font("Arial", Font.PLAIN, 15));
		label_24.setBounds(10, 162, 95, 32);
		panel_5.add(label_24);
		
		JLabel label_25 = new JLabel("id_\u0441\u043A\u043B\u0430\u0434");
		label_25.setFont(new Font("Arial", Font.PLAIN, 15));
		label_25.setBounds(10, 196, 95, 32);
		panel_5.add(label_25);
		
		textField_25 = new JTextField();
		textField_25.setColumns(10);
		textField_25.setBounds(161, 47, 86, 20);
		panel_5.add(textField_25);
		
		textField_26 = new JTextField();
		textField_26.setColumns(10);
		textField_26.setBounds(115, 72, 86, 20);
		panel_5.add(textField_26);
		
		textField_27 = new JTextField();
		textField_27.setColumns(10);
		textField_27.setBounds(141, 102, 63, 20);
		panel_5.add(textField_27);
		
		textField_28 = new JTextField();
		textField_28.setColumns(10);
		textField_28.setBounds(115, 136, 89, 20);
		panel_5.add(textField_28);
		
		textField_29 = new JTextField();
		textField_29.setColumns(10);
		textField_29.setBounds(115, 169, 89, 20);
		panel_5.add(textField_29);
		
		textField_30 = new JTextField();
		textField_30.setColumns(10);
		textField_30.setBounds(115, 203, 89, 20);
		panel_5.add(textField_30);
		
		JButton button_4 = new JButton("\u0414\u043E\u0434\u0430\u0442\u0438");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try{ 	
					String query="insert into postachalnikidileri (id_d,dilerinazva,nazvatovar,kilkistdet,pokupkunasumu, chaspokypki,id_s ) values (?,?,?,?,?,?,?)";
					PreparedStatement pst = connection.prepareStatement(query);  
					pst.setString(1, textField_58.getText());
					pst.setString(2, textField_25.getText());
					pst.setString(3, textField_26.getText());
					pst.setString(4, textField_27.getText());
					pst.setString(5, textField_28.getText());
					pst.setString(6, textField_29.getText());
					pst.setString(7, textField_30.getText());
					
					pst.execute();
					
					JOptionPane.showMessageDialog(null, "Дані додано");
					
					pst.close();
					
					
				}catch(Exception g){
					g.printStackTrace();
				}
				refreshTable5();
			
			}
		});
		button_4.setBounds(38, 228, 131, 32);
		panel_5.add(button_4);
		
		JButton button_13 = new JButton("\u0412\u0438\u043F\u0440\u0430\u0432\u0438\u0442\u0438");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try{ 	
					String query="Update postachalnikidileri set id_d ='"+ textField_58.getText() +"',dilerinazva ='"+ textField_25.getText() +"',nazvatovar ='" + textField_26.getText() +"',kilkistdet ='" + textField_27.getText() +"',pokupkunasumu ='" + textField_28.getText() +"',chaspokypki ='"+ textField_29.getText() +"',id_s ='" + textField_30.getText() +"' where id_d ='"+  textField_58.getText() +"' ";
					PreparedStatement pst = connection.prepareStatement(query);
					
					pst.execute();
					
					JOptionPane.showMessageDialog(null, "Дані оновлено");
					
					pst.close();
					
					
				}catch(Exception w){
					w.printStackTrace();
				}
				refreshTable5();
			}
		});
		button_13.setBounds(38, 274, 131, 32);
		panel_5.add(button_13);
		
		textField_58 = new JTextField();
		textField_58.setColumns(10);
		textField_58.setBounds(115, 15, 89, 20);
		panel_5.add(textField_58);
		
		JLabel label_54 = new JLabel("id_\u0441\u043A\u043B\u0430\u0434");
		label_54.setFont(new Font("Arial", Font.PLAIN, 15));
		label_54.setBounds(10, 8, 95, 32);
		panel_5.add(label_54);
		
		JButton button_23 = new JButton("\u0412\u0438\u0434\u0430\u043B\u0438\u0442\u0438");
		button_23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try{ 	
					String query="delete from postachalnikidileri  where id_d ='"+  textField_58.getText() +"' ";
					PreparedStatement pst = connection.prepareStatement(query);
					
					pst.execute();
					
					JOptionPane.showMessageDialog(null, "Дані видалено");
					
					pst.close();
					
					
				}catch(Exception ex){
					ex.printStackTrace();
				}
				refreshTable5();
		
			}
		});
		button_23.setBounds(38, 312, 131, 32);
		panel_5.add(button_23);
		
		
		
		
		
		
		JPanel panel_6 = new JPanel();
		tabbedPane.addTab("Постачальники невеликі виробництва", null, panel_6, null);
		panel_6.setLayout(null);
		
		JButton btnNewButton_5 = new JButton("Загрузити");
		btnNewButton_5.setBounds(492, 11, 117, 44);
		panel_6.add(btnNewButton_5);
		
		
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
					try{
						String query="select  * from postachalnikinevelikivirobnitstva";
						PreparedStatement pst = connection.prepareStatement(query);
						ResultSet rs=pst.executeQuery();
						table_6.setModel(DbUtils.resultSetToTableModel(rs));
						
					}catch(Exception e){
						e.printStackTrace();
					}
					
			}
		});
		
				
				
				JScrollPane scrollPane_7 = new JScrollPane();
				scrollPane_7.setBounds(217, 71, 574, 284);
				panel_6.add(scrollPane_7);
				
				table_6 = new JTable();
				scrollPane_7.setViewportView(table_6);
				
				textField_31 = new JTextField();
				textField_31.setColumns(10);
				textField_31.setBounds(170, 43, 95, 20);
				panel_6.add(textField_31);
				
				JLabel label_26 = new JLabel("\u041D\u0435\u0432\u0435\u043B\u0438\u043A\u0456 \u0432\u0438\u0440\u043E\u0431\u043D\u0438\u0446\u0442\u0432\u0430");
				label_26.setFont(new Font("Arial", Font.PLAIN, 15));
				label_26.setBounds(7, 36, 153, 32);
				panel_6.add(label_26);
				
				JLabel label_27 = new JLabel("\u041D\u0430\u0437\u0432\u0430 \u0442\u043E\u0432\u0430\u0440\u0443");
				label_27.setFont(new Font("Arial", Font.PLAIN, 15));
				label_27.setBounds(7, 62, 95, 32);
				panel_6.add(label_27);
				
				textField_32 = new JTextField();
				textField_32.setColumns(10);
				textField_32.setBounds(112, 69, 86, 20);
				panel_6.add(textField_32);
				
				textField_33 = new JTextField();
				textField_33.setColumns(10);
				textField_33.setBounds(144, 100, 63, 20);
				panel_6.add(textField_33);
				
				JLabel label_28 = new JLabel("\u041A\u0456\u043B\u044C\u043A\u0456\u0441\u0442\u044C \u0434\u0435\u0442\u0430\u043B\u0435\u0439");
				label_28.setFont(new Font("Arial", Font.PLAIN, 15));
				label_28.setBounds(7, 98, 121, 32);
				panel_6.add(label_28);
				
				JLabel label_29 = new JLabel("\u0426\u0456\u043D\u0430");
				label_29.setFont(new Font("Arial", Font.PLAIN, 15));
				label_29.setBounds(7, 124, 95, 32);
				panel_6.add(label_29);
				
				textField_34 = new JTextField();
				textField_34.setColumns(10);
				textField_34.setBounds(112, 131, 89, 20);
				panel_6.add(textField_34);
				
				textField_35 = new JTextField();
				textField_35.setColumns(10);
				textField_35.setBounds(112, 158, 89, 20);
				panel_6.add(textField_35);
				
				JLabel label_30 = new JLabel("\u0427\u0430\u0441 \u043F\u043E\u043A\u0443\u043F\u043A\u0438");
				label_30.setFont(new Font("Arial", Font.PLAIN, 15));
				label_30.setBounds(7, 151, 95, 32);
				panel_6.add(label_30);
				
				JLabel label_31 = new JLabel("id_\u0441\u043A\u043B\u0430\u0434");
				label_31.setFont(new Font("Arial", Font.PLAIN, 15));
				label_31.setBounds(7, 182, 95, 32);
				panel_6.add(label_31);
				
				textField_36 = new JTextField();
				textField_36.setColumns(10);
				textField_36.setBounds(112, 189, 89, 20);
				panel_6.add(textField_36);
				
				JButton button_5 = new JButton("\u0414\u043E\u0434\u0430\u0442\u0438");
				button_5.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						try{ 	
							String query="insert into postachalnikinevelikivirobnitstva (id_n,nevelikivirobnitstvanazva,nazvatovar,kilkistdet,pokupkunasumu, chaspokypki,id_s ) values (?,?,?,?,?,?,?)";
							PreparedStatement pst = connection.prepareStatement(query);
							pst.setString(1, textField_55.getText());
							pst.setString(2, textField_31.getText());
							pst.setString(3, textField_32.getText());
							pst.setString(4, textField_33.getText());
							pst.setString(5, textField_34.getText());
							pst.setString(6, textField_35.getText());
							pst.setString(7, textField_36.getText());
							
							pst.execute();
							
							JOptionPane.showMessageDialog(null, "Дані додано");
							
							pst.close();
							
							
						}catch(Exception h){
							h.printStackTrace();
						}
						refreshTable6();
					}
				});
				button_5.setBounds(46, 216, 131, 32);
				panel_6.add(button_5);
				
				JButton button_14 = new JButton("\u0412\u0438\u043F\u0440\u0430\u0432\u0438\u0442\u0438");
				button_14.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						

						try{ 	
							String query="Update postachalnikinevelikivirobnitstva set id_n ='"+ textField_55.getText() +"',nevelikivirobnitstvanazva ='"+ textField_31.getText() +"',nazvatovar ='" + textField_32.getText() +"',kilkistdet ='" + textField_33.getText() +"',pokupkunasumu ='" + textField_34.getText() +"',chaspokypki ='"+ textField_35.getText() +"',id_s ='" + textField_36.getText() +"' where id_n ='"+  textField_55.getText() +"' ";
							PreparedStatement pst = connection.prepareStatement(query);
							
							pst.execute();
							
							JOptionPane.showMessageDialog(null, "Дані оновлено");
							
							pst.close();
							
							
						}catch(Exception w){
							w.printStackTrace();
						}
						refreshTable6();
					}
				});
				button_14.setBounds(46, 259, 131, 32);
				panel_6.add(button_14);
				
				JLabel label_51 = new JLabel("id_\u0441\u043A\u043B\u0430\u0434");
				label_51.setFont(new Font("Arial", Font.PLAIN, 15));
				label_51.setBounds(7, 11, 95, 32);
				panel_6.add(label_51);
				
				textField_55 = new JTextField();
				textField_55.setColumns(10);
				textField_55.setBounds(112, 18, 89, 20);
				panel_6.add(textField_55);
				
				JButton button_24 = new JButton("\u0412\u0438\u0434\u0430\u043B\u0438\u0442\u0438");
				button_24.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						try{ 	
							String query="delete from postachalnikinevelikivirobnitstva  where id_n ='"+  textField_55.getText() +"' ";
							PreparedStatement pst = connection.prepareStatement(query);
							
							pst.execute();
							
							JOptionPane.showMessageDialog(null, "Дані видалено");
							
							pst.close();
							
							
						}catch(Exception ex){
							ex.printStackTrace();
						}
						refreshTable6();
				
					}
				});
				button_24.setBounds(46, 302, 131, 32);
				panel_6.add(button_24);
		
		
		
		
		
		JPanel panel_7 = new JPanel();
		tabbedPane.addTab("Постачальники дрібні", null, panel_7, null);
		panel_7.setLayout(null);
		
		JButton btnNewButton_6 = new JButton("Загрузити");
		btnNewButton_6.setBounds(492, 11, 117, 44);
		panel_7.add(btnNewButton_6);
		
		
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
					try{
						String query="select  * from postachalnikidribni";
						PreparedStatement pst = connection.prepareStatement(query);
						ResultSet rs=pst.executeQuery();
						table_7.setModel(DbUtils.resultSetToTableModel(rs));
						
					}catch(Exception e){
						e.printStackTrace();
					}
					
			}
		});
		
				
				
				JScrollPane scrollPane_8 = new JScrollPane();
				scrollPane_8.setBounds(216, 74, 575, 281);
				panel_7.add(scrollPane_8);
				
				table_7 = new JTable();
				scrollPane_8.setViewportView(table_7);
				
				textField_37 = new JTextField();
				textField_37.setColumns(10);
				textField_37.setBounds(166, 49, 86, 20);
				panel_7.add(textField_37);
				
				JLabel label_32 = new JLabel("\u0414\u0440\u0456\u0431\u043D\u0456 \u043F\u043E\u0441\u0442\u0430\u0447\u0430\u043B\u044C\u043D\u0438\u043A\u0438");
				label_32.setFont(new Font("Arial", Font.PLAIN, 15));
				label_32.setBounds(7, 37, 166, 32);
				panel_7.add(label_32);
				
				JLabel label_33 = new JLabel("\u041D\u0430\u0437\u0432\u0430 \u0442\u043E\u0432\u0430\u0440\u0443");
				label_33.setFont(new Font("Arial", Font.PLAIN, 15));
				label_33.setBounds(7, 65, 95, 32);
				panel_7.add(label_33);
				
				textField_38 = new JTextField();
				textField_38.setColumns(10);
				textField_38.setBounds(112, 72, 86, 20);
				panel_7.add(textField_38);
				
				textField_39 = new JTextField();
				textField_39.setColumns(10);
				textField_39.setBounds(138, 103, 63, 20);
				panel_7.add(textField_39);
				
				JLabel label_34 = new JLabel("\u041A\u0456\u043B\u044C\u043A\u0456\u0441\u0442\u044C \u0434\u0435\u0442\u0430\u043B\u0435\u0439");
				label_34.setFont(new Font("Arial", Font.PLAIN, 15));
				label_34.setBounds(7, 96, 121, 32);
				panel_7.add(label_34);
				
				JLabel label_35 = new JLabel("\u0426\u0456\u043D\u0430");
				label_35.setFont(new Font("Arial", Font.PLAIN, 15));
				label_35.setBounds(7, 122, 95, 32);
				panel_7.add(label_35);
				
				textField_40 = new JTextField();
				textField_40.setColumns(10);
				textField_40.setBounds(112, 129, 89, 20);
				panel_7.add(textField_40);
				
				textField_41 = new JTextField();
				textField_41.setColumns(10);
				textField_41.setBounds(112, 158, 89, 20);
				panel_7.add(textField_41);
				
				JLabel label_36 = new JLabel("\u0427\u0430\u0441 \u043F\u043E\u043A\u0443\u043F\u043A\u0438");
				label_36.setFont(new Font("Arial", Font.PLAIN, 15));
				label_36.setBounds(7, 151, 95, 32);
				panel_7.add(label_36);
				
				JLabel label_37 = new JLabel("id_\u0441\u043A\u043B\u0430\u0434");
				label_37.setFont(new Font("Arial", Font.PLAIN, 15));
				label_37.setBounds(7, 180, 95, 32);
				panel_7.add(label_37);
				
				textField_42 = new JTextField();
				textField_42.setColumns(10);
				textField_42.setBounds(109, 187, 89, 20);
				panel_7.add(textField_42);
				
				JButton button_6 = new JButton("\u0414\u043E\u0434\u0430\u0442\u0438");
				button_6.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						try{ 	
							String query="insert into postachalnikidribni (id_d,dribnipostachalnikinazva,nazvatovar,kilkistdet,pokupkunasumu, chaspokypki,id_s ) values (?,?,?,?,?,?,?)";
							PreparedStatement pst = connection.prepareStatement(query);
							pst.setString(1, textField_56.getText());
							pst.setString(2, textField_37.getText());
							pst.setString(3, textField_38.getText());
							pst.setString(4, textField_39.getText());
							pst.setString(5, textField_40.getText());
							pst.setString(6, textField_41.getText());
							pst.setString(7, textField_42.getText());
							
							pst.execute();
							
							JOptionPane.showMessageDialog(null, "Дані додано");
							
							pst.close();
							
							
						}catch(Exception j){
							j.printStackTrace();
						}
						refreshTable7();
						
					}
				});
				button_6.setBounds(42, 218, 131, 32);
				panel_7.add(button_6);
				
				JButton button_15 = new JButton("\u0412\u0438\u043F\u0440\u0430\u0432\u0438\u0442\u0438");
				button_15.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						

						try{ 	
							String query="Update postachalnikidribni set id_d ='"+ textField_56.getText() +"',dribnipostachalnikinazva ='"+ textField_37.getText() +"',nazvatovar ='" + textField_38.getText() +"',kilkistdet ='" + textField_39.getText() +"',pokupkunasumu ='" + textField_40.getText() +"',chaspokypki ='"+ textField_41.getText() +"',id_s ='" + textField_42.getText() +"' where id_d ='"+  textField_56.getText() +"' ";
							PreparedStatement pst = connection.prepareStatement(query);
							
							pst.execute();
							
							JOptionPane.showMessageDialog(null, "Дані оновлено");
							
							pst.close();
							
							
						}catch(Exception w){
							w.printStackTrace();
						}
						refreshTable7();
					}
				});
				button_15.setBounds(42, 261, 131, 32);
				panel_7.add(button_15);
				
				JLabel label_52 = new JLabel("id_\u0441\u043A\u043B\u0430\u0434");
				label_52.setFont(new Font("Arial", Font.PLAIN, 15));
				label_52.setBounds(7, 11, 95, 32);
				panel_7.add(label_52);
				
				textField_56 = new JTextField();
				textField_56.setColumns(10);
				textField_56.setBounds(112, 18, 89, 20);
				panel_7.add(textField_56);
				
				JButton button_25 = new JButton("\u0412\u0438\u0434\u0430\u043B\u0438\u0442\u0438");
				button_25.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						try{ 	
							String query="delete from postachalnikidribni  where id_d ='"+  textField_56.getText() +"' ";
							PreparedStatement pst = connection.prepareStatement(query);
							
							pst.execute();
							
							JOptionPane.showMessageDialog(null, "Дані видалено");
							
							pst.close();
							
							
						}catch(Exception ex){
							ex.printStackTrace();
						}
						refreshTable7();
				
					}
				});
				button_25.setBounds(42, 304, 131, 32);
				panel_7.add(button_25);
		
		
		
		
		
		JPanel panel_8 = new JPanel();
		tabbedPane.addTab("Постачальники магазини", null, panel_8, null);
		panel_8.setLayout(null);
		
		JButton btnNewButton_7 = new JButton("Загрузити");
		btnNewButton_7.setBounds(492, 11, 117, 44);
		panel_8.add(btnNewButton_7);
		
		
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
					try{
						String query="select  * from postachalnikimagazini";
						PreparedStatement pst = connection.prepareStatement(query);
						ResultSet rs=pst.executeQuery();
						table_8.setModel(DbUtils.resultSetToTableModel(rs));
						
					}catch(Exception e){
						e.printStackTrace();
					}
					
			}
		});
		
				
				
				
				JScrollPane scrollPane_9 = new JScrollPane();
				scrollPane_9.setBounds(218, 73, 573, 271);
				panel_8.add(scrollPane_9);
				
				table_8 = new JTable();
				scrollPane_9.setViewportView(table_8);
				
				textField_43 = new JTextField();
				textField_43.setColumns(10);
				textField_43.setBounds(125, 45, 102, 20);
				panel_8.add(textField_43);
				
				JLabel label_38 = new JLabel("\u041D\u0430\u0437\u0432\u0430 \u043C\u0430\u0433\u0430\u0437\u0438\u043D\u0443");
				label_38.setFont(new Font("Arial", Font.PLAIN, 15));
				label_38.setBounds(10, 38, 121, 32);
				panel_8.add(label_38);
				
				JLabel label_39 = new JLabel("\u041D\u0430\u0437\u0432\u0430 \u0442\u043E\u0432\u0430\u0440\u0443");
				label_39.setFont(new Font("Arial", Font.PLAIN, 15));
				label_39.setBounds(10, 64, 95, 32);
				panel_8.add(label_39);
				
				textField_44 = new JTextField();
				textField_44.setColumns(10);
				textField_44.setBounds(112, 71, 96, 20);
				panel_8.add(textField_44);
				
				textField_45 = new JTextField();
				textField_45.setColumns(10);
				textField_45.setBounds(143, 101, 63, 20);
				panel_8.add(textField_45);
				
				JLabel label_40 = new JLabel("\u041A\u0456\u043B\u044C\u043A\u0456\u0441\u0442\u044C \u0434\u0435\u0442\u0430\u043B\u0435\u0439");
				label_40.setFont(new Font("Arial", Font.PLAIN, 15));
				label_40.setBounds(10, 94, 121, 32);
				panel_8.add(label_40);
				
				JLabel label_41 = new JLabel("\u0426\u0456\u043D\u0430");
				label_41.setFont(new Font("Arial", Font.PLAIN, 15));
				label_41.setBounds(10, 126, 95, 32);
				panel_8.add(label_41);
				
				textField_46 = new JTextField();
				textField_46.setColumns(10);
				textField_46.setBounds(115, 133, 89, 20);
				panel_8.add(textField_46);
				
				textField_47 = new JTextField();
				textField_47.setColumns(10);
				textField_47.setBounds(115, 158, 89, 20);
				panel_8.add(textField_47);
				
				JLabel label_42 = new JLabel("\u0427\u0430\u0441 \u043F\u043E\u043A\u0443\u043F\u043A\u0438");
				label_42.setFont(new Font("Arial", Font.PLAIN, 15));
				label_42.setBounds(10, 151, 95, 32);
				panel_8.add(label_42);
				
				JLabel label_43 = new JLabel("id_\u0441\u043A\u043B\u0430\u0434");
				label_43.setFont(new Font("Arial", Font.PLAIN, 15));
				label_43.setBounds(10, 179, 95, 32);
				panel_8.add(label_43);
				
				textField_48 = new JTextField();
				textField_48.setColumns(10);
				textField_48.setBounds(115, 186, 89, 20);
				panel_8.add(textField_48);
				
				JButton button_7 = new JButton("\u0414\u043E\u0434\u0430\u0442\u0438");
				button_7.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						try{ 	
							String query="insert into postachalnikimagazini (id_m,magazininazva,nazvatovar,kilkistdet,pokupkunasumu, chaspokypki,id_s ) values (?,?,?,?,?,?,?)";
							PreparedStatement pst = connection.prepareStatement(query);
							pst.setString(1, textField_57.getText());
							pst.setString(2, textField_43.getText());
							pst.setString(3, textField_44.getText());
							pst.setString(4, textField_45.getText());
							pst.setString(5, textField_46.getText());
							pst.setString(6, textField_47.getText());
							pst.setString(7, textField_48.getText());
							
							pst.execute();
							
							JOptionPane.showMessageDialog(null, "Дані додано");
							
							pst.close();
							
							
						}catch(Exception k){
							k.printStackTrace();
						}
						refreshTable8();
						
					}
				});
				button_7.setBounds(39, 222, 131, 32);
				panel_8.add(button_7);
				
				JButton button_16 = new JButton("\u0412\u0438\u043F\u0440\u0430\u0432\u0438\u0442\u0438");
				button_16.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						

						try{ 	
							String query="Update postachalnikimagazini set id_m ='"+ textField_57.getText() +"',magazininazva ='"+ textField_43.getText() +"',nazvatovar ='"+ textField_44.getText() +"',kilkistdet ='" + textField_45.getText() +"',pokupkunasumu ='" + textField_46.getText() +"',chaspokypki ='" + textField_47.getText() +"',id_s ='" + textField_48.getText() +"' where id_m ='"+  textField_57.getText() +"' ";
							PreparedStatement pst = connection.prepareStatement(query);
							
							pst.execute();
							
							JOptionPane.showMessageDialog(null, "Дані оновлено");
							
							pst.close();
							
							
						}catch(Exception w){
							w.printStackTrace();
						}
						refreshTable8();
					}
				});
				button_16.setBounds(39, 265, 131, 32);
				panel_8.add(button_16);
				
				JLabel label_53 = new JLabel("id_\u0441\u043A\u043B\u0430\u0434");
				label_53.setFont(new Font("Arial", Font.PLAIN, 15));
				label_53.setBounds(10, 11, 95, 32);
				panel_8.add(label_53);
				
				textField_57 = new JTextField();
				textField_57.setColumns(10);
				textField_57.setBounds(115, 18, 89, 20);
				panel_8.add(textField_57);
				
				JButton button_26 = new JButton("\u0412\u0438\u0434\u0430\u043B\u0438\u0442\u0438");
				button_26.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						try{ 	
							String query="delete from postachalnikimagazini  where id_m ='"+  textField_57.getText() +"' ";
							PreparedStatement pst = connection.prepareStatement(query);
							
							pst.execute();
							
							JOptionPane.showMessageDialog(null, "Дані видалено");
							
							pst.close();
							
							
						}catch(Exception ex){
							ex.printStackTrace();
						}
						refreshTable8();
				
					}
				});
				button_26.setBounds(39, 308, 131, 32);
				panel_8.add(button_26);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Брак", null, panel_1, null);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("Загрузити");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try{
					String query="select  * from brak";
					PreparedStatement pst = connection.prepareStatement(query);
					ResultSet rs=pst.executeQuery();
					table_2.setModel(DbUtils.resultSetToTableModel(rs));
					
				}catch(Exception e){
					e.printStackTrace();
				}
				
		}
	});
		
				
				btnNewButton.setBounds(492, 11, 117, 44);
				panel_1.add(btnNewButton);
				
				JScrollPane scrollPane_2 = new JScrollPane();
				scrollPane_2.setBounds(206, 73, 585, 287);
				panel_1.add(scrollPane_2);
				
				table_2 = new JTable();
				scrollPane_2.setViewportView(table_2);
				
				JLabel label_11 = new JLabel("\u0424\u0456\u0440\u043C\u0430 \u0431\u0440\u0430\u043A\u043E\u0432\u0430\u043D\u043E\u0457 \u0434\u0435\u0442\u0430\u043B\u0456");
				label_11.setFont(new Font("Arial", Font.PLAIN, 15));
				label_11.setBounds(7, 34, 173, 32);
				panel_1.add(label_11);
				
				JLabel label_12 = new JLabel("\u041D\u0430\u0437\u0432\u0430 \u0442\u043E\u0432\u0430\u0440\u0443");
				label_12.setFont(new Font("Arial", Font.PLAIN, 15));
				label_12.setBounds(7, 71, 95, 32);
				panel_1.add(label_12);
				
				JLabel label_13 = new JLabel("\u041A\u0456\u043B\u044C\u043A\u0456\u0441\u0442\u044C");
				label_13.setFont(new Font("Arial", Font.PLAIN, 15));
				label_13.setBounds(7, 107, 76, 32);
				panel_1.add(label_13);
				
				JLabel label_14 = new JLabel("\u0426\u0456\u043D\u0430");
				label_14.setFont(new Font("Arial", Font.PLAIN, 15));
				label_14.setBounds(7, 147, 60, 23);
				panel_1.add(label_14);
				
				JLabel lblId = new JLabel("id_\u0441\u043A\u043B\u0430\u0434");
				lblId.setFont(new Font("Arial", Font.PLAIN, 15));
				lblId.setBounds(7, 181, 60, 23);
				panel_1.add(lblId);
				
				textField_14 = new JTextField();
				textField_14.setBounds(196, 46, 86, 20);
				panel_1.add(textField_14);
				textField_14.setColumns(10);
				
				textField_15 = new JTextField();
				textField_15.setBounds(112, 82, 86, 20);
				panel_1.add(textField_15);
				textField_15.setColumns(10);
				
				textField_16 = new JTextField();
				textField_16.setBounds(112, 114, 86, 20);
				panel_1.add(textField_16);
				textField_16.setColumns(10);
				
				textField_17 = new JTextField();
				textField_17.setBounds(112, 147, 86, 20);
				panel_1.add(textField_17);
				textField_17.setColumns(10);
				
				textField_18 = new JTextField();
				textField_18.setBounds(112, 183, 86, 20);
				panel_1.add(textField_18);
				textField_18.setColumns(10);
				
				JButton button_2 = new JButton("\u0414\u043E\u0434\u0430\u0442\u0438");
				button_2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						try{ 	
							String query="insert into brak (id_b,ystanova,nazvabrakovahihdetalei,kilkistbrakovahihdetalei,price, id_s ) values (?,?,?,?,?,?)";
							PreparedStatement pst = connection.prepareStatement(query); 
							pst.setString(1, textField_61.getText());
							pst.setString(2, textField_14.getText());
							pst.setString(3, textField_15.getText());
							pst.setString(4, textField_16.getText());
							pst.setString(5, textField_17.getText());
							pst.setString(6, textField_18.getText());
							
							pst.execute();
							
							JOptionPane.showMessageDialog(null, "Дані додано");
							
							pst.close();
							
							
						}catch(Exception d){
							d.printStackTrace();
						}
						
						refreshTable2();

					
						
					}
				});
				button_2.setBounds(36, 215, 131, 32);
				panel_1.add(button_2);
				
				JButton button_18 = new JButton("\u0412\u0438\u043F\u0440\u0430\u0432\u0438\u0442\u0438");
				button_18.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {

						try{ 	
							String query="Update brak set id_b ='"+ textField_61.getText() +"',ystanova ='"+ textField_14.getText() +"',nazvabrakovahihdetalei ='" + textField_15.getText() +"',kilkistbrakovahihdetalei ='" + textField_16.getText() +"',price ='" + textField_17.getText() +"',id_s ='" + textField_18.getText() +"' where id_b ='"+  textField_61.getText() +"' ";
							PreparedStatement pst = connection.prepareStatement(query);
							
							pst.execute();
							
							JOptionPane.showMessageDialog(null, "Дані оновлено");
							
							pst.close();
							
							
						}catch(Exception w){
							w.printStackTrace();
						}
						refreshTable2();
					}
				});
				button_18.setBounds(36, 258, 131, 32);
				panel_1.add(button_18);
				
				JLabel label_56 = new JLabel("id_\u0441\u043A\u043B\u0430\u0434");
				label_56.setFont(new Font("Arial", Font.PLAIN, 15));
				label_56.setBounds(7, 11, 95, 32);
				panel_1.add(label_56);
				
				textField_61 = new JTextField();
				textField_61.setColumns(10);
				textField_61.setBounds(112, 18, 89, 20);
				panel_1.add(textField_61);
				
				JButton button_27 = new JButton("\u0412\u0438\u0434\u0430\u043B\u0438\u0442\u0438");
				button_27.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						try{ 	
							String query="delete from brak  where id_b ='"+  textField_61.getText() +"' ";
							PreparedStatement pst = connection.prepareStatement(query);
							
							pst.execute();
							
							JOptionPane.showMessageDialog(null, "Дані видалено");
							
							pst.close();
							
							
						}catch(Exception ex){
							ex.printStackTrace();
						}
						
						refreshTable2();
					}
				});
				button_27.setBounds(36, 301, 131, 32);
				panel_1.add(button_27);
		
		
		
		
		
		
		JPanel panel_9 = new JPanel();
		tabbedPane.addTab("Працівники Дані:", null, panel_9, null);
		panel_9.setLayout(null);
		
		JButton btnNewButton_8 = new JButton("Загрузити");
		btnNewButton_8.setBounds(492, 11, 117, 44);
		panel_9.add(btnNewButton_8);
		
		
		
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
					try{
						String query="select  (username) from EmployeeInfo";
						PreparedStatement pst = connection.prepareStatement(query);
						ResultSet rs=pst.executeQuery();
						table_9.setModel(DbUtils.resultSetToTableModel(rs));
						
					}catch(Exception e){
						e.printStackTrace();
					}
					
			}
		});

		
		
		JScrollPane scrollPane_10 = new JScrollPane();
		scrollPane_10.setBounds(214, 61, 577, 294);
		panel_9.add(scrollPane_10);
		
		table_9 = new JTable();
		scrollPane_10.setViewportView(table_9);
		
		JLabel label_44 = new JLabel("\u043F\u0430\u0440\u043E\u043B\u044C");
		label_44.setFont(new Font("Arial", Font.PLAIN, 15));
		label_44.setBounds(10, 88, 95, 32);
		panel_9.add(label_44);
		
		textField_49 = new JTextField();
		textField_49.setColumns(10);
		textField_49.setBounds(125, 59, 79, 20);
		panel_9.add(textField_49);
		
		JButton button_8 = new JButton("\u0414\u043E\u0434\u0430\u0442\u0438");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try{ 	
					String query="insert into EmployeeInfo (id, username,passworld ) values (?,?,?)";
					PreparedStatement pst = connection.prepareStatement(query); 
					pst.setString(1, textField_59.getText());
					pst.setString(2, textField_49.getText());
					pst.setString(3, textField_50.getText());
					
					pst.execute();
					
					JOptionPane.showMessageDialog(null, "Дані додано");
					
					pst.close();
					
					
				}catch(Exception l){
					l.printStackTrace();
				}
				refreshTable9();
			}
		});
		button_8.setBounds(45, 131, 131, 32);
		panel_9.add(button_8);
		
		textField_50 = new JTextField();
		textField_50.setColumns(10);
		textField_50.setBounds(115, 95, 89, 20);
		panel_9.add(textField_50);
		
		JLabel label_45 = new JLabel("\u0406\u043C'\u044F \u043A\u043E\u0440\u0438\u0441\u0442\u0443\u0432\u0430\u0447\u0430");
		label_45.setFont(new Font("Arial", Font.PLAIN, 15));
		label_45.setBounds(10, 52, 122, 32);
		panel_9.add(label_45);
		
		JButton button_17 = new JButton("\u0412\u0438\u043F\u0440\u0430\u0432\u0438\u0442\u0438");
		button_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				try{ 	
					String query="Update EmployeeInfo set id ='"+ textField_59.getText() +"',username ='"+ textField_49.getText() +"',passworld ='" + textField_50.getText() +"' where id ='"+  textField_59.getText() +"' ";
					PreparedStatement pst = connection.prepareStatement(query);
					
					pst.execute();
					
					JOptionPane.showMessageDialog(null, "Дані оновлено");
					
					pst.close();
					
					
				}catch(Exception w){
					w.printStackTrace();
				}
				refreshTable9();
			}
		});
		button_17.setBounds(45, 174, 131, 32);
		panel_9.add(button_17);
		
		JLabel lblId_2 = new JLabel("id_\u043F\u0440\u0430\u0446\u0456\u0432\u043D\u0438\u043A\u0430");
		lblId_2.setFont(new Font("Arial", Font.PLAIN, 15));
		lblId_2.setBounds(10, 16, 95, 32);
		panel_9.add(lblId_2);
		
		textField_59 = new JTextField();
		textField_59.setColumns(10);
		textField_59.setBounds(115, 23, 89, 20);
		panel_9.add(textField_59);
		
		JButton button_28 = new JButton("\u0412\u0438\u0434\u0430\u043B\u0438\u0442\u0438");
		button_28.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try{ 	
					String query="delete from EmployeeInfo  where id ='"+  textField_59.getText() +"' ";
					PreparedStatement pst = connection.prepareStatement(query);
					
					pst.execute();
					
					JOptionPane.showMessageDialog(null, "Дані видалено");
					
					pst.close();
					
					
				}catch(Exception ex){
					ex.printStackTrace();
				}
				
				refreshTable9();
			}
		});
		button_28.setBounds(45, 217, 131, 32);
		panel_9.add(button_28);
		
		JLabel label_57 = new JLabel("\u0406\u043D\u0441\u0442\u0440\u0443\u043A\u0446\u0456\u044F \u0434\u043B\u044F \u0410\u0406\u0421 \"\u041C\u0430\u0433\u0430\u0437\u0438\u043D\u0443 \u0410\u0432\u0442\u043E\u0437\u0430\u043F\u0447\u0430\u0441\u0442\u0438\u043D\"\r\n\r\n\r\n\r\n\r\n");
		label_57.setFont(new Font("Arial", Font.PLAIN, 15));
		label_57.setBounds(10, 421, 306, 34);
		contentPane.add(label_57);
		
		JLabel label_2 = new JLabel("\u041E\u0441\u043D\u043E\u0432\u043D\u043E\u044E \u0432\u043A\u043B\u0430\u0434\u043A\u043E\u044E \u0454 \"\u0421\u043A\u043B\u0430\u0434\" \u0434\u0443\u0431\u043B\u044E\u0432\u0430\u043D\u043D\u044F \u0432 \u0456\u043D\u0448\u0438\u0445 \u0432\u043A\u043B\u0430\u0434\u043A\u0430\u0445 \u043C\u043E\u0436\u043D\u0430 \u0442\u0456\u043B\u044C\u043A\u0438 \u0432 \u0442\u043E\u043C\u0443 \u0432\u0438\u043F\u0430\u0434\u043A\u0443 \u043A\u043E\u043B\u0438 \u0432\u043E\u043D\u0438 \u0432\u0436\u0435 \u043F\u0440\u043E\u043F\u0438\u0441\u0430-");
		label_2.setFont(new Font("Arial", Font.PLAIN, 15));
		label_2.setBounds(10, 452, 806, 34);
		contentPane.add(label_2);
		
		JLabel label_58 = new JLabel("\u043D\u0456 \u0432 \u043E\u0441\u043D\u043E\u0432\u043D\u0456\u0439 \u0432\u043A\u043B\u0430\u0434\u0446\u0456 \"\u0421\u043A\u043B\u0430\u0434\"");
		label_58.setFont(new Font("Arial", Font.PLAIN, 15));
		label_58.setBounds(10, 483, 206, 34);
		contentPane.add(label_58);
		
		JLabel label_59 = new JLabel("\u043A\u043D\u043E\u043F\u043A\u0430 \u0414\u043E\u0434\u0430\u0442\u0438 - \u0434\u043E\u0434\u0430\u0454 \u0434\u0430\u043D\u0456 \u044F\u043A\u0456 \u0432\u0438 \u0432\u043F\u0438\u0441\u0430\u043B\u0438 \u0432 \u043B\u0456\u043D\u0456\u0439\u043A\u0438 \u0437 \u043F\u043E\u0437\u043D\u0430\u0447\u043A\u0430\u043C\u0438. \u0414\u043E\u0434\u0430\u0454 \u0442\u0456\u043B\u044C\u043A\u0438 \u043F\u0440\u0438 \u043D\u0430\u044F\u0432\u043D\u043E\u0441\u0442\u0456 \u0432\u0441\u0456 \u0434\u0430\u043D\u0438\u0445.");
		label_59.setFont(new Font("Arial", Font.PLAIN, 15));
		label_59.setBounds(10, 517, 806, 34);
		contentPane.add(label_59);
		
		JLabel label_60 = new JLabel("\u043A\u043D\u043E\u043F\u043A\u0430 \u0412\u0438\u043F\u0440\u0430\u0432\u0438\u0442\u0438 - \u0432\u0438\u043F\u0440\u0430\u0432\u043B\u044F\u0454 \u0434\u0430\u043D\u0456 \u044F\u043A\u0456 \u0432\u0438 \u0432\u043F\u0438\u0441\u0430\u043B\u0438 \u0432 \u043B\u0456\u043D\u0456\u0439\u043A\u0438 \u0437 \u043F\u043E\u0437\u043D\u0430\u0447\u043A\u0430\u043C\u0438. \u0412\u0438\u043F\u0440\u0430\u0432\u043B\u044F\u0454 \u0442\u0456\u043B\u044C\u043A\u0438 \u043F\u0440\u0438 \u043D\u0430\u044F\u0432\u043D\u043E\u0441\u0442\u0456 \u0432\u0441\u0456 \u0434\u0430\u043D\u0438\u0445.");
		label_60.setFont(new Font("Arial", Font.PLAIN, 15));
		label_60.setBounds(10, 550, 806, 34);
		contentPane.add(label_60);
		
		JLabel label_61 = new JLabel("\u043A\u043D\u043E\u043F\u043A\u0430 \u0412\u0438\u0434\u0430\u043B\u0438\u0442\u0438- \u0432\u0438\u0434\u0430\u043B\u044F\u0454 \u0434\u0430\u043D\u0456 \u0437 \u0442\u0430\u0431\u043B\u0438\u0446\u0456. \u0412\u0438\u0434\u0430\u043B\u044F\u0454 \u0442\u0456\u043B\u044C\u043A\u0438 \u043F\u043E \u043F\u0443\u043D\u043A\u0442\u0443 \"id \u0441\u043A\u043B\u0430\u0434\".");
		label_61.setFont(new Font("Arial", Font.PLAIN, 15));
		label_61.setBounds(10, 577, 806, 34);
		contentPane.add(label_61);
		
		JButton btnHelp = new JButton("\u0414\u043E\u0432\u0456\u0434\u043A\u0430");
		btnHelp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Версія \t 1.12 \n Автор: студент груби ПК-23 Білоніжка Ігор");
			}
		});
		btnHelp.setBounds(545, 423, 206, 32);
		contentPane.add(btnHelp);
		
		refreshTable();
		refreshTable1();
		refreshTable2();
		refreshTable3();
		refreshTable4();
		refreshTable5();
		refreshTable6();
		refreshTable7();
		refreshTable8();
		refreshTable9();
	}
}







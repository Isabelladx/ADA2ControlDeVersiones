package ControlDeVersiones;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;

public class ADA2GUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtProducto;
	private JTextField txtCantidad;
	private JTextField txtPrecio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ADA2GUI frame = new ADA2GUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ADA2GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 519, 343);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPapeleria = new JLabel("Papelería \"El Plumin\"");
		lblPapeleria.setForeground(new Color(0, 0, 255));
		lblPapeleria.setFont(new Font("Stencil", Font.PLAIN, 24));
		lblPapeleria.setBounds(94, 19, 283, 50);
		contentPane.add(lblPapeleria);
		
		JLabel lblProducto = new JLabel("Producto:");
		lblProducto.setFont(new Font("Arial Black", Font.PLAIN, 14));
		lblProducto.setBounds(73, 80, 87, 14);
		contentPane.add(lblProducto);
		
		JLabel lblCantidad = new JLabel("Cantidad:");
		lblCantidad.setFont(new Font("Arial Black", Font.PLAIN, 14));
		lblCantidad.setBounds(73, 130, 87, 14);
		contentPane.add(lblCantidad);
		
		JLabel lblPrecio = new JLabel("Precio:");
		lblPrecio.setFont(new Font("Arial Black", Font.PLAIN, 14));
		lblPrecio.setBounds(73, 176, 87, 14);
		contentPane.add(lblPrecio);
		
		txtProducto = new JTextField();
		txtProducto.setBounds(189, 80, 235, 20);
		contentPane.add(txtProducto);
		txtProducto.setColumns(10);
		
		txtCantidad = new JTextField();
		txtCantidad.setColumns(10);
		txtCantidad.setBounds(189, 129, 235, 20);
		contentPane.add(txtCantidad);
		
		txtPrecio = new JTextField();
		txtPrecio.setColumns(10);
		txtPrecio.setBounds(189, 175, 235, 20);
		contentPane.add(txtPrecio);
		
		JButton btnNewButton = new JButton("Agregar");
		btnNewButton.setBackground(new Color(255, 204, 255));
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setFont(new Font("Arial Black", Font.PLAIN, 14));
		btnNewButton.setBounds(71, 229, 143, 23);
		contentPane.add(btnNewButton);
	}
}

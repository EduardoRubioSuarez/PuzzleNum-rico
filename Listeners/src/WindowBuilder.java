import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WindowBuilder extends JFrame{
	
	public int x=0, o=0,turno;
	
	public WindowBuilder() {
		
		this.setVisible(true);
		this.setSize(500,640);
		this.setTitle("Ventana Perrona");
		this.setLayout(null);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//PANEL DE FONDO
		JPanel panelsito = new JPanel();
		panelsito.setBounds(0,0,500,600);
		panelsito.setOpaque(true);
		panelsito.setLayout(new BorderLayout());
		panelsito.setBackground(Color.decode("#5490BA"));
		this.add(panelsito);
		
		
		//PANEL ARRIBA
		JPanel panelAr = new JPanel();
		panelAr.setBounds(0,0,500,50);
		panelAr.setOpaque(true);
		panelAr.setLayout(new GridLayout(0,2));
		panelsito.add(panelAr,BorderLayout.NORTH);
		
		JLabel txt1 = new JLabel("X:"+x);
		txt1.setOpaque(true);
		txt1.setVisible(true);
		txt1.setBackground(Color.decode("#5287F6"));
		txt1.setForeground(Color.white);
		panelAr.add(txt1);
		
		JLabel txt2 = new JLabel("O:"+o);
		txt2.setOpaque(true);
		txt2.setVisible(true);
		txt2.setBackground(Color.decode("#5287F6"));
		txt2.setForeground(Color.white);
		panelAr.add(txt2);
	
		//PANEL ABAJO
		JPanel panelAb = new JPanel();
		panelAb.setBounds(0,0,500,50);
		panelAb.setOpaque(true);
		panelAb.setLayout(new GridLayout(0,3));
		panelsito.add(panelAb,BorderLayout.SOUTH);
		
		JLabel eb1 = new JLabel("");
		eb1.setOpaque(true);
		eb1.setVisible(true);
		eb1.setBackground(Color.decode("#57F60C"));
		panelAb.add(eb1);
		
		JButton reinicio = new JButton("Reiniciar");
		reinicio.setVisible(true);
		reinicio.setOpaque(true);
		reinicio.setBackground(Color.decode("#FFFFFF"));
		panelAb.add(reinicio);
		
		JLabel eb2 = new JLabel("");
		eb2.setOpaque(true);
		eb2.setVisible(true);
		eb2.setBackground(Color.decode("#57F60C"));
		panelAb.add(eb2);
		
		repaint();
		revalidate();
		
		//PANEL CENTRAL
		JPanel panelsitoCentral = new JPanel();
		panelsitoCentral.setBounds(0,0,500,600);
		panelsitoCentral.setOpaque(true);
		panelsitoCentral.setLayout(new GridLayout(3,3));
		panelsito.add(panelsitoCentral,BorderLayout.CENTER);
		
		JButton b1 = new JButton("");
		b1.setVisible(true);
		b1.setOpaque(true);
		b1.setBackground(Color.decode("#F3DB5B"));
		b1.setForeground(Color.white);
		panelsitoCentral.add(b1);
		
		JButton b2 = new JButton("");
		b2.setVisible(true);
		b2.setOpaque(true);
		b2.setBackground(Color.decode("#F3DB5B"));
		b2.setForeground(Color.white);
		panelsitoCentral.add(b2);
		
		JButton b3 = new JButton("");
		b3.setVisible(true);
		b3.setOpaque(true);
		b3.setBackground(Color.decode("#F3DB5B"));
		b3.setForeground(Color.white);
		panelsitoCentral.add(b3);
		
		JButton b4 = new JButton("");
		b4.setVisible(true);
		b4.setOpaque(true);
		b4.setBackground(Color.decode("#F3DB5B"));
		b4.setForeground(Color.white);
		panelsitoCentral.add(b4);
		
		JButton b5 = new JButton("");
		b5.setVisible(true);
		b5.setOpaque(true);
		b5.setBackground(Color.decode("#F3DB5B"));
		b5.setForeground(Color.white);
		panelsitoCentral.add(b5);
		
		JButton b6 = new JButton("");
		b6.setVisible(true);
		b6.setOpaque(true);
		b6.setBackground(Color.decode("#F3DB5B"));
		b6.setForeground(Color.white);
		panelsitoCentral.add(b6);
		
		JButton b7 = new JButton("");
		b7.setVisible(true);
		b7.setOpaque(true);
		b7.setBackground(Color.decode("#F3DB5B"));
		b7.setForeground(Color.white);
		panelsitoCentral.add(b7);
		
		JButton b8 = new JButton("");
		b8.setVisible(true);
		b8.setOpaque(true);
		b8.setBackground(Color.decode("#F3DB5B"));
		b8.setForeground(Color.white);
		panelsitoCentral.add(b8);
		
		JButton b9 = new JButton("");
		b9.setVisible(true);
		b9.setOpaque(true);
		b9.setBackground(Color.decode("#F3DB5B"));
		b9.setForeground(Color.white);
		panelsitoCentral.add(b9);
		
		turno = 1;
		
		///////////////ACTION LISTENERS DE LOS BOTONES////////////////////
		b1.addActionListener((ActionListener) new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				b1.setEnabled(false);
				if(turno==0) {
					b1.setText("O");
					validar(b1,b2,b3,b4,b5,b6,b7,b8,b9,txt1,txt2);
					turno=1;
				}
				else {
					b1.setText("x");
					validar(b1,b2,b3,b4,b5,b6,b7,b8,b9,txt1,txt2);
					turno=0;
				}
			}
		});
		
		b2.addActionListener((ActionListener) new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				b2.setEnabled(false);
				if(turno==0) {
					b2.setText("O");
					validar(b1,b2,b3,b4,b5,b6,b7,b8,b9,txt1,txt2);
					turno=1;
				}
				else {
					b2.setText("x");
					validar(b1,b2,b3,b4,b5,b6,b7,b8,b9,txt1,txt2);
					turno=0;
				}
			}
		});
		
		b3.addActionListener((ActionListener) new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				b3.setEnabled(false);
				if(turno==0) {
					b3.setText("O");
					validar(b1,b2,b3,b4,b5,b6,b7,b8,b9,txt1,txt2);
					turno=1;
				}
				else {
					b3.setText("x");
					validar(b1,b2,b3,b4,b5,b6,b7,b8,b9,txt1,txt2);
					turno=0;
				}
			}
		});
		
		b4.addActionListener((ActionListener) new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				b4.setEnabled(false);
				if(turno==0) {
					b4.setText("O");
					validar(b1,b2,b3,b4,b5,b6,b7,b8,b9,txt1,txt2);
					turno=1;
				}
				else {
					b4.setText("x");
					validar(b1,b2,b3,b4,b5,b6,b7,b8,b9,txt1,txt2);
					turno=0;
				}
			}
		});
		
		b5.addActionListener((ActionListener) new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				b5.setEnabled(false);
				if(turno==0) {
					b5.setText("O");
					validar(b1,b2,b3,b4,b5,b6,b7,b8,b9,txt1,txt2);
					turno=1;
				}
				else {
					b5.setText("x");
					validar(b1,b2,b3,b4,b5,b6,b7,b8,b9,txt1,txt2);
					turno=0;
				}
			}
		});
		
		b6.addActionListener((ActionListener) new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				b6.setEnabled(false);
				if(turno==0) {
					b6.setText("O");
					validar(b1,b2,b3,b4,b5,b6,b7,b8,b9,txt1,txt2);
					turno=1;
				}
				else {
					b6.setText("x");
					validar(b1,b2,b3,b4,b5,b6,b7,b8,b9,txt1,txt2);
					turno=0;
				}
			}
		});
		
		b7.addActionListener((ActionListener) new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				b7.setEnabled(false);
				if(turno==0) {
					b7.setText("O");
					validar(b1,b2,b3,b4,b5,b6,b7,b8,b9,txt1,txt2);
					turno=1;
				}
				else {
					b7.setText("x");
					validar(b1,b2,b3,b4,b5,b6,b7,b8,b9,txt1,txt2);
					turno=0;
				}
			}
		});
		
		b8.addActionListener((ActionListener) new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				b8.setEnabled(false);
				if(turno==0) {
					b8.setText("O");
					validar(b1,b2,b3,b4,b5,b6,b7,b8,b9,txt1,txt2);
					turno=1;
				}
				else {
					b8.setText("x");
					validar(b1,b2,b3,b4,b5,b6,b7,b8,b9,txt1,txt2);
					turno=0;
				}
			}
		});
		
		b9.addActionListener((ActionListener) new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				b9.setEnabled(false);
				if(turno==0) {
					b9.setText("O");
					validar(b1,b2,b3,b4,b5,b6,b7,b8,b9,txt1,txt2);
					turno=1;
				}
				else {
					b9.setText("x");
					validar(b1,b2,b3,b4,b5,b6,b7,b8,b9,txt1,txt2);
					turno=0;
				}
			}
		});
		
		////////////ACTION LISTENER DE REINICIAR/////////////////
		reinicio.addActionListener((ActionListener) new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				reiniciaTablero(b1,b2,b3,b4,b5,b6,b7,b8,b9);
			}
		});
		
		
		repaint();
		revalidate();
	}
	
	
	public void reiniciaTablero(JButton b1,JButton b2,JButton b3,JButton b4,JButton b5,JButton b6,JButton b7,JButton b8,JButton b9) {
		b1.setText("");
		b1.setEnabled(true);
		b2.setText("");
		b2.setEnabled(true);
		b3.setText("");
		b3.setEnabled(true);
		b4.setText("");
		b4.setEnabled(true);
		b5.setText("");
		b5.setEnabled(true);
		b6.setText("");
		b6.setEnabled(true);
		b7.setText("");
		b7.setEnabled(true);
		b8.setText("");
		b8.setEnabled(true);
		b9.setText("");
		b9.setEnabled(true);
		
		repaint();
		revalidate();
	}
	
	public void validar(JButton b1,JButton b2,JButton b3,JButton b4,JButton b5,JButton b6,JButton b7,JButton b8,JButton b9, JLabel tx, JLabel to){
		//Va a hacer el ciclo pasando por cada uno de los casos en los cuales se verificará si ya se ganó la partida
		//(Se llamará después de cada turno)
		int caso=0;
		for (int i=0;i<8;i++) {
			switch(caso) {
			
			//CASOS HORIZONTALES
			case 0:
				if(b1.getText().equals(b2.getText()) && b1.getText().equals(b3.getText()) && b2.getText().equals(b3.getText())) {
					if(b1.getText()=="x") {
						JOptionPane.showMessageDialog(null, "Jugador X ha ganado");
						reiniciaTablero(b1,b2,b3,b4,b5,b6,b7,b8,b9);
						x++;
						tx.setText("X: "+x);
					}
					if(b1.getText()=="O") {
						JOptionPane.showMessageDialog(null, "Jugador O ha ganado");
						reiniciaTablero(b1,b2,b3,b4,b5,b6,b7,b8,b9);
						o++;
						to.setText("O: "+o);
					}
					repaint();
					revalidate();
				}
				break;
			
			case 1:
				if(b4.getText().equals(b5.getText()) && b4.getText().equals(b6.getText()) && b5.getText().equals(b6.getText())) {
					if(b4.getText()=="x") {
						JOptionPane.showMessageDialog(null, "Jugador X ha ganado");
						reiniciaTablero(b1,b2,b3,b4,b5,b6,b7,b8,b9);
						x++;
						tx.setText("X: "+x);
					}
					if(b4.getText()=="O") {
						JOptionPane.showMessageDialog(null, "Jugador O ha ganado");
						reiniciaTablero(b1,b2,b3,b4,b5,b6,b7,b8,b9);
						o++;
						to.setText("O: "+o);
					}
					repaint();
					revalidate();
				}
				break;
			
			case 2:
				if(b7.getText().equals(b8.getText()) && b7.getText().equals(b9.getText()) && b8.getText().equals(b9.getText())) {
					if(b7.getText()=="x") {
						JOptionPane.showMessageDialog(null, "Jugador X ha ganado");
						reiniciaTablero(b1,b2,b3,b4,b5,b6,b7,b8,b9);
						x++;
						tx.setText("X: "+x);
					}
					if(b7.getText()=="O") {
						JOptionPane.showMessageDialog(null, "Jugador O ha ganado");
						reiniciaTablero(b1,b2,b3,b4,b5,b6,b7,b8,b9);
						o++;
						to.setText("O: "+o);
					}
					repaint();
					revalidate();
				}
				break;
			
				//CASOS VERTICALES
			case 3:
				if(b1.getText().equals(b4.getText()) && b1.getText().equals(b7.getText()) && b4.getText().equals(b7.getText())) {
					if(b1.getText()=="x") {
						JOptionPane.showMessageDialog(null, "Jugador X ha ganado");
						reiniciaTablero(b1,b2,b3,b4,b5,b6,b7,b8,b9);
						x++;
						tx.setText("X: "+x);
					}
					if(b1.getText()=="O") {
						JOptionPane.showMessageDialog(null, "Jugador O ha ganado");
						reiniciaTablero(b1,b2,b3,b4,b5,b6,b7,b8,b9);
						o++;
						to.setText("O: "+o);
					}
					repaint();
					revalidate();
				}
				break;
			
			case 4:
				if(b5.getText().equals(b2.getText()) && b5.getText().equals(b8.getText()) && b2.getText().equals(b8.getText())) {
					if(b2.getText()=="x") {
						JOptionPane.showMessageDialog(null, "Jugador X ha ganado");
						reiniciaTablero(b1,b2,b3,b4,b5,b6,b7,b8,b9);
						x++;
						tx.setText("X: "+x);
					}
					if(b2.getText()=="O") {
						JOptionPane.showMessageDialog(null, "Jugador O ha ganado");
						reiniciaTablero(b1,b2,b3,b4,b5,b6,b7,b8,b9);
						o++;
						to.setText("O: "+o);
					}
					repaint();
					revalidate();
				}
				break;
			
			case 5:
				if(b6.getText().equals(b9.getText()) && b6.getText().equals(b3.getText()) && b9.getText().equals(b3.getText())) {
					if(b3.getText()=="x") {
						JOptionPane.showMessageDialog(null, "Jugador X ha ganado");
						reiniciaTablero(b1,b2,b3,b4,b5,b6,b7,b8,b9);
						x++;
						tx.setText("X: "+x);
					}
					if(b3.getText()=="O") {
						JOptionPane.showMessageDialog(null, "Jugador O ha ganado");
						reiniciaTablero(b1,b2,b3,b4,b5,b6,b7,b8,b9);
						o++;
						to.setText("O: "+o);
					}
					repaint();
					revalidate();
				}
				break;
			
			//CASOS EN DIAGONAL
			case 6:
				if(b1.getText().equals(b5.getText()) && b1.getText().equals(b9.getText()) && b5.getText().equals(b9.getText())) {
					if(b1.getText()=="x") {
						JOptionPane.showMessageDialog(null, "Jugador X ha ganado");
						reiniciaTablero(b1,b2,b3,b4,b5,b6,b7,b8,b9);
						x++;
						tx.setText("X: "+x);
					}
					if(b1.getText()=="O") {
						JOptionPane.showMessageDialog(null, "Jugador O ha ganado");
						reiniciaTablero(b1,b2,b3,b4,b5,b6,b7,b8,b9);
						o++;
						to.setText("O: "+o);
						
					}
					repaint();
					revalidate();
				}
				break;
			
			case 7:
				if(b7.getText().equals(b5.getText()) && b7.getText().equals(b3.getText()) && b5.getText().equals(b3.getText())) {
					if(b7.getText()=="x") {
						JOptionPane.showMessageDialog(null, "Jugador X ha ganado");
						reiniciaTablero(b1,b2,b3,b4,b5,b6,b7,b8,b9);
						x++;
						tx.setText("X: "+x);
					}
					if(b7.getText()=="O") {
						JOptionPane.showMessageDialog(null, "Jugador O ha ganado");
						reiniciaTablero(b1,b2,b3,b4,b5,b6,b7,b8,b9);
						o++;
						to.setText("O: "+o);
						
					}	
					repaint();
					revalidate();
				}
				break;
					
			}
			caso++;
		}
	}
}

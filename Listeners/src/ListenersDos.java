import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ListenersDos extends JFrame{
	public ListenersDos() {
		this.setVisible(true);
		this.setSize(500,600);
		this.setTitle("Ventana Perrona");
		this.setLayout(null);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panelsito = new JPanel();
		panelsito.setBounds(0,0,500,600);
		panelsito.setOpaque(true);
		panelsito.setLayout(null);
		this.add(panelsito);
		panelsito.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("mouseClicked");
				
				Random rand = new Random();
				Random obj = new Random();
				int rand_num = obj.nextInt(0xffffff + 1);
				String colorCode = String.format("#%06x", rand_num);
				JButton b2 = new JButton("Soy nuevo");
				b2.setBounds(e.getX(),e.getY(),rand.nextInt(300), rand.nextInt(300));
				b2.setVisible(true);
				b2.setBackground(Color.decode(colorCode));
				b2.setText(rand.nextInt(100)+"");
				b2.setOpaque(true);
				panelsito.add(b2);
				
				b2.addActionListener(new ActionListener(){

					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						//panelsito.remove(b2);
						
						b2.addKeyListener(new KeyListener() {

							@Override
							public void keyTyped(KeyEvent e) {
								// TODO Auto-generated method stub
							}

							@Override
							public void keyPressed(KeyEvent e) {
								// TODO Auto-generated method stub
								if(e.getKeyChar()=='w') {
									b2.setLocation(b2.getX(),b2.getY()-10);
								}
								if(e.getKeyChar()=='a') {
									b2.setLocation(b2.getX()-10,b2.getY());
								}
								if(e.getKeyChar()=='s') {
									b2.setLocation(b2.getX(),b2.getY()+10);
								}
								if(e.getKeyChar()=='d') {
									b2.setLocation(b2.getX()+10,b2.getY());
								}
								
							}

							@Override
							public void keyReleased(KeyEvent e) {
								// TODO Auto-generated method stub
								
							}
							
						});
						
						repaint();
						revalidate();
					}
					});
				repaint();
				revalidate();
				}
				
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("mousePressed");
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("mouseReleased");
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("mouseEntered");
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("mouseExited");
				Random obj = new Random();
				int rand_num = obj.nextInt(0xffffff + 1);  
				String colorCode = String.format("#%06x", rand_num);
				panelsito.setBackground(Color.decode(colorCode));
			}
			
		});
		
	}
}

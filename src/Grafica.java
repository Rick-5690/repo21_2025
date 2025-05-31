//versione 2 cc
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
//via da qui



public class Grafica extends JFrame implements ActionListener{
	private JButton conferma;
	private JTextField nomeTx,luogoTx,dataTx,oraTx;
	public Grafica() {
		super("Crea il tuo evento");
		Container co=getContentPane();
		JPanel nord,centro,sud;
		//---NORD---
		nord=new JPanel();
		JLabel titolo=new JLabel("Inserimento dati del tuo evento");
		titolo.setFont(new Font("Arial",Font.BOLD,20));
		nord.add(titolo);
		co.add(nord,"North");
		//---CENTER---
		centro=new JPanel(new GridLayout(4,1));
		JPanel[] p=new JPanel[4];
		for(int i=0;i<4;i++) {
			p[i]=new JPanel();
			centro.add(p[i]);
			p[i].setBackground(Color.gray);
		}
		nomeTx=new JTextField(20);
		JLabel nomeL=new JLabel("Nome: ");
		nomeL.setFont(new Font("Arial",Font.PLAIN,16));
		nomeTx.setFont(new Font("Arial",Font.PLAIN,16));
		p[0].add(nomeL);
		p[0].add(nomeTx);
		luogoTx=new JTextField(20);
		JLabel luogoL=new JLabel("Luogo: ");
		luogoL.setFont(new Font("Arial",Font.PLAIN,16));
		luogoTx.setFont(new Font("Arial",Font.PLAIN,16));
		p[1].add(luogoL);
		p[1].add(luogoTx);
		dataTx=new JTextField(20);
		JLabel dataL=new JLabel("Data: ");
		dataL.setFont(new Font("Arial",Font.PLAIN,16));
	    dataTx.setFont(new Font("Arial",Font.PLAIN,16));
		p[2].add(dataL);
		p[2].add(dataTx);
		oraTx=new JTextField(20);
		JLabel oraL=new JLabel("Ora: ");
		oraL.setFont(new Font("Arial",Font.PLAIN,16));
		oraTx.setFont(new Font("Arial",Font.PLAIN,16));
		p[3].add(oraL);
		p[3].add(oraTx);
		co.add(centro);
		//---SUD---
		sud=new JPanel();
		conferma=new JButton("conferma");
		conferma.addActionListener(this);
		sud.add(conferma);
		co.add(sud,"South");
		setSize(500,300);
		setVisible(true);
}
	public static void main(String[] args) {
		Grafica g1=new Grafica();
	}
	public void actionPerformed(ActionEvent e) {
	}
}
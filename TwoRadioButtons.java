import java.awt.*; 
import java.awt.event.*;
import javax.swing.*;

class OptionsPanel extends JPanel implements ActionListener {
	private JLabel quote;
	private JRadioButton comedy, philosophy, cs;
	private String comedyQuote, philosophyQuote, csQuote;

	//panel + radio buttons 
	public OptionsPanel(String cq, String pq, String csq){

	   comedyQuote = cq;
		philosophyQuote = pq;
		csQuote = csq;
			
	
	   quote = new JLabel("Choose a button.");
		quote.setFont(new Font("Helvetica", Font.BOLD, 24));
		
	   comedy = new JRadioButton("Comedy", false);
		comedy.setBackground(Color.green);
		
	   philosophy = new JRadioButton("Philosophy", false);
		philosophy.setBackground(Color.green);

		cs = new JRadioButton("Computer Science", false);
		cs.setBackground(Color.cyan);
	      
		// code with tying them together 
	   ButtonGroup group = new ButtonGroup();
	   group.add(comedy);
		group.add(philosophy);
		group.add(cs);


	   comedy.addActionListener(this);
		philosophy.addActionListener(this);
		cs.addActionListener(this);
	     

	   add(quote);
	   add(comedy);
		add(philosophy);
		add(cs);
	      

	   setBackground(Color.green);
	   setPreferredSize(new Dimension(500, 100));
	}		

	public void actionPerformed(ActionEvent event){
	   Object source = event.getSource();

	   if (source == comedy) {
	      quote.setText(comedyQuote);
	      setBackground(Color.pink);
	   } else if (source == philosophy) {
	      quote.setText(philosophyQuote);
	      setBackground(Color.yellow);
	   } else {
			quote.setText(csQuote);
			setBackground(Color.cyan);
		}
	}
}
	

public class TwoRadioButtons {
	public static void main(String[] args){
		JFrame frame = new JFrame("Quote Options");
	   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   OptionsPanel P = new OptionsPanel("Where there's a will, there's a relative.","You cannot step in the same river twice.", "Where is the 'any' key?");
	   frame.getContentPane().add(P);
	   frame.pack();
	   frame.setVisible(true);
	}
}

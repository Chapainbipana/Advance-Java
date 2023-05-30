import java.awt.event.*;
import javax.swing.*;
class Tbutton implements ItemListener{
	JFrame f;
	JLabel l;
	JToggleButton b;
	Tbutton(){
	    f=new JFrame("toggle button");
	    b=new JToggleButton("on");
		l=new JLabel("the");
		l.setBounds(40, 50, 40, 40);
    	b.setBounds(20,120,50,30);
    	b.addItemListener(this);

    	f.add(b);
		f.add(l);
	    f.setVisible(true);
    	f.setLayout(null);
    	f.setSize(300,300);
	
	}
	public void itemStateChanged(ItemEvent e){
		if(b.isSelected()){
			b.setText("off");
		}
		else{
			b.setText("on");
		}
	}
	public static void main(String args[]){
		Tbutton t=new Tbutton();
	}
	
}

//write a program create a application in awt with 2 textfields ,2Lable & 1 button when button is clicked text entered textfields are show in lables
import java.awt.*;
import java.awt.event.*;

public class application extends Frame implements ActionListener{
	TextField t1,t2,t3,t4;
		Label l1,l2,l3,l4;
	application(){
	
	
		Button b;
		l1=new Label("enter the name");
		l1.setBounds(20,50,100,30);
		
		l2=new Label("enter the address");
		l2.setBounds(20,90,100,30);
		
		t1 = new TextField();
		t1.setBounds(150,50,150,30);
		
		t2 = new TextField();
		t2.setBounds(150,90,150,30);
		
		l3=new Label();
		l3.setBounds(20,130,100,30);
		
		l4=new Label();
		l4.setBounds(20,170,100,30);
		
		
		//t3 = new TextField();
		//t3.setBounds(150,130,150,30);
		
		t4 = new TextField();
		t4.setBounds(150,170,150,30);
		
		
	    b = new Button("submit");
		b.setBounds(80,210,50,30);
		
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(b);
		add(t1);
		add(t2);		
		add(t4);
		//add(t3);
		b.addActionListener(this);
		setTitle("application");
	
		setVisible(true);
		setLayout(null);
		setSize(400,400); 
	}
	
	public void actionPerformed(ActionEvent e){
		try{
		String n1= t1.getText();
		String n2= t2.getText();
		l3.setText(n1);
		l4.setText(n2);
	}
	catch(Exception ex)
	{}
	}
	
	public static void main(String args[]){
		application a=new application();
	}
	
	
}
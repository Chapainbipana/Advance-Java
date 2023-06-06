import java.awt.*;  
import java.awt.event.*;
public class form extends Frame implements ActionListener {  
  Label l1,l2,l3;
  TextField t1,t2,t3;
  Button add,multi,sub,divi;
form(){  
l1 = new Label("First Number");  
l1.setBounds(20, 50, 100, 30);  
  
l2 = new Label("Second Number");  
l2.setBounds(20, 80, 100, 30);  
  
t1 = new TextField();  
t1.setBounds(140, 50, 100, 20);  
  
t2 = new TextField();  
t2.setBounds(140, 80, 100, 20);  
 
 add = new Button("+");  
add.setBounds(20, 140, 100, 30); 
  
 multi = new Button("*");  
multi.setBounds(130,140,100,30);

sub = new Button("-");  
sub.setBounds(20,180,100,30);

divi= new Button("/");  
divi.setBounds(130,180,100,30);


l3 = new Label("result");  
l3.setBounds(20, 110, 80, 20); 

t3 = new TextField();  
t3.setBounds(140, 110, 100, 20);

add(l1);  
add(l2);   
add(t1);  
add(t2);  
add(l3); 
add(add); 
add(multi); 
add(t3);
add(divi);
add(sub);

add.addActionListener(this);
multi.addActionListener(this);
divi.addActionListener(this);
sub.addActionListener(this);
  
setSize(300,300); 
setTitle("calculation");   
setLayout(null);  
setVisible(true);  
}  
public void actionPerformed(ActionEvent e){
	int n1= Integer.parseInt(t1.getText());
	int n2= Integer.parseInt(t2.getText());
	if(e.getSource()==add){
	t3.setText(String.valueOf(n1+n2));
	}
	if(e.getSource()==multi){
	t3.setText(String.valueOf(n1*n2));
	}
	if(e.getSource()==sub){
	t3.setText(String.valueOf(n1-n2));
	}
	if(e.getSource()==divi){
	t3.setText(String.valueOf(n1/n2));
	}
}
public static void main(String[] args) {    
form fr = new form();    
}  
}  
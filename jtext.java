import javax.swing.*;
class jtext{
	JFrame f;
	JTextField t1,t2,t3;
	jtext(){
	  f=new JFrame("text filed");
	  t1=new JTextField("i try to swing program");
	  t2=new JTextField("I try to textfield program in swing ");
	  t3=new JTextField("I try to textfield program  ");
	  t1.setBounds(20,50,150,30);
	  t2.setBounds(10,100,180,30);
	  t3.setBounds(10,150,180,30);
	  f.add(t1);
	  f.add(t2);
	  f.add(t3);
	  f.setVisible(true);
	  f.setLayout(null);
	  f.setSize(300,300);
	}
	public static void main(String args[]){
		jtext j=new jtext();
	}
}

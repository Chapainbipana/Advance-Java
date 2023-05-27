import java.awt.*;
import java.awt.event.*;

public class Gridbaglayout extends Frame
{   
    Gridbaglayout(){
    GridBagLayout bg = new GridBagLayout();
	GridBagConstraints gc=new GridBagConstraints();
	Button b1,b2,b3;
	b1=new Button("1");
	b2=new Button("2");
	b3=new Button("3");
	gc.gridx=2;
	gc.gridy=1;
	gc.gridwidth=4;
	gc.gridheight=4;
	bg.setConstraints(b1,gc);
	add(b1);
	gc.gridx=7;
	gc.gridy=7;
	bg.setConstraints(b2,gc);
	add(b2);
	gc.gridx=12;
	gc.gridy=12;
	bg.setConstraints(b3,gc);
	add(b3);
	setTitle("gridbaglayout");
	setVisible(true);
	setLayout(bg);
	setSize(300,300);
	}
	public static void main(String args[])
	{
		Gridbaglayout gg=new Gridbaglayout();
	}
}
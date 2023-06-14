import javax.swing.*;
import java.awt.*;
 
public class patientform{
	JFrame f;
    JLabel namel,addressl,gender,provence,bloodl,visited,phonel,emaill,aboutl;
    JTextField namet,addresst,phonet,emailt;
    JRadioButton female,male,others;
    //JComboBox pro;
    //JList bl;
    JCheckBox Radiotherapy,Physiotherapy,Pharmacy;
    JTextArea about;
    patientform(){
        f=new JFrame();
        f.setTitle("patient form");
        f.setSize(600,600);
        f.setLayout(null);
        namel=new JLabel("Name");
		namel.setBounds(10,50,100,30);
        namet=new JTextField();
		namet.setBounds(130,50,100,30);
        addressl=new JLabel("address");
		addressl.setBounds(10,90,100,30);
        addresst=new JTextField();
		addresst.setBounds(130,90,100,30);
        phonel=new JLabel("phone");
		phonel.setBounds(10,130,100,30);
        phonet=new JTextField();
		phonet.setBounds(130,130,100,30);
        emaill=new JLabel("email");
		emaill.setBounds(10,170,100,30);
        emailt=new JTextField();
		emailt.setBounds(130,170,100,30);
		provence=new JLabel("province:");
	    provence.setBounds(10,210,80,30);
		String province[]={"Koshi","Madhesh","Gandaki","Bagmati","Lumbini","Karnali", "Sudurpashchim"};
		 JComboBox cb = new JComboBox(province);
		 cb.setBounds(100,210,100,30);
         gender=new JLabel("gender");
		 gender.setBounds(10,250,70,30);
        female=new JRadioButton("female");
		female.setBounds(90,250,70,30);
        male=new JRadioButton("male");
		male.setBounds(170,250,70,30);
        others=new JRadioButton("others");
		others.setBounds(260,250,70,30);
        ButtonGroup g1=new ButtonGroup();
		g1.add(female);
		g1.add(male);
        g1.add(others);
		bloodl=new JLabel("blood");
		 bloodl.setBounds(10,290,70,30);
		String blood[]={"O+","O-","A+","A-","B+","B-","AB+","AB-"};
       JList bl = new JList(blood);
	   bl.setBounds(100,290,100,100);
       aboutl=new JLabel("about patient:");
       aboutl.setBounds(10, 450, 70, 30);
       about = new JTextArea();
       about.setBounds(90, 450, 250, 100);
	   visited=new JLabel("visited:");
       visited.setBounds(10, 400, 40, 30);
         Radiotherapy = new JCheckBox("Radiotherapy");    
          Radiotherapy.setBounds(60, 400,  100, 30);    	
           Physiotherapy= new JCheckBox("Physiotherapy");    
          Physiotherapy.setBounds(160, 400,  110, 30);  
 		  Pharmacy= new JCheckBox("Pharmacy");    
          Pharmacy.setBounds(270, 400,  100, 30); 
         /* ButtonGroup g2=new ButtonGroup();
          g2.add(Radiotherapy);
          g2.add(Physiotherapy);
          g2.add(Pharmacy);
           */
        f.add(namel);
        f.add(namet);
        f.add(addressl);
        f.add(addresst);
        f.add(phonel);
        f.add(phonet);
        f.add(emaill);
        f.add(emailt);
		f.add(provence);
        f.add(cb);
        f.add(gender);
		f.add(female);
		f.add(male);
        f.add(others);
        f.add(bloodl);
        f.add(bl);
        f.add(aboutl);
        f.add(about);
		f.add(visited);
		f.add(Radiotherapy);
		f.add(Physiotherapy);
		f.add(Pharmacy);
		
	  f.setVisible(true);   
    }
 public static void main(String[] args) {
    patientform  pt= new patientform();
 }

}
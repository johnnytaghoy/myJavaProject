
package myJavaApp;

//import javax.swing.*;  

public class myForm
 {
	public static void main(String args[])  
    { 
		
	 javax.swing.JFrame objFrame;	
	 javax.swing.JLabel objLabel1;
	 javax.swing.JLabel objLabel2;
	  		
      objFrame = new javax.swing.JFrame("Label Example");
             
      objLabel1 =new javax.swing.JLabel("First Label");  
      objLabel1.setBounds(50,50, 100,30);
      
      objLabel2 = new javax.swing.JLabel("Second Label"); 
      objLabel2.setBounds(50,100, 100,30);            
      
      objFrame.add(objLabel1); 
      objFrame.add(objLabel2);
      
      objFrame.setSize(600,600);  
      objFrame.setLayout(null);   
      objFrame.setVisible(true);
      
    }        
 }

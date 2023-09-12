import javax.swing.*;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
public class OnlineVotingSystem1{
    static int count1=0;
    static int count2=0;
    static int count3=0;

    OnlineVotingSystem1(){
        JFrame f=new JFrame();
        JLabel label1,label2,label3,label4;
        JTextField field1,field2;
        JButton button4,button5;
        JRadioButton button1,button2,button3;
       
        
        label1 =new JLabel("ONLINE VOTING SYSTEM ");
        label1.setBounds(210,10,400,25);
        label2=new JLabel("ENTER NAME");
        label2.setBounds(0,40,220,50);
        field1=new JTextField();
        field1.setBounds(210,50,300,30);
        label3=new JLabel("ENTER PHONE");
        label3.setBounds(0,90,220,50);
        field2=new JTextField();
        field2.setBounds(210,100,300,30);
        label4=new JLabel("CAST YOUR VOTE HERE"); 
        label4.setBounds(0,140,220,100);
        button1=new JRadioButton("PARTY A");
        button1.setBounds(0,220,150,50);
        button2=new JRadioButton("PARTY B");
        button2.setBounds(0,270,150,50); 
        button3=new JRadioButton("PARTY C");
        button3.setBounds(0,320,150,50);
        button4=new JButton("SUBMIT YOUR VOTE");
        button4.setBounds(170,230,150,50);
        button5=new JButton("CHECK RESULT");
        button5.setBounds(170,310,150,50);
        
        f.add(label1);
        f.add(label2);f.add(label3);
        f.add(label4);
        f.add(field1);
        f.add(field2);
        f.add(button1);
        f.add(button2);
        f.add(button3);
        f.add(button4);
        f.add(button5);

      f.getContentPane().setBackground(Color.YELLOW);
      label1.setFont(new Font("Arial",Font.PLAIN,20));
      label1.setForeground(Color.RED);
      label2.setFont(new Font("Arial",Font.PLAIN,15));
      label3.setFont(new Font("Arial",Font.PLAIN,15));
      label4.setFont(new Font("Arial",Font.PLAIN,15));
      button1.setFont(new Font("Arial",Font.PLAIN,15));
      button2.setFont(new Font("Arial",Font.PLAIN,15));
      button3.setFont(new Font("Arial",Font.PLAIN,15));
      button4.setFont(new Font("Arial",Font.PLAIN,10));
      button5.setFont(new Font("Arial",Font.PLAIN,10));
            
            
                 

        f.setSize(600,600);
        f.setLayout(null);
        f.setVisible(true);
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt){
              if(button1.isSelected())
                button2.setSelected(false);
                button3.setSelected(false);
            
            }
          });
         button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt){
              if(button2.isSelected())
                button1.setSelected(false);
                button3.setSelected(false);
            }
          });
          button3.addActionListener(new ActionListener()  {
            public void actionPerformed(ActionEvent evt){
                if(button3.isSelected()){
                    button1.setSelected(false);
                    button2.setSelected(false);
                }
            }
          });
           button4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt){
                if(button1.isSelected()){
                    count1++;
                }
                else if(button2.isSelected()){
                    count2++;
                }
                else if(button3.isSelected()){
                    count3++;
                }
               
                field1.setText(" ");
                field2.setText(" ");
                button1.setSelected(false);
                button2.setSelected(false);
                button3.setSelected(false);
    
            }
          });
           button5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt){
                if(count1>count2&&count1>count3){
                    JOptionPane.showMessageDialog(f,"Party A"+count1+"\n Party B"+count2+"\n Party c"+count3+"\n\n PARTY A has a lead");
                }
                else if(count2>count1&&count2>count3){
                    JOptionPane.showMessageDialog(f,"Party A"+count1+"\n Party B"+count2+"\n Party c"+count3+"\n\n PARTY B has a lead");
                }
                  else if(count3>count1&&count3>count2){
                    JOptionPane.showMessageDialog(f,"Party A"+count1+"\n Party B"+count2+"\n Party c"+count3+"\n\n PARTY C has a lead");
                }
            }
          });
          
        }
    
    public static void main(String[]args){
          new OnlineVotingSystem1();


    }
}
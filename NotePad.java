package project;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;

public class NotePad extends JFrame {
   NotePad(){
	   //Frame code:
	  setTitle("NotePad");
	//  setBackground(Color.white);
	  ImageIcon NotePadicon=new ImageIcon("C:\\Users\\UII\\Desktop\\Data Structures (Lab)\\FinalProject\\src\\project\\notepad.png");
	  Image icon=NotePadicon.getImage();
	  setIconImage(icon);
	  JMenuBar menubar=new JMenuBar();
	  menubar.setBackground(Color.WHITE);
	 JMenu file=new JMenu("File");
	 file.setFont(new Font("AERIAL",Font.PLAIN,14));
	 menubar.add(file);
	 setJMenuBar(menubar);

	 JMenu edit=new JMenu("Edit");
	 edit.setFont(new Font("AERIAL",Font.PLAIN,14));
	 menubar.add(edit);
	 setJMenuBar(menubar);
	 
	 JMenu format=new JMenu("Format");
	 format.setFont(new Font("AERIAL",Font.PLAIN,14));
	 menubar.add(format);
	 setJMenuBar(menubar);
	 
	 JMenu view=new JMenu("View");
	 view.setFont(new Font("AERIAL",Font.PLAIN,14));
	 menubar.add(view);
	 setJMenuBar(menubar);
	 
	 JMenu help=new JMenu("Help");
	 help.setFont(new Font("AERIAL",Font.PLAIN,14));
	 menubar.add(help);
	 setJMenuBar(menubar);
	 
	 JMenu about=new JMenu("About");
	 about.setFont(new Font("AERIAL",Font.PLAIN,14));
	 menubar.add(about);
	 setJMenuBar(menubar);
	  
	  setExtendedState(Frame.MAXIMIZED_BOTH);
	  setVisible(true);
   }
   public static void main(String args[]) {
	  new NotePad();
   }
}

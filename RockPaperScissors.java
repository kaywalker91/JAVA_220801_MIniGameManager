package Portfolio;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Scanner;

import javax.swing.border.*;
import javax.swing.text.Caret;


public class RockPaperScissors extends JFrame
{
	
	JLabel lbl,com,result,com1,result1,win1,lose1,draw1,cnt1,tot;
    JPanel Panel1,Panel2;
    JButton b1,b2,rock,paper,scissors;
    int playerinput;
    int win,draw,lose,cnt;
    
    public RockPaperScissors()
    {
          super( "가위바위보게임" );
          
          setLayout(null);
   
          EtchedBorder eborder =  new EtchedBorder();
          
          Font font30 = new Font("SansSerif", Font.BOLD, 30);
          Font font25 = new Font("SansSerif", Font.BOLD, 25);
          Font font20 = new Font("SansSerif", Font.BOLD, 20);
  		  Font font15 = new Font("SansSerif", Font.BOLD, 15);
  		  Font font10 = new Font("SansSerif", Font.BOLD, 10);
  		
          lbl = new JLabel( "가위/바위/보 게임",JLabel.CENTER);
          lbl.setBounds(80, 50, 350, 30);		
          lbl.setFont(font30);
          
          lbl.setBorder(eborder);
          
          add( lbl );
          
          Panel2 = new JPanel();
          Panel2.setBounds(100, 130, 300, 150);		
          rock = new JButton("바위");
          rock.setFont(font25);
          paper = new JButton("보");
          paper.setFont(font25);
          scissors = new JButton("가위");
          scissors.setFont(font25);
          Panel2.add( rock );
          Panel2.add( paper );
          Panel2.add( scissors );
          
          Panel1 = new JPanel();
          Panel1.setBounds(200, 220, 100, 100);		
          b1 = new JButton("게임시작");
          b1.setFont(font15);
          b2 = new JButton("통 계");
          b2.setFont(font20);
         
          Panel1.add( b2 );
          
          com = new JLabel("컴퓨터:");
          com.setBounds(160, 320, 100, 30);
          com.setFont(font25);
          com1 = new JLabel("");
          com1.setBounds(250, 320, 70, 30);
          com1.setFont(font25);
         
          result = new JLabel("결 과:");
          result.setBounds(160, 380, 100, 30);
          result.setFont(font25);
          result1 = new JLabel("");
          result1.setBounds(230, 380, 100, 30);
          result1.setFont(font25);
        
          add(Panel1);
          add(Panel2);
          add(com);
          add(com1);
          add(result);
          add(result1);
          
          setSize(500,500);
          setVisible(true);
          
          addWindowListener(new WindowAdapter() 
          {
        	  public void windowClosing(WindowEvent e) 
        	  {
		   		setVisible(false);
		   		dispose();
		   	  }
		  });
          
//          setDefaultCloseOperation(EXIT_ON_CLOSE);
        
          rock.addActionListener(new ActionListener() 
  		  {
        	  public void actionPerformed(ActionEvent e) 
        	  {
        		  if(e.getSource() == rock)
        		  {
        			System.out.println("바위[1]");
        			playerinput = 1;
        			
        			int computer =(int)(Math.random()*3)+1;
        			
        			if(computer == 3)
        			{
        				System.out.println("플레이어승리!");
        				System.out.println("컴퓨터:가위");
        				com1.setText("가위");
        				result1.setText("승리");
        				win++;
        				cnt++;
        			}
        			else if(computer == 2)
        			{
        				System.out.println("컴퓨터승리!");
        				System.out.println("컴퓨터:보");
        				com1.setText("보");
        				result1.setText("패배");
        				lose++;
        				cnt++;
        			}
        			else
        			{
        				System.out.println("무승부!");
        				System.out.println("컴퓨터:주먹");
        				com1.setText("주먹");
        				result1.setText("무승부");
        				draw++;
        				cnt++;
        			}
    			}				
    		}
      	 });
        
        paper.addActionListener(new ActionListener() 
  		{
        	public void actionPerformed(ActionEvent e) 
    		{
    				if(e.getSource() == paper)
        			{
    					System.out.println("보[2]");
        				playerinput = 2;
            			
            			int computer =(int)(Math.random()*3)+1;
            			
            			if(computer == 1)
            			{
            				System.out.println("플레이어승리!");
            				System.out.println("컴퓨터:주먹");
            				com1.setText("주먹");
            				result1.setText("승리");
            				win++;
            				cnt++;
            			}
            			else if(computer == 3)
            			{
            				System.out.println("컴퓨터승리!");
            				System.out.println("컴퓨터:가위");
            				com1.setText("가위");
            				result1.setText("패배");
            				lose++;
            				cnt++;
            			}
            			else
            			{
            				System.out.println("무승부!");
            				System.out.println("컴퓨터:보");
            				com1.setText("보");
            				result1.setText("무승부");
            				draw++;
            				cnt++;
            			}
        			}								
    		}
      	});
        
        scissors.addActionListener(new ActionListener() 
  		{
        	public void actionPerformed(ActionEvent e) 
    		{
    			if(e.getSource() == scissors)
    	    	{
    				System.out.println("가위[3]");
    				playerinput = 3;
    				
    				int computer =(int)(Math.random()*3)+1;
        			
        			if(computer == 2)
        			{
        				System.out.println("플레이어승리!");
        				System.out.println("컴퓨터:보");
        				com1.setText("보");
        				result1.setText("승리");
        				win++;
        				cnt++;
        			}
        			else if(computer == 1)
        			{
        				System.out.println("컴퓨터승리!");
        				System.out.println("컴퓨터:주먹");
        				com1.setText("주먹");
        				result1.setText("패배");
        				lose++;
        				cnt++;
        			}
        			else
        			{
        				System.out.println("무승부!");
        				System.out.println("컴퓨터:가위");
        				com1.setText("가위");
        				result1.setText("무승부");
        				draw++;
        				cnt++;
        			}
    	    	}				
    		}
      	});
        
        b2.addActionListener(new ActionListener() 
  		{
        	public void actionPerformed(ActionEvent e) 
    		{
    			if(e.getSource() == b2)
    	    	{
    				final Frame f = new Frame();
    				
    			   	f.setTitle("총전적");
    			   	
    			   	tot = new JLabel("통 계",JLabel.CENTER);
    			   	tot.setBounds(180, 100, 150, 50);
    			   	tot.setFont(font25);
    			   	cnt1 = new JLabel("총전적: "+cnt+"판",JLabel.CENTER);
    			   	cnt1.setBounds(180, 150, 150, 50);
    			   	cnt1.setFont(font20);
    			   	win1 = new JLabel("나의승리: "+win+"승",JLabel.CENTER);
    			   	win1.setBounds(180, 210, 150, 50);
    			   	win1.setFont(font20);
    			   	lose1 = new JLabel("나의패배: "+lose+"패",JLabel.CENTER);
    			   	lose1.setBounds(180, 270, 150, 50);
    			   	lose1.setFont(font20);
    			   	draw1 = new JLabel("무승부: "+draw+"무",JLabel.CENTER);
    			   	draw1.setBounds(180, 330, 150, 50);
    			   	draw1.setFont(font20);
    			   	
    			   	f.add(tot);
    			   	f.add(cnt1);
    			   	f.add(win1);
    				f.add(lose1);
    				f.add(draw1);
    			   	
    			    f.setLayout(null);
    				
    			   	f.setVisible(true);
    			   	
    			   	f.addWindowListener(new WindowAdapter() {
    			   		public void windowClosing(WindowEvent e) {
    			   			f.setVisible(false);
    			   			f.dispose();
    			   		}
    			   	});
    			   	
    			   	f.setSize(500,500);
    			     	   
    			}
    				System.out.println("총전적");
    				System.out.println("승 리: "+win);
    				System.out.println("패 배: "+lose);
    				System.out.println("무승부: "+draw);
    				
    	    	}
        		
      });
    }
    
           
public static void main( String args[] )
	{   		
    	new RockPaperScissors();
 	}
}




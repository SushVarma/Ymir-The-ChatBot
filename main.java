import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
 
public class Main extends JFrame {
    //Typing Bar
    private JTextField inputBar = new JTextField();
    //Chat Output Area
    private JTextArea chatOutput = new JTextArea();
    
    public Main() {
        //Creating the Frame
        JScrollPane pane = new JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        this.setContentPane(pane);			
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(650,650);
        this.setVisible(true);
        this.setResizable(true);
	        
          // Setting GUI title 
          this.setTitle("Ymir: Customer Service ChatBot");
        
        // creating inputBar 
        inputBar.setLocation(2, 540);
        inputBar.setSize(540, 50);
 
        //inputBar Action Event
        inputBar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0) {
                String userInput = inputBar.getText().toLowerCase();
                chatOutput.append("You: " + inputBar.getText() + "\n");
                
				switch(userInput) {
					default: 
						inputBar.setText("");
						botOutput("Please select a catagory I can assist you with(Select category number): \n\n 1. Recent Product Status \n\n 2. Report Product Issue \n\n 3. Contact Customer Support Representative \n\n 4. Exit");
						break;						
					case "1": 
						inputBar.setText("");
						botOutput("You have recently ordered product 'HP Laptop' which has order id 'Order12345' and the status is 'In dispatching' state");
						break;
					case "2": 
						inputBar.setText("");
						botOutput("Please enter product order id");
						break;
					case "3": 
						inputBar.setText("");
						botOutput("Please contact on 9874563210 to speak to CSR");
						break;
					case "4": 
						inputBar.setText("");
						System.exit(0);
						break;					
				}
            }
        });
        
      //chatOutput
        chatOutput.setLocation(15, 5);
        chatOutput.setSize(560, 510);
        chatOutput.setLineWrap(true);
        chatOutput.setEditable(false);
        chatOutput.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 12));
        //Frame items
        this.add(inputBar);
        this.add(chatOutput);
    }
    
    public void botOutput(String s){
        chatOutput.append("Ymir: " + s + "\n"+"\n");
		
    }
    
    public static void main(String[] args){
        new Main();
		
    }
  
}

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class CalculatorApp implements  ActionListener
 {
    double a=0,b=0,c=0;
    int calculation;
     JFrame frame=new JFrame("calculator");
     JLabel label=new JLabel();
     JTextField textField=new JTextField();
     JRadioButton onRadioButton=new JRadioButton("on");
     JRadioButton offRadioButton=new JRadioButton("off");
     JButton zero=new JButton( "0");
     JButton equal=new JButton("=");
     JButton one=new JButton("1");     
     JButton two=new JButton("2");     
     JButton three=new JButton("3");     
     JButton four=new JButton("4");     
     JButton five=new JButton("5");     
     JButton six=new JButton("6");     
     JButton seven=new JButton("7");     
     JButton eighth=new JButton("8");     
     JButton nine=new JButton("9");     
     JButton plus=new JButton("+");     
     JButton minus=new JButton("-");     
     JButton multiply=new JButton("*");     
     JButton divide=new JButton("/");     
     JButton square=new JButton("x\u00b2");     
     JButton delete=new JButton("DEL"); 
     JButton clear=new JButton("clr");   
     JButton dot=new JButton("."); 
     JButton reciprocal=new JButton("1/X");
     JButton sqrt=new JButton("\u221A"); 
    CalculatorApp()
    {
        gui();   
        component(); 
        action();   
    } 
    public void component()
    {
        label.setBounds(250, 0, 50, 50);
        label.setForeground(Color.white);
        frame.add(label);

        textField.setBounds( 10,  40, 270, 40);
        textField.setFont(new Font("arial",Font.BOLD,20));
        textField.setEditable(false);
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        frame.add(textField);

        onRadioButton.setBounds(10,95,60,40);
        onRadioButton.setSelected(true);
        onRadioButton.setFont(new Font("arial",Font.BOLD,15));
        onRadioButton.setBackground(Color.black);
        onRadioButton.setForeground(Color.white);
        frame.add(onRadioButton);

        offRadioButton.setBounds(10,120,60,40);
        offRadioButton.setSelected(true);
        offRadioButton.setFont(new Font("arial",Font.BOLD,15));
        offRadioButton.setBackground(Color.black);
        offRadioButton.setForeground(Color.white);
        frame.add(offRadioButton);

        ButtonGroup buttonGroup=new ButtonGroup();
        buttonGroup.add(onRadioButton);
        buttonGroup.add(offRadioButton);

        seven.setBounds(10, 230, 65, 55);
        seven.setFont(new Font("arial",Font.BOLD,20));
        seven.setFocusable(false);
        frame.add(seven);

        eighth.setBounds(80, 230, 65, 55);
        eighth.setFont(new Font("arial",Font.BOLD,20));
        eighth.setFocusable(false);

        frame.add(eighth);


        nine.setBounds(150, 230, 65, 55);
        nine.setFont(new Font("arial",Font.BOLD,20));
        nine.setFocusable(false);

        frame.add(nine);

        four.setBounds(10, 290, 65, 55);
        four.setFont(new Font("arial",Font.BOLD,20));
        frame.add(four);

        five.setBounds(80, 290, 65, 55);
        five.setFocusable(false);

        five.setFont(new Font("arial",Font.BOLD,20));
        frame.add(five);

        six.setBounds(150, 290, 65, 55);
        six.setFont(new Font("arial",Font.BOLD,20));
        six.setFocusable(false);

        frame.add(six);

        one.setBounds(10, 350, 65, 55);
        one.setFont(new Font("arial",Font.BOLD,20));
        one.setFocusable(false);

        frame.add(one);

        two.setBounds(80, 350, 65, 55);
        two.setFont(new Font("arial",Font.BOLD,20));
        two.setFocusable(false);

        frame.add(two);

        three.setBounds(150, 350, 65, 55);
        three.setFont(new Font("arial",Font.BOLD,20));
        three.setFocusable(false);

        frame.add(three);
  
        dot.setBounds(145, 410, 70, 40);
        dot.setFont(new Font("arial",Font.BOLD,25));
        dot.setFocusable(false);

        frame.add(dot);

        zero.setBounds(10, 410, 130, 40);
        zero.setFont(new Font("arial",Font.BOLD,25));
        zero.setFocusable(false);

        frame.add(zero); 

        equal.setBounds(220, 350, 60, 100);
        equal.setFont(new Font("arial",Font.BOLD,25));
        equal.setBackground(new Color(0, 0, 40));
        equal.setForeground(Color.white);

        equal.setFocusable(false);

        frame.add(equal);

        divide.setBounds(220, 110, 60, 60);
        divide.setFont(new Font("arial",Font.BOLD,25));
        divide.setBackground(new Color(0, 0, 40));
        divide.setForeground(Color.white);

        divide.setFocusable(false);

        frame.add(divide);

        multiply.setBounds(220, 230, 60, 60);
        multiply.setFont(new Font("arial",Font.BOLD,25));
        multiply.setBackground(new Color(0, 0, 40));
        multiply.setForeground(Color.white);

        multiply.setFocusable(false);

        frame.add(multiply);

        minus.setBounds(220, 170, 60, 60);
        minus.setFont(new Font("arial",Font.BOLD,25));
        minus.setBackground(new Color(0, 0, 40));
        minus.setForeground(Color.white);

        minus.setFocusable(false);

        frame.add(minus);

        plus.setBounds(220, 290, 60, 60);
        plus.setFont(new Font("arial",Font.BOLD,25));
        plus.setBackground(new Color(0, 0, 40));
        plus.setForeground(Color.white);

       plus.setFocusable(false);

        frame.add(plus);

        delete.setBounds(150, 110, 65, 55);
        delete.setFont(new Font("arial",Font.BOLD,15));
        delete.setBackground(Color.gray);
        delete.setForeground(Color.white);

        frame.add(delete);

        clear.setBounds(80, 110, 65, 55);
        clear.setFont(new Font("arial",Font.BOLD,20));
        clear.setBackground(Color.gray);
        clear.setForeground(Color.white);
        clear.setFocusable(false);

        frame.add(clear);
    square.setBounds(80,170,65 , 55);
    square.setFont(new Font("arial",Font.BOLD,20));
    frame.add(square);
    reciprocal.setBounds(150,170,65 , 55);
    reciprocal.setFont(new Font("arial",Font.BOLD,14));
    frame.add(reciprocal);
    sqrt.setBounds(10,170,65 , 55);
    sqrt.setFont(new Font("arial",Font.BOLD,20));
    frame.add(sqrt);
         
    }
    public void gui()
    {
        frame.setSize(350 , 550);
        frame.getContentPane().setLayout(null);    
        frame.getContentPane().setBackground(Color.black );
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    }
    public void action()
    {
        onRadioButton.addActionListener(this);
        offRadioButton.addActionListener(this);
        one.addActionListener(this);
        two.addActionListener(this);
        three.addActionListener(this);
        four.addActionListener(this);
        five.addActionListener(this);
        six.addActionListener(this);
        seven.addActionListener(this);
        eighth.addActionListener(this);
        nine.addActionListener(this);
        zero.addActionListener(this);
        plus.addActionListener(this);
        minus.addActionListener(this);
        multiply.addActionListener(this);
        divide.addActionListener(this);
        clear.addActionListener(this);
        delete.addActionListener(this);
        sqrt.addActionListener(this);
        square.addActionListener(this);
        reciprocal.addActionListener(this);
        dot.addActionListener(this);
    equal.addActionListener(this);

    }
    public static void main(String[] args) {
        CalculatorApp cal=new CalculatorApp();
    }
 
 public void actionPerformed(ActionEvent e)
{
  Object o=e.getSource();
  if(o==onRadioButton)
  {
    on();
  }
  else if(o==offRadioButton)
  {
    off();
  }
  else if(o==clear)
  {
   label.setText("");
   textField.setText(""); 
  }
  else if(o==delete)
  {
    int l=textField.getText().length();
    int m=l-1;
    if(l>0)
    {
         StringBuilder s=new StringBuilder(textField.getText());
         s.deleteCharAt(m);
         textField.setText(s.toString());
    }
    if(textField.getText().endsWith(""));
    label.setText("");
  }
  else if(o==zero)
  {
    if(textField.getText().equals("0"))
    {
    return;
    }else
  {
    textField.setText(textField.getText()+"0");
  }
}else if(o==one)
  {
    textField.setText(textField.getText()+"1");
  }
  else if(o==two)
  {
    textField.setText(textField.getText()+"2");
  }
  else if(o==three)
  {
    textField.setText(textField.getText()+"3");
  }
  else if(o==four)
  {
    textField.setText(textField.getText()+"4");
  }
  else if(o==five)
  {
    textField.setText(textField.getText()+"5");
  }
  else if(o==six)
  {
    textField.setText(textField.getText()+"6");
  }
  else if(o==seven)
  {
    textField.setText(textField.getText()+"7");
  }
  else if(o==eighth)
  {
    textField.setText(textField.getText()+"8");
  }
  else if(o==nine)
  {
    textField.setText(textField.getText()+"9");
  }
  else if(o==dot)
  {
    if(textField.getText().contains(".")){
    return;
  }
  else
  {
    textField.setText(textField.getText()+".");
  }
  }
  else if(o==plus)
  {
    String t=textField.getText();
    a=Double.parseDouble(textField.getText());
    calculation=1;
    textField.setText("");
    label.setText(t+"+");
}
else if(o==minus)
{
  String t=textField.getText();
  a=Double.parseDouble(textField.getText());
  calculation=2;
  textField.setText("");
  label.setText(t+"-");
}
else if(o==divide)
{
  String t=textField.getText();
  a=Double.parseDouble(textField.getText());
  calculation=3;
  textField.setText("");
  label.setText(t+"/");
}
else if(o==multiply)
{
  String t=textField.getText();
  a=Double.parseDouble(textField.getText());
  calculation=4;
  textField.setText("");
  label.setText(t+"*");
}
else if(o==square)
{
    a=Double.parseDouble(textField.getText());
    double sq=Math.pow(a, 2);
   String st=Double.toString(sq);
   if(st.endsWith(".0")){
    textField.setText(st.replace(".0",""));
   }else{
    textField.setText(st);
   }
}else if(o==sqrt)
{
    a=Double.parseDouble(textField.getText());
    double sr=Math.sqrt(a);
    textField.setText(Double.toString(sr));
}
else if(o==reciprocal)
{
    a=Double.parseDouble(textField.getText());
    double rec=1/a;
     String st=Double.toString(rec);
     if(st.endsWith(".0"))
     {
        textField.setText(st.replace(".0",""));
     }else{
        textField.setText(st);
     }
}else if(o==equal)
{
    b=Double.parseDouble(textField.getText());
    switch(calculation)
    {
        case 1:
        c=a+b;
        break;
        case 2:
        c=a-b;
        break;
        case 3:
        c=a/b;
        break;
        case 4:
        c=a*b;
        break;
    }if(Double.toString(c).endsWith(".0"))
    {
        textField.setText(Double.toString(c).replace(".0",""));
    }else{
        textField.setText(Double.toString(c));
    }
    label.setText("");
    a=c;
}
}
public void off()
{
    onRadioButton.setEnabled(true);
    offRadioButton.setEnabled(false);
    textField.setEnabled(false);
    label.setEnabled(false);
    clear.setEnabled(false);
    delete.setEnabled(false);
    plus.setEnabled(false);
    minus.setEnabled(false);
    divide.setEnabled(false);
    multiply.setEnabled(false);
    one.setEnabled(false);
    two.setEnabled(false);
    three.setEnabled(false);
    four.setEnabled(false);
    five.setEnabled(false);
    six.setEnabled(false);
    seven.setEnabled(false);
    eighth.setEnabled(false);
    nine.setEnabled(false);
    zero.setEnabled(false);
    sqrt.setEnabled(false);
    square.setEnabled(false);
    dot.setEnabled(false);
    equal.setEnabled(false);
    reciprocal.setEnabled(false);
}
public void on()
{
  onRadioButton.setEnabled(false);
  offRadioButton.setEnabled(true);
  textField.setEnabled(true);
  label.setEnabled(true);
  clear.setEnabled(true);
  delete.setEnabled(true);
  plus.setEnabled(true);
  minus.setEnabled(true);
  divide.setEnabled(true);
  multiply.setEnabled(true);
  one.setEnabled(true);
  two.setEnabled(true);
  three.setEnabled(true);
  four.setEnabled(true);
  five.setEnabled(true);
  six.setEnabled(true);
  seven.setEnabled(true);
  eighth.setEnabled(true);
  nine.setEnabled(true);
  zero.setEnabled(true);
  sqrt.setEnabled(true);
  square.setEnabled(true);
  dot.setEnabled(true);
  equal.setEnabled(true);
  reciprocal.setEnabled(true);
}
}
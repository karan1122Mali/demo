import java.awt.*;
import javax.swing.*;


class Cal1  extends JFrame
{

public static void main(String arg[])
{

Cal1 c1=new Cal1();
c1.setVisible(true);
c1.setSize(300,500);
c1.setTitle("Calculator");
c1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



}
Cal1()
{
int i;
TextField tf;
Container c=getContentPane();
GridLayout f=new GridLayout(4,3);
c.setLayout(f);

tf=new TextField();
c.add(tf);
for(i=0;i<10;i++)
{

c.add(new Button(""+i));

}
i++;
c.add(new Button("+"));
i++;
c.add(new Button("-"));
i++;
c.add(new Button("*"));
i++;
c.add(new Button("/"));
i++;
c.add(new Button("="));
i++;
c.add(new Button("CLR"));



}



}
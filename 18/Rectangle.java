import java.awt.*;
import javax.swing.text.html.StyleSheet;
import java.applet.*;
public class Rectangle extends Applet
{
String a,b,c,d,e;
Color colr;
int x1,y1,x2,y2;
StyleSheet s=new StyleSheet();
public void init()
{
a = getParameter("x1");
b= getParameter("y1");
c = getParameter("x2");
d = getParameter("y2");
e = getParameter("color");
x1 = Integer.parseInt(a);
y1 = Integer.parseInt(b);
x2 = Integer.parseInt(c);
y2 = Integer.parseInt(d);
colr = s.stringToColor(e);
}
public void paint(Graphics g)
{
g.setColor(colr);
g.drawRect(x1,y1,x2,y2);
}
}


// HTML CODE

<html>
<head><title> Rectangle1</title><html>
<body>
<applet code=Rectangle.java width=600 height=600>
<param name=”x1” value=100>
<param name=”y1” value=100>
<param name=”x2” value=100>
<param name=”y2” value=300>
<param name=”color” value=red>
</applet>
</body>
</html>

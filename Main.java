package Main;

import java.awt.*; 
import java.awt.event.*;

public class Main extends Frame{
	public Label dugme = new Label("");
	public Label l1 = new Label("R1");
	public Label l2 = new Label("R2");
	public Label l3 = new Label("R3");
    public Label l4 = new Label("Dolazni smnp");
    public TextField tf11 = new TextField();
    public TextField tf12 = new TextField();
    public TextField tf13 = new TextField();
    public Label l5 = new Label("Odlazni smnp");
    public TextField tf21 = new TextField();
    public TextField tf22 = new TextField();
    public TextField tf23 = new TextField();
    public Label l6 = new Label("Dolazni get");
    public TextField tf31 = new TextField();
    public TextField tf32 = new TextField();
    public TextField tf33 = new TextField();
    public Label l66 = new Label("Dolazni odgovori");
    public TextField t1f31 = new TextField();
    public TextField t1f32 = new TextField();
    public TextField t1f33 = new TextField();
    public Label l7 = new Label("Odlazni get");
    public TextField tf41 = new TextField();
    public TextField tf42 = new TextField();
    public TextField tf43 = new TextField();
    public Label l77 = new Label("Odlazni odgovori");
    public TextField t1f41 = new TextField();
    public TextField t1f42 = new TextField();
    public TextField t1f43 = new TextField();
    public Label l8 = new Label("Dolazni set");
    public TextField tf51 = new TextField();
    public TextField tf52 = new TextField();
    public TextField tf53 = new TextField();
    public Label l9 = new Label("Odlazni set");
    public TextField tf61 = new TextField();
    public TextField tf62 = new TextField();
    public TextField tf63 = new TextField();
    public Label l10 = new Label("Dolazni trapovi");
    public TextField tf71 = new TextField();
    public TextField tf72 = new TextField();
    public TextField tf73 = new TextField();
    public Label l11 = new Label("Odlazni trapovi");
    public TextField tf81 = new TextField();
    public TextField tf82 = new TextField();
    public TextField tf83 = new TextField();
    public Label l12 = new Label("Neispravni community");
    public TextField tf91 = new TextField();
    public TextField tf92 = new TextField();
    public TextField tf93 = new TextField();
    public Panel p = new Panel(new GridLayout(12 , 1));
	
    public Main() {
		super("Varijanta 7");
		setSize(600 , 500);
		setBackground(Color.green);
		Panel p1 = new Panel(new GridLayout(1,4));
		Panel p2 = new Panel(new GridLayout(1,4));
		Panel p3 = new Panel(new GridLayout(1,4));
		Panel p4 = new Panel(new GridLayout(1,4));
		Panel p44 = new Panel(new GridLayout(1,4));
		Panel p5 = new Panel(new GridLayout(1,4));
		Panel p55 = new Panel(new GridLayout(1,4));
		Panel p6 = new Panel(new GridLayout(1,4));
		Panel p7 = new Panel(new GridLayout(1,4));
		Panel p8 = new Panel(new GridLayout(1,4));
		Panel p9 = new Panel(new GridLayout(1,4));
		Panel p10 = new Panel(new GridLayout(1,4));
	    
	    p1.add(dugme);
	    p1.add(l1);
	    p1.add(l2);
	    p1.add(l3);
	    p2.add(l4);
	    p2.add(tf11);
	    p2.add(tf12);
	    p2.add(tf13);
	    p3.add(l5);
	    p3.add(tf21);
	    p3.add(tf22);
	    p3.add(tf23);
	    p4.add(l6);
	    p4.add(tf31);
	    p4.add(tf32);
	    p4.add(tf33);
	    p44.add(l66);
	    p44.add(t1f31);
	    p44.add(t1f32);
	    p44.add(t1f33);
	    p5.add(l7);
	    p5.add(tf41);
	    p5.add(tf42);
	    p5.add(tf43);
	    p55.add(l77);
	    p55.add(t1f41);
	    p55.add(t1f42);
	    p55.add(t1f43);
	    p6.add(l8);
	    p6.add(tf51);
	    p6.add(tf52);
	    p6.add(tf53);
	    p7.add(l9);
	    p7.add(tf61);
	    p7.add(tf62);
	    p7.add(tf63);
	    p8.add(l10);
	    p8.add(tf71);
	    p8.add(tf72);
	    p8.add(tf73);
	    p9.add(l11);
	    p9.add(tf81);
	    p9.add(tf82);
	    p9.add(tf83);
	    p10.add(l12);
	    p10.add(tf91);
	    p10.add(tf92);
	    p10.add(tf93);
	    p.add(p1);
	    p.add(p2);
	    p.add(p3);
	    p.add(p4);
	    p.add(p44);
	    p.add(p5);
	    p.add(p55);
	    p.add(p6);
	    p.add(p7);
	    p.add(p8);
	    p.add(p9);
	    p.add(p10);
		add(p);
	    Nit prviRuter = new Nit("192.168.10.1" ,1 ,this);
		Nit drugiRuter = new Nit("192.168.20.1" ,2 , this);
		Nit treciRuter = new Nit("192.168.30.1" , 3, this);
	    addWindowListener(new WindowAdapter() {
	    	public void windowClosing(WindowEvent e)
	    	{prviRuter.prekini();
	    	drugiRuter.prekini();
	    	treciRuter.prekini();
	    	dispose();}
	    	});
	    
		prviRuter.start();
		drugiRuter.start();
		treciRuter.start();
	    
		setVisible(true);
	}
	public static void main(String[] args) {
		new Main();
		
	}
}

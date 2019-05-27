package model;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;

public class SlashDecorator extends Decorator {
	private int x1, y1, w1, h1;

	public SlashDecorator(JComponent c) {
		super(c);
	}

	public void setBounds(int x, int y, int w, int h) {
		x1 = x;
		y1 = y;
		w1 = w;
		h1 = h;
		super.setBounds(x, y, w, h);
	}

	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(Color.LIGHT_GRAY);
		g.drawLine(0, 0, w1, h1);
		g.drawLine(1, 1, w1 - 2, h1 - 2);
		g.drawLine(w1, 0, 0, h1);
		g.drawLine(w1-2, 1, 1, h1 - 2);
	}
}

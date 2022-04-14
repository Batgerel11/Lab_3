package lights;

import java.awt.Color;

public class ColoredLight extends Light{
	
	Color lightColor;
	

	public ColoredLight(Color color) {
		// TODO
		lightColor = color;
		//throw new RuntimeException("ColoredLight(Color) not yet implemented!");
	}
	

	public Color getColor() {
		// TODO
		return lightColor;
		//throw new RuntimeException("ColoredLight.getColor() not yet implemented!");
	}
	

	public void setColor(Color c) {
		// TODO
		lightColor = c;
		//throw new RuntimeException("ColoredLight.setColor() not yet implemented!");
	}
//
	@Override
	public void randomChange() {
		// TODO. 
		lightColor = new Color((int) 
				(Math.random()*255), 
				(int) (Math.random()*255), 
				(int) (Math.random()*255));
		// Take advantage of Light.randomChange
		//throw new RuntimeException("ColoredLight.randomChange() not yet implemented!");
	}
	
}
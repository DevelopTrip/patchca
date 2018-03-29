package cn.jetclouds.patchca.background;

import cn.jetclouds.patchca.color.ColorFactory;
import cn.jetclouds.patchca.color.SingleColorFactory;

import java.awt.*;
import java.awt.image.BufferedImage;


public class SingleColorBackgroundFactory implements BackgroundFactory {

	private ColorFactory colorFactory;
	
	public SingleColorBackgroundFactory() {
		colorFactory = new SingleColorFactory(Color.WHITE);
	}

	public SingleColorBackgroundFactory(Color color) {
		colorFactory = new SingleColorFactory(color);
	}
	
	public void setColorFactory(ColorFactory colorFactory) {
		this.colorFactory = colorFactory;
	}

	public void fillBackground(BufferedImage dest) {
		Graphics g = dest.getGraphics();
		g.setColor(colorFactory.getColor(0));
		g.fillRect(0, 0, dest.getWidth(), dest.getHeight());
	}

}

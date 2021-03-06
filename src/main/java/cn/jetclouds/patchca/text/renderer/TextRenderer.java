package cn.jetclouds.patchca.text.renderer;

import cn.jetclouds.patchca.color.ColorFactory;
import cn.jetclouds.patchca.font.FontFactory;

import java.awt.image.BufferedImage;

public interface TextRenderer {

	void setLeftMargin(int leftMargin);

	void setRightMargin(int rightMargin);

	void setTopMargin(int topMargin);

	void setBottomMargin(int bottomMargin);

	void draw(String text, BufferedImage canvas, FontFactory fontFactory, ColorFactory colorFactory);

}

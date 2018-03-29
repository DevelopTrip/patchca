package cn.jetclouds.patchca.service;

import cn.jetclouds.patchca.background.SingleColorBackgroundFactory;
import cn.jetclouds.patchca.color.SingleColorFactory;
import cn.jetclouds.patchca.filter.FilterFactory;
import cn.jetclouds.patchca.font.RandomFontFactory;
import cn.jetclouds.patchca.text.renderer.BestFitTextRenderer;
import cn.jetclouds.patchca.word.AdaptiveRandomWordFactory;

import java.awt.*;

public class SimpleCaptchaService extends AbstractCaptchaService {

	public SimpleCaptchaService(int width, int height, Color textColor, Color backgroundColor, int fontSize, FilterFactory ff,int fontMinSize,int fontMaxSize) {
		backgroundFactory = new SingleColorBackgroundFactory(backgroundColor);
		wordFactory = new AdaptiveRandomWordFactory();
		fontFactory = new RandomFontFactory(fontMinSize,fontMaxSize);
		textRenderer = new BestFitTextRenderer();
		colorFactory = new SingleColorFactory(textColor);
		filterFactory = ff;
		this.width = width;
		this.height = height;
	}
	
	public SimpleCaptchaService(int width, int height, Color textColor, Color backgroundColor, int fontSize, String[]fontNames, FilterFactory ff) {
		backgroundFactory = new SingleColorBackgroundFactory(backgroundColor);
		wordFactory = new AdaptiveRandomWordFactory();
		fontFactory = new RandomFontFactory(fontNames);
		textRenderer = new BestFitTextRenderer();
		colorFactory = new SingleColorFactory(textColor);
		filterFactory = ff;
		this.width = width;
		this.height = height;
	}
	
	@Override
	public Captcha getCaptcha() {
		return null;
	}

}

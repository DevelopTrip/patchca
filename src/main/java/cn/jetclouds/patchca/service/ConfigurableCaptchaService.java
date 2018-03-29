package cn.jetclouds.patchca.service;

import cn.jetclouds.patchca.background.SingleColorBackgroundFactory;
import cn.jetclouds.patchca.color.SingleColorFactory;
import cn.jetclouds.patchca.filter.predefined.CurvesRippleFilterFactory;
import cn.jetclouds.patchca.font.RandomFontFactory;
import cn.jetclouds.patchca.text.renderer.BestFitTextRenderer;
import cn.jetclouds.patchca.word.AdaptiveRandomWordFactory;

public class ConfigurableCaptchaService extends AbstractCaptchaService {

	public ConfigurableCaptchaService(int width,int height,int fontMinSize,int fontMaxSize) {
		backgroundFactory = new SingleColorBackgroundFactory();
		wordFactory = new AdaptiveRandomWordFactory();
		fontFactory = new RandomFontFactory(fontMinSize,fontMaxSize);
		textRenderer = new BestFitTextRenderer();
		colorFactory = new SingleColorFactory();
		filterFactory = new CurvesRippleFilterFactory(colorFactory);
		textRenderer.setLeftMargin(10);
		textRenderer.setRightMargin(10);
		this.width = width;
		this.height = height;
	}

}

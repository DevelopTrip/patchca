package cn.jetclouds.patchca.utils.encoder;

import cn.jetclouds.patchca.service.Captcha;
import cn.jetclouds.patchca.service.CaptchaService;

import javax.imageio.ImageIO;
import java.io.IOException;
import java.io.OutputStream;

public class EncoderHelper {

	/**
	 * 生成验证码图像
	 * @param service
	 * @param format
	 * @param os
	 * @return 验证码字符
	 * @throws IOException
	 */
	public static String getChallangeAndWriteImage(CaptchaService service, String format, OutputStream os) throws IOException {
		Captcha captcha = service.getCaptcha();
		ImageIO.write(captcha.getImage(), format, os);
		return captcha.getChallenge();
	}
	
}


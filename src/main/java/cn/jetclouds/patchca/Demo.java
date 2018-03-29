package cn.jetclouds.patchca;

import java.awt.Color;
import java.io.FileOutputStream;
import java.io.IOException;

import cn.jetclouds.patchca.color.SingleColorFactory;
import cn.jetclouds.patchca.filter.predefined.CurvesRippleFilterFactory;
import cn.jetclouds.patchca.service.ConfigurableCaptchaService;
import cn.jetclouds.patchca.utils.encoder.EncoderHelper;

/**
 * <p>ClassName：Demo</p>
 * <p>Description：验证码示例程序</p>
 * @author JohnnyWu
 * @email johnnywu9712@live.com
 * @date 2018年3月28日 上午10:28:43 
 * @version v1.0.0
 */
public class Demo {
	
	/**
	 * 生成验证码图像，当前示例程序图像默认生成在D盘
	 * @throws IOException
	 */
	public static void patchca() throws IOException {
		ConfigurableCaptchaService ccs = new ConfigurableCaptchaService(160,70,45,45);
		ccs.setColorFactory(new SingleColorFactory(new Color(25,60,170)));
		ccs.setFilterFactory(new CurvesRippleFilterFactory(ccs.getColorFactory()));
		
		FileOutputStream fos = new FileOutputStream("d:/img.png"); // 指定生成图像文件位置
		String code = EncoderHelper.getChallangeAndWriteImage(ccs, "png", fos);
		System.out.println("Code:"+code);
		fos.close();

	}
	
}

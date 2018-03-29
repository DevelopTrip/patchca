package cn.jetclouds.patchca.filter.predefined;

import cn.jetclouds.patchca.filter.library.MarbleImageOp;

import java.awt.image.BufferedImageOp;
import java.util.ArrayList;
import java.util.List;


public class MarbleRippleFilterFactory extends RippleFilterFactory {

	protected MarbleImageOp marble = new MarbleImageOp();

	@Override
	protected List<BufferedImageOp> getPreRippleFilters() {
		List<BufferedImageOp> list = new ArrayList<BufferedImageOp>();
		list.add(marble);
		return list;
	}
	
}


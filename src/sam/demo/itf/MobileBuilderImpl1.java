package sam.demo.itf;

import sam.demo.base.AbstractBaseMobilePackage;
import sam.demo.model.MobilePackage;

public class MobileBuilderImpl1 extends AbstractBaseMobilePackage implements
		IMobileBuilder {

	@Override
	public void buildPrice() {
		// TODO Auto-generated method stub
		this.mobilePackage.setPrice(20.0f);
	}

	@Override
	public void buildShortMessage() {
		// TODO Auto-generated method stub
		this.mobilePackage.setShortMessage(400);
	}

	@Override
	public void buildMusic() {
		// TODO Auto-generated method stub
		this.mobilePackage.setMusic("angel");
	}

	@Override
	public MobilePackage getMobilePackage() {
		// TODO Auto-generated method stub
		return this.mobilePackage;
	}

}

package sam.demo.itf;

import sam.demo.base.AbstractBaseMobilePackage;
import sam.demo.model.MobilePackage;

public class MobilePackageImpl2 extends AbstractBaseMobilePackage implements
		IMobileBuilder {

	@Override
	public void buildPrice() {
		// TODO Auto-generated method stub
		this.mobilePackage.setPrice(25.0f);

	}

	@Override
	public void buildShortMessage() {
		// TODO Auto-generated method stub
		this.mobilePackage.setShortMessage(600);
	}

	@Override
	public void buildMusic() {
		// TODO Auto-generated method stub
		this.mobilePackage.setMusic("우있일소");
	}

	@Override
	public MobilePackage getMobilePackage() {
		// TODO Auto-generated method stub
		return this.mobilePackage;
	}

}

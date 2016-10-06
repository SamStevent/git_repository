package sam.demo.base;

import sam.demo.model.MobilePackage;

public abstract class AbstractBaseMobilePackage {
	protected MobilePackage mobilePackage;
	public AbstractBaseMobilePackage(){
		this.mobilePackage=new MobilePackage();
	}
}

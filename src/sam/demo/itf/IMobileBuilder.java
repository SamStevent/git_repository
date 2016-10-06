package sam.demo.itf;

import sam.demo.model.MobilePackage;

public interface IMobileBuilder {
	public void buildPrice();
	public void buildShortMessage();
	public void buildMusic();
	public MobilePackage getMobilePackage();
}

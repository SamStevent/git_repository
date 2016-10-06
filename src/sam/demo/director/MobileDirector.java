package sam.demo.director;

import sam.demo.itf.IMobileBuilder;
import sam.demo.model.MobilePackage;

public class MobileDirector {
	public MobilePackage createMobilePackage(IMobileBuilder mobileBuilder){
		if (mobileBuilder!=null) {
			mobileBuilder.buildMusic();
			mobileBuilder.buildPrice();
			mobileBuilder.buildShortMessage();
			return mobileBuilder.getMobilePackage();
		}
		return null;
	}
}

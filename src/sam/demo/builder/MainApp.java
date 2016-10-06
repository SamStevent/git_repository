package sam.demo.builder;

import com.sun.prism.Image;

import sam.demo.director.MobileDirector;
import sam.demo.itf.IMobileBuilder;
import sam.demo.itf.MobileBuilderImpl1;
import sam.demo.itf.MobilePackageImpl2;
import sam.demo.model.MobilePackage;
/**构造者模式将复杂对象的构建和表示分离，使得统一的构建过程可以创建不同的表示
 * 构建者内部存在构建的对象，并提供方法对该对象给指导者调用并返回最终的对象*/
public class MainApp {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MobileDirector mobileDirector=new MobileDirector();
		IMobileBuilder mobileBuilder1=new MobileBuilderImpl1();
		IMobileBuilder mobileBuilder2=new MobilePackageImpl2();
		MobilePackage mobilePackage1=mobileDirector.createMobilePackage(mobileBuilder1);
		printMessage(mobilePackage1);
		MobilePackage mobilePackage2=mobileDirector.createMobilePackage(mobileBuilder2);
		printMessage(mobilePackage2);
	}
	
	public static void printMessage(MobilePackage mobilePackage){
		System.out.println("--话费："+mobilePackage.getPrice()+"元\t短信："+mobilePackage.getShortMessage()
				+"条\t彩铃："+mobilePackage.getMusic());
	}

}

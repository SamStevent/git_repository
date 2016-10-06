package sam.demo.builder;

import com.sun.prism.Image;

import sam.demo.director.MobileDirector;
import sam.demo.itf.IMobileBuilder;
import sam.demo.itf.MobileBuilderImpl1;
import sam.demo.itf.MobilePackageImpl2;
import sam.demo.model.MobilePackage;
/**������ģʽ�����Ӷ���Ĺ����ͱ�ʾ���룬ʹ��ͳһ�Ĺ������̿��Դ�����ͬ�ı�ʾ
 * �������ڲ����ڹ����Ķ��󣬲��ṩ�����Ըö����ָ���ߵ��ò��������յĶ���*/
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
		System.out.println("--���ѣ�"+mobilePackage.getPrice()+"Ԫ\t���ţ�"+mobilePackage.getShortMessage()
				+"��\t���壺"+mobilePackage.getMusic());
	}

}

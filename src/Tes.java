import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;



public class Tes {
	
	public static void main(String[] args) {
		File file=new File("E:\\project1111111\\projectWrite.bib");
		try {
			System.out.println(file.createNewFile());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println(file.mkdirs());
//public static void main(String[] args) {
//	try {
//		Class<Entry> claz=(Class<Entry>) Class.forName("Article");
//		Entry entry=claz.newInstance();
//		Field[] fields=claz.getDeclaredFields();
//		System.out.println("ss");
//		for(Field field:fields){
//			System.out.println(field.getName());
//			if(field.getName().equals("name")){
//				try {
//					Method setter=  claz.getMethod("set"+Untils.FirstChar2Up(field.getName()), field.getType());
//					setter.invoke(entry, "Lixuejian");
//					Method getter=claz.getDeclaredMethod("get"+Untils.FirstChar2Up(field.getName()));
//					String name=(String) getter.invoke(entry);
//					System.out.println("*****"+name);
//				} catch (NoSuchMethodException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				} catch (SecurityException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				} catch (IllegalArgumentException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				} catch (InvocationTargetException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//
//			
//		}
//		
//	} catch (ClassNotFoundException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	} catch (InstantiationException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	} catch (IllegalAccessException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
}
}



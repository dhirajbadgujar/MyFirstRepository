package POJO;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import main.SingeltonClass;

public class MainClass {
	public static void main(String[] args) throws Exception{
		Class c = Class.forName("main.SingeltonClass");
		Constructor cons[] =  c.getDeclaredConstructors();
		cons[0].setAccessible(true);
		cons[0].newInstance();
	}
}

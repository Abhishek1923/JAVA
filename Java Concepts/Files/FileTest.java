import java.io.*;
class FileTest{
	public static void main(String[] args){
		File f = new File("test.txt");
		System.out.println("Exists "+f.exists());
		System.out.println("Getname "+f.getName());
		System.out.println("length "+f.length());
		System.out.println("can read "+f.canRead());
		System.out.println("can write "+f.canWrite());
		System.out.println("get path "+f.getPath());
		System.out.println("absolute path "+f.getAbsolutePath());
		System.out.println("set read only "+f.setReadOnly());
		System.out.println("can write "+f.canWrite());
	}
}
package io;

//Java program demonstrating ObjectOutputStream methods 
//illustrating annotateClass(Class<?> cl) method 

import java.io.*;

class ObjectOutputStreamDemo extends ObjectOutputStream {
	public ObjectOutputStreamDemo(OutputStream out) throws IOException {
		super(out);
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileOutputStream fout = new FileOutputStream("file.txt");
		ObjectOutputStreamDemo oot = new ObjectOutputStreamDemo(fout);
		ObjectOutputStream oot1 = new ObjectOutputStream(fout);
		Character c = 'A';

		// illustrating annotateClass(Class<?> cl) method
		oot.annotateClass(Character.class);

		// Write the specified object to the ObjectOutputStream
		oot.writeObject(c);

		// flushing the stream
		oot.flush();

		// closing the stream
		oot.close();

		FileInputStream fin = new FileInputStream("file.txt");
		ObjectInputStream oit = new ObjectInputStream(fin);
		System.out.print(oit.readObject());
		oit.close();
	}
}

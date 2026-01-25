package Abstraction;

public class Book implements Readable, Writeable{
	@Override
public void read() {
	System.out.println("Book reading!!");
}
	@Override
public void write() {
	System.out.println("Book writing !!");
}
}

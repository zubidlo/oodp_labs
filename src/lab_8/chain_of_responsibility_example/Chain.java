package lab_8.chain_of_responsibility_example;

public interface Chain
{
	public abstract void addChain(Chain c);
	public abstract void sendToChain(String mesg);
	public Chain getChain();
}






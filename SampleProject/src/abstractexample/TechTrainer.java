package abstractexample;

public class TechTrainer extends Trainer
{
	@Override
	public void session() {
		System.out.println("Corejava session is going on");
	}
	@Override
	public void checks()
	{
		System.out.println("Assignment given from Inheritance");
	}
}

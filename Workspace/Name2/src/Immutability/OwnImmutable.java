package Immutability;

public class OwnImmutable {
	final float number;

	public OwnImmutable(float number)
	{
		//super();
		this.number=number;
	}
	public OwnImmutable modify(float number)
	{
		if(this.number==number)
			return this;
		return new OwnImmutable(number);
	}
}

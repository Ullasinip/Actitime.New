package Exception;

public class VotingException extends RuntimeException 
{
	String msg;
	public VotingException(String str)
	{
		msg=str;
	}
	public String getLocalizedMessage()
	{
		return msg;
	}
}

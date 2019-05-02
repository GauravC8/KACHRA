class UserException extends Exception
{
	public UserException(String msg)
	{
		super(msg);
	}
}
class Withdraw
{
	// int amt;
	// public void setAmt(int amt)
	// {this.amt=amt;}
	// public int getAmt(){return amt;}
	// int total=4000;
	public void withdraw() throws UserException
	{
		System.out.println("Enter Amt : ");
		int amt = s.nextInt();
		try{
		if(amt > 4000)
		{
			throw new UserException("Cannot withdraw");
		}
		}catch(Exception e){System.out.println(msg);}
	}
}
public class ExceptionDemo {

	public static void main(String[] args){
	Withdraw w= new Withdraw();
	//w.setAmt(5000);
	w.withdraw();
	}
}
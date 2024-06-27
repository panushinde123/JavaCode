package Abstraction;
interface MessageService
{
	void sendMsg(String message, String receipient);
	void rcvMsg(String message, String sender);
}
class EmailService implements MessageService
{
	@Override
	public void sendMsg(String message, String receipient) 
	{
		System.out.println(receipient+" : "+message);
		
	}
	@Override
	public void rcvMsg(String message, String sender) 
	{
		
		System.out.println(sender+" : "+message);
	}
}
class SmsService implements MessageService
{

	@Override
	public void sendMsg(String message, String receipient) 
	{
		System.out.println(receipient+" : "+message);
		
	}

	@Override
	public void rcvMsg(String message, String sender) 
	{
		System.out.println(sender+" : "+message);
		
	}
	
}
public class InterfaceEx2 
	{
	  private static void main() {
		  EmailService e=new EmailService();
		  e.sendMsg("Hi Please Join the Meeting..", "John");
		  e.rcvMsg("Hello Joing in Few Minutes..", "Lisa");
		  SmsService s=new SmsService();
		  s.sendMsg("Call Me..", "Pranita");
		 s.rcvMsg("Calling after lunch", "Pranali");
		
	}
	  

}

package week3.day1homeassignment;

public class JavaConnection implements DatabaseConnectionInteface {


	@Override
	public void connect() {
		
		System.out.println("Connect Database");
		
	}

	@Override
	public void disconnect()
	{
		System.out.println("Disconnect Database");
		
	}

	@Override
	public void executeUpdate() {
		
		System.out.println("executeUpdate");
		
	}

	public static void main(String[] args) {
		JavaConnection obj = new JavaConnection();
		obj.connect();
		obj.disconnect();
		obj.executeUpdate();

	}

}

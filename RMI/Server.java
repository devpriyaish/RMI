//create a server

import java.rmi.*;
public class Server
{
	public static void main(String... args) throws Exception
	{
		CalcC obj = new CalcC();
		Naming.rebind("ADD", obj);
		Naming.rebind("SUB", obj);
		Naming.rebind("MUL", obj);
		Naming.rebind("DIV", obj);
		Naming.rebind("REM", obj);
		System.out.println("Server Started");
	}
}

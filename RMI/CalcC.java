//implementing the interface

import java.rmi.server.UnicastRemoteObject;
public class CalcC extends UnicastRemoteObject implements CalcI
{
	public CalcC() throws Exception
	{
		super();
	}
	public int add(int x, int y)
	{
		return x+y;
	}
	public int sub(int x, int y)
	{
		return x-y;
	}
	public int mul(int x, int y)
	{
		return x*y;
	}
	public int div(int x, int y)
	{
		return x/y;
	}
	public int rem(int x, int y)
	{
		return x%y;
	}
}

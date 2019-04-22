// Create an Interface

import java.rmi.Remote;

public interface CalcI extends Remote
{
	public int add(int x, int y) throws Exception;
	public int sub(int x, int y) throws Exception;
	public int mul(int x, int y) throws Exception;
	public int div(int x, int y) throws Exception;
	public int rem(int x, int y) throws Exception;
}


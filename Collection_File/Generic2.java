interface a<T>
{
	T max(T z);
}
class p88<T> implements a<T>
{
	public T max(T z)
	{
		return z;
	}
	public static void main(String ...a)
	{
		p88<Integer> obj= new p88<Integer>();
		int abc=obj.max(38);
		System.out.println(abc);
	}
}

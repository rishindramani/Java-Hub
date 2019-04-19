class stats<T extends Number>
{
	T[] nums;
	Stats(T[] ob)
		{
			nums=ob;
		}
	double average()
	{
		double sum=0.0
		for(int i=0;i<nums.length;i++)
			sum+=nums[i].doubleValue();
			return sum/nums.length;
	}
}
class P
{
	public static void main(Stirng ...a)
	{
		Integer inums[]={1,2,3,4,5};
		Stats<Integer> iob=new Stats<Integer>(inums);
		double v=iob.average();
		System.out.println("iob average is "+v);
		Double dnums[]={1.2,3.4,5.6,7.8,9.8};
		Stats<Double> dob=new Stats<Double>(dnums);
		double w=dob.average();
		System.out.println("dob average " +w);
	}
}
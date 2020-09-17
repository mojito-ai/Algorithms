package algorithms;

public class quickunion {

	private int[] id;
	public quickfind(int N) 
	{
		id=new int[N];
		for(int i=0;i<N;i++)
			id[i]=i;
	}
	private int root(int i)
	{
		while(id[i]!=i) i=id[i];
		return i;
	}
	public boolean connected(int p, int q)
	{
		return root[p]==root[q];
	}
	public void union(int p,int q)
	{
		int i=root(p);
		int j=root(q);
		id[i]=j;
	}

	public static void main(String[] args)
	{
		quickfind qf=new quickfind(10);
		qf.union(4,3);
		qf.union(3,8);
		qf.union(6,5);
		qf.union(9,4);
		qf.union(2,1);
		System.out.println(qf.connected(0, 7));
		System.out.println(qf.connected(8,9));
		qf.union(0,1);
		System.out.println(qf.connected(0,7));
		qf.union(2, 7);
		System.out.println(qf.connected(0,7));
	}
}
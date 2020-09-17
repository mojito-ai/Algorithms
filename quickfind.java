package algorithms;

public class quickfind {

	private int[] id;
	public quickfind(int N) 
	{
		id=new int[N];
		for(int i=0;i<N;i++)
			id[i]=i;
	}
	public boolean connected(int p, int q)
	{
		return id[p]==id[q];
	}
	public void union(int p,int q)
	{
		int id_p=id[p];
		int id_q=id[q];
		for (int i=0;i<id.length;i++)
			if (id[i]==id_p) id[i]=id_q;
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
	}
}
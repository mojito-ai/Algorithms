package algorithms;
//VANILLA IMPLEMENTATION OF Weighted quick union with path compression
public class WQUPC {

	public int[] id;
	public int[] sz;
	public WQUPC(int N) 
	{
		id=new int[N];
		sz=new int[N];
		for(int i=0;i<N;i++)
			{
				id[i]=i;
				sz[i]=1;
			}
			
	}
	private int root(int i)
	{
		while(id[i]!=i) 
			{//used the grandparent approach
				id[i]=id[id[i]];
				i=id[i];
			}
		return i;
	}
	public boolean connected(int p, int q)
	{
		return root(p)==root(q);
	}
	public void union(int p,int q)
	{
		int i=root(p);
		int j=root(q);
		if (sz[i]<sz[j]) {id[p]=j; sz[j]+=sz[i];}
		else 			 {id[q]=i; sz[i]+=sz[j];}
	}

	public static void main(String[] args)
	{
		WQUPC qf=new WQUPC(15);
		qf.union(4,3);
		qf.union(3,8);
		qf.union(6,5);
		qf.union(9,4);
		qf.union(2,1);
		
		for (int i=0; i<15; i++)
		{
			System.out.print(qf.id[i]+ " ");
		}//To find the final instance of the id array
		System.out.println();
		for (int i=0; i<15; i++)
		{
			System.out.print(qf.sz[i]+ " ");
		}//to find the final instance of size array
	}
}
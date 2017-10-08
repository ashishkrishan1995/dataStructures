// written by hg398

#include<bits/stdc++.h>
using namespace std;
vector <int> adj[100000];

int main() {
	int n,e;
	cout<<"Enter number of Nodes and Edges in graph:"<<endl;;
	cin>>n>>e;
	cout<<"Enter pairs of vertices between which an edge of graph exist:"<<endl;
	for(int i=0;i<e;i++)
	{
		int a,b;
		cin>>a>>b;
		a--;
		b--;
		adj[a].push_back(b);
		adj[b].push_back(a);
	}
	for(int i=0;i<n;i++)
	{
		cout<<"Adjacency List of "<<i+1<<" contains --> ";
		for(int j=0;j<adj[i].size();j++)
		{
			cout<<adj[i][j]+1<<" ";
		}
		cout<<endl;
	}
	return 0;
}

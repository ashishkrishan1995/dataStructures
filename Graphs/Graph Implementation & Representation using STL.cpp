// written by hg398

#include<bits/stdc++.h>
using namespace std;
vector <int> adj[100000];                                                           //vector to represent adjacency lsts of graph

int main() {
	int n,e;                                                                        //n is no. of nodes and e is edges
	cout<<"Enter number of Nodes and Edges in graph:"<<endl;;
	cin>>n>>e;
	cout<<"Enter pairs of vertices between which an edge of graph exist:"<<endl;
	for(int i=0;i<e;i++)
	{
		int a,b;                                                                    // vertices between which an edge exist
		cin>>a>>b;
		a--;                                                                        
		b--;
		adj[a].push_back(b);                                                        // push vertices in list of each other (undirected graph)
		adj[b].push_back(a);
	}
	for(int i=0;i<n;i++)                                                            
	{
		cout<<"Adjacency List of "<<i+1<<" contains --> ";
		for(int j=0;j<adj[i].size();j++)                                            //traversing adjacency list of each vertex
		{
			cout<<adj[i][j]+1<<" ";                                                 //print the vertex to which it is directly connected 
		}
		cout<<endl;
	}
	return 0;
}

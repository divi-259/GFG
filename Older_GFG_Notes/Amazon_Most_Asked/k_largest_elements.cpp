//To print k largest numbers of an array in decreasing order
#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;

int main()
 {
	int t;
	cin>>t;
	for(int i=0;i<t;i++)
	{
	int n,k;
	cin>>n>>k;
	vector<int> arr;
    int in;
    for(int j=0;j<n;j++)
    {
        cin>>in;
        arr.push_back(in);
        
    }
    sort(arr.begin(),arr.end());
    for(int j=n-1;j>=n-k;j--)
    cout<<arr[j]<<" ";
    cout<<endl;
	
	}
	return 0;
}

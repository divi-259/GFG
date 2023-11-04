// In an array check for any combination like A^2=B^2+C^2 
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
	int n;
	cin>>n;
	vector<int> a;
	int in;
	for(int j=0;j<n;j++)
	{
	    cin>>in;
	    a.push_back(in);
	}
  // sort the given array and square every number
	sort(a.begin(),a.end());
	for(int j=0;j<n;j++)
	{
	    a[j]=a[j]*a[j];
	}
	// Consider last no as A and run loop till only three elements
	int flag=0;
	for(int j=n-1;j>=2;j--)
	{
	    int l=0;
	    int r=j-1;
      // this inner loop runs from 0 to one no less than our current A(highest no)
	    while(l<r)
	    {
	        if(a[l]+a[r]==a[j])
	        {
	        flag=1;
	        break;
	        }
	        else if(a[l]+a[r]<a[j])
	        l++;
	        else
	        r--;
	    }
	    if(flag==1)
	    break;
	}
	if(flag==1)
	cout<<"Yes"<<endl;
	else cout<<"No"<<endl;
	}
	return 0;
}

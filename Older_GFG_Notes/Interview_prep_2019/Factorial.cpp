#include<iostream>
using namespace std;
int main()
 {
	int t;
	cin>>t;
	for(int i=0;i<t;i++)
	{
	long int fact=1;
	int n;
	cin>>n;
	if(n==0 || n==1)
	fact=1;
	else
	{
	    for(int i=2;i<=n;i++)
	    {
	        fact*=i;
	    }
	}
	cout<<fact<<endl;
	}
	return 0;
}

#include<iostream>
using namespace std;
int main()
 {
	int t;
	cin>>t;
	for(int i=0;i<t;i++)
	{
	int n;
	int flag=0;
	cin>>n;
	if(n==1 || n==2)
	flag=1;
	else
	{
	    for(int i=2;i<n/2;i++)
	    {
	        if(n%i==0)
	        {
	        flag=1;
	        break;
	        }
	    }
	}
	if(flag==1)
	cout<<"No"<<endl;
	else cout<<"Yes"<<endl;
	
	}
	return 0;
}

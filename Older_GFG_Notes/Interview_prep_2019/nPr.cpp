#include<iostream>
using namespace std;

long int fac(int n)
{
    long int f=1;
    while(n>1)
    {
        f*=n;
        n--;
    }
    return f;
}
int main()
 {
	int t;
	cin>>t;
	for(int i=0;i<t;i++)
	{
	int n,r;
	cin>>n>>r;
	long int a=fac(n);
	long int b=fac(n-r);
	cout<<a/b<<endl;
	
	}
	return 0;
}

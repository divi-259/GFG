#include<iostream>
using namespace std;
int gcd(int a, int b)
{
    if(b==0)
    return a;
    else return gcd(b,a%b);
}
int lcm(int a,int b,int g)
{
    int m=a*b;
    return m/g;
}
int main()
 {
	int t;
	cin>>t;
	for(int i=0;i<t;i++)
	{
	int a,b;
	cin>>a>>b;
	int g=gcd(a,b);
	int l=lcm(a,b,g);
	cout<<l<<" "<<g<<endl;
	
	}
	return 0;
}

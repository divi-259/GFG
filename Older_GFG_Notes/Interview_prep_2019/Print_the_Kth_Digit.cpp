// Given two numbers a and b, print the kth digit from right in a^b
#include<iostream>
#include<math.h>
#include<string>
using namespace std;
int main()
 {
	int t;
	cin>>t;
	for(int i=0;i<t;i++)
	{
	long long int p;
	int a,b,k;
	cin>>a>>b>>k;
	p=pow(a,b);
	string power=to_string(p);
	int n=power.size();
	cout<<power[n-k]<<endl;
	
	}
	return 0;
}

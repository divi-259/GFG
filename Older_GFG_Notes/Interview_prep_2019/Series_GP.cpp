// Program to find out the nth term of a GP series given first two terms
#include<iostream>
#include<math.h>
using namespace std;
int main()
 {
	int t;
	cin>>t;
	for(int i=0;i<t;i++)
	{
	float a,b;
	cin>>a>>b;
	float r=b/a;
	float n;
	cin>>n;
	float term=a*pow(b/a,n-1);
	cout<<int(term)<<endl;
	}
	return 0;
}

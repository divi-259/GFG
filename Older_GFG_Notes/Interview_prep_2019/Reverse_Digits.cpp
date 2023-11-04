#include<iostream>
#include<string>
#include<algorithm>
using namespace std;
int main()
 {
	int t;
	cin>>t;
	
	for(int i=0;i<t;i++)
	{
	/*string str;
	cin>>str;
	reverse(str.begin(),str.end());
	cout<<str<<endl;*/ // It didn't work for cases like 200 --> 002 (no need of extra 0s)
	
	long int a;
	long int b=0;
	cin>>a;
	int r;
	while(a)
	{
	    r=a%10;
	    b=b*10;
	    b=b+r;
	    a=a/10;
	}
	cout<<b<<endl;
	
	}
	return 0;
}

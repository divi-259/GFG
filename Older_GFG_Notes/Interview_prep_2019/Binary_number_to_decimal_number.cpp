#include<iostream>
#include <string>
using namespace std;
int main()
 {
	int t;
	cin>>t;
	for(int i=0;i<t;i++)
	{
	string bin;
	cin>>bin;
	int base=1;
	int dec=0;
	int l=bin.length();
	for(int i=l-1;i>=0;i--)
	{
	    if(bin[i]=='1')
	    dec+=base;
	    base=base*2;
	}
	cout<<dec<<endl;
	}
	return 0;
}

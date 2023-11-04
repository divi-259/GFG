#include<iostream>
using namespace std;
// Function to find out gcd of a number
int gcd(int a,int b)
{
    if(b==0)
    return a;
    else return gcd(b,a%b);
}
// Main Function
int main()
 {
	int t;
	cin>>t;
	for(int i=0;i<t;i++)
	{
	int n;
	cin>>n;
//If only one element in the array then print that number
    if(n==1)
    	{
    	    int num;
    	    cin>>num;
    	    cout<<num<<endl;
    	}
// Else find out the gcd of two smallest numbers in the array
else
{
    int arr[n];
	int s1=1000001,s2=1000001;
	for(int j=0;j<n;j++)
	{
	    cin>>arr[j];
	    if(arr[j]<s1 || arr[j]<s2)
	    {
	        if(arr[j]>s1)
	        s2=arr[j];
	        else
	        {
	        s2=s1;
	        s1=arr[j];
	        }
	        
	    }
	    
	}
	int flag=0;
	int g=gcd(s1,s2);
// If every no in array is divisible by this gcd then it is GCD of whole array otherwise GCD of array is 1
	for(int j=0;j<n;j++)
	{
	    if((arr[j]%g)==0)
	    continue;
	    else
	    {
	        flag=1;
	        break;
	    }
	}

    	if(flag!=0)
    	cout<<"1"<<endl;
    	else 
    	cout<<g<<endl;
}
}
	return 0;
}

/* 
Problem Link - https://practice.geeksforgeeks.org/problems/-rearrange-array-alternately/0/
Editorial Link - https://www.geeksforgeeks.org/rearrange-array-maximum-minimum-form/

Code for above problem */

#include<iostream>
#include<bits/stdc++.h>
using namespace std;
int main()
 {
	int t;
	cin>>t;
	for(int i=0;i<t;i++)
	{
	int n;
	cin>>n;
	int arr[n];
	for(int j=0;j<n;j++)
	{
	    cin>>arr[j];
	}
    int x=0,y=n-1;
    while(x<y)
    {
        cout<<arr[y]<<" ";
        cout<<arr[x]<<" ";
        x++;
        y--;
    }
    if(n%2!=0)
        cout<<arr[n/2]<<" ";
    cout<<"\n";
	
	}
	return 0;
}

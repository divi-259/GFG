/*
Problem Link - https://practice.geeksforgeeks.org/problems/missing-number-in-array/0
Editorial Link -https://www.geeksforgeeks.org/find-the-missing-number/

*/

// Code for above problem
#include<iostream>
#include<bits/stdc++.h>
using namespace std;
int main()
 {
	int t;
	cin>>t;
	for(int i=0;i<t;i++)
	{
	int n,x;
	cin>>n;
	int sum=0;
	vector<int> arr;
	for(int j=0;j<n-1;j++)
	{
	    cin>>x;
	   arr.push_back(x); 
	   sum+=x;
	}
  // Sum of first N natural numbers
	int sum_n = (n*(n+1));
	sum_n=sum_n/2;
	cout<<sum_n-sum<<"\n";
	
	}
	return 0;
}

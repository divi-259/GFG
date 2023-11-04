using namespace std;
int main()
 {
	int t;
	cin>>t;
	
	for(int i=0;i<t;i++)
	{
	int n;
	cin>>n;
	int sum=0;
	while(n)
	{
	    int a=n%10;
	    sum+=a;
	    n=n/10;
	}
	if(sum/10==0)
	cout<<"YES"<<endl;
	else if(sum/10 == sum%10)
    cout<<"YES"<<endl;
    else cout<<"NO"<<endl;

	}
	return 0;
}

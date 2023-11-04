using namespace std;
#define CUBE(x) (x*x*x)
int main()
 {
	int t;
	cin>>t;
	for(int i=0;i<t;i++)
	{
	int n;
	cin>>n;
	int a=n;
	int sum=0;
	while(a)
	{
	    int j=a%10;
	    sum+=CUBE(j);
	    a=a/10;
	}
	if(sum==n)
	cout<<"Yes"<<endl;
	else cout<<"No"<<endl;
	
	}
	return 0;
}

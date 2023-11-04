// To print the Nth term of the Arithmetic Progression.
using namespace std;
int main()
 {
	int t;
	cin>>t;
	for(int i=0;i<t;i++)
	{
	int a,b;
	cin>>a>>b;
	int n;
	cin>>n;
	int d=b-a;
	cout<<a+(n-1)*d<<endl;
	}
	return 0;
}

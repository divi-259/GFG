//Program to print vertical sum of a binary tree

void abc(Node *root,int hd,map <int,int>&ver)
{
    if(root==NULL)
    return;
    abc(root->left,hd-1,ver);
    ver[hd]+=root->data;
    abc(root->right,hd+1,ver);
}
void printVertical(Node *root)
{
//add code here.

map<int,int> versum;
Node *temp=root;
abc(root,0,versum);
map <int,int>::iterator itr;
for(itr=versum.begin();itr!=versum.end();itr++)
cout<<itr->second<<" ";
}

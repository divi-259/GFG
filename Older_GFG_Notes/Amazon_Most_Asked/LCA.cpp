// Function which returns lowest common ancestor if both nodes n1 and n2 are present
Node * LCA(Node* root ,int n1 ,int n2 )
{
   //Your code here 
   if(root==NULL)
   return NULL;
   if(root->data==n1 || root->data==n2)
   return root;
   Node* left_lca=LCA(root->left,n1,n2);
   Node* right_lca=LCA(root->right,n1,n2);
   if(left_lca && right_lca)
   return root;
   return (left_lca!=NULL)?left_lca:right_lca;
}

// If node n1 or n2 or both are not present, then following function will work
Node * LCAUtil(Node* root ,int n1 ,int n2, bool &v1,bool &v2 )
{
   //Your code here 
   if(root==NULL)
   return NULL;
   if(root->data==n1)
   { v1=true;
   return root; }
   if(root->data==n2){ v2=true; 
   return root; }
   Node* left_lca=LCAUtil(root->left,n1,n2,v1,v2);
   Node* right_lca=LCAUtil(root->right,n1,n2,v1,v2);
   if(left_lca && right_lca)
   return root;
   return (left_lca!=NULL)?left_lca:right_lca;
}
bool find(Node *root, int k) 
{ 
    // Base Case 
    if (root == NULL) 
        return false; 
 
    if (root->data == k || find(root->left, k) ||  find(root->right, k)) 
        return true; 
  
    // Else return false 
    return false; 
} 
Node * LCA(Node* root ,int n1 ,int n2 )
{
   //Your code here 
  bool v1=false,v2=false;
  Node* lca=LCAUtil(root,n1,n2,v1,v2);
    if (v1 && v2 || v1 && find(lca, n2) || v2 && find(lca, n1)) 
        return lca; 
  
    // Else return NULL 
    return NULL; 
}

class Solution {
public:
    
    int max(int a,int b)
    {
        return (a>b)?a:b;
    }
        int min(int a,int b)
    {
        return (a<b)?a:b;
    }
    int maxArea(vector<int>& height) {
        
        int l=0;
        int r=height.size()-1;
        int area=0;
        while(l<r)
        {
            area=max(area,min(height[l],height[r])*(r-l));

            if(height[l]<height[r])
                l++;
            else
                r--;
        }
        if(height.size()>2)
        return area;   
        
        else return min(height[0],height[1]);
    }
};

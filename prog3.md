#include<iostream>
#include<fstream>
using namespace std;


void arraysum(int n,int max,int min)
{ int *a;
int sum=0;
  a=new int[n];
ifstream in("D:\\data.txt");
if(! in){cout<<"不能打开文本文件";}
 for(int i=0;in>>a[i],i<n;i++)
 {if(a[i]>=min&&a[i]<<max)sum+=a[i];}
  cout<<sum;
  in.close();
}
  int main(void)
{ int a,max,min;
	  cout<<"数据长度:";
  cin>>a;
  cout<<"范围最大为：";
  cin>>max;
  cout<<"范围最小为：";
	  cin>>min;
  cout<<"总和为";
  arraysum(a,max,min);
  return 0;
}
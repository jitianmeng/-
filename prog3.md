#include<iostream>
#include<fstream>
using namespace std;


void arraysum(int n,int max,int min)
{ int *a;
int sum=0;
  a=new int[n];
ifstream in("D:\\data.txt");
if(! in){cout<<"���ܴ��ı��ļ�";}
 for(int i=0;in>>a[i],i<n;i++)
 {if(a[i]>=min&&a[i]<<max)sum+=a[i];}
  cout<<sum;
  in.close();
}
  int main(void)
{ int a,max,min;
	  cout<<"���ݳ���:";
  cin>>a;
  cout<<"��Χ���Ϊ��";
  cin>>max;
  cout<<"��Χ��СΪ��";
	  cin>>min;
  cout<<"�ܺ�Ϊ";
  arraysum(a,max,min);
  return 0;
}
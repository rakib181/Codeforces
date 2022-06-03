#include<bits/stdc++.h>
using namespace std;

const int N=1e8;

bool isPerfact(int x){
   int ans=0;
   while(x>0){
    ans+=x%10;
    x/=10;
   }
   if(ans==10){
    return true;
   }else{
    return false;
   }
}

int32_t main(){
   ios_base::sync_with_stdio(0);
    cin.tie(0); 
    cout.tie(0);
    #ifndef ONLINE_JUDGE 
    freopen("input.txt","r",stdin); 
    freopen("output.txt","w",stdout); 
    #endif
    auto start=clock();
    int k,cnt=0;
    cin >> k;
    for(int i=10;i<=N;i++){
      if(isPerfact(i)){
        cnt++;
        if(cnt==k){
          cout << i << '\n';
          break;
        }
      }
    }
    cerr<<1.0 * (clock()-start)/CLOCKS_PER_SEC<<endl;
    return 0;
}

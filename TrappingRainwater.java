public class TrappingRainwater {

    //mine wrong analysis
//     public static void RainWater(int H[]){
//         int start = 0;
//         int end; int Netheight; int Netwidth; int Subheight = 0; int Subwidth = 0; int waterlvl = 0;
        
//             for(int i= start;i<H.length;i++){
//             if(H[start]<=H[i]){
//                 end = H[i];
//                 Netwidth = i-1;
//                 Netheight = H[start];
//                 for(int j=start+1;j<end;j++){
//                     Subheight+=H[j];
//                     Subwidth+= 1;
//                 }
//                 waterlvl = (Netheight*Netwidth)-(Subheight*Subwidth);
//                 start  = end+1;
//             }
//         }
//         System.out.println("Trapped amount of water is :" +waterlvl);
//     }
 public static int rainWater(int height[]){
    int n = height.length;
    //calculate left max boundary-array
    int leftMax[] = new int[n];
    
    leftMax[0] = height[0];
    for(int i=1;i<n;i++){
        leftMax[i] = Math.max(height[i],leftMax[i-1]);
    }

    //calculate max right boundary-array
    int rightMax[] = new int[n];
    rightMax[n-1] = height[n-1];
    for(int i=n-2;i>=0;i--){
        rightMax[i] = Math.max(height[i],rightMax[i+1]);
    }

    
    int trappedWater =0;
    //loop
    for(int i=0;i<n;i++){
        //water lvl = min(left bound,rightbound)
        int waterLvl = Math.min(leftMax[i],rightMax[i]);
        //trappedWater = waterlvl -height[i]
        trappedWater+= waterLvl-height[i];
    }
    return trappedWater;
    
 }
   public static void maxProfit(int price[]){
    int buyPrice = Integer.MAX_VALUE; int maxProfit = 0;
    for(int i=0;i<price.length;i++){
        
        if(buyPrice<price[i]){
            int profit = price[i]- buyPrice;
            maxProfit = Math.max(profit,maxProfit);
        }
        else{
            // sell ki bajay buy kar lete hai otherwise loos hoga if we sell so,
            buyPrice = price[i];
        }
    }
    System.out.println("Max Profit  = " +maxProfit );
   }
     
    public static void main(String args[]){
        // int height[] = {4,2,0,6,3,2,5};
        // System.out.println(rainWater(height));
        int price[] = {7,1,5,3,6,4};
        maxProfit(price);
        
        
    }
}

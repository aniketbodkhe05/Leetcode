class Solution {
    public int totalFruit(int[] fruits) {
        // int maxlength=0;
        // for(int i=0;i<fruits.length;i++){
        //     HashSet<Integer> st=new HashSet<>();
        //     for(int j=i;j<fruits.length;j++){
        //         st.add(fruits[j]);
        //        if(st.size()<=2){
        //          maxlength=Math.max(maxlength,j-i+1);
        //        }
        //        else{
        //         break;
        //        }
        //     }

        // }
        // return maxlength;

        // int maxlength = 0;
        // int l = 0;
        // int r = 0;
        // Map<Integer, Integer> mp = new HashMap<>();
        // while (r < fruits.length) {
        //     mp.put(fruits[r], mp.getOrDefault(fruits[r], 0) + 1);

        //     if (mp.size() > 2) {
        //         while (mp.size() > 2) {
        //             mp.put(fruits[l], mp.get(fruits[l]) - 1);
        //             if (mp.get(fruits[l]) == 0) {
        //                 mp.remove(fruits[l]);
        //             }
        //             l++;
        //         }

        //     }
        //     maxlength = Math.max(maxlength, r - l + 1);
        //     r++;

        // }
        // return maxlength;
        int maxlength = 0;
        int l = 0;
        int r = 0;
        Map<Integer, Integer> mp = new HashMap<>();
        while (r < fruits.length) {
            mp.put(fruits[r], mp.getOrDefault(fruits[r], 0) + 1);

            while (mp.size() > 2) {
                mp.put(fruits[l], mp.get(fruits[l]) - 1);

                if (mp.get(fruits[l]) == 0) {
                    mp.remove(fruits[l]);
                }

                l++;
            }
            if (mp.size() <= 2) {
                maxlength = Math.max(maxlength, r - l + 1);
            }
            r++;

        }
        return maxlength;
    }
}
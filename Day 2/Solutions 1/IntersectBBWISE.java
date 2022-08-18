class IntersectBBWISE {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList <Integer> Nums1 = new ArrayList <Integer>();
        for (int i=0;i<nums1.length;i++){
            Nums1.add(nums1[i]);
        }
        ArrayList <Integer> out = new ArrayList<Integer>();
        for(int i=0;i<nums2.length;i++){
            if(Nums1.contains(nums2[i])){
                out.add(nums2[i]);
                Nums1.remove(Nums1.indexOf(nums2[i]));
            }
        }
        int [] output = new int[out.size()];
        for(int i=0;i<out.size();i++){
            output[i]=out.get(i);
        }
        return output;
    }
    public static void main(String [] args){
	int [] nums1 = {1,2,2,1};
	int [] nums2 = {2,2};
	IntersectBBWISE sol = new IntersectBBWISE ();
	sol.intersect(nums1,nums2);
    }
}
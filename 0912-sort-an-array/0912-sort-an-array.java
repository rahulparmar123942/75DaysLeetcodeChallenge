import java.util.*;

class Solution {

    public int[] sortArray(int[] nums) {
       

       int n = nums.length;

       mergeSort(nums,0,n-1);
       return nums;
    }
    public void mergeSort(int[] nums,int low,int high){

        while(low>=high){
           return;
    }
         int mid = low+(high-low)/2;
        mergeSort(nums,low,mid);
        mergeSort(nums,mid+1,high);

        merge(nums,low,mid,high);
    }
    public void merge(int[] nums,int low,int mid,int high){

       int[] temp = new int[high-low+1];
       int i = low;
       int j = mid+1;
       int k =0;
        while(i<=mid && j<=high){

            if(nums[i]<=nums[j]){
                temp[k++] = nums[i++];
            }else{
                temp[k++] = nums[j++];
            }
        }
             while(i<=mid){
                temp[k++] = nums[i++];
             }      
             while(j<=high){
                temp[k++] = nums[j++];
             }
          for(int x =0;x<temp.length;x++){
              nums[low+x] = temp[x];
          }
  }
}
    //    int n= nums.length;
    //    ArrayList<Integer> list = new ArrayList<>();

    //    for(int num:nums){
    //     list.add(num);
    //    }

    //    sort(list);
    //    for(int i=0;i<n;i++){
    //     nums[i] = list.get(i);
    //    }

    //    return nums;
    // }

    // public void sort(ArrayList<Integer> list) {

    //    if(list.size()<=1){
    //     return ;
    //    }

    //    int last = list.remove(list.size()-1);

    //    sort(list);
    //    insert(list,last);
    // }

    // public void insert(ArrayList<Integer> list, int value){


    //     if(list.size()==0 || list.get(list.size()-1) <= value){

    //         list.add(value);
    //         return;
    //     }

    //     int last = list.remove(list.size()-1);

    //     insert(list,value);
    //     list.add(last);
  
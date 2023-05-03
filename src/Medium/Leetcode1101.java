package Medium;

import java.util.*;
//1101. The Earliest Moment When Everyone Become Friends

class Leetcode1101 {
    public int earliestAcq(int[][] logs, int n) {
        Arrays.sort(logs,new Comparator<int[]>(){ //sort according to the timestamp
            public int compare(int a[],int b[]){
                return a[0]-b[0];
            }
        });
        List<Set<Integer>> list=new ArrayList<>(); //list of set of groups
        for(int[] log:logs){
            int friendAGrp=getSetNum(list,log[1]); //get the list index, ie, group number to which the person belongs
            int friendBGrp=getSetNum(list,log[2]);
            if(friendAGrp==-1 && friendBGrp==-1){ //if both the friends are not yet added to any group
                Set<Integer> newFriendShip=new HashSet();
                newFriendShip.add(log[1]);
                newFriendShip.add(log[2]);
                list.add(newFriendShip);
            }
            else if(friendAGrp==-1){ //if friend A is not added to any of the groups yet
                list.get(friendBGrp).add(log[1]);
            }
            else if(friendBGrp==-1){ //if friend B is not added to any of the groups yet
                list.get(friendAGrp).add(log[2]);
            }
            else if(friendAGrp!=friendBGrp){ //if both of them are in separate groups
                list.get(friendAGrp).addAll(list.get(friendBGrp));
                list.remove(friendBGrp);
            }
            if(list.size()==1 && list.get(0).size()==n){ //all the friends become friends with each other directly or indirectly
                return log[0];
            }
        }
        return -1;
    }

    public int getSetNum(List<Set<Integer>> list, int friend){ //helper function to get the group number of a person
        for(int i=0;i<list.size();i++){
            if(list.get(i).contains(friend)){
                return i;
            }
        }
        return -1;
    }
}

class Solution:
    def getIndex(self,num,listOfSet):
        for i,connection in enumerate(listOfSet):
            if num in connection:
                return i

    def merge(self,i,connections,listOfSet):
        for connNum,connection in enumerate(connections):
            if connection==0:
                continue

            currIndex=self.getIndex(i,listOfSet)
            connectionIndex=self.getIndex(connNum,listOfSet)
            if currIndex!=connectionIndex:
                listOfSet[currIndex]|=listOfSet[connectionIndex]
                listOfSet.pop(connectionIndex)

            else:
                continue

    def findCircleNum(self, isConnected: List[List[int]]) -> int:
        listOfSet=[]
        for i in range(len(isConnected)):
            listOfSet.append({i})

        for i,connections in enumerate(isConnected):
            self.merge(i,connections,listOfSet)

        return len(listOfSet)
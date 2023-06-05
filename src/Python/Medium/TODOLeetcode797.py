#Note the working of list objects
class Solution:
    def allPathsSourceTarget(self, graph: List[List[int]]) -> List[List[int]]:
        start=graph[0]
        end=len(graph)-1
        connectionMap=dict()
        ans=[]
        for i,connections in enumerate(graph):
            connectionMap[i]=connections

        def dfs(curr, path_till_now):
            if curr==end:
                ans.append(list(path_till_now))
                return

            for connection in connectionMap[curr]:
                    path_till_now.append(connection)
                    dfs(connection, path_till_now)
                    path_till_now.pop()

        dfs(0,[0])
        return ans



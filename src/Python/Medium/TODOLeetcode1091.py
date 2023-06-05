#Referred https://www.youtube.com/watch?v=YnxUdAO7TAo
class Solution:
    def bfs(self,grid,N):
        queue=collections.deque()
        visited=set()
        x=0
        y=0
        queue.append((0,0,1))
        visited.add((0,0))
        directions=[[0,1],[1,0],[1,1],[0,-1],[-1,0],[-1,-1],[-1,1],[1,-1]]
        while queue:
            front=queue.popleft()
            x=front[0]
            y=front[1]
            if max(x,y)>=N or min(x,y)<0 or grid[x][y]!=0:
                continue

            if x==N-1 and y==N-1:
                return front[2]

            for direction in directions:
                if (x+direction[0],y+direction[1]) in visited:
                    continue
                queue.append((x+direction[0],y+direction[1],front[2]+1))
                visited.add((x+direction[0],y+direction[1]))

        return -1


    def shortestPathBinaryMatrix(self, grid: List[List[int]]) -> int:
        N=len(grid)
        return self.bfs(grid,N)


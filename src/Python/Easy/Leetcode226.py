class Solution:
    def invertTree(self, root: Optional[TreeNode]) -> Optional[TreeNode]:
        if root is None:
            return None

        bfs_queue=[]
        bfs_queue.append(root)
        while bfs_queue:
            front=bfs_queue.pop()
            temp=front.left
            front.left=front.right
            front.right=temp
            if front.left is not None:
                bfs_queue.append(front.left)
            if front.right is not None:
                bfs_queue.append(front.right)

        return root
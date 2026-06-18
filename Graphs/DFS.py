class Solution:
    def dfs(self, adj):
        
        def dffs(u,adj,vis,ans):
            vis.add(u)
            ans.append(u)
            for n in adj[u]:
                if n not in vis:
                    dffs(n,adj,vis,ans)
            return ans
        vis=set()
        ans=[]
        count=dffs(0,adj,vis,ans)
        return count
        
        

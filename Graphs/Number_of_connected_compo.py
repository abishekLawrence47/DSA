class Solution:
    def countConnected(self, V, edges):
        
        def dfs(i,vis,edge):
            vis[i]=1
            for j in edge[i]:
                if vis[j]==0:
                    dfs(j,vis,edge)
        edge=[[]for _ in range(V)]
        for v,u in edges:
            edge[v].append(u)
            edge[u].append(v)
        vis=[0]*V
        c=0
        for i in range(len(vis)):
            if vis[i]==0:
                    c+=1
                    dfs(i,vis,edge)
        return c

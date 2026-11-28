class Solution:
    def markIslands(self, grid: List[List[str]], i, j):
        if i < 0 or i >= len(grid) or j < 0 or j >= len(grid[0]):
            return
        elif grid[i][j] != "1":
            return
        
        grid[i][j] = "0"

        self.markIslands(grid, i - 1, j)
        self.markIslands(grid, i, j - 1)
        self.markIslands(grid, i + 1, j)
        self.markIslands(grid, i, j + 1)

        return
        

    def numIslands(self, grid: List[List[str]]) -> int:
        counter = 0
        for i in range(len(grid)):
            for j in range(len(grid[0])):
                if grid[i][j] != "1":
                    continue

                self.markIslands(grid, i, j)
                counter += 1
        
        return counter


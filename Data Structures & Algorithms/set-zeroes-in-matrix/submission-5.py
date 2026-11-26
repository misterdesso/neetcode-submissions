class Solution:
    def setZeroes(self, matrix: List[List[int]]) -> None:
        setFirstRow = False
        for i in range(len(matrix[0])):
            if matrix[0][i] == 0:
                setFirstRow = True
                break

        for i in range(1, len(matrix)):
            for j in range(len(matrix[0])):
                if matrix[i][j] == 0:
                    matrix[i][0] = 0
                    matrix[0][j] = 0
                    continue

        
        for i in range(1, len(matrix)):
            for j in range(1, len(matrix[0])):
                if matrix[i][0] == 0 or matrix[0][j] == 0:
                    matrix[i][j] = 0

        if matrix[0][0] == 0:
            for i in range(len(matrix)):
                matrix[i][0] = 0

        if setFirstRow:
            for i in range(len(matrix[0])):
                matrix[0][i] = 0
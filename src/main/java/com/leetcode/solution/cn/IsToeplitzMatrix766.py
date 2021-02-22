def main(matrix):
    for i in range(len(matrix) - 1):
        if matrix[i][:-1] != matrix[i + 1][1:]:
            return False
    return True


if __name__ == "__main__":
    matrix = [[1,2,3,4],[5,1,2,3],[9,5,1,2]]
    main(matrix)
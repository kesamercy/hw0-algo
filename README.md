# hw0-algo

In this problem we will consider matrix and vector multiplication, but with the caveat that we already know something about the matrix. In particular for any 0≤i,j≤n−1, we have
Un[i][j]={01if j<iotherwise.
If you "draw" this matrix you will note that all of the elements below the diagonal is zero: such matrices are called upper triangular matrices. Further, all non-zero values (in the "upper triangular" part) are all 1. Note that we only need to know the value of n to completely determine Un.

You have to write code to solve the following computational problem: given any integer n≥1 and a vector x of length n, return the vector y=Un⋅x. Read on for more details on the format etc.

Sometimes it is easier to visualize a specific Un. Below is U5 written down in a 2D-array form:

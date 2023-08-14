/*
Revision notes:
1. When going up, look at which boundaries you will hit and then make your boundary checks
2. When going down look at which boundaries you will hit and then make your boundary checks

ITS ALL ABOUT WATCHING WHICH BOUNDARIES WE WILL HIT WHEN GOING IN WHICH DIRECTION

matrix traversals are all about watching for boundaries!


We are going in either or directions
1. up
2. down

when going up, what boundaries do we hit when we are going out of bounds?

    We will hit
        top row or
     _ _ _ _ _ 
    |         |
    |         |
    |         |  right col
    |         |
    |_ _ _ _ _|

So if going up ever reaches row == 0 ( top row )
then go to next col ( c++ ) and change direction and go down
if going up every ever hits right col, then row++ and change direction to go down


when going down, what boundaries do we hit when we are going out of bounds?
         _ _ _ _ _ 
        |         |
        |         |
left col|         |
        |         |
        |_ _ _ _ _|
            bottom
            row
            

if going down we ever hit col 0, then row++ and change direction to go up
if going down we ever hit bottom last row ( m-1 ), then c++ and change direction


*/
func findDiagonalOrder(mat [][]int) []int {
    up := true
    out := []int{}
    m := len(mat)
    n := len(mat[0])
    r := 0
    c := 0
    for len(out) != m*n {
        out = append(out, mat[r][c])
        if up {
            if c == n-1 {r++; up = false; continue}
            if r == 0 {c++; up = false; continue}
            r--; c++
        } else {
            if r == m-1 {c++; up = true; continue}
            if c == 0 {r++; up = true; continue}
            r++; c--
        }
    } 
    return out
}

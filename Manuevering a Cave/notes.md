### Manuevering a cave

Statement - The problem is to count all the possible paths from top left to bottom right of a m X n matrix with the 
constraints that from each cell you can either move only to right or down.

Examples : 

Input :  m = 2, n = 2;</br>
Output : 2</br>
There are two paths</br>
(0, 0) -> (0, 1) -> (1, 1)</br>
(0, 0) -> (1, 0) -> (1, 1)</br>

Input :  m = 2, n = 3;</br>
Output : 3</br>
There are three paths</br>
(0, 0) -> (0, 1) -> (0, 2) -> (1, 2)</br>
(0, 0) -> (0, 1) -> (1, 1) -> (1, 2)</br>
(0, 0) -> (1, 0) -> (1, 1) -> (1, 2)</br>

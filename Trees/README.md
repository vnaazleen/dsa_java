# Tree

A tree is a finite set of one or more nodes such that:

* There is a specially designated node called the **root**.
* Remaining nodes are partitioned into n (n > 0) disjoint sets T1, T2,..., Tn, where 
each Ti(i = 1, 2, 3, ..., n) is a tree; T1, T2,..., Tn are called sub trees of the root.

## Node

This is the main component of any tree structure. The concept of node is same as used
in linked list. Node of a tree stores the actual data and links to the other node.

## Parent

Parent of a node is the immediate predecessor of a node. 

## Child

If the immediate predecessor of a node is the parent of the node then all immediate
successors of a node are known as child.

## Link

This is a pointer to a node in a tree. 

## Root

This is a specially designated node which has no parent.

## Level

Level is the rank of the hierarchy and root node is termed as in level 0. If a node is
at level i then its child is at level i+1 and parents is at level i-1. This is true
for all nodes except the root node.Level of the root node is zero.

## Height

Maximum number of nodes that is possible in a path starting from root node to a leaf
node is called the height of a tree. 

It can be easily obtained that h = imax + 1
where,
* h = height
* imax = maximum level of the tree            

## Degree

Maximum number of children that is possible for a node is known as the degree of a node

# Binary Tree

* A *binary tree* is a special form of a tree.
* A *binary tree* T is a finite set of nodes, such that 
	* T is empty(called empty binary tree), or
	* T contains a specially designated node called the root of T, and the remaining nodes
of T form two disjoint binary trees T1 and T2 which are called left sub-tree and the right sub-tree, respectively.

## Fill binary tree

* A binary tree is a *full binary tree*, if it contains **maximum** possible number of nodes in **all levels**.

## Complete binary tree

* A binary tree is said to be a **complete binary** tree, if **all its levels, except
possibly the last level, have the maximum number of possible nodes**, and all the nodes at the last level appear **as far
left as possible**.

## Skewed binary tree
* A binary tree is said to be a **skewed binary** tree, if *all its levels*, all nodes contain only one child.

## Properties of a Binary Tree
* In any binary tree,maximum number of nodes on level l is 2 ** l, where l >= 0.
* Maximum number of nodes pssible in a binary tree of heiht h is 2 ** h - 1.
* Minimum number of nodes possible in a binary tree of height h is h.
* For any non-empty binary tree, if n is the number of nodes and e is the number of edges, then n = e + 1
* For any non-empty binary tree T, if n0 is the number of leaf nodes(degree = 0) and n2 is the number 
of internal node(degree = 2), then n0 = n2 + 1
* Height of a complete binary tree with n number of nodes is [log(n+1) base 2]


# Array representation of binary tree
* The root is at location 1.
* For any node with index i, 1 < i <= n, (for some n)
	* PARENT(i) = [i/2] (For the node when i=1, there is no parent)
	* LCHILD(i) = 2 * i (If 2 * i > n, then i has no left child)
	* RCHILD(i) = 2 * i + 1 (If 2 * (i+1) > n, then i has no right child)

* Maximum & minimum size that an array may require to store a binary tree with n number of nodes are
	* Size (max) = 2 ** n - 1
	* Size (min) = 2 ** [log(n+1) base 2] - 1

# Operations on Trees

* Traversal --> To visit all the nodes in a binary tree.
* Insertion --> To include a node into an existing (may be empty) binary tree.
* Deletion  --> To delete a node from a non-empty binary tree.
* Merging   --> To merge two binary trees into a larger one.

## Tree Traversal

* Traversal operation is a frequently used operation on a binary tree.
* This operation is used to visit each node in the tree exactly once.
* A full traversal on a binary tree gives a linear ordering of the data in the tree.
	* For an example, if the binary tree contains an arithmetric expression, then its traversal may
give us the expression in infix notation, postfix notation or prefix notation.

## Different ways of traversing
* Now a tree can be traversed in various ways.
* For a systematic traversal, it is better to visit each node (starting from the root) and its sub trees in the same fashion.
* There are *six* such possible ways:

			R
		      /   \
		     T1    T2

	* R T1 T2 --> Pre-order traversal
	* T1 R T2 --> In-order traversal
	* T1 T2 R --> Post-order travsersal
	* T2 T1 R (mirror replica of R T1 T2)
	* T2 R T1 (mirror replica of T1 R T2)
	* R T2 T1 (mirror replica of T1 T2 R)

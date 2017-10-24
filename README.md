# Data Structures

This repository contains the various progams on Data Structures and Algorithms using C and C++.

Further, it contains the programs which are commonly asked in the technical interviews of companies like Microsoft, Amazon, Flipkart, DE Shaw etc.

# Data structures in english
The following is a simple language explanation of a few data structures. For the sake of simplicity imagine that you have a set of Objects (small cubes or spheres or something) and that you can connect them in arbitrary ways.
## Linked Lists
A linked lists are simple data structures where each object links to the object behind and sometimes to the object in front of it. The basic idea is to line your objects up on after the other. These data structures are easy to deal with but are slow when you have sufficiently large lists. In general you can only access a linked list from the front or the back (or both) and in order to find something in it you may need to walk the entire list.

## Arrays

1D Arrays are like Linked Lists, but where you can access each element directly. This is great if you know what you want out of it, but no better if you need to search through until you find a match. Higher order arrays (2D, 3D, 4D, etc...) give greater granularity and can help if you can give meaningful ordering to each new dimension. ex name on dimension 1 and age on dimension 2.

## Queues ##
Queues are data structures that you insert elements in begin and remove elements in the end. It follow the principle FIFO, "First in, First Out". Queues can be implemented using 1D Arrays and Linked Lists. Queues are common in classical algorithms, like BFS.

## Stacks ##
Stacks are data structures that you insert elements in begin and remove elements in begin, you call this part the top of stack. The principle that stacks follows are LIFO, "Last in, First Out". Stacks can be implemented using 1D Arrays and Linked Lists, too.

## Resources
[Open Data Structures](http://opendatastructures.org/)
[VisuaAlgo](https://visualgo.net/en)

## Authors

* **Ashish Krishan** - *Initial work*

//https://www.hackerrank.com/challenges/fp-filter-positions-in-a-list/problem
def f(arr:List[Int]):List[Int] = arr.view.zipWithIndex.filter(_._2 %2 == 1).map(_._1).toList
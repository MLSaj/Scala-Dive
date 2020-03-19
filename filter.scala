//https://www.hackerrank.com/challenges/fp-filter-array/problem
def filter_func(filter:Int, number:Int) = {
     if(number < filter)Some(number)else None
 }

def f(delim:Int,arr:List[Int]):List[Int] = {
    val newlist = arr.flatMap(a=>filter_func(delim,a))
    newlist
    
}
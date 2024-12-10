
class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

fun hasCycle(head: ListNode?): Boolean {
    if(head?.next == null) return false
    var i = head
    var j = head.next
    while (i != j){
        if(j == null || j.next == null){
            return false
        }
        i = i?.next
        j = j.next!!.next
    }
    return true
}
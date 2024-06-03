package easy

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
    var c1 = list1
    var c2 = list2
    val ph = ListNode(-1)
    var c: ListNode? = ph

    while (c1 != null || c2 != null) {

        if (c1 == null) {
            c?.next = c2?.`val`?.let { ListNode(it) }
            c = c?.next
            c2 = c2?.next
            continue
        }

        if (c2 == null) {
            c?.next = ListNode(c1.`val`)
            c = c?.next
            c1 = c1.next
            continue
        }

        if (c1.`val` >= c2.`val`) {
            c?.next = ListNode(c2.`val`)
            c2 = c2.next
        } else {
            c?.next = ListNode(c1.`val`)
            c1 = c1.next
        }

        c = c?.next
    }
    return ph.next
}

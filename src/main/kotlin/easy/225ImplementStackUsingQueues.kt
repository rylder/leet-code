package easy

class MyStack() {

    private val list = mutableListOf<Int>()

    fun push(x: Int) {
        list.add(list.size, x)
    }

    fun pop(): Int {
        return list.removeAt(0)
    }

    fun top(): Int {
        return list.last()
    }

    fun empty(): Boolean {
        return list.isEmpty()
    }

}

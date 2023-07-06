fun main(){
    var a =Queue(5)
    a.dequeue()
    a.enqueue(1)
    a.enqueue(2)
    a.enqueue(3)
    a.dequeue()
    a.dequeue()
    a.display()
    a.enqueue(45)
    a.enqueue(32)
    a.enqueue(64)
    a.enqueue(32)
    a.display()





}
class  Queue(var capacity:Int){
    var data=IntArray(capacity)
    var front=0
    var rear=0
    fun enqueue(value:Int):Int{
        if (isFull()){
            println("queues is full")
            return

        }
        data[rear]=value

    }
    fun dequeue():Int?{
        if (isEmpty()){
            println("Queue is empty")
            return null
        }
        var removed =data[front]

        for (i in front until rear -1){
            data[i]=data[i+1]
        }
       rear--
        return removed
    }
    fun peek():Boolean{
        if (isEmpty()){
            return null
        }
        else
            return data[front]


    }
    fun isFull():Boolean{
        return rear==capacity

    }
    fun  isEmpty():Boolean{
        return front==rear

    }
    fun display(){
        if (isEmpty()){
            return
        }
        for (i in front until rear){
            println(data)
        }

    }
}


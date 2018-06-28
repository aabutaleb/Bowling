package whitbread.dojo

class Frame {
    var nextFrame: Frame? = null
    var rolls: ArrayList<Roll> = ArrayList<Roll>()

    fun score(): Int{
        return 0
    }
}

class TenthFrame(){
    var roll: Roll? = null
}
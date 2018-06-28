package whitbread.dojo

class Game(){

    var frame: Frame = Frame()

    fun roll(pins: Int){
        var currentFrame = frame;
        while (frame.nextFrame != null){
            currentFrame = currentFrame.nextFrame ?: Frame() //hack?
        }

        if (currentFrame.rolls?.size == 2){
            currentFrame.nextFrame = Frame()
            currentFrame = currentFrame.nextFrame ?: Frame() //hack?
        }

        currentFrame.rolls.add(Roll(pins))
    }

    fun score(): Int{
        return 0;
    }
}
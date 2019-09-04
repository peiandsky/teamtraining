/**
 *公司：赛安服
 *  文件名：sealedClasses
 *  @author（作者）：Administratora
 *  @time（时间）：2019/9/1 16:40
 *  描述：密封类
 *  @version（版本）：
 *
 */
package net.println.kotlin.sealedClass

import java.text.FieldPosition
//密封类子类可数
sealed class PlayerCmd{
    class Play(val url:String,val position:Long):PlayerCmd()
    class Seek(val position: Long):PlayerCmd()
    object Pause:PlayerCmd()
    object Resume:PlayerCmd()
    object Stop:PlayerCmd()
}
//枚举实例可数
enum class PlayerState{
    IDLE,PAUSE,PLAYING
}
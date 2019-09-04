/**
 *公司：赛安服
 *  文件名：chapter
 *  @author（作者）：Administratora
 *  @time（时间）：2019/8/30 9:13
 *  描述：接口相关
 *  @version（版本）：
 *
 */
package net.println.kotlin.chapter3

import javax.jws.soap.SOAPBinding
//定义一个输入接口
interface  inputDevice{
    fun input(event:Any)
}
//定义一个USB接口 继承输入接口
interface  UsbInputDevice:inputDevice
//定义一个蓝牙接口 继承输入接口
interface  BulInputDevice:inputDevice
//定义抽象类鼠标实现usb接口
abstract class USBMouse(val name:String):UsbInputDevice{
    override fun input(event: Any) {
    }
    override fun toString(): String {
        return "$name"
    }
    //定义一个抽象接口
    abstract fun  haoMath(Moth:Int)
}
//定义一个小米鼠标类 继承抽象类鼠标并实现其未实现的抽象方法
class  xiaomiMouse:USBMouse("小米鼠标"){
    //实现抽象方法
    override fun haoMath(Moth: Int) {
        println("$name 售价：$Moth")
    }
}
//定义一个电脑类
class Computer{
    //添加USB连接的方法
    fun addUsbInputDevice(inputDevice:UsbInputDevice){
        println("USB设备已连接: $inputDevice")
    }
    //添加蓝牙连接的方法
    fun addBulInputDevice(inputDevice:BulInputDevice){
        println("蓝牙设备已连接: $inputDevice")
    }
    //添加输入接口的方法
    fun addInputDevice(inputDevice: inputDevice){
        //判断输入是什么类型
        when(inputDevice){
            //如果是USB类型
            is UsbInputDevice->{
             //执行添加USB连接的方法
            addUsbInputDevice(inputDevice)
        }
            //如果是蓝牙类型
            is BulInputDevice->{
                //添加蓝牙连接的方法
                addBulInputDevice(inputDevice)
            }
            //如果不是以上两种类型
            else ->{
                //抛出异常
                throw  IllegalArgumentException("输入设备类型不支持")
            }
        }
    }
}

fun main(args: Array<String>) {
    //实例化一个电脑类型
    val computer=Computer()
    //实例化一个小米鼠标类
    val mouse=xiaomiMouse()
    //调用电脑类型的添加输入接口的方法
    computer.addInputDevice(mouse)
    //调用小米鼠标类的方法
    mouse.haoMath(60)
}
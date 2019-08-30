package hellokotlin

/**
 * @author：HeZhiQi
 * @Date: 2019/8/29
 * @Description: hellokotlin
 * @version: 1.0
 *抽象类与接口相关练习
 */

interface InputDevice{
    fun input(event:Any)
}

interface USBInputDevice:InputDevice

interface BLEInputDevice:InputDevice

class Computer{
    fun addUSBInputDevice(inputDevice: USBInputDevice){
        //插入输入设备
        println("add usb input device :$inputDevice")
    }

    fun addBLEInputDevice(inputDevice: BLEInputDevice){
        //输入插入设备
        println("add BLE input device :$inputDevice")
    }

    fun addInputDevice(inputDevice: InputDevice){
        when(inputDevice){
            is BLEInputDevice ->{addBLEInputDevice(inputDevice)}
            is USBInputDevice ->{addUSBInputDevice(inputDevice)}
            else ->{throw IllegalArgumentException("输入设备类型不支持")}
        }
    }

}

class USBMouse(var name:String):USBInputDevice{
    override fun input(event: Any) {

    }

    override fun toString(): String {
        return name
    }

}

fun main(args: Array<String>) {
    var computer = Computer()
    var usbMouse = USBMouse("高端鼠标")
    computer.addInputDevice(usbMouse)
}
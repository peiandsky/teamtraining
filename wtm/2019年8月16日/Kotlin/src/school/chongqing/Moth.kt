/**
 *公司：赛安服
 *  文件名：Moth
 *  @author（作者）：Administratora
 *  @time（时间）：2019/8/30 10:32
 *  描述：
 *  @version（版本）：
 *
 */
package school.chongqing
//导包可以使用别名
import school.shanghai.School as shanghaiSchool
import school.beijing.School as beijingSchool
fun main(args: Array<String>) {
    val cqSchool=School("重庆大学")
    val shSchool=shanghaiSchool("上海大学")
    val bjSchool=beijingSchool("北京大学")
    val tjSchool=school.tianjing.School("天津大学")
    println("这里是 ：$cqSchool")
    println("这里是 ：$shSchool")
    println("这里是 ：$bjSchool")
    println("这里是 ：$tjSchool")
}
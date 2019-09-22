<template>
    <div>
        <div class="title">热门搜索</div>
        <ul class="menu">
            <li @click="menu1">笔记本电脑</li>
            <li @click="menu2">手机</li>
            <li @click="menu3">服饰</li>
            <li @click="menu4">手表</li>
            <li @click="menu5">书籍</li>
            <li @click="menu6">玩具</li>
            <li @click="menu7">小家电</li>
            <li @click="menu8">学习用品</li>
            <li @click="menu9">办公用品</li>
            <li @click="menu10">旅游必备</li>
            <li @click="menu11">游戏卡通</li>
        </ul>
    </div>
</template>
<style type="text/css">
    .title{
        width:100px;
        color: red;
    }
    .menu li{
        list-style:none;
        height: 50px;
        margin-bottom: 2px;
        background-color: white;
        line-height: 50px;
        cursor: pointer;
    }
</style>
<script type="text/javascript">
    import Msg from "./msg.js"
    export default {
       methods:{
           menu1:function () {
               Msg.$emit("val","笔记本电脑")
           },
           menu2:function () {
               Msg.$emit("val","手机")
           },
           menu3:function () {
               Msg.$emit("val","服饰")
           },
           menu4:function () {
               Msg.$emit("val","手表")
           },
           menu5:function () {
               Msg.$emit("val","书籍")
           },
           menu6:function () {
               Msg.$emit("val","玩具")
           },
       }
    }
</script>

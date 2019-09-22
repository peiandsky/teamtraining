<template>
    <div name="show">
        <ul class="goodsList">
            <li v-for="good in list">
                <img v-bind:src="good.img">
                <p>{{good.goodName}}</p>
            </li>
        </ul>
    </div>
</template>
<style type="text/css">
    .goodsList li{
        width: 200px;
        height: 200px;
        list-style: none;
        float: left;
        color: red;
        margin-bottom:20px;
    }
    .goodsList img{
        width:160px;
        height: 160px;
    }
</style>
<script type="text/javascript">
    export default {
        name:"show",
        data(){
            var obj = this;
            var url = ""
            if(obj.goodId==1){
                url = "json/bjb.json"
            }else if(obj.goodId==2){
                url = "json/shouji.json"
            }
            this.$http.get(url).then(function (res) {
                obj.list = res.data;
            })
            return{
                list:[]
            }
        },
        props:{
            goodId:Number
        },
        watch:{
            goodId(){
                var obj = this
                var url = ""
                if(obj.goodId==1){
                    url = "json/bjb.json"
                }else if(obj.goodId==2){
                    url = "json/shouji.json"
                }
                this.$http.get(url).then(function (res) {
                    obj.list = res.data;
                })
                return{
                    list:[]
                }
            }
        }
    }
</script>

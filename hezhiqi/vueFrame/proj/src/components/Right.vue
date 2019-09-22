<template>
    <div>
        <div v-if="kk=='笔记本电脑'">
            <GoodsList :goodId="1"></GoodsList>
        </div>
        <div v-if="kk=='手机'">
            <GoodsList :goodId="2"></GoodsList>
        </div>
        <div v-if="kk=='服饰'">
            3333
        </div>
    </div>
</template>
<script type="text/javascript">
    import Msg from "./msg.js"
    import GoodsList from "./goodsList.vue"
    export default {
        data(){
            return{
                kk:0
            }
        },
        mounted:function () {
            var _this = this;
            Msg.$on("val",function (m) {
                _this.kk = m
            })
        },
        components:{
            GoodsList
        }
    }
</script>

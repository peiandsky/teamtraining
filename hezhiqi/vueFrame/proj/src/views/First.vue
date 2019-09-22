<template>
    <div class="main">
        <div class="left">
            <Left></Left>
        </div>
        <div class="right">
             <div class="top">
                <img src="/image/title.png">
             </div>
             <div class="buttom">
                 <Right></Right>
             </div>
        </div>
    </div>
</template>
<style type="text/css">
    *{
        padding: 0;
        margin: 0;
    }
    .left{
        background-color: #f5f5f5;
        width: 100px;
        float: left;
        margin-right: 10px;
    }
    .right{
        background-color:#f5f5f5;
        width: 1000px;
        float: left;
        margin-left: 10px;
    }
    .main{
        width: 1200px;
        margin: 20px auto;
    }
    .top img{
        width: 1000px;
        height: 200px;
    }
</style>
<script type="text/javascript">
    import Left from '../components/Left.vue'
    import Right from '../components/Right.vue'
    export default {
      components:{
          Left,
          Right
      }
    }
</script>

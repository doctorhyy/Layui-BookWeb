<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <script
            src="https://kit.fontawesome.com/64d58efce2.js"
            crossorigin="anonymous"
    ></script>
    <link rel="stylesheet" href="css/style.css" />
    <link rel="stylesheet" href="layui/css/layui.css" tppabs="layui/css/layui.css"  media="all">
    <title>注册登录界面</title>
</head>
<body>
<div class="container">
    <div class="forms-container">
        <div class="signin-signup">
            <form action="${pageContext.servletContext.contextPath}/user/login.do" method="post" class="sign-in-form layui-form">
                <h2 class="title">登录</h2>
                <div class="input-field">
                    <i class="fas fa-user"></i>
                    <input type="text" placeholder="账号" lay-verify="userId" name="id"/>
                </div>
                <div class="input-field">
                    <i class="fas fa-lock"></i>
                    <input type="password" placeholder="密码" lay-verify="pass" name="password"/>
                </div>
                <input type="submit" value="登录" class="btn solid" lay-submit=""/>
                <p class="social-text">或者从以下平台登录</p>
                <div class="social-media">
                    <a href="#" class="social-icon">
                        <i class="fab fa-facebook-f"></i>
                    </a>
                    <a href="#" class="social-icon">
                        <i class="fab fa-twitter"></i>
                    </a>
                    <a href="#" class="social-icon">
                        <i class="fab fa-google"></i>
                    </a>
                    <a href="#" class="social-icon">
                        <i class="fab fa-linkedin-in"></i>
                    </a>
                </div>
            </form>
            <form action="${pageContext.servletContext.contextPath}/user/add.do" method="post" class="sign-up-form layui-form">
                <h2 class="title">注册</h2>
                <div class="input-field">
                    <i class="fas fa-user"></i>
                    <input type="text" placeholder="昵称" name="userName" lay-verify="userName"/>
                </div>
                <div class="input-field">
                    <i class="fas fa-user"></i>
                    <input type="text" placeholder="账号" lay-verify="userId" id="userId" name="userId"/>
                </div>
                <div class="input-field">
                    <i class="fas fa-lock"></i>
                    <input type="password" placeholder="密码"  lay-verify="pass" name="userPassword"/>
                </div>
                <input type="submit" value="登录" class="btn solid" lay-submit=""/>
                <p class="social-text">或者从以下平台登录</p>
                <div class="social-media">
                    <a href="#" class="social-icon">
                        <i class="fab fa-facebook-f"></i>
                    </a>
                    <a href="#" class="social-icon">
                        <i class="fab fa-twitter"></i>
                    </a>
                    <a href="#" class="social-icon">
                        <i class="fab fa-google"></i>
                    </a>
                    <a href="#" class="social-icon">
                        <i class="fab fa-linkedin-in"></i>
                    </a>
                </div>
            </form>
        </div>
    </div>

    <div class="panels-container">
        <div class="panel left-panel">
            <div class="content">
                <h3>初来乍到？</h3>
                <p>
                    您可以点击下面的按钮进行注册。
                </p>
                <button class="btn transparent" id="sign-up-btn">
                    注册
                </button>
            </div>
            <img src="img/log.svg" class="image" alt="" />
        </div>
        <div class="panel right-panel">
            <div class="content">
                <h3>已经是会员？</h3>
                <p>
                    您可以点击下面的按钮进行登录
                </p>
                <button class="btn transparent" id="sign-in-btn">
                    登录
                </button>
            </div>
            <img src="img/register.svg" class="image" alt="" />
        </div>
    </div>
</div>

<script src="js/app.js"></script>
<script src="layui/layui.js" charset="utf-8"></script>

<script>
    layui.use(['form', 'layedit', 'laydate','jquery'], function(){
        var form = layui.form
            ,layer = layui.layer
            ,layedit = layui.layedit
            ,laydate = layui.laydate
            ,$ = layui.$;
        $(function(){
            $("#userId").blur(function (){
                $.ajax({
                    url: 'http://localhost:8080/Bookweb/user/testId.do',
                    type:"post",
                    data:{"userId":$("#userId").val()},
                    success:function (responseText){
                        if (responseText.trim() == "false")
                            layer.msg("该id有人占用啦！QWQ");
                    }
                })
            })
        })
        //创建一个编辑器
        var editIndex = layedit.build('LAY_demo_editor');

        //自定义验证规则
        form.verify({
            userId: [
                /^[0-9]{4,18}$/
                ,'账号必须为4到18位的数字，且不能出现空格'
            ]
            ,pass: [
                /^(?![0-9]+$)(?![a-zA-Z]+$)[0-9A-Za-z]{6,20}$/
                ,'密码只能为6-20包含数字，英文字母，不能出现空格'
            ]
            ,userName: [
                /^[\u4E00-\u9FA5A-Za-z0-9_]+$/
                ,'昵称只能为中文、英文、数字包括下划线'
            ]
            ,content: function(value){
                layedit.sync(editIndex);
            }
        });
    });
</script>

</body>
</html>
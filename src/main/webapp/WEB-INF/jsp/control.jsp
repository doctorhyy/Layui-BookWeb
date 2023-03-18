<%--
  Created by IntelliJ IDEA.
  User: TR
  Date: 2021/12/15
  Time: 9:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="GBK">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>管理系统</title>
    <link rel="stylesheet" href="../layui/css/layui.css">
    <script src="../layui/layui.js" charset="utf-8"></script>

</head>
<body>
<div class="layui-layout layui-layout-admin">
    <div class="layui-header">
        <div class="layui-logo layui-hide-xs layui-bg-black">综合管理系统</div>
        <!-- 头部区域（可配合layui 已有的水平导航） -->
        <ul class="layui-nav layui-layout-left">
            <!-- 移动端显示 -->
            <li class="layui-nav-item layui-show-xs-inline-block layui-hide-sm" lay-header-event="menuLeft">
                <i class="layui-icon layui-icon-spread-left"></i>
            </li>

            <li class="layui-nav-item layui-hide-xs"><a href="">书库</a></li>
            <li class="layui-nav-item">
                <a href="javascript:;">合作伙伴</a>
                <dl class="layui-nav-child">
                    <dd><a href="https://www.baidu.com/">百度</a></dd>
                    <dd><a href="https://www.qq.com/">腾讯</a></dd>
                    <dd><a href="https://www.bilibili.com/">B站</a></dd>
                </dl>
            </li>
        </ul>
        <ul class="layui-nav layui-layout-right">
            <li class="layui-nav-item layui-hide layui-show-md-inline-block">
                <a href="javascript:;">
                    <img src="../img/log.svg" class="layui-nav-img">
                    管理员
                </a>
                <dl class="layui-nav-child">
                    <dd><a href="http://localhost:8080/Bookweb/user/logout.do">退出登录</a></dd>
                </dl>
            </li>
            <li class="layui-nav-item" lay-header-event="menuRight" lay-unselect>
                <a href="javascript:;">
                    <i class="layui-icon layui-icon-more-vertical"></i>
                </a>
            </li>
        </ul>
    </div>

    <div class="layui-side layui-bg-black">
        <div class="layui-side-scroll">
            <!-- 左侧导航区域（可配合layui已有的垂直导航） -->
            <ul class="layui-nav layui-nav-tree" lay-filter="test">
                <li class="layui-nav-item layui-nav-itemed">
                    <a  href="javascript:;">信息管理</a>
                    <dl class="layui-nav-child">
                        <dd><a href="http://localhost:8080/Bookweb/html/userControl.do" class="child">用户信息管理</a></dd>
                        <dd><a href="http://localhost:8080/Bookweb/html/collectControl.do" class="child">收藏信息展示</a></dd>
                        <dd><a href="http://localhost:8080/Bookweb/html/bookControl.do" class="child">图书基本信息管理</a></dd>
                    </dl>
                </li>
                <li class="layui-nav-item">
                    <a href="javascript:;">添加功能</a>
                    <dl class="layui-nav-child">
                        <dd><a href="http://localhost:8080/Bookweb/html/adduser.do" class="child">添加用户</a></dd>
                        <dd><a href="http://localhost:8080/Bookweb/html/addbook.do" class="child">添加图书</a></dd>
                    </dl>
                </li>
                <li class="layui-nav-item">
                    <a href="javascript:;">阅读数量数据分析</a>
                    <dl class="layui-nav-child">
                        <dd><a href="http://localhost:8080/Bookweb/html/pieReadNum.do" class="child">饼图</a></dd>
                        <dd><a href="http://localhost:8080/Bookweb/html/barReadNum.do" class="child">直方图</a></dd>
                        <dd><a href="http://localhost:8080/Bookweb/html/roseReadNum.do" class="child">玫瑰图</a></dd>
                        <dd><a href="http://localhost:8080/Bookweb/html/radiusReadNum.do" class="child">圆角环形图</a></dd>
                    </dl>
                </li>
                <li class="layui-nav-item">
                    <a href="javascript:;">图书种类数据分析</a>
                    <dl class="layui-nav-child">
                        <dd><a href="http://localhost:8080/Bookweb/html/pieSortNum.do" class="child">饼图</a></dd>
                        <dd><a href="http://localhost:8080/Bookweb/html/barSortNum.do" class="child">直方图</a></dd>
                        <dd><a href="http://localhost:8080/Bookweb/html/roseSortNum.do" class="child">玫瑰图</a></dd>
                        <dd><a href="http://localhost:8080/Bookweb/html/radiusSortNum.do" class="child">圆角环形图</a></dd>
                    </dl>
                </li>
            </ul>
        </div>
    </div>

    <div class="layui-body">
        <iframe src="" id="main" height="100%" width="100%"></iframe>
    </div>
</div>

<script>
    layui.use('element',function(){
        var element = layui.element;
        var $=layui.jquery;
        $(document).ready(function(){
            $(".child").click(function (e){
                e.preventDefault();
                $('#main').attr("src",$(this).attr("href"))
            });
        });
    });
</script>

<script>
    //JS
    layui.use(['element', 'layer', 'util'], function(){
        var element = layui.element
            ,layer = layui.layer
            ,util = layui.util
            ,$ = layui.$;

        //头部事件
        util.event('lay-header-event', {
            //左侧菜单事件
            menuLeft: function(othis){
                layer.msg('展开左侧菜单的操作', {icon: 0});
            }
            ,menuRight: function(){
                layer.open({
                    type: 1
                    ,content: '<div style="padding: 15px;">欢迎来到管理界面,在这里你可以进行用户信息以及图书信息的管理，以及添加用户和查看与图书阅读量相关的数据</div>'
                    ,area: ['260px', '100%']
                    ,offset: 'rt' //右上角
                    ,anim: 5
                    ,shadeClose: true
                });
            }
        });

    });
</script>
</body>
</html>
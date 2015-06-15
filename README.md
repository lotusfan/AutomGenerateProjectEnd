# AutomGenerateProjectEnd
SpringMVC + MyBatis + Maven 的一个自动生成框架

先上第一版。一个简单的生成类，都是自己写的，有一些不足或改进的地方希望可以一块善。
类介绍：
MainThread是项目的入口main类。里面有一些可配置的参数已经加注解了，应该很容易理解。这里只说一个自己定义的包packageNameYourself
这个变量其实就是com级下的一个包名，且整个项目只有这一个包名是可以自定义的，其它都是定义好的，具体效果可以看一下loutsfan这个就
是我自定义的。
MainUtil类里的方法是把数据库里的变量名，表名去解析为java类可用的名。
其它类都是按结构一一对应的生成每部分内容。
生成内容：
生成项目里 有MyBatis  XML配置文件，Dao层接口， Service里的事务控制类， Action里的一个查看类据库信息类。JSP  Js（待完善）
还有一些Spring    MyBatis   log  web.xml， pom.xml 配置文件。

使用说明：
首先要说的是，我是在IDEA下构建的所以整体目录结构都是按IDEA自动生成来匹配的，如果大家要用eclipse的话还请有心人帮我写一下，估
计不怎么合适，但还是有利用价值的， 只是要手动一个模块一个模块去粘了！！。

IDEA构建：建立一个Maven空项目，里面有一个src目录，我们自己写的所有代码都在这里。展开后有一个main。和我们生成的目录结构是一
样的，唯一一个不同就是我把pom.XML文件放在了生成src目录里了，所以我们要把生成的main去覆盖新建空Maven里的main。之后把pom.xml文
件粘贴到新建项目的最外层（也就是直接覆盖工程里的pom.xml）。关于项目启动我使用的是jetty插件 端口是8080。具体配置在pom.xml里，其中还有tomcat7的插件，大家可以自
已选。

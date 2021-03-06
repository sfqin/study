# 基于spring-boot 的学习

## 涉及技术
* maven+springboot+springmvc+mybatis+druid

### 第一节 初始化项目
 * maven+springboot+springmvc+mybatis+druid项目主体
 * .gitignore文件定义哪些文件不被git追踪
 * sql文件夹定义每一次的sql变更
 
 #### 坑记录
 1. 项目启动时，spring容器没有自动创建mybatis生成mapper接口；【解决方案：在springboot的启动类上加上@MapperScan指定mapper接口扫描的路径】
 2. 项目启动成功，在调用dao方法的时候，出现错误，无效statement 绑定；【解决方案：在spring配置文件（application或者application-dev 加入mybatis.mapperLocations=classpath*:mapper/*.xml）中指定mapper.xml文件所在路径】
 3. 项目启动和调用都不报错，但是dao方法查询出来的结果只 有id和remark有数据；【解决方案：原因是mybatis要开启驼峰命名格式，需要在配置文件中加上 mybatis.configuration.map-underscore-to-camel-case=true】
 4. 【续】项目启动报错（Cannot determine embedded database driver class for database type NONE，If you want an embedded database please put a supported one on the classpath. If you have database settings to be loaded from a particular profile you may need to active it！）意思是你配置了数据库就应该加上数据库的相关配置，原来是因为编译后target目录下没有将spring的配置文件编译打包进来，导致（ No active profile set, falling back to default profiles: default）；最后将pom文件的packaging标签改为jar解决
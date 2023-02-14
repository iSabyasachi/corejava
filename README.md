# corejava
# mymodapp command
* javac -d appmodules\appfuncs appsrc\appfuncs\appfuncs\simplefuncs\SimpleMathFuncs.java
* javac -d appmodules\appfuncs appsrc\appfuncs\module-info.java

# Or
* javac -d appmodules\appfuncs appsrc\appfuncs\module-info.java appsrc\appfuncs\appfuncs\simplefuncs\SimpleMathFuncs.java

* javac --module-path appmodules -d appmodules\appstart appsrc\appstart\module-info.java appsrc\appstart\appstart\mymodappdemo\MyModAppDemo.java

* java --module-path appmodules -m appstart/appstart.mymodappdemo.MyModAppDemo

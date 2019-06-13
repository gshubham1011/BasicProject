set projectLocation=C:\Users\shubham.o.gupta\TestingWorkPlace\Automation_DemoProject
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\testng.xml
pause
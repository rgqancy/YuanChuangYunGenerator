rd src\main\java /s /q
md src\main\java
java -jar lib\mybatis-generator-core-1.3.5.jar -configfile generatorConfig.xml -overwrite
@REM java -jar mybatis-generator-core-1.3.2.jar -configfile generatorConfig.xml
@REM java -cp mybatis-generator-core-1.3.2.jar org.mybatis.generator.api.ShellRunner -configfile generatorConfig.xml
@REM java -cp mybatis-generator-core-1.3.2.jar org.mybatis.generator.api.ShellRunner -configfile generatorConfig.xml -overwrite
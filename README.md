# FrameworkFromScratch
FrameworkFromScratch

1) download ojbc6.jar from oracle.com
2) put it in appropriate path in pom.xml <br/>
   For example: <systemPath>d:/Downloads/ojdbc6.jar</systemPath>

runner: <br/>
  prod          desktop </br>
  levelUpTask.automation.storefront.TaskTestSuite <br/>
  -ea -Denv="prod" -Dcucumber.options="--tags @ok" -Dspring.profiles.active=desktop <br/>
  


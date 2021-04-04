//package BasePackage;
//
//import java.util.concurrent.TimeUnit;
//
//import org.junit.After;
//import org.junit.Before;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;
//

//		<!-- https://mvnrepository.com/artifact/tech.grasshopper/extentreports-cucumber5-adapter -->
//		<dependency>
//			<groupId>tech.grasshopper</groupId>
//			<artifactId>extentreports-cucumber5-adapter</artifactId>
//			<version>2.5.0</version>
//		</dependency>



//<dependency>
//    <groupId>tech.grasshopper</groupId>
//    <artifactId>extentreports-cucumber5-adapter</artifactId>
//    <version>1.1.0</version>
//</dependency>
//
// <configuration>
//    <parallel>methods</parallel>
//    <useUnlimitedThreads>true</useUnlimitedThreads>
//    </configuration>


//<plugin>
//				<groupId>org.apache.maven.plugins</groupId>
//				<artifactId>maven-failsafe-plugin</artifactId>
//				<version>3.0.0-M1</version>
//				<executions>
//					<execution>
//						<goals>
//							<goal>integration-test</goal>
//						</goals>
//						<configuration>
//							<includes>
//								<include>**/TestRunner.java</include>
//							</includes>
//							<parallel>methods</parallel>
//							<threadCount>4</threadCount>
//							<perCoreThreadCount>true</perCoreThreadCount>
//						</configuration>
//
//					</execution>
//				</executions>
//			</plugin>


// <configuration>
//    <excludes>
//     <exclude>**/ParallelTestRunner</exclude>
//            <exclude>**/ParallelTestRERunner</exclude>
//       </excludes>     
//            <parallel>methods</parallel>
//  							<threadCount>4</threadCount>
//  							<perCoreThreadCount>false</perCoreThreadCount>
//  		</configuration>
//  		

//   <configuration>
//    <excludes>
//    <exclude>**/ParallelRunner</exclude>
//    <exclude>**/ParallelTestRERunner</exclude>
//    <exclude>**/TestRERunner</exclude>
//    </excludes>
//    </configuration>

//
//<>plugin>
//    <groupId>org.apache.maven.plugins</groupId>
//    <artifactId>maven-failsafe-plugin</artifactId>
//    <version>2.22.0</version>
//    <executions>
//        <execution>
//            <goals>
//                <goal>integration-test</goal>
//                <goal>verify</goal>
//            </goals>
//            <configuration>
//                <parallel>methods</parallel>
//                <useUnlimitedThreads>true</useUnlimitedThreads>
//            </configuration>
//        </execution>
//    </executions>
//</plugin>
//
//<configuration>
//<parallel>methods</parallel>
//<threadCount>4</threadCount>
//<perCoreThreadCount>false</perCoreThreadCount>
//</configuration>
//
//<plugin>
//<groupId>org.apache.maven.plugins</groupId>
//<artifactId>maven-surefire-plugin</artifactId>
//<version>2.22.0</version>
//<configuration>
//    <parallel>methods</parallel>
//    <useUnlimitedThreads>true</useUnlimitedThreads>
//</configuration>
//</plugin>
  		
  		
  		
            

//<dependency>
//			<groupId>org.codehaus.mojo</groupId>
//			<artifactId>cobertura-maven-plugin</artifactId>
//			<version>2.7</version>
//			<executions>
//			<execution>
//			<phase>none</phase>
//			</execution>
//			</executions>
//		</dependency>
			
//<dependency>
//			<groupId>org.codehaus.mojo</groupId>
//			<artifactId>cobertura-maven-plugin</artifactId>
//			<version>2.7</version>
//</dependency>

//<!-- https://mvnrepository.com/artifact/com.aventstack/extentreports -->
//		<dependency>
//			<groupId>com.aventstack</groupId>
//			<artifactId>extentreports</artifactId>
//			<version>5.0.0</version>
//		</dependency>
//
//		<!-- https://mvnrepository.com/artifact/tech.grasshopper/extentreports-cucumber5-adapter -->
//		<dependency>
//			<groupId>tech.grasshopper</groupId>
//			<artifactId>extentreports-cucumber5-adapter</artifactId>
//			<version>2.5.0</version>
//		</dependency>
//
//		<!-- https://mvnrepository.com/artifact/com.github.temyers/cucumber-jvm-parallel-plugin -->
//		<dependency>
//			<groupId>com.github.temyers</groupId>
//			<artifactId>cucumber-jvm-parallel-plugin</artifactId>
//			<version>3.0.0</version>
//		</dependency>
//	 

//<dependency>
//	<groupId>io.cucumber</groupId>
//	<artifactId>cucumber-expressions</artifactId>
//	<version>5.0.12</version>
//</dependency>


////		extent.reporter.pdf.start=true
//extent.reporter.pdf.out=C:/Users/vishwa/eclipse-workspace/seleniumSecond/target/Cucumber-html-report/spark/ExtentPdf.pdf
//	
//
//<!-- https://mvnrepository.com/artifact/net.masterthought/maven-cucumber-reporting -->
//<plugin>
//    <groupId>net.masterthought</groupId>
//    <artifactId>maven-cucumber-reporting</artifactId>
//    <version>2.8.0</version>
//                    <executions>
//                    <execution>
//                        <id>execution</id>
//                        <phase>verify</phase>
//                        <goals>
//                            <goal>generate</goal>
//                        </goals>
//                            <configuration>
//                                <projectName>seleniumSecond</projectName>
//                                <outputDirectory>target/Cucumber-html-report/cucumber-advanced-reports</outputDirectory>
//                                <cucumberOutput>target/Cucumber-json-report/reports.json</cucumberOutput>
//                            </configuration>
//                             </execution>
//                    </executions>
//                       
//      </plugin>          
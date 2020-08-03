

buildscript {
   	   	...
   	repositories {
         	mavenCentral()
   	}
   	dependencies {
...
         	classpath("io.spring.gradle:dependency-management-plugin:0.5.4.RELEASE")
   	}
}
..
apply plugin: "io.spring.dependency-management"
 
dependencyManagement {
	imports {
    	mavenBom ('com.amazonaws:aws-java-sdk-bom:1.10.47')
	}
}
 
dependencies {
   	..
   	compile ('com.amazonaws:aws-java-sdk-s3')
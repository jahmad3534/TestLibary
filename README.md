	In your buid.gradle file add maven repository
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
	
	
	dependencies {
	        implementation 'com.github.jahmad3534:TestLibary:1.1'
	}

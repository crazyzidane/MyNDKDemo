# MyNDKDemo
	my ndk demo, just learn how to use jni in Android, include some usual methods.

	with AndroidStudio 2.3.3

## 1、 Link C++ project with Gradle
	Right button of "app" in AndroidStudio, choose the "Link C++ project with Gradle", it will popup a dialog,
	In the dialog, we choose ndk-build in Build System, and select the Android.mk file in Project path.


## 2、About method Signature
	➜  debug git:(test) ✗ pwd
	/Users/liushanpu/AndroidStudioProjects/MyNDKDemo/app/build/intermediates/classes/debug
	➜  debug git:(test) ✗ javap -s com.example.liushanpu.myndkdemo.Hello 

	In fact, it has include the method Signature in the generated .h file.
	e.g:
	/*
	 * Class:     com_example_liushanpu_myndkdemo_Hello
 	* Method:    sayHello
 	* Signature: ()Ljava/lang/String;
 	*/
	JNICALLNIEXPORT jstring JNICALL Java_com_example_liushanpu_myndkdemo_Hello_sayHello(JNIEnv *, jclass);	//C

## 3、About generate .h file with java.
	cd app/src/main/java javah -encoding UTF-8 -d ../jni com.lqm.ndkjnistudy.Hello 
	//-d:生成目录 .. ：当前文件的上层文件夹




	the command to git push the code:
	git push origin HEAD:master

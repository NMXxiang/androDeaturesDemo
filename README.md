---------------------------文件夹---------------------------

# Intents:意图方面组件及功能

---------------------------BUG-----------------------------

## 问题:Android 11及以上使用Intent.resolveActivity(context.getPackageManager()) == null

方案:在清单文件(AndroidManifest.xml)中加queries标签.

适用于启动其他第三方APP(暂时没试过)🧐

例子:

这个指queries标签是manifest标签的子标签

```
<manifest> 
	<queries>
        	<intent>
            		<action android:name="android.media.action.IMAGE_CAPTURE"/>
        	</intent>

        	<intent>
            		<action android:name="android.media.action.VIDEO_CAPTURE"/>
            </intent>
    </queries>
</manifest>
```

[解决链接](https://blog.csdn.net/u012452490/article/details/113125945)

## 问题:revoked permission android.permission.CAMERA

方案:删除这句话

(不清楚原因)

```
<uses-permission android:name="android.permission.CAMERA"/>
```

[解决链接](https://cloud.tencent.com/developer/ask/sof/114072647)




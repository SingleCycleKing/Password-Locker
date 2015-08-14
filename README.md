# Password-Locker
A sample password locker...

![Screenshot]()

##使用方法
  1.将library导入，修改你的工程的gradle如下:

    dependencies {
      compile project(':library')
    }

  2.在xml中使用:
  ```xml
    <com.aquarids.library.Indicator
        android:id="@+id/indicator"
        android:layout_width="120dp"
        android:layout_height="30dp"
        android:layout_gravity="center_horizontal" />

    <com.aquarids.library.Keyboard
        android:id="@+id/keyboard"
        android:layout_width="match_parent"
        android:layout_height="match_parent" />
  ```      
  3.在你的activity中:
  ```java
      Keyboard keyboard = (Keyboard) findViewById(R.id.keyboard);
      Indicator indicator = (Indicator) findViewById(R.id.indicator);
      indicator.setKeyboard(keyboard);
      indicator.setInteractEnable(true);//是否启动
      keyboard.setVibratorEnable(true);//是否震动

      indicator.setOnPasswordInputCompleted(new Indicator.OnPasswordInputCompleted() {
            @Override
            public void onPasswordInputCompleted(String password) {

            }
        });
  ```


package jp.techacademy.murai.yusuke.javalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//課題１
        Human human = new Human("ワイエム", 40, "ランニング");

        human.say();

        human.think();

    }


//インターフェース練習
/*
        Dog dog = new Dog("ポチ", 3);

        dog.move();
    }
*/


//自作Class練習2　メンバ変数/関数、クラス変数/関数
/*        Dog dog = new Dog("ポチ", 3);

        dog.say();
        Log.d("javatest", "犬の名前は" + dog.name + "です。");
        Log.d("javatest", "犬の年齢は" + dog.age + "歳です。");

        BigDog bigdog = new BigDog("ヨーゼフ", 15);
        bigdog.say();
        Log.d("javatest", "犬の名前は" + bigdog.name + "です。");
        Log.d("javatest", "犬の年齢は" + bigdog.age + "歳です。");


        Dog.introduce();
        Log.d("javatest", Dog.to_jp + "のクラス変数です。");

    }*/

//自作Class練習
/*
        Dog dog = new Dog("ポチ", 3);

        dog.say();
        Log.d("javatest", "犬の名前は" + dog.name + "です。");
        Log.d("javatest", "犬の年齢は" + dog.age + "歳です。");

        Dog dog2 = new Dog("ハチ", 10);

        dog2.say();
        Log.d("javatest", "犬の名前は" + dog2.name + "です。");
        Log.d("javatest", "犬の年齢は" + dog2.age + "歳です。");

    }
*/



//関数練習
 /*       int t = total(100, 1000);
        Log.d("javatest", String.valueOf(t));
    }

    private int total(int first, int last){
        int sum = 0;
        for (int i = first; i < last; i++){
            sum = sum + i;
        }
        return sum;
    }
*/

//配列練習
/*
        int[] points = new int[5];
        points[0] = 10;
        points[1] = 6;
        points[2] = 15;
        points[3] = 23;
        points[4] = 17;

        for (int i = 0; i < points.length; i++){
            Log.d("javatest", String.valueOf(points[i]));
        }
*/


// if文、while文練習
/*
        for (int i = 1; i < 6; i++) {
            Log.d("javatest", "for文の " + String.valueOf(i) + "回目");
        }

        int num = 1;
        while (num < 6) {
            Log.d("javatest", "while文の　" + String.valueOf(num) + "回目");
            num++;
        }
*/


//  Swich文練習
/*        int drink = 2;

        switch (drink) {
            case 0:
                Log.d("javatest", "コーヒー");
                break;
            case 1:
                Log.d("javatest", "紅茶");
                break;
            case 2:
                Log.d("javatest", "ミルク");
                break;
            default:
                Log.d("javatest", "オーダーミス");
                break;

        }*/


//    if文練習
/*
        int num = 60;

        if (num >= 90) {
            Log.d("javatest", "優");
        } else if (num >= 75) {
            Log.d("javatest", "良");
        } else if (num >= 60){
            Log.d("javatest", "可");
        } else {
            Log.d("javatest", "不可");
        }
*/


//  論理演算練習
/*
        int num1 = 10 + 5 - 2 * 4 / 2;
        Log.d("javatest", "10 + 5 - 2 * 4 / 2 = " + String.valueOf(num1));

        boolean flag1 = true;
        boolean flag2 = false;
        Log.d("javatest", "flag1 && flag2 = " + String.valueOf(flag1 && flag2));
        Log.d("javatest", "flag1 || flag2 = " + String.valueOf(flag1 || flag2));

        int num2 = 10;
        int num3 = 20;
        Log.d("javatest", "num2 < num3 = " + String.valueOf(num2 < num3));
*/

    //}
}
package techacademy.saitou.junki.human;

import android.util.Log;

/**
 * Created by junki on 2018/05/15.
 */
class Human extends Animal implements Thinkable {
    //クラス変数
    static String to_jp = "人";
    String hobby;

    public Human(String name, int age, String hobby) {   //コンストラクタ
        this.name = name;
        this.age = age;
        this.hobby = hobby;
    }

    public static void introduce() {
        Log.d("javatest", "これはHumanクラスです。");
    }

    @Override
    public void say() {
        Log.d("javatest", this.name + "(" + this.age + "歳)");
    }

    @Override
    public void think() {
        Log.d("javatest", "私は" + this.hobby + "について考える。");//インターフェース
    }
}


package com.test720.grasshoppercollege.module.yuWen.yuYanPinYinShiZi.pinYin;

import android.content.Intent;

import com.test720.grasshoppercollege.BuyClassActivity;
import com.test720.grasshoppercollege.MyApplication;
import com.test720.grasshoppercollege.module.yuWen.yuYanPinYinShiZi.BaseShouYeActivity;
import com.test720.grasshoppercollege.untils.HttpUntil;

import okhttp3.FormBody;

public class PingYinShouActivity extends BaseShouYeActivity {

    @Override
    public int type() {
        return 5;
    }

    @Override
    public void buyCurr() {
        Intent intent = new Intent(mcontext, BuyClassActivity.class);
        intent.putExtra("curr_type", 5);
        intent.putExtra("type", "4");
        jumpToActivity(intent, false);
    }

    @Override
    public void buyGuoGuo() {
        if (re_id == null) return;
        FormBody.Builder formBuilder = new FormBody.Builder();
        formBuilder.add("uid", MyApplication.getmInstance().getUid());//请求参数一
        formBuilder.add("curr_type", "5");
        formBuilder.add("type", "2");
        formBuilder.add("points", points);
        formBuilder.add("re_id", re_id);
        Post(HttpUntil.GetIntent().addShareSpendRecord(), formBuilder, 123, false);
    }

    @Override
    public void shareCurr() {
        if (points == null) return;
        FormBody.Builder formBuilder = new FormBody.Builder();
        formBuilder.add("uid", MyApplication.getmInstance().getUid());//请求参数一
        formBuilder.add("curr_type", "5");
        formBuilder.add("type", "1");
        formBuilder.add("re_id", re_id);
        Post(HttpUntil.GetIntent().addShareSpendRecord(), formBuilder, 123, false);
    }

    @Override
    public String[] shareStr() {
        return shareStr;
    }

    @Override
    public void adapterItemClick(String id, String state, String title) {
        Intent in = new Intent(mcontext, PinYinVideoActivity.class);
        in.putExtra("video_id", id);
        in.putExtra("title", title);
        if (state.equals("1")) {
            in.putExtra("h5", false);
        } else {
            in.putExtra("h5", true);
        }
        jumpToActivity(in, false);
    }

    @Override
    protected String setTitle() {
        return "拼音动画";
    }
}
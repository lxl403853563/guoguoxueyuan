package com.test720.grasshoppercollege.module.yuFaJiangJie;

import com.lzy.okgo.model.HttpParams;
import com.test720.grasshoppercollege.BasePingJiaActivity;
import com.test720.grasshoppercollege.MyApplication;
import com.test720.grasshoppercollege.untils.HttpUntil;

import java.util.List;

public class YuFaPinLunActivity extends BasePingJiaActivity {
    @Override
    protected String setTitle() {
        return "新评论";
    }

    @Override
    protected void initData() {

    }

    @Override
    public void GetHttpBackStr(String str, int what) {
        if (codeIsOne(str)) {
            finish();
        }
    }

    @Override
    public void pinLun(List<String> pathList) {
        String comment_id = "0";
        if (getIntent().getStringExtra("comment_id") != null)
            comment_id = getIntent().getStringExtra("comment_id");
        HttpParams builder = new HttpParams();
        builder.put("book_id", getIntent().getStringExtra("book_id"));
        builder.put("uid", MyApplication.getmInstance().getUid());
        builder.put("comment_id", comment_id);
        builder.put("content", body.getText().toString());
        for (int i = 0; i < pathList.size(); i++) {
            builder.put("file[" + i + "]", pathList.get(i));
        }
        postResponse(HttpUntil.GetIntent().EnGrammarcomment(), builder, 5, true);
    }
}

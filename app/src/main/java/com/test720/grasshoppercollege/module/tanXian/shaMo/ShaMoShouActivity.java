package com.test720.grasshoppercollege.module.tanXian.shaMo;

import com.test720.grasshoppercollege.module.tanXian.BaseTanXianAdapter;
import com.test720.grasshoppercollege.module.tanXian.TanXianGuanKaShouActivity;

public class ShaMoShouActivity extends TanXianGuanKaShouActivity {


    @Override
    public int indexType() {
        return 3;
    }

    @Override
    public BaseTanXianAdapter adapter() {
        return new ShaMoAdapter(getList(),mcontext);
    }

    @Override
    protected String setTitle() {
        return null;
    }
}
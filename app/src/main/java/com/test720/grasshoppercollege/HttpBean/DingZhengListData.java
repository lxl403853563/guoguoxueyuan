package com.test720.grasshoppercollege.HttpBean;

import java.util.List;

/**
 * Created by 水东流 on 2018/6/21.
 */

public class DingZhengListData {


    /**
     * code : 1
     * msg : 成功
     * data : [{"eq_id":"2","time":"2018-06-21","status":"0"}]
     */

    private int code;
    private String msg;
    private List<DataBean> data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * eq_id : 2
         * time : 2018-06-21
         * status : 0
         */

        private String eq_id;
        private String time;
        private String status;

        public String getEq_id() {
            return eq_id;
        }

        public void setEq_id(String eq_id) {
            this.eq_id = eq_id;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }
    }
}
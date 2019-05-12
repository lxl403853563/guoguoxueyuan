package com.test720.grasshoppercollege.HttpBean;

import java.util.List;

/**
 * Created by 水东流 on 2018/4/26.
 */

public class AoShuShouYeGuanKaData {


    /**
     * code : 1
     * msg : 成功
     * data : [[{"mop_id":"1","name":"1","permissions":"1","is_permissions":"1","points":"0","open_up":1,"pay":false,"title":"应用题","content":"啊是觉得你烦阿三啊"},{"mop_id":"2","name":"2","permissions":"1","is_permissions":"1","points":"0","open_up":1,"pay":false,"title":"应用题","content":"啊是觉得你烦阿三啊"},{"mop_id":"3","name":"3","permissions":"2","is_permissions":"1","points":"0","open_up":1,"pay":false,"title":"应用题","content":"啊是觉得你烦阿三啊"},{"mop_id":"4","name":"4","permissions":"3","is_permissions":"1","points":"0","open_up":0,"pay":false,"title":"应用题","content":"啊是觉得你烦阿三啊"},{"mop_id":"5","name":"5","permissions":"4","is_permissions":"1","points":"0","open_up":0,"pay":false,"title":"应用题","content":"啊是觉得你烦阿三啊"},{"mop_id":"6","name":"6","permissions":"5","is_permissions":"1","points":"1","open_up":0,"pay":false,"title":"应用题","content":"啊是觉得你烦阿三啊"},{"mop_id":"7","name":"7","permissions":"3","is_permissions":"1","points":"0","open_up":0,"pay":false,"title":"应用题","content":"啊是觉得你烦阿三啊"},{"mop_id":"8","name":"8","permissions":"4","is_permissions":"1","points":"0","open_up":0,"pay":false,"title":"应用题","content":"啊是觉得你烦阿三啊"},{"mop_id":"9","name":"9","permissions":"5","is_permissions":"1","points":"1","open_up":0,"pay":false,"title":"应用题","content":"啊是觉得你烦阿三啊"},{"mop_id":"10","name":"10","permissions":"4","is_permissions":"1","points":"0","open_up":0,"pay":false,"title":"应用题","content":"啊是觉得你烦阿三啊"},{"mop_id":"11","name":"11","permissions":"4","is_permissions":"1","points":"0","open_up":0,"pay":false,"title":"应用题","content":"啊是觉得你烦阿三啊"},{"mop_id":"12","name":"12","permissions":"4","is_permissions":"1","points":"0","open_up":0,"pay":false,"title":"应用题","content":"啊是觉得你烦阿三啊"},{"mop_id":"13","name":"13","permissions":"4","is_permissions":"1","points":"0","open_up":0,"pay":false,"title":"应用题","content":"啊是觉得你烦阿三啊"},{"mop_id":"14","name":"14","permissions":"4","is_permissions":"1","points":"0","open_up":0,"pay":false,"title":"应用题","content":"啊是觉得你烦阿三啊"},{"mop_id":"15","name":"15","permissions":"1","is_permissions":"1","points":"0","open_up":1,"pay":false,"title":"应用题","content":"啊是觉得你烦阿三啊"},{"mop_id":"16","name":"16","permissions":"1","is_permissions":"1","points":"0","open_up":1,"pay":false,"title":"应用题","content":"啊是觉得你烦阿三啊"}],[{"mop_id":"17","name":"17","permissions":"1","is_permissions":"1","points":"0","open_up":1,"pay":false,"title":"应用题","content":"啊是觉得你烦阿三啊"}]]
     */

    private int code;
    private String msg;
    private List<List<DataBean>> data;

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

    public List<List<DataBean>> getData() {
        return data;
    }

    public void setData(List<List<DataBean>> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * mop_id : 1
         * name : 1
         * permissions : 1
         * is_permissions : 1
         * points : 0
         * open_up : 1
         * pay : false
         * title : 应用题
         * content : 啊是觉得你烦阿三啊
         */

        private String mop_id;
        private String name;
        private String permissions;
        private String is_permissions;
        private String points;
        private int open_up;
        private boolean pay;
        private String title;
        private String content;

        public String getMop_id() {
            return mop_id;
        }

        public void setMop_id(String mop_id) {
            this.mop_id = mop_id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPermissions() {
            return permissions;
        }

        public void setPermissions(String permissions) {
            this.permissions = permissions;
        }

        public String getIs_permissions() {
            return is_permissions;
        }

        public void setIs_permissions(String is_permissions) {
            this.is_permissions = is_permissions;
        }

        public String getPoints() {
            return points;
        }

        public void setPoints(String points) {
            this.points = points;
        }

        public int getOpen_up() {
            return open_up;
        }

        public void setOpen_up(int open_up) {
            this.open_up = open_up;
        }

        public boolean isPay() {
            return pay;
        }

        public void setPay(boolean pay) {
            this.pay = pay;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }
    }
}
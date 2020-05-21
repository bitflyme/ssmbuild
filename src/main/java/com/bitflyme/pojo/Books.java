package com.bitflyme.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: wll
 * @Date: 2020/5/22 0:13
 * @Description:
 */

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public class Books {

        private int bookID;
        private String bookName;
        private int bookCounts;
        private String detail;

    }

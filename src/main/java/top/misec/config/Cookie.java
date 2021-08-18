package top.misec.config;

import lombok.Data;

/**
 * @Description: Cookie
 * @Author: han
 * @Date: 2021-08-18
 */
@Data
public class Cookie {
    private String userId = "";
    private String sessData = "";
    private String biliJct = "";
    private String FT_KEY = null;
    private String CHAT_ID = null;
}

package wen.magic.demo.util;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import java.util.Date;
import lombok.extern.slf4j.Slf4j;
import wen.magic.demo.vo.TokenVo;

/** Created by yuting on 2021/1/27 15:47 */
@Slf4j
public class TokenUtil {

  public static final String JWT_SECRET_KEY = "MjAxOHh1ZWxhbmd5dW4wOHNodXpoaTA4";

  public static TokenVo parseToken(String ticket) {
    try {
      Claims claims = Jwts.parser().setSigningKey(JWT_SECRET_KEY).parseClaimsJws(ticket).getBody();
      if (claims != null) {
        TokenVo vo = new TokenVo();
        vo.setSubject(claims.getSubject());
        vo.setUserId(claims.get("userId", Long.class));
        vo.setExpire(claims.get("expire", Date.class));
        vo.setCreateTime(claims.get("createTime", Date.class));
        return vo;
      }
    } catch (Exception e) {
      log.error("token解析出错：{}", e.getMessage());
    }

    return null;
  }
}

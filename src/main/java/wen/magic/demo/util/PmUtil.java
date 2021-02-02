package wen.magic.demo.util;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import wen.magic.demo.vo.TokenVo;

/** Created by yuting on 2021/1/27 15:46 */
@Slf4j
public class PmUtil {

  public static Long getUId(String token) {
    if (StringUtils.isBlank(token)) {
      return null;
    }
    TokenVo vo = TokenUtil.parseToken(token);
    return (vo == null) ? null : vo.getUserId();
  }

}

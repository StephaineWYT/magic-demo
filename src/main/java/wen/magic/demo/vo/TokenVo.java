package wen.magic.demo.vo;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class TokenVo implements Serializable {

  private String subject;

  private Long userId;

  private Date expire;

  private Date createTime;
}

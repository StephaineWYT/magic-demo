package wen.magic.demo.module;

import org.springframework.stereotype.Component;
import org.ssssssss.magicapi.config.MagicModule;
import org.ssssssss.script.annotation.Comment;

/** Created by yuting on 2021/2/2 9:33 */
@Component
public class CustomModule implements MagicModule {

  @Override
  public String getModuleName() {
    return "customModule";
  }

  public void println(@Comment("参数名的提示（用于提示）") String value) {
    System.out.println("自定义方法打印值：" + value);
  }

}

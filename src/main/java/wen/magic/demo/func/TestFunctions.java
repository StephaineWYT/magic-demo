package wen.magic.demo.func;

import org.springframework.stereotype.Component;
import org.ssssssss.magicapi.config.MagicModule;
import org.ssssssss.script.annotation.Comment;

/** Created by yuting on 2021/2/1 17:56 */
@Component
public class TestFunctions implements MagicModule {

  // 返回模块名，使用时通过import指令导入之后使用
  @Override
  public String getModuleName() {
    return "customModuleName";
  }

  @Comment("方法名的注释（用于提示）")
  public void println(@Comment("参数名的提示（用于提示）") String value) {
    System.out.println(value);
  }
}
